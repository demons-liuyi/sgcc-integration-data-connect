package com.sgcc.mapper;

import com.sgcc.po.PublicCoding;
import com.sgcc.po.PublicCodingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicCodingMapper {
    int countByExample(PublicCodingExample example);

    int deleteByExample(PublicCodingExample example);

    int deleteByPrimaryKey(String gencodeid);

    int insert(PublicCoding record);

    int insertSelective(PublicCoding record);

    List<PublicCoding> selectByExample(PublicCodingExample example);

    PublicCoding selectByPrimaryKey(String gencodeid);

    int updateByExampleSelective(@Param("record") PublicCoding record, @Param("example") PublicCodingExample example);

    int updateByExample(@Param("record") PublicCoding record, @Param("example") PublicCodingExample example);

    int updateByPrimaryKeySelective(PublicCoding record);

    int updateByPrimaryKey(PublicCoding record);
}