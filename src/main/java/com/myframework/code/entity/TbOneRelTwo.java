package com.myframework.code.entity;

public class TbOneRelTwo {
    private String layerOneId;

    private String layerTwoId;

    private String status;

    public TbOneRelTwo(String layerOneId, String layerTwoId, String status) {
        this.layerOneId = layerOneId;
        this.layerTwoId = layerTwoId;
        this.status = status;
    }

    public TbOneRelTwo() {
        super();
    }

    public String getLayerOneId() {
        return layerOneId;
    }

    public void setLayerOneId(String layerOneId) {
        this.layerOneId = layerOneId == null ? null : layerOneId.trim();
    }

    public String getLayerTwoId() {
        return layerTwoId;
    }

    public void setLayerTwoId(String layerTwoId) {
        this.layerTwoId = layerTwoId == null ? null : layerTwoId.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}