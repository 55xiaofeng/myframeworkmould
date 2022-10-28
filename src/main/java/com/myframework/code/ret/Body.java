package com.myframework.code.ret;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Body
{
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
}