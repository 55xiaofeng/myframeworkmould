package com.myframework.code.rev;

import net.sf.json.JSONObject;
import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class AppHead
{
    public static AppHead fill(JSONObject jsonobj){
        AppHead entity = new AppHead();
        return entity;
    }
    public static List<AppHead> fillList(JSONArray jsonarray) {
        if (jsonarray == null || jsonarray.size() == 0)
            return null;
        List<AppHead> olist = new ArrayList<AppHead>();
        for (int i = 0; i < jsonarray.size(); i++) {
            olist.add(fill(jsonarray.getJSONObject(i)));
        }
        return olist;
    }
}