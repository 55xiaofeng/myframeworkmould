package com.myframework.code.dao;

import com.myframework.code.entity.TbLayerTwo;
import com.myframework.code.entity.TbLayerTwoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbLayerTwoMapper {
    long countByExample(TbLayerTwoExample example);

    int deleteByExample(TbLayerTwoExample example);

    int deleteByPrimaryKey(String layerTwoId);

    int insert(TbLayerTwo record);

    int insertSelective(TbLayerTwo record);

    List<TbLayerTwo> selectByExample(TbLayerTwoExample example);

    TbLayerTwo selectByPrimaryKey(String layerTwoId);

    int updateByExampleSelective(@Param("record") TbLayerTwo record, @Param("example") TbLayerTwoExample example);

    int updateByExample(@Param("record") TbLayerTwo record, @Param("example") TbLayerTwoExample example);

    int updateByPrimaryKeySelective(TbLayerTwo record);

    int updateByPrimaryKey(TbLayerTwo record);
}