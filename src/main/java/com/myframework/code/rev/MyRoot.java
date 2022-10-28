package com.myframework.code.rev;
//rev
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
//        "mark": "mark1",
//        "name": "name",
//        "note": "note",
//        "creator": "fyb",
//        "createTime": "20200513 020939555",
//        "oprType": "1"
//        }
//}

//return
//{
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
//}
public class MyRoot
{
    private SysHead sysHead;

    private AppHead appHead;

    private OtherHead otherHead;

    private Body body;

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
        this.body = (Body) body;
    }
    public Body getBody(){
        return this.body;
    }
//    public static MyRoot fill(JSONObject jsonobj){
//        MyRoot entity = new MyRoot();
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
//    public static List<MyRoot> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<MyRoot> olist = new ArrayList<MyRoot>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
}