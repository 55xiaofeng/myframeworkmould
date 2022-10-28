package com.myframework.code.service;

import com.myframework.code.dao.*;
import com.myframework.code.entity.*;
import com.myframework.code.ret.RetMyRoot;
import com.myframework.code.rev.Body;
import com.myframework.code.rev.MyRoot;
import com.myframework.code.service.returnval.TRADE001DETAILRET;
import com.myframework.code.service.returnval.TRADE001RET;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
//举例
//{
//        "sysHead": {
//        "serviceId": "DOMAIN001",
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
//        "mark": "mark5",
//        "name": "nameadfasdf1",
//        "note": "noteadfadsf",
//        "creator": "sysadmin",
//        "createTime": "20200513 020939555",
//        "oprType": "2"
//        }
//}

@Transactional
@Service()
public class TRADE001 extends Body
{
//    static {
//        logger.debug("DOMAIN001初始化了");
    //    }

    @Autowired
    private TbLayerOneMapper tbLayerOneMapper;
    @Autowired
    private TbOneRelTwoMapper tbOneRelTwoMapper;

    private Logger logger = null;

    private String layerOneId;


    public TRADE001RET TRADE001Ret;

    public String getLayerOneId() {
        return layerOneId;
    }

    public void setLayerOneId(String layerOneId) {
        this.layerOneId = layerOneId;
    }

    public TRADE001RET getTRADE001Ret() {
        return TRADE001Ret;
    }

    public void setTRADE001Ret(TRADE001RET TRADE001Ret) {
        this.TRADE001Ret = TRADE001Ret;
    }


    public TRADE001 initi(TRADE001 TRADE001){
        TRADE001 TRADE001Temp = new TRADE001();
        TRADE001Temp.setLayerOneId(TRADE001.getLayerOneId());

        return TRADE001Temp;
    }

//    @Transactional
    public int implreal(MyRoot myRoot, RetMyRoot retMyRoot)  {
        logger = LoggerFactory.getLogger(TRADE001.class);

        logger.info("调用到服务DOMAIN001");
        int ret=0;
        TRADE001 TRADE001 = initi((TRADE001) myRoot.getBody());
        TRADE001RET TRADE001Ret = new TRADE001RET();

        TbLayerOneExample tbLayerOneExample = new TbLayerOneExample();
        TbLayerOneExample.Criteria criteriaTbLayerOne = tbLayerOneExample.createCriteria();
        criteriaTbLayerOne.andLayerOneIdEqualTo(TRADE001.getLayerOneId());
        List<TbLayerOne> listTbProjectTemp = tbLayerOneMapper.selectByExample(tbLayerOneExample);
        logger.info("取得数据【"+listTbProjectTemp.get(0).getLayerOneName()+"】【"+listTbProjectTemp.get(0).getLayerOneOtherContent()+"】");
        TRADE001Ret.setLayerOneId(listTbProjectTemp.get(0).getLayerOneId());
        TRADE001Ret.setLayerOneName(listTbProjectTemp.get(0).getLayerOneName());
        TRADE001Ret.setLayerOneOtherContent(listTbProjectTemp.get(0).getLayerOneOtherContent());
        retMyRoot.setBody(TRADE001Ret);

        TbOneRelTwoExample tbOneRelTwoExample =  new TbOneRelTwoExample();
        TbOneRelTwoExample.Criteria criteriaTbOneRelTwo = tbOneRelTwoExample.createCriteria();
        criteriaTbOneRelTwo.andLayerOneIdEqualTo(TRADE001.getLayerOneId());
        List<TbOneRelTwo> listTbOneRelTwoTemp = tbOneRelTwoMapper.selectByExample(tbOneRelTwoExample);
        List<TRADE001DETAILRET> trade001DETAILRETList = new ArrayList<TRADE001DETAILRET>();
        for( int i = 0 ; i<listTbOneRelTwoTemp.size();i++){
            TRADE001DETAILRET one =  new TRADE001DETAILRET();
            one.setLayerOneId(listTbOneRelTwoTemp.get(i).getLayerOneId());
            one.setLayerTwoId(listTbOneRelTwoTemp.get(i).getLayerTwoId());
            one.setStatus(listTbOneRelTwoTemp.get(i).getStatus());
            trade001DETAILRETList.add(one);
        }
        TRADE001Ret.setTrade001DETAILRETList( trade001DETAILRETList );
        retMyRoot.setBody(TRADE001Ret);
        return 0;
    }



}
