package com.hnitoj.mapper;

import com.hnitoj.pojo.Custominput;
import com.hnitoj.pojo.CustominputExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustominputMapper {
    int countByExample(CustominputExample example);

    int deleteByExample(CustominputExample example);

    int deleteByPrimaryKey(Integer solutionId);

    int insert(Custominput record);

    int insertSelective(Custominput record);

    List<Custominput> selectByExampleWithBLOBs(CustominputExample example);

    List<Custominput> selectByExample(CustominputExample example);

    Custominput selectByPrimaryKey(Integer solutionId);

    int updateByExampleSelective(@Param("record") Custominput record, @Param("example") CustominputExample example);

    int updateByExampleWithBLOBs(@Param("record") Custominput record, @Param("example") CustominputExample example);

    int updateByExample(@Param("record") Custominput record, @Param("example") CustominputExample example);

    int updateByPrimaryKeySelective(Custominput record);

    int updateByPrimaryKeyWithBLOBs(Custominput record);
}