package com.myframework.code.rev;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.myframework.code.ret.RetMyRoot;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class Body
{
//    private String mark;
//
//    public void setMark(String mark){
//        this.mark = mark;
//    }
//    public String getMark(){
//        return this.mark;
//    }

    private Logger logger = null;

    public Body(){}

    public static Body fill(JSONObject jsonobj){
        Body entity = new Body();
        return entity;
    }
    public static List<Body> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<Body> olist = new ArrayList<Body>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
    @Transactional
    public int impl(MyRoot myRoot, RetMyRoot retMyRoot) throws Exception {
        logger = LoggerFactory.getLogger(Body.class);
        int ret = 0;
        try{

            ret = implreal( myRoot , retMyRoot );
            if( ret != 0 ){
                logger.error("执行服务"+myRoot.getSysHead().getServiceId()+"错误");
                if("".equals(retMyRoot.getSysHead().getRet().getRetCode())
                        || "SYS99999".equals(retMyRoot.getSysHead().getRet().getRetCode())){
                    retMyRoot.getSysHead().setRetStatus("F");
                    retMyRoot.getSysHead().getRet().setRetCode("99999999");
                    retMyRoot.getSysHead().getRet().setRetMsg("执行服务"+myRoot.getSysHead().getServiceId()+"错误");
                }
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//强制回滚事务
                logger.error("事务回滚");
                return 1;
            }
        }catch(Exception e){

            e.printStackTrace();
            StackTraceElement[] stackArray = e.getStackTrace();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < stackArray.length; i++) {
                StackTraceElement element = stackArray[i];
                sb.append(element.toString() + "\n  ");
            }
            logger.error("取得交易代码错误"+sb);

            logger.error("执行服务"+myRoot.getSysHead().getServiceId()+"抛异常");
            if("".equals(retMyRoot.getSysHead().getRet().getRetCode())
                    || "SYS99999".equals(retMyRoot.getSysHead().getRet().getRetCode())){
                retMyRoot.getSysHead().setRetStatus("F");
                retMyRoot.getSysHead().getRet().setRetCode("99999999");
                retMyRoot.getSysHead().getRet().setRetMsg("执行服务"+myRoot.getSysHead().getServiceId()+"抛异常");
            }
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//强制回滚事务
            logger.error("事务回滚");
            return 1;
        }
        return 0;
    }
    public int implreal(MyRoot myRoot, RetMyRoot retMyRoot) throws Exception {
        logger = LoggerFactory.getLogger(Body.class);
        logger.error("服务"+myRoot.getSysHead().getServiceId()+"对应的实现方法没有实现，请先实现");
        retMyRoot.getSysHead().setRetStatus("F");
        retMyRoot.getSysHead().getRet().setRetCode("99999999");
        retMyRoot.getSysHead().getRet().setRetMsg("服务"+myRoot.getSysHead().getServiceId()+"对应的实现方法没有实现，请先实现");
        return 1;
    }

}