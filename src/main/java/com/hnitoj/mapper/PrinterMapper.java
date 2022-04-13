package com.hnitoj.mapper;

import com.hnitoj.pojo.Printer;
import com.hnitoj.pojo.PrinterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrinterMapper {
    int countByExample(PrinterExample example);

    int deleteByExample(PrinterExample example);

    int deleteByPrimaryKey(Integer printerId);

    int insert(Printer record);

    int insertSelective(Printer record);

    List<Printer> selectByExampleWithBLOBs(PrinterExample example);

    List<Printer> selectByExample(PrinterExample example);

    Printer selectByPrimaryKey(Integer printerId);

    int updateByExampleSelective(@Param("record") Printer record, @Param("example") PrinterExample example);

    int updateByExampleWithBLOBs(@Param("record") Printer record, @Param("example") PrinterExample example);

    int updateByExample(@Param("record") Printer record, @Param("example") PrinterExample example);

    int updateByPrimaryKeySelective(Printer record);

    int updateByPrimaryKeyWithBLOBs(Printer record);

    int updateByPrimaryKey(Printer record);
}