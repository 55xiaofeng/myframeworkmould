package com.myframework.code.ret;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Ret
{
    private String retCode;

    private String retMsg;

    public void setRetCode(String retCode){
        this.retCode = retCode;
    }
    public String getRetCode(){
        return this.retCode;
    }
    public void setRetMsg(String retMsg){
        this.retMsg = retMsg;
    }
    public String getRetMsg(){
        return this.retMsg;
    }
    public static Ret fill(JSONObject jsonobj){
        Ret entity = new Ret();
        if (jsonobj.containsKey("retCode")) {
            entity.setRetCode(jsonobj.getString("retCode"));
        }
        if (jsonobj.containsKey("retMsg")) {
            entity.setRetMsg(jsonobj.getString("retMsg"));
        }
        return entity;
    }
    public static List<Ret> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<Ret> olist = new ArrayList<Ret>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}