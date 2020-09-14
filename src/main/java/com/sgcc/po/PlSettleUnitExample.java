package com.sgcc.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlSettleUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlSettleUnitExample() {
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

        public Criteria andSettleCodeIsNull() {
            addCriterion("SETTLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSettleCodeIsNotNull() {
            addCriterion("SETTLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCodeEqualTo(String value) {
            addCriterion("SETTLE_CODE =", value, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeNotEqualTo(String value) {
            addCriterion("SETTLE_CODE <>", value, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeGreaterThan(String value) {
            addCriterion("SETTLE_CODE >", value, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_CODE >=", value, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeLessThan(String value) {
            addCriterion("SETTLE_CODE <", value, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_CODE <=", value, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeLike(String value) {
            addCriterion("SETTLE_CODE like", value, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeNotLike(String value) {
            addCriterion("SETTLE_CODE not like", value, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeIn(List<String> values) {
            addCriterion("SETTLE_CODE in", values, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeNotIn(List<String> values) {
            addCriterion("SETTLE_CODE not in", values, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeBetween(String value1, String value2) {
            addCriterion("SETTLE_CODE between", value1, value2, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleCodeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_CODE not between", value1, value2, "settleCode");
            return (Criteria) this;
        }

        public Criteria andSettleNameIsNull() {
            addCriterion("SETTLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSettleNameIsNotNull() {
            addCriterion("SETTLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSettleNameEqualTo(String value) {
            addCriterion("SETTLE_NAME =", value, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameNotEqualTo(String value) {
            addCriterion("SETTLE_NAME <>", value, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameGreaterThan(String value) {
            addCriterion("SETTLE_NAME >", value, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_NAME >=", value, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameLessThan(String value) {
            addCriterion("SETTLE_NAME <", value, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_NAME <=", value, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameLike(String value) {
            addCriterion("SETTLE_NAME like", value, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameNotLike(String value) {
            addCriterion("SETTLE_NAME not like", value, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameIn(List<String> values) {
            addCriterion("SETTLE_NAME in", values, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameNotIn(List<String> values) {
            addCriterion("SETTLE_NAME not in", values, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameBetween(String value1, String value2) {
            addCriterion("SETTLE_NAME between", value1, value2, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleNameNotBetween(String value1, String value2) {
            addCriterion("SETTLE_NAME not between", value1, value2, "settleName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameIsNull() {
            addCriterion("SETTLE_ALIAS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameIsNotNull() {
            addCriterion("SETTLE_ALIAS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameEqualTo(String value) {
            addCriterion("SETTLE_ALIAS_NAME =", value, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameNotEqualTo(String value) {
            addCriterion("SETTLE_ALIAS_NAME <>", value, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameGreaterThan(String value) {
            addCriterion("SETTLE_ALIAS_NAME >", value, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_ALIAS_NAME >=", value, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameLessThan(String value) {
            addCriterion("SETTLE_ALIAS_NAME <", value, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_ALIAS_NAME <=", value, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameLike(String value) {
            addCriterion("SETTLE_ALIAS_NAME like", value, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameNotLike(String value) {
            addCriterion("SETTLE_ALIAS_NAME not like", value, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameIn(List<String> values) {
            addCriterion("SETTLE_ALIAS_NAME in", values, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameNotIn(List<String> values) {
            addCriterion("SETTLE_ALIAS_NAME not in", values, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameBetween(String value1, String value2) {
            addCriterion("SETTLE_ALIAS_NAME between", value1, value2, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andSettleAliasNameNotBetween(String value1, String value2) {
            addCriterion("SETTLE_ALIAS_NAME not between", value1, value2, "settleAliasName");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdIsNull() {
            addCriterion("MARKET_MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdIsNotNull() {
            addCriterion("MARKET_MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdEqualTo(String value) {
            addCriterion("MARKET_MEMBER_ID =", value, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdNotEqualTo(String value) {
            addCriterion("MARKET_MEMBER_ID <>", value, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdGreaterThan(String value) {
            addCriterion("MARKET_MEMBER_ID >", value, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdGreaterThanOrEqualTo(String value) {
            addCriterion("MARKET_MEMBER_ID >=", value, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdLessThan(String value) {
            addCriterion("MARKET_MEMBER_ID <", value, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdLessThanOrEqualTo(String value) {
            addCriterion("MARKET_MEMBER_ID <=", value, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdLike(String value) {
            addCriterion("MARKET_MEMBER_ID like", value, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdNotLike(String value) {
            addCriterion("MARKET_MEMBER_ID not like", value, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdIn(List<String> values) {
            addCriterion("MARKET_MEMBER_ID in", values, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdNotIn(List<String> values) {
            addCriterion("MARKET_MEMBER_ID not in", values, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdBetween(String value1, String value2) {
            addCriterion("MARKET_MEMBER_ID between", value1, value2, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andMarketMemberIdNotBetween(String value1, String value2) {
            addCriterion("MARKET_MEMBER_ID not between", value1, value2, "marketMemberId");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNull() {
            addCriterion("SETTLE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNotNull() {
            addCriterion("SETTLE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusEqualTo(String value) {
            addCriterion("SETTLE_STATUS =", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotEqualTo(String value) {
            addCriterion("SETTLE_STATUS <>", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThan(String value) {
            addCriterion("SETTLE_STATUS >", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_STATUS >=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThan(String value) {
            addCriterion("SETTLE_STATUS <", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_STATUS <=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLike(String value) {
            addCriterion("SETTLE_STATUS like", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotLike(String value) {
            addCriterion("SETTLE_STATUS not like", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIn(List<String> values) {
            addCriterion("SETTLE_STATUS in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotIn(List<String> values) {
            addCriterion("SETTLE_STATUS not in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusBetween(String value1, String value2) {
            addCriterion("SETTLE_STATUS between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotBetween(String value1, String value2) {
            addCriterion("SETTLE_STATUS not between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNull() {
            addCriterion("SETTLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIsNotNull() {
            addCriterion("SETTLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeEqualTo(String value) {
            addCriterion("SETTLE_TYPE =", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotEqualTo(String value) {
            addCriterion("SETTLE_TYPE <>", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThan(String value) {
            addCriterion("SETTLE_TYPE >", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_TYPE >=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThan(String value) {
            addCriterion("SETTLE_TYPE <", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_TYPE <=", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeLike(String value) {
            addCriterion("SETTLE_TYPE like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotLike(String value) {
            addCriterion("SETTLE_TYPE not like", value, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIn(List<String> values) {
            addCriterion("SETTLE_TYPE in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotIn(List<String> values) {
            addCriterion("SETTLE_TYPE not in", values, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeBetween(String value1, String value2) {
            addCriterion("SETTLE_TYPE between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andSettleTypeNotBetween(String value1, String value2) {
            addCriterion("SETTLE_TYPE not between", value1, value2, "settleType");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffIsNull() {
            addCriterion("AUTHORIZED_TARIFF is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffIsNotNull() {
            addCriterion("AUTHORIZED_TARIFF is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffEqualTo(BigDecimal value) {
            addCriterion("AUTHORIZED_TARIFF =", value, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffNotEqualTo(BigDecimal value) {
            addCriterion("AUTHORIZED_TARIFF <>", value, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffGreaterThan(BigDecimal value) {
            addCriterion("AUTHORIZED_TARIFF >", value, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTHORIZED_TARIFF >=", value, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffLessThan(BigDecimal value) {
            addCriterion("AUTHORIZED_TARIFF <", value, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTHORIZED_TARIFF <=", value, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffIn(List<BigDecimal> values) {
            addCriterion("AUTHORIZED_TARIFF in", values, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffNotIn(List<BigDecimal> values) {
            addCriterion("AUTHORIZED_TARIFF not in", values, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTHORIZED_TARIFF between", value1, value2, "authorizedTariff");
            return (Criteria) this;
        }

        public Criteria andAuthorizedTariffNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTHORIZED_TARIFF not between", value1, value2, "authorizedTariff");
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