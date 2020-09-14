package com.sgcc.mapper;

import com.sgcc.po.PlContract;
import com.sgcc.po.PlContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlContractMapper {
    int countByExample(PlContractExample example);

    int deleteByExample(PlContractExample example);

    int deleteByPrimaryKey(String contractId);

    int insert(PlContract record);

    int insertSelective(PlContract record);

    List<PlContract> selectByExample(PlContractExample example);

    PlContract selectByPrimaryKey(String contractId);

    int updateByExampleSelective(@Param("record") PlContract record, @Param("example") PlContractExample example);

    int updateByExample(@Param("record") PlContract record, @Param("example") PlContractExample example);

    int updateByPrimaryKeySelective(PlContract record);

    int updateByPrimaryKey(PlContract record);
}