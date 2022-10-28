package com.myframework.code.entity;

public class TbLayerThree {
    private String layerThreeId;

    private String layerThreeName;

    private String layerThreeOtherContent;

    public TbLayerThree(String layerThreeId, String layerThreeName, String layerThreeOtherContent) {
        this.layerThreeId = layerThreeId;
        this.layerThreeName = layerThreeName;
        this.layerThreeOtherContent = layerThreeOtherContent;
    }

    public TbLayerThree() {
        super();
    }

    public String getLayerThreeId() {
        return layerThreeId;
    }

    public void setLayerThreeId(String layerThreeId) {
        this.layerThreeId = layerThreeId == null ? null : layerThreeId.trim();
    }

    public String getLayerThreeName() {
        return layerThreeName;
    }

    public void setLayerThreeName(String layerThreeName) {
        this.layerThreeName = layerThreeName == null ? null : layerThreeName.trim();
    }

    public String getLayerThreeOtherContent() {
        return layerThreeOtherContent;
    }

    public void setLayerThreeOtherContent(String layerThreeOtherContent) {
        this.layerThreeOtherContent = layerThreeOtherContent == null ? null : layerThreeOtherContent.trim();
    }
}