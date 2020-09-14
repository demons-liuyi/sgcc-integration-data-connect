package com.sgcc.mapper;

import com.sgcc.po.MarketMember;
import com.sgcc.po.MarketMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketMemberMapper {
    int countByExample(MarketMemberExample example);

    int deleteByExample(MarketMemberExample example);

    int deleteByPrimaryKey(String id);

    int insert(MarketMember record);

    int insertSelective(MarketMember record);

    List<MarketMember> selectByExample(MarketMemberExample example);

    MarketMember selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MarketMember record, @Param("example") MarketMemberExample example);

    int updateByExample(@Param("record") MarketMember record, @Param("example") MarketMemberExample example);

    int updateByPrimaryKeySelective(MarketMember record);

    int updateByPrimaryKey(MarketMember record);
}