package com.sgcc.mapper;

import com.sgcc.po.PlPhysicalGen;
import com.sgcc.po.PlPhysicalGenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlPhysicalGenMapper {
    int countByExample(PlPhysicalGenExample example);

    int deleteByExample(PlPhysicalGenExample example);

    int deleteByPrimaryKey(String genId);

    int insert(PlPhysicalGen record);

    int insertSelective(PlPhysicalGen record);

    List<PlPhysicalGen> selectByExample(PlPhysicalGenExample example);

    PlPhysicalGen selectByPrimaryKey(String genId);

    int updateByExampleSelective(@Param("record") PlPhysicalGen record, @Param("example") PlPhysicalGenExample example);

    int updateByExample(@Param("record") PlPhysicalGen record, @Param("example") PlPhysicalGenExample example);

    int updateByPrimaryKeySelective(PlPhysicalGen record);

    int updateByPrimaryKey(PlPhysicalGen record);
}