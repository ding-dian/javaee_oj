package com.hnitoj.mapper;

import com.hnitoj.pojo.ContestProblem;
import com.hnitoj.pojo.ContestProblemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContestProblemMapper {
    int countByExample(ContestProblemExample example);

    int deleteByExample(ContestProblemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ContestProblem record);

    int insertSelective(ContestProblem record);

    List<ContestProblem> selectByExample(ContestProblemExample example);

    ContestProblem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ContestProblem record, @Param("example") ContestProblemExample example);

    int updateByExample(@Param("record") ContestProblem record, @Param("example") ContestProblemExample example);

    int updateByPrimaryKeySelective(ContestProblem record);

    int updateByPrimaryKey(ContestProblem record);
}