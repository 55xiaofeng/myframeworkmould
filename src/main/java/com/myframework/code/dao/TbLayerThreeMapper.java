package com.myframework.code.dao;

import com.myframework.code.entity.TbLayerThree;
import com.myframework.code.entity.TbLayerThreeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbLayerThreeMapper {
    long countByExample(TbLayerThreeExample example);

    int deleteByExample(TbLayerThreeExample example);

    int deleteByPrimaryKey(String layerThreeId);

    int insert(TbLayerThree record);

    int insertSelective(TbLayerThree record);

    List<TbLayerThree> selectByExample(TbLayerThreeExample example);

    TbLayerThree selectByPrimaryKey(String layerThreeId);

    int updateByExampleSelective(@Param("record") TbLayerThree record, @Param("example") TbLayerThreeExample example);

    int updateByExample(@Param("record") TbLayerThree record, @Param("example") TbLayerThreeExample example);

    int updateByPrimaryKeySelective(TbLayerThree record);

    int updateByPrimaryKey(TbLayerThree record);
}