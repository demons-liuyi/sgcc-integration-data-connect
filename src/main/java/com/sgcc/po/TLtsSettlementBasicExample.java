package com.sgcc.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TLtsSettlementBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TLtsSettlementBasicExample() {
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

        public Criteria andSettleIdIsNull() {
            addCriterion("SETTLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSettleIdIsNotNull() {
            addCriterion("SETTLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettleIdEqualTo(String value) {
            addCriterion("SETTLE_ID =", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdNotEqualTo(String value) {
            addCriterion("SETTLE_ID <>", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdGreaterThan(String value) {
            addCriterion("SETTLE_ID >", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_ID >=", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdLessThan(String value) {
            addCriterion("SETTLE_ID <", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_ID <=", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdLike(String value) {
            addCriterion("SETTLE_ID like", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdNotLike(String value) {
            addCriterion("SETTLE_ID not like", value, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdIn(List<String> values) {
            addCriterion("SETTLE_ID in", values, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdNotIn(List<String> values) {
            addCriterion("SETTLE_ID not in", values, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdBetween(String value1, String value2) {
            addCriterion("SETTLE_ID between", value1, value2, "settleId");
            return (Criteria) this;
        }

        public Criteria andSettleIdNotBetween(String value1, String value2) {
            addCriterion("SETTLE_ID not between", value1, value2, "settleId");
            return (Criteria) this;
        }

        public Criteria andDataStateIsNull() {
            addCriterion("DATA_STATE is null");
            return (Criteria) this;
        }

        public Criteria andDataStateIsNotNull() {
            addCriterion("DATA_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataStateEqualTo(String value) {
            addCriterion("DATA_STATE =", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotEqualTo(String value) {
            addCriterion("DATA_STATE <>", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateGreaterThan(String value) {
            addCriterion("DATA_STATE >", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_STATE >=", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLessThan(String value) {
            addCriterion("DATA_STATE <", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLessThanOrEqualTo(String value) {
            addCriterion("DATA_STATE <=", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateLike(String value) {
            addCriterion("DATA_STATE like", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotLike(String value) {
            addCriterion("DATA_STATE not like", value, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateIn(List<String> values) {
            addCriterion("DATA_STATE in", values, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotIn(List<String> values) {
            addCriterion("DATA_STATE not in", values, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateBetween(String value1, String value2) {
            addCriterion("DATA_STATE between", value1, value2, "dataState");
            return (Criteria) this;
        }

        public Criteria andDataStateNotBetween(String value1, String value2) {
            addCriterion("DATA_STATE not between", value1, value2, "dataState");
            return (Criteria) this;
        }

        public Criteria andSettleMonthIsNull() {
            addCriterion("SETTLE_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andSettleMonthIsNotNull() {
            addCriterion("SETTLE_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andSettleMonthEqualTo(String value) {
            addCriterion("SETTLE_MONTH =", value, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthNotEqualTo(String value) {
            addCriterion("SETTLE_MONTH <>", value, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthGreaterThan(String value) {
            addCriterion("SETTLE_MONTH >", value, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_MONTH >=", value, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthLessThan(String value) {
            addCriterion("SETTLE_MONTH <", value, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_MONTH <=", value, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthLike(String value) {
            addCriterion("SETTLE_MONTH like", value, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthNotLike(String value) {
            addCriterion("SETTLE_MONTH not like", value, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthIn(List<String> values) {
            addCriterion("SETTLE_MONTH in", values, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthNotIn(List<String> values) {
            addCriterion("SETTLE_MONTH not in", values, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthBetween(String value1, String value2) {
            addCriterion("SETTLE_MONTH between", value1, value2, "settleMonth");
            return (Criteria) this;
        }

        public Criteria andSettleMonthNotBetween(String value1, String value2) {
            addCriterion("SETTLE_MONTH not between", value1, value2, "settleMonth");
            return (Criteria) this;
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

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNull() {
            addCriterion("PURCHASER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNotNull() {
            addCriterion("PURCHASER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdEqualTo(String value) {
            addCriterion("PURCHASER_ID =", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotEqualTo(String value) {
            addCriterion("PURCHASER_ID <>", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThan(String value) {
            addCriterion("PURCHASER_ID >", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASER_ID >=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThan(String value) {
            addCriterion("PURCHASER_ID <", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThanOrEqualTo(String value) {
            addCriterion("PURCHASER_ID <=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLike(String value) {
            addCriterion("PURCHASER_ID like", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotLike(String value) {
            addCriterion("PURCHASER_ID not like", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIn(List<String> values) {
            addCriterion("PURCHASER_ID in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotIn(List<String> values) {
            addCriterion("PURCHASER_ID not in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdBetween(String value1, String value2) {
            addCriterion("PURCHASER_ID between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotBetween(String value1, String value2) {
            addCriterion("PURCHASER_ID not between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andComponentIdIsNull() {
            addCriterion("COMPONENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andComponentIdIsNotNull() {
            addCriterion("COMPONENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComponentIdEqualTo(String value) {
            addCriterion("COMPONENT_ID =", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotEqualTo(String value) {
            addCriterion("COMPONENT_ID <>", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdGreaterThan(String value) {
            addCriterion("COMPONENT_ID >", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPONENT_ID >=", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdLessThan(String value) {
            addCriterion("COMPONENT_ID <", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdLessThanOrEqualTo(String value) {
            addCriterion("COMPONENT_ID <=", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdLike(String value) {
            addCriterion("COMPONENT_ID like", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotLike(String value) {
            addCriterion("COMPONENT_ID not like", value, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdIn(List<String> values) {
            addCriterion("COMPONENT_ID in", values, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotIn(List<String> values) {
            addCriterion("COMPONENT_ID not in", values, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdBetween(String value1, String value2) {
            addCriterion("COMPONENT_ID between", value1, value2, "componentId");
            return (Criteria) this;
        }

        public Criteria andComponentIdNotBetween(String value1, String value2) {
            addCriterion("COMPONENT_ID not between", value1, value2, "componentId");
            return (Criteria) this;
        }

        public Criteria andManageModeIsNull() {
            addCriterion("MANAGE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andManageModeIsNotNull() {
            addCriterion("MANAGE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andManageModeEqualTo(String value) {
            addCriterion("MANAGE_MODE =", value, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeNotEqualTo(String value) {
            addCriterion("MANAGE_MODE <>", value, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeGreaterThan(String value) {
            addCriterion("MANAGE_MODE >", value, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGE_MODE >=", value, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeLessThan(String value) {
            addCriterion("MANAGE_MODE <", value, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeLessThanOrEqualTo(String value) {
            addCriterion("MANAGE_MODE <=", value, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeLike(String value) {
            addCriterion("MANAGE_MODE like", value, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeNotLike(String value) {
            addCriterion("MANAGE_MODE not like", value, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeIn(List<String> values) {
            addCriterion("MANAGE_MODE in", values, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeNotIn(List<String> values) {
            addCriterion("MANAGE_MODE not in", values, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeBetween(String value1, String value2) {
            addCriterion("MANAGE_MODE between", value1, value2, "manageMode");
            return (Criteria) this;
        }

        public Criteria andManageModeNotBetween(String value1, String value2) {
            addCriterion("MANAGE_MODE not between", value1, value2, "manageMode");
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

        public Criteria andGenerateDateIsNull() {
            addCriterion("GENERATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andGenerateDateIsNotNull() {
            addCriterion("GENERATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateDateEqualTo(String value) {
            addCriterion("GENERATE_DATE =", value, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateNotEqualTo(String value) {
            addCriterion("GENERATE_DATE <>", value, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateGreaterThan(String value) {
            addCriterion("GENERATE_DATE >", value, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATE_DATE >=", value, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateLessThan(String value) {
            addCriterion("GENERATE_DATE <", value, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateLessThanOrEqualTo(String value) {
            addCriterion("GENERATE_DATE <=", value, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateLike(String value) {
            addCriterion("GENERATE_DATE like", value, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateNotLike(String value) {
            addCriterion("GENERATE_DATE not like", value, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateIn(List<String> values) {
            addCriterion("GENERATE_DATE in", values, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateNotIn(List<String> values) {
            addCriterion("GENERATE_DATE not in", values, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateBetween(String value1, String value2) {
            addCriterion("GENERATE_DATE between", value1, value2, "generateDate");
            return (Criteria) this;
        }

        public Criteria andGenerateDateNotBetween(String value1, String value2) {
            addCriterion("GENERATE_DATE not between", value1, value2, "generateDate");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIsNull() {
            addCriterion("BELONG_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIsNotNull() {
            addCriterion("BELONG_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andBelongUnitEqualTo(String value) {
            addCriterion("BELONG_UNIT =", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotEqualTo(String value) {
            addCriterion("BELONG_UNIT <>", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitGreaterThan(String value) {
            addCriterion("BELONG_UNIT >", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitGreaterThanOrEqualTo(String value) {
            addCriterion("BELONG_UNIT >=", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLessThan(String value) {
            addCriterion("BELONG_UNIT <", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLessThanOrEqualTo(String value) {
            addCriterion("BELONG_UNIT <=", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitLike(String value) {
            addCriterion("BELONG_UNIT like", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotLike(String value) {
            addCriterion("BELONG_UNIT not like", value, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitIn(List<String> values) {
            addCriterion("BELONG_UNIT in", values, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotIn(List<String> values) {
            addCriterion("BELONG_UNIT not in", values, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitBetween(String value1, String value2) {
            addCriterion("BELONG_UNIT between", value1, value2, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andBelongUnitNotBetween(String value1, String value2) {
            addCriterion("BELONG_UNIT not between", value1, value2, "belongUnit");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("IS_USE is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("IS_USE is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(String value) {
            addCriterion("IS_USE =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(String value) {
            addCriterion("IS_USE <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(String value) {
            addCriterion("IS_USE >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_USE >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(String value) {
            addCriterion("IS_USE <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(String value) {
            addCriterion("IS_USE <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLike(String value) {
            addCriterion("IS_USE like", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotLike(String value) {
            addCriterion("IS_USE not like", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<String> values) {
            addCriterion("IS_USE in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<String> values) {
            addCriterion("IS_USE not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(String value1, String value2) {
            addCriterion("IS_USE between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(String value1, String value2) {
            addCriterion("IS_USE not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNull() {
            addCriterion("REVIEW_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIsNotNull() {
            addCriterion("REVIEW_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReviewStatusEqualTo(String value) {
            addCriterion("REVIEW_STATUS =", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotEqualTo(String value) {
            addCriterion("REVIEW_STATUS <>", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThan(String value) {
            addCriterion("REVIEW_STATUS >", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_STATUS >=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThan(String value) {
            addCriterion("REVIEW_STATUS <", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_STATUS <=", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusLike(String value) {
            addCriterion("REVIEW_STATUS like", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotLike(String value) {
            addCriterion("REVIEW_STATUS not like", value, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusIn(List<String> values) {
            addCriterion("REVIEW_STATUS in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotIn(List<String> values) {
            addCriterion("REVIEW_STATUS not in", values, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusBetween(String value1, String value2) {
            addCriterion("REVIEW_STATUS between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andReviewStatusNotBetween(String value1, String value2) {
            addCriterion("REVIEW_STATUS not between", value1, value2, "reviewStatus");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeIsNull() {
            addCriterion("TOTAL_ELECTRIC_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeIsNotNull() {
            addCriterion("TOTAL_ELECTRIC_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_CHARGE =", value, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_CHARGE <>", value, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_CHARGE >", value, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_CHARGE >=", value, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeLessThan(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_CHARGE <", value, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_CHARGE <=", value, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ELECTRIC_CHARGE in", values, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ELECTRIC_CHARGE not in", values, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ELECTRIC_CHARGE between", value1, value2, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ELECTRIC_CHARGE not between", value1, value2, "totalElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceIsNull() {
            addCriterion("TOTAL_ELECTRIC_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceIsNotNull() {
            addCriterion("TOTAL_ELECTRIC_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_PRICE =", value, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_PRICE <>", value, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_PRICE >", value, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_PRICE >=", value, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceLessThan(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_PRICE <", value, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_PRICE <=", value, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ELECTRIC_PRICE in", values, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ELECTRIC_PRICE not in", values, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ELECTRIC_PRICE between", value1, value2, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ELECTRIC_PRICE not between", value1, value2, "totalElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostIsNull() {
            addCriterion("TOTAL_ELECTRIC_COST is null");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostIsNotNull() {
            addCriterion("TOTAL_ELECTRIC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_COST =", value, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_COST <>", value, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_COST >", value, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_COST >=", value, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostLessThan(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_COST <", value, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_ELECTRIC_COST <=", value, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ELECTRIC_COST in", values, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_ELECTRIC_COST not in", values, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ELECTRIC_COST between", value1, value2, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andTotalElectricCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_ELECTRIC_COST not between", value1, value2, "totalElectricCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeIsNull() {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeIsNotNull() {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE =", value, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeNotEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE <>", value, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeGreaterThan(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE >", value, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE >=", value, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeLessThan(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE <", value, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE <=", value, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeIn(List<BigDecimal> values) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE in", values, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeNotIn(List<BigDecimal> values) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE not in", values, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE between", value1, value2, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_CHARGE not between", value1, value2, "notPerformPeakValleyCharge");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceIsNull() {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceIsNotNull() {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE =", value, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceNotEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE <>", value, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceGreaterThan(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE >", value, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE >=", value, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceLessThan(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE <", value, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE <=", value, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceIn(List<BigDecimal> values) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE in", values, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceNotIn(List<BigDecimal> values) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE not in", values, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE between", value1, value2, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_PRICE not between", value1, value2, "notPerformPeakValleyPrice");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostIsNull() {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST is null");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostIsNotNull() {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST is not null");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST =", value, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostNotEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST <>", value, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostGreaterThan(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST >", value, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST >=", value, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostLessThan(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST <", value, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST <=", value, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostIn(List<BigDecimal> values) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST in", values, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostNotIn(List<BigDecimal> values) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST not in", values, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST between", value1, value2, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andNotPerformPeakValleyCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOT_PERFORM_PEAK_VALLEY_COST not between", value1, value2, "notPerformPeakValleyCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeIsNull() {
            addCriterion("TIP_ELECTRIC_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeIsNotNull() {
            addCriterion("TIP_ELECTRIC_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_CHARGE =", value, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeNotEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_CHARGE <>", value, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeGreaterThan(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_CHARGE >", value, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_CHARGE >=", value, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeLessThan(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_CHARGE <", value, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_CHARGE <=", value, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeIn(List<BigDecimal> values) {
            addCriterion("TIP_ELECTRIC_CHARGE in", values, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeNotIn(List<BigDecimal> values) {
            addCriterion("TIP_ELECTRIC_CHARGE not in", values, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP_ELECTRIC_CHARGE between", value1, value2, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP_ELECTRIC_CHARGE not between", value1, value2, "tipElectricCharge");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceIsNull() {
            addCriterion("TIP_ELECTRIC_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceIsNotNull() {
            addCriterion("TIP_ELECTRIC_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_PRICE =", value, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceNotEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_PRICE <>", value, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceGreaterThan(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_PRICE >", value, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_PRICE >=", value, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceLessThan(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_PRICE <", value, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_PRICE <=", value, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceIn(List<BigDecimal> values) {
            addCriterion("TIP_ELECTRIC_PRICE in", values, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceNotIn(List<BigDecimal> values) {
            addCriterion("TIP_ELECTRIC_PRICE not in", values, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP_ELECTRIC_PRICE between", value1, value2, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP_ELECTRIC_PRICE not between", value1, value2, "tipElectricPrice");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostIsNull() {
            addCriterion("TIP_ELECTRIC_COST is null");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostIsNotNull() {
            addCriterion("TIP_ELECTRIC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_COST =", value, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostNotEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_COST <>", value, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostGreaterThan(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_COST >", value, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_COST >=", value, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostLessThan(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_COST <", value, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TIP_ELECTRIC_COST <=", value, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostIn(List<BigDecimal> values) {
            addCriterion("TIP_ELECTRIC_COST in", values, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostNotIn(List<BigDecimal> values) {
            addCriterion("TIP_ELECTRIC_COST not in", values, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP_ELECTRIC_COST between", value1, value2, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andTipElectricCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TIP_ELECTRIC_COST not between", value1, value2, "tipElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeIsNull() {
            addCriterion("PEAK_ELECTRIC_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeIsNotNull() {
            addCriterion("PEAK_ELECTRIC_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_CHARGE =", value, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeNotEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_CHARGE <>", value, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeGreaterThan(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_CHARGE >", value, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_CHARGE >=", value, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeLessThan(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_CHARGE <", value, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_CHARGE <=", value, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeIn(List<BigDecimal> values) {
            addCriterion("PEAK_ELECTRIC_CHARGE in", values, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeNotIn(List<BigDecimal> values) {
            addCriterion("PEAK_ELECTRIC_CHARGE not in", values, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_ELECTRIC_CHARGE between", value1, value2, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_ELECTRIC_CHARGE not between", value1, value2, "peakElectricCharge");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceIsNull() {
            addCriterion("PEAK_ELECTRIC_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceIsNotNull() {
            addCriterion("PEAK_ELECTRIC_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_PRICE =", value, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceNotEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_PRICE <>", value, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceGreaterThan(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_PRICE >", value, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_PRICE >=", value, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceLessThan(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_PRICE <", value, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_PRICE <=", value, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceIn(List<BigDecimal> values) {
            addCriterion("PEAK_ELECTRIC_PRICE in", values, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceNotIn(List<BigDecimal> values) {
            addCriterion("PEAK_ELECTRIC_PRICE not in", values, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_ELECTRIC_PRICE between", value1, value2, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_ELECTRIC_PRICE not between", value1, value2, "peakElectricPrice");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostIsNull() {
            addCriterion("PEAK_ELECTRIC_COST is null");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostIsNotNull() {
            addCriterion("PEAK_ELECTRIC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_COST =", value, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostNotEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_COST <>", value, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostGreaterThan(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_COST >", value, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_COST >=", value, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostLessThan(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_COST <", value, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PEAK_ELECTRIC_COST <=", value, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostIn(List<BigDecimal> values) {
            addCriterion("PEAK_ELECTRIC_COST in", values, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostNotIn(List<BigDecimal> values) {
            addCriterion("PEAK_ELECTRIC_COST not in", values, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_ELECTRIC_COST between", value1, value2, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andPeakElectricCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PEAK_ELECTRIC_COST not between", value1, value2, "peakElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeIsNull() {
            addCriterion("LEVEL_ELECTRIC_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeIsNotNull() {
            addCriterion("LEVEL_ELECTRIC_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_CHARGE =", value, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeNotEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_CHARGE <>", value, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeGreaterThan(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_CHARGE >", value, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_CHARGE >=", value, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeLessThan(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_CHARGE <", value, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_CHARGE <=", value, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeIn(List<BigDecimal> values) {
            addCriterion("LEVEL_ELECTRIC_CHARGE in", values, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeNotIn(List<BigDecimal> values) {
            addCriterion("LEVEL_ELECTRIC_CHARGE not in", values, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVEL_ELECTRIC_CHARGE between", value1, value2, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVEL_ELECTRIC_CHARGE not between", value1, value2, "levelElectricCharge");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceIsNull() {
            addCriterion("LEVEL_ELECTRIC_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceIsNotNull() {
            addCriterion("LEVEL_ELECTRIC_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_PRICE =", value, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceNotEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_PRICE <>", value, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceGreaterThan(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_PRICE >", value, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_PRICE >=", value, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceLessThan(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_PRICE <", value, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_PRICE <=", value, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceIn(List<BigDecimal> values) {
            addCriterion("LEVEL_ELECTRIC_PRICE in", values, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceNotIn(List<BigDecimal> values) {
            addCriterion("LEVEL_ELECTRIC_PRICE not in", values, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVEL_ELECTRIC_PRICE between", value1, value2, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVEL_ELECTRIC_PRICE not between", value1, value2, "levelElectricPrice");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostIsNull() {
            addCriterion("LEVEL_ELECTRIC_COST is null");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostIsNotNull() {
            addCriterion("LEVEL_ELECTRIC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_COST =", value, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostNotEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_COST <>", value, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostGreaterThan(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_COST >", value, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_COST >=", value, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostLessThan(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_COST <", value, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVEL_ELECTRIC_COST <=", value, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostIn(List<BigDecimal> values) {
            addCriterion("LEVEL_ELECTRIC_COST in", values, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostNotIn(List<BigDecimal> values) {
            addCriterion("LEVEL_ELECTRIC_COST not in", values, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVEL_ELECTRIC_COST between", value1, value2, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andLevelElectricCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVEL_ELECTRIC_COST not between", value1, value2, "levelElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeIsNull() {
            addCriterion("VALLEY_ELECTRIC_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeIsNotNull() {
            addCriterion("VALLEY_ELECTRIC_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_CHARGE =", value, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeNotEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_CHARGE <>", value, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeGreaterThan(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_CHARGE >", value, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_CHARGE >=", value, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeLessThan(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_CHARGE <", value, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_CHARGE <=", value, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeIn(List<BigDecimal> values) {
            addCriterion("VALLEY_ELECTRIC_CHARGE in", values, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeNotIn(List<BigDecimal> values) {
            addCriterion("VALLEY_ELECTRIC_CHARGE not in", values, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALLEY_ELECTRIC_CHARGE between", value1, value2, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALLEY_ELECTRIC_CHARGE not between", value1, value2, "valleyElectricCharge");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceIsNull() {
            addCriterion("VALLEY_ELECTRIC_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceIsNotNull() {
            addCriterion("VALLEY_ELECTRIC_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_PRICE =", value, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceNotEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_PRICE <>", value, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceGreaterThan(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_PRICE >", value, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_PRICE >=", value, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceLessThan(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_PRICE <", value, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_PRICE <=", value, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceIn(List<BigDecimal> values) {
            addCriterion("VALLEY_ELECTRIC_PRICE in", values, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceNotIn(List<BigDecimal> values) {
            addCriterion("VALLEY_ELECTRIC_PRICE not in", values, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALLEY_ELECTRIC_PRICE between", value1, value2, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALLEY_ELECTRIC_PRICE not between", value1, value2, "valleyElectricPrice");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostIsNull() {
            addCriterion("VALLEY_ELECTRIC_COST is null");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostIsNotNull() {
            addCriterion("VALLEY_ELECTRIC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_COST =", value, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostNotEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_COST <>", value, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostGreaterThan(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_COST >", value, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_COST >=", value, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostLessThan(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_COST <", value, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALLEY_ELECTRIC_COST <=", value, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostIn(List<BigDecimal> values) {
            addCriterion("VALLEY_ELECTRIC_COST in", values, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostNotIn(List<BigDecimal> values) {
            addCriterion("VALLEY_ELECTRIC_COST not in", values, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALLEY_ELECTRIC_COST between", value1, value2, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andValleyElectricCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALLEY_ELECTRIC_COST not between", value1, value2, "valleyElectricCost");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNull() {
            addCriterion("IS_CONFIRM is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNotNull() {
            addCriterion("IS_CONFIRM is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmEqualTo(String value) {
            addCriterion("IS_CONFIRM =", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotEqualTo(String value) {
            addCriterion("IS_CONFIRM <>", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThan(String value) {
            addCriterion("IS_CONFIRM >", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CONFIRM >=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThan(String value) {
            addCriterion("IS_CONFIRM <", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThanOrEqualTo(String value) {
            addCriterion("IS_CONFIRM <=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLike(String value) {
            addCriterion("IS_CONFIRM like", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotLike(String value) {
            addCriterion("IS_CONFIRM not like", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIn(List<String> values) {
            addCriterion("IS_CONFIRM in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotIn(List<String> values) {
            addCriterion("IS_CONFIRM not in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmBetween(String value1, String value2) {
            addCriterion("IS_CONFIRM between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotBetween(String value1, String value2) {
            addCriterion("IS_CONFIRM not between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIsNull() {
            addCriterion("POWER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIsNotNull() {
            addCriterion("POWER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPowerTypeEqualTo(String value) {
            addCriterion("POWER_TYPE =", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotEqualTo(String value) {
            addCriterion("POWER_TYPE <>", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeGreaterThan(String value) {
            addCriterion("POWER_TYPE >", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_TYPE >=", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLessThan(String value) {
            addCriterion("POWER_TYPE <", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLessThanOrEqualTo(String value) {
            addCriterion("POWER_TYPE <=", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeLike(String value) {
            addCriterion("POWER_TYPE like", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotLike(String value) {
            addCriterion("POWER_TYPE not like", value, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeIn(List<String> values) {
            addCriterion("POWER_TYPE in", values, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotIn(List<String> values) {
            addCriterion("POWER_TYPE not in", values, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeBetween(String value1, String value2) {
            addCriterion("POWER_TYPE between", value1, value2, "powerType");
            return (Criteria) this;
        }

        public Criteria andPowerTypeNotBetween(String value1, String value2) {
            addCriterion("POWER_TYPE not between", value1, value2, "powerType");
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