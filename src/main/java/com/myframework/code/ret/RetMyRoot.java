package com.myframework.code.ret;
//return
//{
//        "RetMyRoot": {
//        "sysHead": {
//        "retStatus": "retStatus",
//        "ret": {
//        "retCode": "00000000",
//        "retMsg": "交易成功"
//        },
//        "tranDate": "tranDate",
//        "seqNo": "seqNo",
//        "tranTimestamp": "tranTimestamp"
//        },
//        "appHead": {},
//        "otherHead": {},
//        "body": {}
//        }
//}

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class RetMyRoot
{
    private SysHead sysHead = new SysHead();

    private AppHead appHead = new AppHead();

    private OtherHead otherHead = new OtherHead();

    private Body body = new Body();

    public void setSysHead(SysHead sysHead){
        this.sysHead = sysHead;
    }
    public SysHead getSysHead(){
        return this.sysHead;
    }
    public void setAppHead(AppHead appHead){
        this.appHead = appHead;
    }
    public AppHead getAppHead(){
        return this.appHead;
    }
    public void setOtherHead(OtherHead otherHead){
        this.otherHead = otherHead;
    }
    public OtherHead getOtherHead(){
        return this.otherHead;
    }
    public void setBody(Body body){
        this.body = body;
    }
    public Body getBody(){
        return this.body;
    }
//    public static RetMyRoot fill(JSONObject jsonobj){
//        RetMyRoot entity = new RetMyRoot();
//        if (jsonobj.containsKey("sysHead")) {
//            entity.setSysHead(jsonobj.getSysHead("sysHead"));
//        }
//        if (jsonobj.containsKey("appHead")) {
//            entity.setAppHead(jsonobj.getAppHead("appHead"));
//        }
//        if (jsonobj.containsKey("otherHead")) {
//            entity.setOtherHead(jsonobj.getOtherHead("otherHead"));
//        }
//        if (jsonobj.containsKey("body")) {
//            entity.setBody(jsonobj.getBody("body"));
//        }
//        return entity;
//    }
//    public static List<RetMyRoot> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<RetMyRoot> olist = new ArrayList<RetMyRoot>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
}
