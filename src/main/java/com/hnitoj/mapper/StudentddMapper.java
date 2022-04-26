package com.hnitoj.mapper;

import com.hnitoj.pojo.Studentdd;
import com.hnitoj.pojo.StudentddExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentddMapper {
    int countByExample(StudentddExample example);

    int deleteByExample(StudentddExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Studentdd record);

    int insertSelective(Studentdd record);

    List<Studentdd> selectByExample(StudentddExample example);

    Studentdd selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Studentdd record, @Param("example") StudentddExample example);

    int updateByExample(@Param("record") Studentdd record, @Param("example") StudentddExample example);

    int updateByPrimaryKeySelective(Studentdd record);

    int updateByPrimaryKey(Studentdd record);

    /*自定义sql*/
    int updateById(Studentdd record);

    List<Studentdd> getPage(StudentddExample example);

    int addBatch(Studentdd record);
}