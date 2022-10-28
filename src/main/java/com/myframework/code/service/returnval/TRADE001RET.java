package com.myframework.code.service.returnval;

import com.myframework.code.ret.Body;

import java.util.List;

public class TRADE001RET extends Body {
    private String layerOneId;

    private String layerOneName;

    private String layerOneOtherContent;

    private List<TRADE001DETAILRET> trade001DETAILRETList;



    public String getLayerOneId() {
        return layerOneId;
    }

    public void setLayerOneId(String layerOneId) {
        this.layerOneId = layerOneId;
    }

    public String getLayerOneName() {
        return layerOneName;
    }

    public void setLayerOneName(String layerOneName) {
        this.layerOneName = layerOneName;
    }

    public String getLayerOneOtherContent() {
        return layerOneOtherContent;
    }

    public void setLayerOneOtherContent(String layerOneOtherContent) {
        this.layerOneOtherContent = layerOneOtherContent;
    }

    public List<TRADE001DETAILRET> getTrade001DETAILRETList() {
        return trade001DETAILRETList;
    }

    public void setTrade001DETAILRETList(List<TRADE001DETAILRET> trade001DETAILRETList) {
        this.trade001DETAILRETList = trade001DETAILRETList;
    }
}
