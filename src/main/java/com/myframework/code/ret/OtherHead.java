package com.myframework.code.ret;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class OtherHead
{
    public static OtherHead fill(JSONObject jsonobj){
        OtherHead entity = new OtherHead();
        return entity;
    }
    public static List<OtherHead> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<OtherHead> olist = new ArrayList<OtherHead>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}