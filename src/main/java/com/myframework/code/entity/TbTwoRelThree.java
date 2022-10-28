package com.myframework.code.entity;

public class TbTwoRelThree {
    private String layerTwoId;

    private String layerThreeId;

    private String status;

    public TbTwoRelThree(String layerTwoId, String layerThreeId, String status) {
        this.layerTwoId = layerTwoId;
        this.layerThreeId = layerThreeId;
        this.status = status;
    }

    public TbTwoRelThree() {
        super();
    }

    public String getLayerTwoId() {
        return layerTwoId;
    }

    public void setLayerTwoId(String layerTwoId) {
        this.layerTwoId = layerTwoId == null ? null : layerTwoId.trim();
    }

    public String getLayerThreeId() {
        return layerThreeId;
    }

    public void setLayerThreeId(String layerThreeId) {
        this.layerThreeId = layerThreeId == null ? null : layerThreeId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}