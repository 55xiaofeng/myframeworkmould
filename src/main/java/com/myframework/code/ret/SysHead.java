package com.myframework.code.ret;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class SysHead
{
    private String retStatus;

    private Ret ret = new Ret();

    private String tranDate;

    private String seqNo;

    private String tranTimestamp;

    public void setRetStatus(String retStatus){
        this.retStatus = retStatus;
    }
    public String getRetStatus(){
        return this.retStatus;
    }
    public void setRet(Ret ret){
        this.ret = ret;
    }
    public Ret getRet(){
        return this.ret;
    }
    public void setTranDate(String tranDate){
        this.tranDate = tranDate;
    }
    public String getTranDate(){
        return this.tranDate;
    }
    public void setSeqNo(String seqNo){
        this.seqNo = seqNo;
    }
    public String getSeqNo(){
        return this.seqNo;
    }
    public void setTranTimestamp(String tranTimestamp){
        this.tranTimestamp = tranTimestamp;
    }
    public String getTranTimestamp(){
        return this.tranTimestamp;
    }
//    public static SysHead fill(JSONObject jsonobj){
//        SysHead entity = new SysHead();
//        if (jsonobj.containsKey("retStatus")) {
//            entity.setRetStatus(jsonobj.getString("retStatus"));
//        }
//        if (jsonobj.containsKey("ret")) {
//            entity.setRet(jsonobj.getRet("ret"));
//        }
//        if (jsonobj.containsKey("tranDate")) {
//            entity.setTranDate(jsonobj.getString("tranDate"));
//        }
//        if (jsonobj.containsKey("seqNo")) {
//            entity.setSeqNo(jsonobj.getString("seqNo"));
//        }
//        if (jsonobj.containsKey("tranTimestamp")) {
//            entity.setTranTimestamp(jsonobj.getString("tranTimestamp"));
//        }
//        return entity;
//    }
//    public static List<SysHead> fillList(JSONArray jsonarray) {
//        if (jsonarray == null || jsonarray.size() == 0)
//            return null;
//        List<SysHead> olist = new ArrayList<SysHead>();
//        for (int i = 0; i < jsonarray.size(); i++) {
//            olist.add(fill(jsonarray.getJSONObject(i)));
//        }
//        return olist;
//    }
}