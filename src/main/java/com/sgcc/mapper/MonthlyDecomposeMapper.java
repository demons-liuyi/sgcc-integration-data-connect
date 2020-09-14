package com.sgcc.mapper;

import com.sgcc.po.MonthlyDecompose;
import com.sgcc.po.MonthlyDecomposeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthlyDecomposeMapper {
    int countByExample(MonthlyDecomposeExample example);

    int deleteByExample(MonthlyDecomposeExample example);

    int deleteByPrimaryKey(String decomposeId);

    int insert(MonthlyDecompose record);

    int insertSelective(MonthlyDecompose record);

    List<MonthlyDecompose> selectByExample(MonthlyDecomposeExample example);

    MonthlyDecompose selectByPrimaryKey(String decomposeId);

    int updateByExampleSelective(@Param("record") MonthlyDecompose record, @Param("example") MonthlyDecomposeExample example);

    int updateByExample(@Param("record") MonthlyDecompose record, @Param("example") MonthlyDecomposeExample example);

    int updateByPrimaryKeySelective(MonthlyDecompose record);

    int updateByPrimaryKey(MonthlyDecompose record);
}