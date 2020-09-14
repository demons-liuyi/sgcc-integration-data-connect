package com.sgcc.mapper;

import com.sgcc.po.PlSettleUnit;
import com.sgcc.po.PlSettleUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlSettleUnitMapper {
    int countByExample(PlSettleUnitExample example);

    int deleteByExample(PlSettleUnitExample example);

    int deleteByPrimaryKey(String settleId);

    int insert(PlSettleUnit record);

    int insertSelective(PlSettleUnit record);

    List<PlSettleUnit> selectByExample(PlSettleUnitExample example);

    PlSettleUnit selectByPrimaryKey(String settleId);

    int updateByExampleSelective(@Param("record") PlSettleUnit record, @Param("example") PlSettleUnitExample example);

    int updateByExample(@Param("record") PlSettleUnit record, @Param("example") PlSettleUnitExample example);

    int updateByPrimaryKeySelective(PlSettleUnit record);

    int updateByPrimaryKey(PlSettleUnit record);
}