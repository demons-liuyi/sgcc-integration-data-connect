package com.sgcc.mapper;

import com.sgcc.po.PlGenUnitRelation;
import com.sgcc.po.PlGenUnitRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlGenUnitRelationMapper {
    int countByExample(PlGenUnitRelationExample example);

    int deleteByExample(PlGenUnitRelationExample example);

    int deleteByPrimaryKey(String relationId);

    int insert(PlGenUnitRelation record);

    int insertSelective(PlGenUnitRelation record);

    List<PlGenUnitRelation> selectByExample(PlGenUnitRelationExample example);

    PlGenUnitRelation selectByPrimaryKey(String relationId);

    int updateByExampleSelective(@Param("record") PlGenUnitRelation record, @Param("example") PlGenUnitRelationExample example);

    int updateByExample(@Param("record") PlGenUnitRelation record, @Param("example") PlGenUnitRelationExample example);

    int updateByPrimaryKeySelective(PlGenUnitRelation record);

    int updateByPrimaryKey(PlGenUnitRelation record);
}