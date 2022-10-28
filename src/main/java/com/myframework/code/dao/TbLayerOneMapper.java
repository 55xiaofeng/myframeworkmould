package com.myframework.code.dao;

import com.myframework.code.entity.TbLayerOne;
import com.myframework.code.entity.TbLayerOneExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbLayerOneMapper {
    long countByExample(TbLayerOneExample example);

    int deleteByExample(TbLayerOneExample example);

    int deleteByPrimaryKey(String layerOneId);

    int insert(TbLayerOne record);

    int insertSelective(TbLayerOne record);

    List<TbLayerOne> selectByExample(TbLayerOneExample example);

    TbLayerOne selectByPrimaryKey(String layerOneId);

    int updateByExampleSelective(@Param("record") TbLayerOne record, @Param("example") TbLayerOneExample example);

    int updateByExample(@Param("record") TbLayerOne record, @Param("example") TbLayerOneExample example);

    int updateByPrimaryKeySelective(TbLayerOne record);

    int updateByPrimaryKey(TbLayerOne record);
}