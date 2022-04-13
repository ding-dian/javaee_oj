package com.hnitoj.mapper;

import com.hnitoj.pojo.Problem;
import com.hnitoj.pojo.ProblemExample;
import com.hnitoj.pojo.ProblemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProblemMapper {
    int countByExample(ProblemExample example);

    int deleteByExample(ProblemExample example);

    int deleteByPrimaryKey(Integer problemId);

    int insert(ProblemWithBLOBs record);

    int insertSelective(ProblemWithBLOBs record);

    List<ProblemWithBLOBs> selectByExampleWithBLOBs(ProblemExample example);

    List<Problem> selectByExample(ProblemExample example);

    ProblemWithBLOBs selectByPrimaryKey(Integer problemId);

    int updateByExampleSelective(@Param("record") ProblemWithBLOBs record, @Param("example") ProblemExample example);

    int updateByExampleWithBLOBs(@Param("record") ProblemWithBLOBs record, @Param("example") ProblemExample example);

    int updateByExample(@Param("record") Problem record, @Param("example") ProblemExample example);

    int updateByPrimaryKeySelective(ProblemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ProblemWithBLOBs record);

    int updateByPrimaryKey(Problem record);
}