package com.hnitoj.mapper;

import com.hnitoj.pojo.SourceCode;
import com.hnitoj.pojo.SourceCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SourceCodeMapper {
    int countByExample(SourceCodeExample example);

    int deleteByExample(SourceCodeExample example);

    int deleteByPrimaryKey(Integer solutionId);

    int insert(SourceCode record);

    int insertSelective(SourceCode record);

    List<SourceCode> selectByExampleWithBLOBs(SourceCodeExample example);

    List<SourceCode> selectByExample(SourceCodeExample example);

    SourceCode selectByPrimaryKey(Integer solutionId);

    int updateByExampleSelective(@Param("record") SourceCode record, @Param("example") SourceCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") SourceCode record, @Param("example") SourceCodeExample example);

    int updateByExample(@Param("record") SourceCode record, @Param("example") SourceCodeExample example);

    int updateByPrimaryKeySelective(SourceCode record);

    int updateByPrimaryKeyWithBLOBs(SourceCode record);
}