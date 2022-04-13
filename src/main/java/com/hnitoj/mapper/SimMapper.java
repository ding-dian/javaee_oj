package com.hnitoj.mapper;

import com.hnitoj.pojo.Sim;
import com.hnitoj.pojo.SimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimMapper {
    int countByExample(SimExample example);

    int deleteByExample(SimExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Sim record);

    int insertSelective(Sim record);

    List<Sim> selectByExample(SimExample example);

    Sim selectByPrimaryKey(Integer sId);

    int updateByExampleSelective(@Param("record") Sim record, @Param("example") SimExample example);

    int updateByExample(@Param("record") Sim record, @Param("example") SimExample example);

    int updateByPrimaryKeySelective(Sim record);

    int updateByPrimaryKey(Sim record);
}