package com.myframework.code.entity;

public class TbLayerOne {
    private String layerOneId;

    private String layerOneName;

    private String layerOneOtherContent;

    public TbLayerOne(String layerOneId, String layerOneName, String layerOneOtherContent) {
        this.layerOneId = layerOneId;
        this.layerOneName = layerOneName;
        this.layerOneOtherContent = layerOneOtherContent;
    }

    public TbLayerOne() {
        super();
    }

    public String getLayerOneId() {
        return layerOneId;
    }

    public void setLayerOneId(String layerOneId) {
        this.layerOneId = layerOneId == null ? null : layerOneId.trim();
    }

    public String getLayerOneName() {
        return layerOneName;
    }

    public void setLayerOneName(String layerOneName) {
        this.layerOneName = layerOneName == null ? null : layerOneName.trim();
    }

    public String getLayerOneOtherContent() {
        return layerOneOtherContent;
    }

    public void setLayerOneOtherContent(String layerOneOtherContent) {
        this.layerOneOtherContent = layerOneOtherContent == null ? null : layerOneOtherContent.trim();
    }
}