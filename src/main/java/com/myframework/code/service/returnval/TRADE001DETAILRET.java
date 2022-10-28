package com.myframework.code.service.returnval;

import com.myframework.code.ret.Body;

public class TRADE001DETAILRET extends Body {
    private String layerOneId;

    private String layerTwoId;

    private String status;

    public String getLayerOneId() {
        return layerOneId;
    }

    public void setLayerOneId(String layerOneId) {
        this.layerOneId = layerOneId;
    }

    public String getLayerTwoId() {
        return layerTwoId;
    }

    public void setLayerTwoId(String layerTwoId) {
        this.layerTwoId = layerTwoId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
