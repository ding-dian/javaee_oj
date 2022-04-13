package com.hnitoj.mapper;

import com.hnitoj.pojo.Balloon;
import com.hnitoj.pojo.BalloonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BalloonMapper {
    int countByExample(BalloonExample example);

    int deleteByExample(BalloonExample example);

    int deleteByPrimaryKey(Integer balloonId);

    int insert(Balloon record);

    int insertSelective(Balloon record);

    List<Balloon> selectByExample(BalloonExample example);

    Balloon selectByPrimaryKey(Integer balloonId);

    int updateByExampleSelective(@Param("record") Balloon record, @Param("example") BalloonExample example);

    int updateByExample(@Param("record") Balloon record, @Param("example") BalloonExample example);

    int updateByPrimaryKeySelective(Balloon record);

    int updateByPrimaryKey(Balloon record);
}