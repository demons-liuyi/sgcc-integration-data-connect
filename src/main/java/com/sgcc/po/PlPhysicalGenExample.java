package com.sgcc.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlPhysicalGenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlPhysicalGenExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGenIdIsNull() {
            addCriterion("GEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andGenIdIsNotNull() {
            addCriterion("GEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGenIdEqualTo(String value) {
            addCriterion("GEN_ID =", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotEqualTo(String value) {
            addCriterion("GEN_ID <>", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdGreaterThan(String value) {
            addCriterion("GEN_ID >", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdGreaterThanOrEqualTo(String value) {
            addCriterion("GEN_ID >=", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdLessThan(String value) {
            addCriterion("GEN_ID <", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdLessThanOrEqualTo(String value) {
            addCriterion("GEN_ID <=", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdLike(String value) {
            addCriterion("GEN_ID like", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotLike(String value) {
            addCriterion("GEN_ID not like", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdIn(List<String> values) {
            addCriterion("GEN_ID in", values, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotIn(List<String> values) {
            addCriterion("GEN_ID not in", values, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdBetween(String value1, String value2) {
            addCriterion("GEN_ID between", value1, value2, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotBetween(String value1, String value2) {
            addCriterion("GEN_ID not between", value1, value2, "genId");
            return (Criteria) this;
        }

        public Criteria andGenNameIsNull() {
            addCriterion("GEN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGenNameIsNotNull() {
            addCriterion("GEN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGenNameEqualTo(String value) {
            addCriterion("GEN_NAME =", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameNotEqualTo(String value) {
            addCriterion("GEN_NAME <>", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameGreaterThan(String value) {
            addCriterion("GEN_NAME >", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameGreaterThanOrEqualTo(String value) {
            addCriterion("GEN_NAME >=", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameLessThan(String value) {
            addCriterion("GEN_NAME <", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameLessThanOrEqualTo(String value) {
            addCriterion("GEN_NAME <=", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameLike(String value) {
            addCriterion("GEN_NAME like", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameNotLike(String value) {
            addCriterion("GEN_NAME not like", value, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameIn(List<String> values) {
            addCriterion("GEN_NAME in", values, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameNotIn(List<String> values) {
            addCriterion("GEN_NAME not in", values, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameBetween(String value1, String value2) {
            addCriterion("GEN_NAME between", value1, value2, "genName");
            return (Criteria) this;
        }

        public Criteria andGenNameNotBetween(String value1, String value2) {
            addCriterion("GEN_NAME not between", value1, value2, "genName");
            return (Criteria) this;
        }

        public Criteria andGenCodeIsNull() {
            addCriterion("GEN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGenCodeIsNotNull() {
            addCriterion("GEN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGenCodeEqualTo(String value) {
            addCriterion("GEN_CODE =", value, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeNotEqualTo(String value) {
            addCriterion("GEN_CODE <>", value, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeGreaterThan(String value) {
            addCriterion("GEN_CODE >", value, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GEN_CODE >=", value, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeLessThan(String value) {
            addCriterion("GEN_CODE <", value, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeLessThanOrEqualTo(String value) {
            addCriterion("GEN_CODE <=", value, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeLike(String value) {
            addCriterion("GEN_CODE like", value, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeNotLike(String value) {
            addCriterion("GEN_CODE not like", value, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeIn(List<String> values) {
            addCriterion("GEN_CODE in", values, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeNotIn(List<String> values) {
            addCriterion("GEN_CODE not in", values, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeBetween(String value1, String value2) {
            addCriterion("GEN_CODE between", value1, value2, "genCode");
            return (Criteria) this;
        }

        public Criteria andGenCodeNotBetween(String value1, String value2) {
            addCriterion("GEN_CODE not between", value1, value2, "genCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeIsNull() {
            addCriterion("DISPATCH_GEN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeIsNotNull() {
            addCriterion("DISPATCH_GEN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeEqualTo(String value) {
            addCriterion("DISPATCH_GEN_CODE =", value, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeNotEqualTo(String value) {
            addCriterion("DISPATCH_GEN_CODE <>", value, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeGreaterThan(String value) {
            addCriterion("DISPATCH_GEN_CODE >", value, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISPATCH_GEN_CODE >=", value, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeLessThan(String value) {
            addCriterion("DISPATCH_GEN_CODE <", value, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeLessThanOrEqualTo(String value) {
            addCriterion("DISPATCH_GEN_CODE <=", value, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeLike(String value) {
            addCriterion("DISPATCH_GEN_CODE like", value, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeNotLike(String value) {
            addCriterion("DISPATCH_GEN_CODE not like", value, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeIn(List<String> values) {
            addCriterion("DISPATCH_GEN_CODE in", values, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeNotIn(List<String> values) {
            addCriterion("DISPATCH_GEN_CODE not in", values, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeBetween(String value1, String value2) {
            addCriterion("DISPATCH_GEN_CODE between", value1, value2, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andDispatchGenCodeNotBetween(String value1, String value2) {
            addCriterion("DISPATCH_GEN_CODE not between", value1, value2, "dispatchGenCode");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLike(String value) {
            addCriterion("MEMBER_ID like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNull() {
            addCriterion("NODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNodeIdIsNotNull() {
            addCriterion("NODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNodeIdEqualTo(String value) {
            addCriterion("NODE_ID =", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotEqualTo(String value) {
            addCriterion("NODE_ID <>", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThan(String value) {
            addCriterion("NODE_ID >", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdGreaterThanOrEqualTo(String value) {
            addCriterion("NODE_ID >=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThan(String value) {
            addCriterion("NODE_ID <", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLessThanOrEqualTo(String value) {
            addCriterion("NODE_ID <=", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdLike(String value) {
            addCriterion("NODE_ID like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotLike(String value) {
            addCriterion("NODE_ID not like", value, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdIn(List<String> values) {
            addCriterion("NODE_ID in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotIn(List<String> values) {
            addCriterion("NODE_ID not in", values, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdBetween(String value1, String value2) {
            addCriterion("NODE_ID between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andNodeIdNotBetween(String value1, String value2) {
            addCriterion("NODE_ID not between", value1, value2, "nodeId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(String value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(String value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(String value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(String value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(String value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLike(String value) {
            addCriterion("AREA_ID like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotLike(String value) {
            addCriterion("AREA_ID not like", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<String> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<String> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(String value1, String value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(String value1, String value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(BigDecimal value) {
            addCriterion("CAPACITY =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(BigDecimal value) {
            addCriterion("CAPACITY <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(BigDecimal value) {
            addCriterion("CAPACITY >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPACITY >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(BigDecimal value) {
            addCriterion("CAPACITY <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPACITY <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<BigDecimal> values) {
            addCriterion("CAPACITY in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<BigDecimal> values) {
            addCriterion("CAPACITY not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPACITY between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPACITY not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andProductTimeIsNull() {
            addCriterion("PRODUCT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProductTimeIsNotNull() {
            addCriterion("PRODUCT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProductTimeEqualTo(String value) {
            addCriterion("PRODUCT_TIME =", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeNotEqualTo(String value) {
            addCriterion("PRODUCT_TIME <>", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeGreaterThan(String value) {
            addCriterion("PRODUCT_TIME >", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TIME >=", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeLessThan(String value) {
            addCriterion("PRODUCT_TIME <", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TIME <=", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeLike(String value) {
            addCriterion("PRODUCT_TIME like", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeNotLike(String value) {
            addCriterion("PRODUCT_TIME not like", value, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeIn(List<String> values) {
            addCriterion("PRODUCT_TIME in", values, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeNotIn(List<String> values) {
            addCriterion("PRODUCT_TIME not in", values, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TIME between", value1, value2, "productTime");
            return (Criteria) this;
        }

        public Criteria andProductTimeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TIME not between", value1, value2, "productTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeIsNull() {
            addCriterion("MERCH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMerchTimeIsNotNull() {
            addCriterion("MERCH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchTimeEqualTo(String value) {
            addCriterion("MERCH_TIME =", value, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeNotEqualTo(String value) {
            addCriterion("MERCH_TIME <>", value, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeGreaterThan(String value) {
            addCriterion("MERCH_TIME >", value, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeGreaterThanOrEqualTo(String value) {
            addCriterion("MERCH_TIME >=", value, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeLessThan(String value) {
            addCriterion("MERCH_TIME <", value, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeLessThanOrEqualTo(String value) {
            addCriterion("MERCH_TIME <=", value, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeLike(String value) {
            addCriterion("MERCH_TIME like", value, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeNotLike(String value) {
            addCriterion("MERCH_TIME not like", value, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeIn(List<String> values) {
            addCriterion("MERCH_TIME in", values, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeNotIn(List<String> values) {
            addCriterion("MERCH_TIME not in", values, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeBetween(String value1, String value2) {
            addCriterion("MERCH_TIME between", value1, value2, "merchTime");
            return (Criteria) this;
        }

        public Criteria andMerchTimeNotBetween(String value1, String value2) {
            addCriterion("MERCH_TIME not between", value1, value2, "merchTime");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNull() {
            addCriterion("FUEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIsNotNull() {
            addCriterion("FUEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFuelTypeEqualTo(String value) {
            addCriterion("FUEL_TYPE =", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotEqualTo(String value) {
            addCriterion("FUEL_TYPE <>", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThan(String value) {
            addCriterion("FUEL_TYPE >", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FUEL_TYPE >=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThan(String value) {
            addCriterion("FUEL_TYPE <", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLessThanOrEqualTo(String value) {
            addCriterion("FUEL_TYPE <=", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeLike(String value) {
            addCriterion("FUEL_TYPE like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotLike(String value) {
            addCriterion("FUEL_TYPE not like", value, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeIn(List<String> values) {
            addCriterion("FUEL_TYPE in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotIn(List<String> values) {
            addCriterion("FUEL_TYPE not in", values, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeBetween(String value1, String value2) {
            addCriterion("FUEL_TYPE between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andFuelTypeNotBetween(String value1, String value2) {
            addCriterion("FUEL_TYPE not between", value1, value2, "fuelType");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityIsNull() {
            addCriterion("PEAK_ABILITY is null");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityIsNotNull() {
            addCriterion("PEAK_ABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityEqualTo(String value) {
            addCriterion("PEAK_ABILITY =", value, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityNotEqualTo(String value) {
            addCriterion("PEAK_ABILITY <>", value, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityGreaterThan(String value) {
            addCriterion("PEAK_ABILITY >", value, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("PEAK_ABILITY >=", value, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityLessThan(String value) {
            addCriterion("PEAK_ABILITY <", value, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityLessThanOrEqualTo(String value) {
            addCriterion("PEAK_ABILITY <=", value, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityLike(String value) {
            addCriterion("PEAK_ABILITY like", value, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityNotLike(String value) {
            addCriterion("PEAK_ABILITY not like", value, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityIn(List<String> values) {
            addCriterion("PEAK_ABILITY in", values, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityNotIn(List<String> values) {
            addCriterion("PEAK_ABILITY not in", values, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityBetween(String value1, String value2) {
            addCriterion("PEAK_ABILITY between", value1, value2, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andPeakAbilityNotBetween(String value1, String value2) {
            addCriterion("PEAK_ABILITY not between", value1, value2, "peakAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityIsNull() {
            addCriterion("AGC_ABILITY is null");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityIsNotNull() {
            addCriterion("AGC_ABILITY is not null");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityEqualTo(String value) {
            addCriterion("AGC_ABILITY =", value, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityNotEqualTo(String value) {
            addCriterion("AGC_ABILITY <>", value, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityGreaterThan(String value) {
            addCriterion("AGC_ABILITY >", value, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("AGC_ABILITY >=", value, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityLessThan(String value) {
            addCriterion("AGC_ABILITY <", value, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityLessThanOrEqualTo(String value) {
            addCriterion("AGC_ABILITY <=", value, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityLike(String value) {
            addCriterion("AGC_ABILITY like", value, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityNotLike(String value) {
            addCriterion("AGC_ABILITY not like", value, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityIn(List<String> values) {
            addCriterion("AGC_ABILITY in", values, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityNotIn(List<String> values) {
            addCriterion("AGC_ABILITY not in", values, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityBetween(String value1, String value2) {
            addCriterion("AGC_ABILITY between", value1, value2, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andAgcAbilityNotBetween(String value1, String value2) {
            addCriterion("AGC_ABILITY not between", value1, value2, "agcAbility");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyIsNull() {
            addCriterion("HAS_HEAT_SUPPLY is null");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyIsNotNull() {
            addCriterion("HAS_HEAT_SUPPLY is not null");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyEqualTo(String value) {
            addCriterion("HAS_HEAT_SUPPLY =", value, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyNotEqualTo(String value) {
            addCriterion("HAS_HEAT_SUPPLY <>", value, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyGreaterThan(String value) {
            addCriterion("HAS_HEAT_SUPPLY >", value, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_HEAT_SUPPLY >=", value, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyLessThan(String value) {
            addCriterion("HAS_HEAT_SUPPLY <", value, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyLessThanOrEqualTo(String value) {
            addCriterion("HAS_HEAT_SUPPLY <=", value, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyLike(String value) {
            addCriterion("HAS_HEAT_SUPPLY like", value, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyNotLike(String value) {
            addCriterion("HAS_HEAT_SUPPLY not like", value, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyIn(List<String> values) {
            addCriterion("HAS_HEAT_SUPPLY in", values, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyNotIn(List<String> values) {
            addCriterion("HAS_HEAT_SUPPLY not in", values, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyBetween(String value1, String value2) {
            addCriterion("HAS_HEAT_SUPPLY between", value1, value2, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andHasHeatSupplyNotBetween(String value1, String value2) {
            addCriterion("HAS_HEAT_SUPPLY not between", value1, value2, "hasHeatSupply");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationIsNull() {
            addCriterion("POWER_GENERATION is null");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationIsNotNull() {
            addCriterion("POWER_GENERATION is not null");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationEqualTo(String value) {
            addCriterion("POWER_GENERATION =", value, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationNotEqualTo(String value) {
            addCriterion("POWER_GENERATION <>", value, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationGreaterThan(String value) {
            addCriterion("POWER_GENERATION >", value, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_GENERATION >=", value, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationLessThan(String value) {
            addCriterion("POWER_GENERATION <", value, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationLessThanOrEqualTo(String value) {
            addCriterion("POWER_GENERATION <=", value, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationLike(String value) {
            addCriterion("POWER_GENERATION like", value, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationNotLike(String value) {
            addCriterion("POWER_GENERATION not like", value, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationIn(List<String> values) {
            addCriterion("POWER_GENERATION in", values, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationNotIn(List<String> values) {
            addCriterion("POWER_GENERATION not in", values, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationBetween(String value1, String value2) {
            addCriterion("POWER_GENERATION between", value1, value2, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andPowerGenerationNotBetween(String value1, String value2) {
            addCriterion("POWER_GENERATION not between", value1, value2, "powerGeneration");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("TAX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("TAX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(String value) {
            addCriterion("TAX_RATE =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(String value) {
            addCriterion("TAX_RATE <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(String value) {
            addCriterion("TAX_RATE >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_RATE >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(String value) {
            addCriterion("TAX_RATE <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(String value) {
            addCriterion("TAX_RATE <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLike(String value) {
            addCriterion("TAX_RATE like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotLike(String value) {
            addCriterion("TAX_RATE not like", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<String> values) {
            addCriterion("TAX_RATE in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<String> values) {
            addCriterion("TAX_RATE not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(String value1, String value2) {
            addCriterion("TAX_RATE between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(String value1, String value2) {
            addCriterion("TAX_RATE not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeIsNull() {
            addCriterion("SCHEDUE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeIsNotNull() {
            addCriterion("SCHEDUE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeEqualTo(String value) {
            addCriterion("SCHEDUE_TYPE =", value, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeNotEqualTo(String value) {
            addCriterion("SCHEDUE_TYPE <>", value, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeGreaterThan(String value) {
            addCriterion("SCHEDUE_TYPE >", value, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEDUE_TYPE >=", value, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeLessThan(String value) {
            addCriterion("SCHEDUE_TYPE <", value, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeLessThanOrEqualTo(String value) {
            addCriterion("SCHEDUE_TYPE <=", value, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeLike(String value) {
            addCriterion("SCHEDUE_TYPE like", value, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeNotLike(String value) {
            addCriterion("SCHEDUE_TYPE not like", value, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeIn(List<String> values) {
            addCriterion("SCHEDUE_TYPE in", values, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeNotIn(List<String> values) {
            addCriterion("SCHEDUE_TYPE not in", values, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeBetween(String value1, String value2) {
            addCriterion("SCHEDUE_TYPE between", value1, value2, "schedueType");
            return (Criteria) this;
        }

        public Criteria andSchedueTypeNotBetween(String value1, String value2) {
            addCriterion("SCHEDUE_TYPE not between", value1, value2, "schedueType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeIsNull() {
            addCriterion("POWER_GENE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeIsNotNull() {
            addCriterion("POWER_GENE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeEqualTo(String value) {
            addCriterion("POWER_GENE_TYPE =", value, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeNotEqualTo(String value) {
            addCriterion("POWER_GENE_TYPE <>", value, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeGreaterThan(String value) {
            addCriterion("POWER_GENE_TYPE >", value, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_GENE_TYPE >=", value, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeLessThan(String value) {
            addCriterion("POWER_GENE_TYPE <", value, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeLessThanOrEqualTo(String value) {
            addCriterion("POWER_GENE_TYPE <=", value, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeLike(String value) {
            addCriterion("POWER_GENE_TYPE like", value, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeNotLike(String value) {
            addCriterion("POWER_GENE_TYPE not like", value, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeIn(List<String> values) {
            addCriterion("POWER_GENE_TYPE in", values, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeNotIn(List<String> values) {
            addCriterion("POWER_GENE_TYPE not in", values, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeBetween(String value1, String value2) {
            addCriterion("POWER_GENE_TYPE between", value1, value2, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andPowerGeneTypeNotBetween(String value1, String value2) {
            addCriterion("POWER_GENE_TYPE not between", value1, value2, "powerGeneType");
            return (Criteria) this;
        }

        public Criteria andHasDesuflIsNull() {
            addCriterion("HAS_DESUFL is null");
            return (Criteria) this;
        }

        public Criteria andHasDesuflIsNotNull() {
            addCriterion("HAS_DESUFL is not null");
            return (Criteria) this;
        }

        public Criteria andHasDesuflEqualTo(String value) {
            addCriterion("HAS_DESUFL =", value, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflNotEqualTo(String value) {
            addCriterion("HAS_DESUFL <>", value, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflGreaterThan(String value) {
            addCriterion("HAS_DESUFL >", value, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_DESUFL >=", value, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflLessThan(String value) {
            addCriterion("HAS_DESUFL <", value, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflLessThanOrEqualTo(String value) {
            addCriterion("HAS_DESUFL <=", value, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflLike(String value) {
            addCriterion("HAS_DESUFL like", value, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflNotLike(String value) {
            addCriterion("HAS_DESUFL not like", value, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflIn(List<String> values) {
            addCriterion("HAS_DESUFL in", values, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflNotIn(List<String> values) {
            addCriterion("HAS_DESUFL not in", values, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflBetween(String value1, String value2) {
            addCriterion("HAS_DESUFL between", value1, value2, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDesuflNotBetween(String value1, String value2) {
            addCriterion("HAS_DESUFL not between", value1, value2, "hasDesufl");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalIsNull() {
            addCriterion("HAS_DUST_REMOVAL is null");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalIsNotNull() {
            addCriterion("HAS_DUST_REMOVAL is not null");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalEqualTo(String value) {
            addCriterion("HAS_DUST_REMOVAL =", value, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalNotEqualTo(String value) {
            addCriterion("HAS_DUST_REMOVAL <>", value, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalGreaterThan(String value) {
            addCriterion("HAS_DUST_REMOVAL >", value, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_DUST_REMOVAL >=", value, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalLessThan(String value) {
            addCriterion("HAS_DUST_REMOVAL <", value, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalLessThanOrEqualTo(String value) {
            addCriterion("HAS_DUST_REMOVAL <=", value, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalLike(String value) {
            addCriterion("HAS_DUST_REMOVAL like", value, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalNotLike(String value) {
            addCriterion("HAS_DUST_REMOVAL not like", value, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalIn(List<String> values) {
            addCriterion("HAS_DUST_REMOVAL in", values, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalNotIn(List<String> values) {
            addCriterion("HAS_DUST_REMOVAL not in", values, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalBetween(String value1, String value2) {
            addCriterion("HAS_DUST_REMOVAL between", value1, value2, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasDustRemovalNotBetween(String value1, String value2) {
            addCriterion("HAS_DUST_REMOVAL not between", value1, value2, "hasDustRemoval");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanIsNull() {
            addCriterion("HAS_SUPER_CLEAN is null");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanIsNotNull() {
            addCriterion("HAS_SUPER_CLEAN is not null");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanEqualTo(String value) {
            addCriterion("HAS_SUPER_CLEAN =", value, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanNotEqualTo(String value) {
            addCriterion("HAS_SUPER_CLEAN <>", value, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanGreaterThan(String value) {
            addCriterion("HAS_SUPER_CLEAN >", value, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_SUPER_CLEAN >=", value, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanLessThan(String value) {
            addCriterion("HAS_SUPER_CLEAN <", value, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanLessThanOrEqualTo(String value) {
            addCriterion("HAS_SUPER_CLEAN <=", value, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanLike(String value) {
            addCriterion("HAS_SUPER_CLEAN like", value, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanNotLike(String value) {
            addCriterion("HAS_SUPER_CLEAN not like", value, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanIn(List<String> values) {
            addCriterion("HAS_SUPER_CLEAN in", values, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanNotIn(List<String> values) {
            addCriterion("HAS_SUPER_CLEAN not in", values, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanBetween(String value1, String value2) {
            addCriterion("HAS_SUPER_CLEAN between", value1, value2, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasSuperCleanNotBetween(String value1, String value2) {
            addCriterion("HAS_SUPER_CLEAN not between", value1, value2, "hasSuperClean");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesIsNull() {
            addCriterion("HAS_DESUFL_FACILITIES is null");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesIsNotNull() {
            addCriterion("HAS_DESUFL_FACILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesEqualTo(String value) {
            addCriterion("HAS_DESUFL_FACILITIES =", value, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesNotEqualTo(String value) {
            addCriterion("HAS_DESUFL_FACILITIES <>", value, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesGreaterThan(String value) {
            addCriterion("HAS_DESUFL_FACILITIES >", value, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_DESUFL_FACILITIES >=", value, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesLessThan(String value) {
            addCriterion("HAS_DESUFL_FACILITIES <", value, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesLessThanOrEqualTo(String value) {
            addCriterion("HAS_DESUFL_FACILITIES <=", value, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesLike(String value) {
            addCriterion("HAS_DESUFL_FACILITIES like", value, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesNotLike(String value) {
            addCriterion("HAS_DESUFL_FACILITIES not like", value, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesIn(List<String> values) {
            addCriterion("HAS_DESUFL_FACILITIES in", values, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesNotIn(List<String> values) {
            addCriterion("HAS_DESUFL_FACILITIES not in", values, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesBetween(String value1, String value2) {
            addCriterion("HAS_DESUFL_FACILITIES between", value1, value2, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasDesuflFacilitiesNotBetween(String value1, String value2) {
            addCriterion("HAS_DESUFL_FACILITIES not between", value1, value2, "hasDesuflFacilities");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleIsNull() {
            addCriterion("HAS_COMBINED_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleIsNotNull() {
            addCriterion("HAS_COMBINED_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleEqualTo(String value) {
            addCriterion("HAS_COMBINED_CYCLE =", value, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleNotEqualTo(String value) {
            addCriterion("HAS_COMBINED_CYCLE <>", value, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleGreaterThan(String value) {
            addCriterion("HAS_COMBINED_CYCLE >", value, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_COMBINED_CYCLE >=", value, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleLessThan(String value) {
            addCriterion("HAS_COMBINED_CYCLE <", value, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleLessThanOrEqualTo(String value) {
            addCriterion("HAS_COMBINED_CYCLE <=", value, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleLike(String value) {
            addCriterion("HAS_COMBINED_CYCLE like", value, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleNotLike(String value) {
            addCriterion("HAS_COMBINED_CYCLE not like", value, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleIn(List<String> values) {
            addCriterion("HAS_COMBINED_CYCLE in", values, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleNotIn(List<String> values) {
            addCriterion("HAS_COMBINED_CYCLE not in", values, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleBetween(String value1, String value2) {
            addCriterion("HAS_COMBINED_CYCLE between", value1, value2, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasCombinedCycleNotBetween(String value1, String value2) {
            addCriterion("HAS_COMBINED_CYCLE not between", value1, value2, "hasCombinedCycle");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationIsNull() {
            addCriterion("HAS_DENITRATION is null");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationIsNotNull() {
            addCriterion("HAS_DENITRATION is not null");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationEqualTo(String value) {
            addCriterion("HAS_DENITRATION =", value, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationNotEqualTo(String value) {
            addCriterion("HAS_DENITRATION <>", value, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationGreaterThan(String value) {
            addCriterion("HAS_DENITRATION >", value, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_DENITRATION >=", value, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationLessThan(String value) {
            addCriterion("HAS_DENITRATION <", value, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationLessThanOrEqualTo(String value) {
            addCriterion("HAS_DENITRATION <=", value, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationLike(String value) {
            addCriterion("HAS_DENITRATION like", value, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationNotLike(String value) {
            addCriterion("HAS_DENITRATION not like", value, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationIn(List<String> values) {
            addCriterion("HAS_DENITRATION in", values, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationNotIn(List<String> values) {
            addCriterion("HAS_DENITRATION not in", values, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationBetween(String value1, String value2) {
            addCriterion("HAS_DENITRATION between", value1, value2, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andHasDenitrationNotBetween(String value1, String value2) {
            addCriterion("HAS_DENITRATION not between", value1, value2, "hasDenitration");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityIsNull() {
            addCriterion("MIN_ECON_ABLITY is null");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityIsNotNull() {
            addCriterion("MIN_ECON_ABLITY is not null");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityEqualTo(BigDecimal value) {
            addCriterion("MIN_ECON_ABLITY =", value, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityNotEqualTo(BigDecimal value) {
            addCriterion("MIN_ECON_ABLITY <>", value, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityGreaterThan(BigDecimal value) {
            addCriterion("MIN_ECON_ABLITY >", value, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_ECON_ABLITY >=", value, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityLessThan(BigDecimal value) {
            addCriterion("MIN_ECON_ABLITY <", value, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_ECON_ABLITY <=", value, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityIn(List<BigDecimal> values) {
            addCriterion("MIN_ECON_ABLITY in", values, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityNotIn(List<BigDecimal> values) {
            addCriterion("MIN_ECON_ABLITY not in", values, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_ECON_ABLITY between", value1, value2, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMinEconAblityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_ECON_ABLITY not between", value1, value2, "minEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityIsNull() {
            addCriterion("MAX_ECON_ABLITY is null");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityIsNotNull() {
            addCriterion("MAX_ECON_ABLITY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityEqualTo(BigDecimal value) {
            addCriterion("MAX_ECON_ABLITY =", value, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityNotEqualTo(BigDecimal value) {
            addCriterion("MAX_ECON_ABLITY <>", value, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityGreaterThan(BigDecimal value) {
            addCriterion("MAX_ECON_ABLITY >", value, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_ECON_ABLITY >=", value, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityLessThan(BigDecimal value) {
            addCriterion("MAX_ECON_ABLITY <", value, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_ECON_ABLITY <=", value, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityIn(List<BigDecimal> values) {
            addCriterion("MAX_ECON_ABLITY in", values, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityNotIn(List<BigDecimal> values) {
            addCriterion("MAX_ECON_ABLITY not in", values, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_ECON_ABLITY between", value1, value2, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxEconAblityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_ECON_ABLITY not between", value1, value2, "maxEconAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyIsNull() {
            addCriterion("MAX_ROTA_STANDBY is null");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyIsNotNull() {
            addCriterion("MAX_ROTA_STANDBY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyEqualTo(BigDecimal value) {
            addCriterion("MAX_ROTA_STANDBY =", value, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyNotEqualTo(BigDecimal value) {
            addCriterion("MAX_ROTA_STANDBY <>", value, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyGreaterThan(BigDecimal value) {
            addCriterion("MAX_ROTA_STANDBY >", value, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_ROTA_STANDBY >=", value, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyLessThan(BigDecimal value) {
            addCriterion("MAX_ROTA_STANDBY <", value, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_ROTA_STANDBY <=", value, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyIn(List<BigDecimal> values) {
            addCriterion("MAX_ROTA_STANDBY in", values, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyNotIn(List<BigDecimal> values) {
            addCriterion("MAX_ROTA_STANDBY not in", values, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_ROTA_STANDBY between", value1, value2, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRotaStandbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_ROTA_STANDBY not between", value1, value2, "maxRotaStandby");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityIsNull() {
            addCriterion("MAX_RUN_ABLITY is null");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityIsNotNull() {
            addCriterion("MAX_RUN_ABLITY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityEqualTo(BigDecimal value) {
            addCriterion("MAX_RUN_ABLITY =", value, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityNotEqualTo(BigDecimal value) {
            addCriterion("MAX_RUN_ABLITY <>", value, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityGreaterThan(BigDecimal value) {
            addCriterion("MAX_RUN_ABLITY >", value, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_RUN_ABLITY >=", value, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityLessThan(BigDecimal value) {
            addCriterion("MAX_RUN_ABLITY <", value, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_RUN_ABLITY <=", value, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityIn(List<BigDecimal> values) {
            addCriterion("MAX_RUN_ABLITY in", values, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityNotIn(List<BigDecimal> values) {
            addCriterion("MAX_RUN_ABLITY not in", values, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_RUN_ABLITY between", value1, value2, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMaxRunAblityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_RUN_ABLITY not between", value1, value2, "maxRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleIsNull() {
            addCriterion("MIN_STOP_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleIsNotNull() {
            addCriterion("MIN_STOP_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleEqualTo(BigDecimal value) {
            addCriterion("MIN_STOP_CYCLE =", value, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleNotEqualTo(BigDecimal value) {
            addCriterion("MIN_STOP_CYCLE <>", value, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleGreaterThan(BigDecimal value) {
            addCriterion("MIN_STOP_CYCLE >", value, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_STOP_CYCLE >=", value, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleLessThan(BigDecimal value) {
            addCriterion("MIN_STOP_CYCLE <", value, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_STOP_CYCLE <=", value, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleIn(List<BigDecimal> values) {
            addCriterion("MIN_STOP_CYCLE in", values, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleNotIn(List<BigDecimal> values) {
            addCriterion("MIN_STOP_CYCLE not in", values, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_STOP_CYCLE between", value1, value2, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinStopCycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_STOP_CYCLE not between", value1, value2, "minStopCycle");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityIsNull() {
            addCriterion("MIN_RUN_ABLITY is null");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityIsNotNull() {
            addCriterion("MIN_RUN_ABLITY is not null");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityEqualTo(BigDecimal value) {
            addCriterion("MIN_RUN_ABLITY =", value, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityNotEqualTo(BigDecimal value) {
            addCriterion("MIN_RUN_ABLITY <>", value, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityGreaterThan(BigDecimal value) {
            addCriterion("MIN_RUN_ABLITY >", value, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_RUN_ABLITY >=", value, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityLessThan(BigDecimal value) {
            addCriterion("MIN_RUN_ABLITY <", value, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIN_RUN_ABLITY <=", value, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityIn(List<BigDecimal> values) {
            addCriterion("MIN_RUN_ABLITY in", values, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityNotIn(List<BigDecimal> values) {
            addCriterion("MIN_RUN_ABLITY not in", values, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_RUN_ABLITY between", value1, value2, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andMinRunAblityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIN_RUN_ABLITY not between", value1, value2, "minRunAblity");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateIsNull() {
            addCriterion("ROTA_STANDBY_RATE is null");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateIsNotNull() {
            addCriterion("ROTA_STANDBY_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateEqualTo(BigDecimal value) {
            addCriterion("ROTA_STANDBY_RATE =", value, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateNotEqualTo(BigDecimal value) {
            addCriterion("ROTA_STANDBY_RATE <>", value, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateGreaterThan(BigDecimal value) {
            addCriterion("ROTA_STANDBY_RATE >", value, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ROTA_STANDBY_RATE >=", value, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateLessThan(BigDecimal value) {
            addCriterion("ROTA_STANDBY_RATE <", value, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ROTA_STANDBY_RATE <=", value, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateIn(List<BigDecimal> values) {
            addCriterion("ROTA_STANDBY_RATE in", values, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateNotIn(List<BigDecimal> values) {
            addCriterion("ROTA_STANDBY_RATE not in", values, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROTA_STANDBY_RATE between", value1, value2, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andRotaStandbyRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ROTA_STANDBY_RATE not between", value1, value2, "rotaStandbyRate");
            return (Criteria) this;
        }

        public Criteria andStartCostIsNull() {
            addCriterion("START_COST is null");
            return (Criteria) this;
        }

        public Criteria andStartCostIsNotNull() {
            addCriterion("START_COST is not null");
            return (Criteria) this;
        }

        public Criteria andStartCostEqualTo(BigDecimal value) {
            addCriterion("START_COST =", value, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostNotEqualTo(BigDecimal value) {
            addCriterion("START_COST <>", value, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostGreaterThan(BigDecimal value) {
            addCriterion("START_COST >", value, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("START_COST >=", value, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostLessThan(BigDecimal value) {
            addCriterion("START_COST <", value, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("START_COST <=", value, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostIn(List<BigDecimal> values) {
            addCriterion("START_COST in", values, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostNotIn(List<BigDecimal> values) {
            addCriterion("START_COST not in", values, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("START_COST between", value1, value2, "startCost");
            return (Criteria) this;
        }

        public Criteria andStartCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("START_COST not between", value1, value2, "startCost");
            return (Criteria) this;
        }

        public Criteria andVoltageClassIsNull() {
            addCriterion("VOLTAGE_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andVoltageClassIsNotNull() {
            addCriterion("VOLTAGE_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageClassEqualTo(String value) {
            addCriterion("VOLTAGE_CLASS =", value, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassNotEqualTo(String value) {
            addCriterion("VOLTAGE_CLASS <>", value, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassGreaterThan(String value) {
            addCriterion("VOLTAGE_CLASS >", value, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassGreaterThanOrEqualTo(String value) {
            addCriterion("VOLTAGE_CLASS >=", value, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassLessThan(String value) {
            addCriterion("VOLTAGE_CLASS <", value, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassLessThanOrEqualTo(String value) {
            addCriterion("VOLTAGE_CLASS <=", value, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassLike(String value) {
            addCriterion("VOLTAGE_CLASS like", value, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassNotLike(String value) {
            addCriterion("VOLTAGE_CLASS not like", value, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassIn(List<String> values) {
            addCriterion("VOLTAGE_CLASS in", values, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassNotIn(List<String> values) {
            addCriterion("VOLTAGE_CLASS not in", values, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassBetween(String value1, String value2) {
            addCriterion("VOLTAGE_CLASS between", value1, value2, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andVoltageClassNotBetween(String value1, String value2) {
            addCriterion("VOLTAGE_CLASS not between", value1, value2, "voltageClass");
            return (Criteria) this;
        }

        public Criteria andGenStatusIsNull() {
            addCriterion("GEN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andGenStatusIsNotNull() {
            addCriterion("GEN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGenStatusEqualTo(String value) {
            addCriterion("GEN_STATUS =", value, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusNotEqualTo(String value) {
            addCriterion("GEN_STATUS <>", value, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusGreaterThan(String value) {
            addCriterion("GEN_STATUS >", value, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusGreaterThanOrEqualTo(String value) {
            addCriterion("GEN_STATUS >=", value, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusLessThan(String value) {
            addCriterion("GEN_STATUS <", value, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusLessThanOrEqualTo(String value) {
            addCriterion("GEN_STATUS <=", value, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusLike(String value) {
            addCriterion("GEN_STATUS like", value, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusNotLike(String value) {
            addCriterion("GEN_STATUS not like", value, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusIn(List<String> values) {
            addCriterion("GEN_STATUS in", values, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusNotIn(List<String> values) {
            addCriterion("GEN_STATUS not in", values, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusBetween(String value1, String value2) {
            addCriterion("GEN_STATUS between", value1, value2, "genStatus");
            return (Criteria) this;
        }

        public Criteria andGenStatusNotBetween(String value1, String value2) {
            addCriterion("GEN_STATUS not between", value1, value2, "genStatus");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("START_TIME like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("START_TIME not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("END_TIME like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("END_TIME not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("CREATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("CREATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("CREATE_USER_ID =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("CREATE_USER_ID <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("CREATE_USER_ID >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("CREATE_USER_ID <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_ID <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("CREATE_USER_ID like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("CREATE_USER_ID not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("CREATE_USER_ID in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("CREATE_USER_ID not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_ID not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("CREATE_TIME like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("CREATE_TIME not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("UPDATE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("UPDATE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("UPDATE_USER_ID =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("UPDATE_USER_ID >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("UPDATE_USER_ID <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("UPDATE_USER_ID like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("UPDATE_USER_ID not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("UPDATE_USER_ID in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_ID between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_ID not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("UPDATE_TIME like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("UPDATE_TIME not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("DATA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("DATA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(String value) {
            addCriterion("DATA_STATUS =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(String value) {
            addCriterion("DATA_STATUS <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(String value) {
            addCriterion("DATA_STATUS >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_STATUS >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(String value) {
            addCriterion("DATA_STATUS <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(String value) {
            addCriterion("DATA_STATUS <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLike(String value) {
            addCriterion("DATA_STATUS like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotLike(String value) {
            addCriterion("DATA_STATUS not like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<String> values) {
            addCriterion("DATA_STATUS in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<String> values) {
            addCriterion("DATA_STATUS not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(String value1, String value2) {
            addCriterion("DATA_STATUS between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(String value1, String value2) {
            addCriterion("DATA_STATUS not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("DATA_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("DATA_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("DATA_SOURCE =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("DATA_SOURCE <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("DATA_SOURCE >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("DATA_SOURCE <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("DATA_SOURCE like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("DATA_SOURCE not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("DATA_SOURCE in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("DATA_SOURCE not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusIsNull() {
            addCriterion("MARKETIZE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusIsNotNull() {
            addCriterion("MARKETIZE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusEqualTo(String value) {
            addCriterion("MARKETIZE_STATUS =", value, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusNotEqualTo(String value) {
            addCriterion("MARKETIZE_STATUS <>", value, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusGreaterThan(String value) {
            addCriterion("MARKETIZE_STATUS >", value, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARKETIZE_STATUS >=", value, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusLessThan(String value) {
            addCriterion("MARKETIZE_STATUS <", value, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusLessThanOrEqualTo(String value) {
            addCriterion("MARKETIZE_STATUS <=", value, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusLike(String value) {
            addCriterion("MARKETIZE_STATUS like", value, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusNotLike(String value) {
            addCriterion("MARKETIZE_STATUS not like", value, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusIn(List<String> values) {
            addCriterion("MARKETIZE_STATUS in", values, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusNotIn(List<String> values) {
            addCriterion("MARKETIZE_STATUS not in", values, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusBetween(String value1, String value2) {
            addCriterion("MARKETIZE_STATUS between", value1, value2, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andMarketizeStatusNotBetween(String value1, String value2) {
            addCriterion("MARKETIZE_STATUS not between", value1, value2, "marketizeStatus");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketIsNull() {
            addCriterion("HAS_SPOT_MARKET is null");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketIsNotNull() {
            addCriterion("HAS_SPOT_MARKET is not null");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketEqualTo(String value) {
            addCriterion("HAS_SPOT_MARKET =", value, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketNotEqualTo(String value) {
            addCriterion("HAS_SPOT_MARKET <>", value, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketGreaterThan(String value) {
            addCriterion("HAS_SPOT_MARKET >", value, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_SPOT_MARKET >=", value, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketLessThan(String value) {
            addCriterion("HAS_SPOT_MARKET <", value, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketLessThanOrEqualTo(String value) {
            addCriterion("HAS_SPOT_MARKET <=", value, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketLike(String value) {
            addCriterion("HAS_SPOT_MARKET like", value, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketNotLike(String value) {
            addCriterion("HAS_SPOT_MARKET not like", value, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketIn(List<String> values) {
            addCriterion("HAS_SPOT_MARKET in", values, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketNotIn(List<String> values) {
            addCriterion("HAS_SPOT_MARKET not in", values, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketBetween(String value1, String value2) {
            addCriterion("HAS_SPOT_MARKET between", value1, value2, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andHasSpotMarketNotBetween(String value1, String value2) {
            addCriterion("HAS_SPOT_MARKET not between", value1, value2, "hasSpotMarket");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryIsNull() {
            addCriterion("OK_ABUD_DRY is null");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryIsNotNull() {
            addCriterion("OK_ABUD_DRY is not null");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryEqualTo(String value) {
            addCriterion("OK_ABUD_DRY =", value, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryNotEqualTo(String value) {
            addCriterion("OK_ABUD_DRY <>", value, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryGreaterThan(String value) {
            addCriterion("OK_ABUD_DRY >", value, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryGreaterThanOrEqualTo(String value) {
            addCriterion("OK_ABUD_DRY >=", value, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryLessThan(String value) {
            addCriterion("OK_ABUD_DRY <", value, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryLessThanOrEqualTo(String value) {
            addCriterion("OK_ABUD_DRY <=", value, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryLike(String value) {
            addCriterion("OK_ABUD_DRY like", value, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryNotLike(String value) {
            addCriterion("OK_ABUD_DRY not like", value, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryIn(List<String> values) {
            addCriterion("OK_ABUD_DRY in", values, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryNotIn(List<String> values) {
            addCriterion("OK_ABUD_DRY not in", values, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryBetween(String value1, String value2) {
            addCriterion("OK_ABUD_DRY between", value1, value2, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkAbudDryNotBetween(String value1, String value2) {
            addCriterion("OK_ABUD_DRY not between", value1, value2, "okAbudDry");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingIsNull() {
            addCriterion("OK_TIME_SHARING is null");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingIsNotNull() {
            addCriterion("OK_TIME_SHARING is not null");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingEqualTo(String value) {
            addCriterion("OK_TIME_SHARING =", value, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingNotEqualTo(String value) {
            addCriterion("OK_TIME_SHARING <>", value, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingGreaterThan(String value) {
            addCriterion("OK_TIME_SHARING >", value, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingGreaterThanOrEqualTo(String value) {
            addCriterion("OK_TIME_SHARING >=", value, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingLessThan(String value) {
            addCriterion("OK_TIME_SHARING <", value, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingLessThanOrEqualTo(String value) {
            addCriterion("OK_TIME_SHARING <=", value, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingLike(String value) {
            addCriterion("OK_TIME_SHARING like", value, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingNotLike(String value) {
            addCriterion("OK_TIME_SHARING not like", value, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingIn(List<String> values) {
            addCriterion("OK_TIME_SHARING in", values, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingNotIn(List<String> values) {
            addCriterion("OK_TIME_SHARING not in", values, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingBetween(String value1, String value2) {
            addCriterion("OK_TIME_SHARING between", value1, value2, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOkTimeSharingNotBetween(String value1, String value2) {
            addCriterion("OK_TIME_SHARING not between", value1, value2, "okTimeSharing");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("ORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("ORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("ORGANIZATION_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("ORGANIZATION_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("ORGANIZATION_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("ORGANIZATION_ID like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("ORGANIZATION_ID not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("ORGANIZATION_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("ORGANIZATION_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}