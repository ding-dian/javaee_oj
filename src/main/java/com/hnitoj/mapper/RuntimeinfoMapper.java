package com.hnitoj.mapper;

import com.hnitoj.pojo.Runtimeinfo;
import com.hnitoj.pojo.RuntimeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RuntimeinfoMapper {
    int countByExample(RuntimeinfoExample example);

    int deleteByExample(RuntimeinfoExample example);

    int deleteByPrimaryKey(Integer solutionId);

    int insert(Runtimeinfo record);

    int insertSelective(Runtimeinfo record);

    List<Runtimeinfo> selectByExampleWithBLOBs(RuntimeinfoExample example);

    List<Runtimeinfo> selectByExample(RuntimeinfoExample example);

    Runtimeinfo selectByPrimaryKey(Integer solutionId);

    int updateByExampleSelective(@Param("record") Runtimeinfo record, @Param("example") RuntimeinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Runtimeinfo record, @Param("example") RuntimeinfoExample example);

    int updateByExample(@Param("record") Runtimeinfo record, @Param("example") RuntimeinfoExample example);

    int updateByPrimaryKeySelective(Runtimeinfo record);

    int updateByPrimaryKeyWithBLOBs(Runtimeinfo record);
}