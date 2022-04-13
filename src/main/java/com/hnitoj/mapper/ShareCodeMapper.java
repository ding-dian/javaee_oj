package com.hnitoj.mapper;

import com.hnitoj.pojo.ShareCode;
import com.hnitoj.pojo.ShareCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShareCodeMapper {
    int countByExample(ShareCodeExample example);

    int deleteByExample(ShareCodeExample example);

    int deleteByPrimaryKey(Integer shareId);

    int insert(ShareCode record);

    int insertSelective(ShareCode record);

    List<ShareCode> selectByExampleWithBLOBs(ShareCodeExample example);

    List<ShareCode> selectByExample(ShareCodeExample example);

    ShareCode selectByPrimaryKey(Integer shareId);

    int updateByExampleSelective(@Param("record") ShareCode record, @Param("example") ShareCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") ShareCode record, @Param("example") ShareCodeExample example);

    int updateByExample(@Param("record") ShareCode record, @Param("example") ShareCodeExample example);

    int updateByPrimaryKeySelective(ShareCode record);

    int updateByPrimaryKeyWithBLOBs(ShareCode record);

    int updateByPrimaryKey(ShareCode record);
}