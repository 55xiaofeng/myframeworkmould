package com.myframework.code.dao;

import com.myframework.code.entity.TbTwoRelThree;
import com.myframework.code.entity.TbTwoRelThreeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbTwoRelThreeMapper {
    long countByExample(TbTwoRelThreeExample example);

    int deleteByExample(TbTwoRelThreeExample example);

    int deleteByPrimaryKey(@Param("layerTwoId") String layerTwoId, @Param("layerThreeId") String layerThreeId);

    int insert(TbTwoRelThree record);

    int insertSelective(TbTwoRelThree record);

    List<TbTwoRelThree> selectByExample(TbTwoRelThreeExample example);

    TbTwoRelThree selectByPrimaryKey(@Param("layerTwoId") String layerTwoId, @Param("layerThreeId") String layerThreeId);

    int updateByExampleSelective(@Param("record") TbTwoRelThree record, @Param("example") TbTwoRelThreeExample example);

    int updateByExample(@Param("record") TbTwoRelThree record, @Param("example") TbTwoRelThreeExample example);

    int updateByPrimaryKeySelective(TbTwoRelThree record);

    int updateByPrimaryKey(TbTwoRelThree record);
}