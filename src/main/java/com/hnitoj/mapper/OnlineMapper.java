package com.hnitoj.mapper;

import com.hnitoj.pojo.Online;
import com.hnitoj.pojo.OnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OnlineMapper {
    int countByExample(OnlineExample example);

    int deleteByExample(OnlineExample example);

    int deleteByPrimaryKey(String hash);

    int insert(Online record);

    int insertSelective(Online record);

    List<Online> selectByExample(OnlineExample example);

    Online selectByPrimaryKey(String hash);

    int updateByExampleSelective(@Param("record") Online record, @Param("example") OnlineExample example);

    int updateByExample(@Param("record") Online record, @Param("example") OnlineExample example);

    int updateByPrimaryKeySelective(Online record);

    int updateByPrimaryKey(Online record);
}