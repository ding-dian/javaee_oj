package com.hnitoj.mapper;

import com.hnitoj.pojo.Solution;
import com.hnitoj.pojo.SolutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SolutionMapper {
    int countByExample(SolutionExample example);

    int deleteByExample(SolutionExample example);

    int deleteByPrimaryKey(Integer solutionId);

    int insert(Solution record);

    int insertSelective(Solution record);

    List<Solution> selectByExample(SolutionExample example);

    Solution selectByPrimaryKey(Integer solutionId);

    int updateByExampleSelective(@Param("record") Solution record, @Param("example") SolutionExample example);

    int updateByExample(@Param("record") Solution record, @Param("example") SolutionExample example);

    int updateByPrimaryKeySelective(Solution record);

    int updateByPrimaryKey(Solution record);
}