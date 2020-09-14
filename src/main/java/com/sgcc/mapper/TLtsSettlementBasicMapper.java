package com.sgcc.mapper;

import com.sgcc.po.TLtsSettlementBasic;
import com.sgcc.po.TLtsSettlementBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLtsSettlementBasicMapper {
    int countByExample(TLtsSettlementBasicExample example);

    int deleteByExample(TLtsSettlementBasicExample example);

    int deleteByPrimaryKey(String settleId);

    int insert(TLtsSettlementBasic record);

    int insertSelective(TLtsSettlementBasic record);

    List<TLtsSettlementBasic> selectByExample(TLtsSettlementBasicExample example);

    TLtsSettlementBasic selectByPrimaryKey(String settleId);

    int updateByExampleSelective(@Param("record") TLtsSettlementBasic record, @Param("example") TLtsSettlementBasicExample example);

    int updateByExample(@Param("record") TLtsSettlementBasic record, @Param("example") TLtsSettlementBasicExample example);

    int updateByPrimaryKeySelective(TLtsSettlementBasic record);

    int updateByPrimaryKey(TLtsSettlementBasic record);
}