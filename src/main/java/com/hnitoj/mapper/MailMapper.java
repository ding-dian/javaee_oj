package com.hnitoj.mapper;

import com.hnitoj.pojo.Mail;
import com.hnitoj.pojo.MailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MailMapper {
    int countByExample(MailExample example);

    int deleteByExample(MailExample example);

    int deleteByPrimaryKey(Integer mailId);

    int insert(Mail record);

    int insertSelective(Mail record);

    List<Mail> selectByExampleWithBLOBs(MailExample example);

    List<Mail> selectByExample(MailExample example);

    Mail selectByPrimaryKey(Integer mailId);

    int updateByExampleSelective(@Param("record") Mail record, @Param("example") MailExample example);

    int updateByExampleWithBLOBs(@Param("record") Mail record, @Param("example") MailExample example);

    int updateByExample(@Param("record") Mail record, @Param("example") MailExample example);

    int updateByPrimaryKeySelective(Mail record);

    int updateByPrimaryKeyWithBLOBs(Mail record);

    int updateByPrimaryKey(Mail record);
}