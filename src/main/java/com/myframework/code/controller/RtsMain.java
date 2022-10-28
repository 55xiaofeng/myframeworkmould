package com.myframework.code.controller;
//举例
//{
//        "sysHead": {
//        "serviceId": "REQMENT001",
//        "userId": "sysadmin",
//        "tranDate": "tranDate",
//        "tranTimestamp": "tranTimestamp",
//        "systemId": "systemId",
//        "seqNo": "seqNo",
//        "globalSeqNo": "globalSeqNo"
//        },
//        "appHead": {},
//        "otherHead": {},
//        "body": {
//        "projectMark": "PPRO-0048",
//        "mark": "REQ-0047-222",
//        "name": "111",
//        "description": "1",
//        "confirm": "confirm",
//        "note": "note",
//        "propose": "propose",
//        "priority": "300903",
//        "current": "sunj",
//        "creator": "cuisy",
//        "createTime": "20200310 153500000",
//        "oprType":"1"
//        }
//}
import com.alibaba.fastjson.JSON;
import com.myframework.code.rev.*;
import com.myframework.code.service.pub.ApplicationContextHelper;
import com.myframework.code.check.AppHeadCheck;
import com.myframework.code.check.OtherHeadCheck;
import com.myframework.code.check.SysHeadCheck;
import com.myframework.code.ret.RetMyRoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

@RestController
@RequestMapping("/myframe/main")
public class RtsMain {

    private Logger logger = null;

    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public RetMyRoot post( @RequestBody(required=false) Map<String,Object> map){
        logger = LoggerFactory.getLogger(RtsMain.class);
        RetMyRoot retMyRoot = new RetMyRoot();
        retMyRoot.getSysHead().setRetStatus("F");
        retMyRoot.getSysHead().getRet().setRetCode("SYS99999");
        retMyRoot.getSysHead().getRet().setRetMsg("交易失败");

        Map<String,String> map1 = (Map) map.get("sysHead");
        Map<String,String> map2 = (Map) map.get("appHead");
        Map<String,String> map3 = (Map) map.get("otherHead");
        Map<String,String> map4 = (Map) map.get("body");
//        Class<?> loaderClz = null;
        logger.info("sysHead:"+map1);
        logger.info("appHead:"+map2);
        logger.info("otherHead:"+map3);
        logger.info("body:"+map4);

        SysHead sysHead = JSON.parseObject(JSON.toJSONString(map1), SysHead.class);
        AppHead appHead = JSON.parseObject(JSON.toJSONString(map2), AppHead.class);
        OtherHead otherHead = JSON.parseObject(JSON.toJSONString(map4), OtherHead.class);
        Class clz = null;
        Object obj = null;
        Object objTemp = null;

//        ClassLoader loader = ClassLoader.getSystemClassLoader();

        try {
            String classname = "com.myframework.code.service."+sysHead.getServiceId();
            clz =  Class.forName(classname);
//            loaderClz = loader.loadClass(classname);

            obj = ApplicationContextHelper.popBean(clz);
//            classname = "com.myframework.code.check.SysHeadCheck";
//            clz =  Class.forName(classname);
//
//            obj = ApplicationContextHelper.popBean(clz);
            logger.debug("obj.getClass()="+obj.getClass());
//            obj = loaderClz.newInstance();
//            logger.debug("obj.getClass()="+obj.getClass());
            objTemp = JSON.parseObject(JSON.toJSONString(map4), obj.getClass());

            if( mychange(objTemp,obj,clz) ){
                logger.error("转换body变量失败");
                retMyRoot.getSysHead().setRetStatus("F");
                retMyRoot.getSysHead().getRet().setRetCode("99999999");
                retMyRoot.getSysHead().getRet().setRetMsg("转换body变量失败");
                return retMyRoot;
            }

            logger.debug("obj.getClass()="+obj.getClass());
//            logger.debug("dm1="+dm1.getMark());

        }catch(Exception e){
            e.printStackTrace();
            StackTraceElement[] stackArray = e.getStackTrace();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < stackArray.length; i++) {
                StackTraceElement element = stackArray[i];
                sb.append(element.toString() + "\n  ");
            }
            logger.error("取得交易代码错误"+sb);
            retMyRoot.getSysHead().setRetStatus("F");
            retMyRoot.getSysHead().getRet().setRetCode("99999999");
            retMyRoot.getSysHead().getRet().setRetMsg("取得交易代码错误");
            return retMyRoot;
        }

        MyRoot myRoot = new MyRoot();
        myRoot.setSysHead(sysHead);
        myRoot.setAppHead(appHead);
        myRoot.setOtherHead(otherHead);
        myRoot.setBody((Body) obj);



        if( check(myRoot,retMyRoot) ){
            if("".equals(retMyRoot.getSysHead().getRet().getRetCode())
                    || "SYS99999".equals(retMyRoot.getSysHead().getRet().getRetCode())){
                logger.error("执行实现失败："+true+"且错误信息没有赋，请检查报错信息逻辑！"+retMyRoot.getSysHead().getRet().getRetCode());
                retMyRoot.getSysHead().setRetStatus("F");
                retMyRoot.getSysHead().getRet().setRetCode("99999999");
                retMyRoot.getSysHead().getRet().setRetMsg("执行"+myRoot.getSysHead().getServiceId()+"交易失败");
            }
            return retMyRoot;//检查失败
        }

