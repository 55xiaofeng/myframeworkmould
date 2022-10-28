package com.myframework.code.entity;

public class TbLayerTwo {
    private String layerTwoId;

    private String layerTwoName;

    private String layerTwoOtherContent;

    public TbLayerTwo(String layerTwoId, String layerTwoName, String layerTwoOtherContent) {
        this.layerTwoId = layerTwoId;
        this.layerTwoName = layerTwoName;
        this.layerTwoOtherContent = layerTwoOtherContent;
    }

    public TbLayerTwo() {
        super();
    }

    public String getLayerTwoId() {
        return layerTwoId;
    }

    public void setLayerTwoId(String layerTwoId) {
        this.layerTwoId = layerTwoId == null ? null : layerTwoId.trim();
    }

    public String getLayerTwoName() {
        return layerTwoName;
    }

    public void setLayerTwoName(String layerTwoName) {
        this.layerTwoName = layerTwoName == null ? null : layerTwoName.trim();
    }

    public String getLayerTwoOtherContent() {
        return layerTwoOtherContent;
    }

    public void setLayerTwoOtherContent(String layerTwoOtherContent) {
        this.layerTwoOtherContent = layerTwoOtherContent == null ? null : layerTwoOtherContent.trim();
    }
}