package com.myframework.code.dao;

import com.myframework.code.entity.TbOneRelTwo;
import com.myframework.code.entity.TbOneRelTwoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TbOneRelTwoMapper {
    long countByExample(TbOneRelTwoExample example);

    int deleteByExample(TbOneRelTwoExample example);

    int deleteByPrimaryKey(@Param("layerOneId") String layerOneId, @Param("layerTwoId") String layerTwoId);

    int insert(TbOneRelTwo record);

    int insertSelective(TbOneRelTwo record);

    List<TbOneRelTwo> selectByExample(TbOneRelTwoExample example);

    TbOneRelTwo selectByPrimaryKey(@Param("layerOneId") String layerOneId, @Param("layerTwoId") String layerTwoId);

    int updateByExampleSelective(@Param("record") TbOneRelTwo record, @Param("example") TbOneRelTwoExample example);

    int updateByExample(@Param("record") TbOneRelTwo record, @Param("example") TbOneRelTwoExample example);

    int updateByPrimaryKeySelective(TbOneRelTwo record);

    int updateByPrimaryKey(TbOneRelTwo record);
}