        int ret = implmain(myRoot,retMyRoot);
        if( ret != 0 ){
            logger.error("调用服务失败"+ret);
            if("".equals(retMyRoot.getSysHead().getRet().getRetCode())
                    || "SYS99999".equals(retMyRoot.getSysHead().getRet().getRetCode())){
                logger.error("执行实现失败："+ret+"且错误信息没有赋，请检查报错信息逻辑！"+retMyRoot.getSysHead().getRet().getRetCode());
                retMyRoot.getSysHead().setRetStatus("F");
                retMyRoot.getSysHead().getRet().setRetCode("99999999");
                retMyRoot.getSysHead().getRet().setRetMsg("执行"+myRoot.getSysHead().getServiceId()+"交易失败");
            }
            return retMyRoot;
        }

        retMyRoot.getSysHead().setRetStatus("S");
        retMyRoot.getSysHead().getRet().setRetCode("00000000");
        retMyRoot.getSysHead().getRet().setRetMsg("交易成功");

        ReponseMain(retMyRoot);

        return retMyRoot;

    }

    public boolean mychange(Object fromobj,Object toobj,Class clz) {//成功返回false
        //1、得到clazz 对应的类中有哪些方法,不能获取private方法
        Method[] methods =clz.getMethods();
//        System.out.print("        getMethods: ");
//        for (Method method : methods){
//            logger.debug(method.getName() + ", ");
////            //获取指定的方法
////            Method methodExec = clz.getDeclaredMethod(method.getName());//第一个参数是方法名，后面的是方法里的参数
////            logger.debug("\nmethod : " + method);
//
//            //执行方法！
////            methodExec.invoke(obj)
////            Object obj = clz.newInstance();
////            method2.invoke(obj, "changwen", 22);
//        }

        Field[] fields = clz.getDeclaredFields();
//        for(Field f : fields) {
//            PropertyDescriptor pd = new PropertyDescriptor(f.getName(), clz);
//            Method wM = pd.getWriteMethod();//获得写方法
//            wM.invoke(clz, 2);//因为知道是int类型的属性，所以传个int过去就是了。。实际情况中需要判断下他的参数类型
//        }

        for(Field f : fields) {
//            logger.debug("field:"+f);
            try {
                PropertyDescriptor pd = new PropertyDescriptor(f.getName(), clz);
                Method rM = pd.getReadMethod();//获得读方法
                Method wM = pd.getWriteMethod();//获得写方法
                wM.invoke(toobj, rM.invoke(fromobj));
//                logger.debug(rM+":"+ rM.invoke(fromobj));
            }catch (IntrospectionException e){
                continue;
            }catch (Exception e){
                e.printStackTrace();
                StackTraceElement[] stackArray = e.getStackTrace();
                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < stackArray.length; i++) {
                    StackTraceElement element = stackArray[i];
                    sb.append(element.toString() + "\n  ");
                }
                logger.error("取得交易代码错误"+sb);
                return true;
            }
        }

        return false;
    }


    private boolean check(MyRoot myRoot,RetMyRoot retMyRoot){
        //sys控制检查
        SysHeadCheck sysHeadCheck = ApplicationContextHelper.popBean(SysHeadCheck.class);
        if(sysHeadCheck.controlone(myRoot,retMyRoot)){
            return true;//检查失败
        }
        //app控制检查
        AppHeadCheck appHeadCheck = new AppHeadCheck();
        if(appHeadCheck.controlone(myRoot)){
            return true;//检查失败
        }
        //other控制检查
        OtherHeadCheck otherHeadCheck = new OtherHeadCheck();
        if(otherHeadCheck.controlone(myRoot)){
            return true;//检查失败
        }
        return false;
    }

    public int implmain(MyRoot myRoot,RetMyRoot retMyRoot) {
        int ret=0;
        logger.info("调用："+myRoot.getSysHead().getServiceId());
        try {
            ret = myRoot.getBody().impl(myRoot,retMyRoot);
            if( ret != 0 ){
                if("".equals(retMyRoot.getSysHead().getRet().getRetCode())
                        || "SYS99999".equals(retMyRoot.getSysHead().getRet().getRetCode())){
                    logger.error("执行实现失败："+ret+"且错误信息没有赋，请检查报错信息逻辑！"+retMyRoot.getSysHead().getRet().getRetCode());
                    retMyRoot.getSysHead().setRetStatus("F");
                    retMyRoot.getSysHead().getRet().setRetCode("99999999");
                    retMyRoot.getSysHead().getRet().setRetMsg("执行"+myRoot.getSysHead().getServiceId()+"交易失败");
                }

                return 1;
            }
        }catch(Exception e){
            e.printStackTrace();
            StackTraceElement[] stackArray = e.getStackTrace();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < stackArray.length; i++) {
                StackTraceElement element = stackArray[i];
                sb.append(element.toString() + "\n");
            }
            logger.error("执行实现失败："+sb);
            if("".equals(retMyRoot.getSysHead().getRet().getRetCode())
                    || "SYS99999".equals(retMyRoot.getSysHead().getRet().getRetCode())){
                logger.error("执行实现失败："+ret+"且错误信息没有赋，请检查报错信息逻辑！"+retMyRoot.getSysHead().getRet().getRetCode());
                retMyRoot.getSysHead().setRetStatus("F");
                retMyRoot.getSysHead().getRet().setRetCode("99999999");
                retMyRoot.getSysHead().getRet().setRetMsg("执行"+myRoot.getSysHead().getServiceId()+"交易失败");
            }
            return 1;
        }

        return ret;
    }
    private int ReponseMain(RetMyRoot retMyRoot){
        //1、body处理 todo

        return 0;
    }
}
