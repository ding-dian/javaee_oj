package com.hnitoj.mapper;

import com.hnitoj.pojo.Compileinfo;
import com.hnitoj.pojo.CompileinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompileinfoMapper {
    int countByExample(CompileinfoExample example);

    int deleteByExample(CompileinfoExample example);

    int deleteByPrimaryKey(Integer solutionId);

    int insert(Compileinfo record);

    int insertSelective(Compileinfo record);

    List<Compileinfo> selectByExampleWithBLOBs(CompileinfoExample example);

    List<Compileinfo> selectByExample(CompileinfoExample example);

    Compileinfo selectByPrimaryKey(Integer solutionId);

    int updateByExampleSelective(@Param("record") Compileinfo record, @Param("example") CompileinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") Compileinfo record, @Param("example") CompileinfoExample example);

    int updateByExample(@Param("record") Compileinfo record, @Param("example") CompileinfoExample example);

    int updateByPrimaryKeySelective(Compileinfo record);

    int updateByPrimaryKeyWithBLOBs(Compileinfo record);
}