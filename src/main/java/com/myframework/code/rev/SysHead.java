package com.myframework.code.rev;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class SysHead
{
    private String serviceId;

    private String userId;

    private String tranDate;

    private String tranTimestamp;

    private String systemId;

    private String seqNo;

    private String globalSeqNo;

    private Integer id;

    public void setServiceId(String serviceId){
        this.serviceId = serviceId;
    }
    public String getServiceId(){
        return this.serviceId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }
    public String getUserId(){
        return this.userId;
    }
    public void setTranDate(String tranDate){
        this.tranDate = tranDate;
    }
    public String getTranDate(){
        return this.tranDate;
    }
    public void setTranTimestamp(String tranTimestamp){
        this.tranTimestamp = tranTimestamp;
    }
    public String getTranTimestamp(){
        return this.tranTimestamp;
    }
    public void setSystemId(String systemId){
        this.systemId = systemId;
    }
    public String getSystemId(){
        return this.systemId;
    }
    public void setSeqNo(String seqNo){
        this.seqNo = seqNo;
    }
    public String getSeqNo(){
        return this.seqNo;
    }
    public void setGlobalSeqNo(String globalSeqNo){
        this.globalSeqNo = globalSeqNo;
    }
    public String getGlobalSeqNo(){
        return this.globalSeqNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static SysHead fill(JSONObject jsonobj){
        SysHead entity = new SysHead();
        if (jsonobj.containsKey("serviceId")) {
            entity.setServiceId(jsonobj.getString("serviceId"));
        }
        if (jsonobj.containsKey("userId")) {
            entity.setUserId(jsonobj.getString("userId"));
        }
        if (jsonobj.containsKey("tranDate")) {
            entity.setTranDate(jsonobj.getString("tranDate"));
        }
        if (jsonobj.containsKey("tranTimestamp")) {
            entity.setTranTimestamp(jsonobj.getString("tranTimestamp"));
        }
        if (jsonobj.containsKey("systemId")) {
            entity.setSystemId(jsonobj.getString("systemId"));
        }
        if (jsonobj.containsKey("seqNo")) {
            entity.setSeqNo(jsonobj.getString("seqNo"));
        }
        if (jsonobj.containsKey("globalSeqNo")) {
            entity.setGlobalSeqNo(jsonobj.getString("globalSeqNo"));
        }
        return entity;
    }
    public static List<SysHead> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<SysHead> olist = new ArrayList<SysHead>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}