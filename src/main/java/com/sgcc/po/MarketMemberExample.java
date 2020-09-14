package com.sgcc.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MarketMemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketMemberExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("MEMBER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("MEMBER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("MEMBER_NAME =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("MEMBER_NAME <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("MEMBER_NAME >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("MEMBER_NAME <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_NAME <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("MEMBER_NAME like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("MEMBER_NAME not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("MEMBER_NAME in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("MEMBER_NAME not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("MEMBER_NAME not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitIsNull() {
            addCriterion("SUPERIOR_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitIsNotNull() {
            addCriterion("SUPERIOR_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitEqualTo(String value) {
            addCriterion("SUPERIOR_UNIT =", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitNotEqualTo(String value) {
            addCriterion("SUPERIOR_UNIT <>", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitGreaterThan(String value) {
            addCriterion("SUPERIOR_UNIT >", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitGreaterThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_UNIT >=", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitLessThan(String value) {
            addCriterion("SUPERIOR_UNIT <", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitLessThanOrEqualTo(String value) {
            addCriterion("SUPERIOR_UNIT <=", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitLike(String value) {
            addCriterion("SUPERIOR_UNIT like", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitNotLike(String value) {
            addCriterion("SUPERIOR_UNIT not like", value, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitIn(List<String> values) {
            addCriterion("SUPERIOR_UNIT in", values, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitNotIn(List<String> values) {
            addCriterion("SUPERIOR_UNIT not in", values, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitBetween(String value1, String value2) {
            addCriterion("SUPERIOR_UNIT between", value1, value2, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andSuperiorUnitNotBetween(String value1, String value2) {
            addCriterion("SUPERIOR_UNIT not between", value1, value2, "superiorUnit");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIsNull() {
            addCriterion("MEMBER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIsNotNull() {
            addCriterion("MEMBER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCodeEqualTo(String value) {
            addCriterion("MEMBER_CODE =", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotEqualTo(String value) {
            addCriterion("MEMBER_CODE <>", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeGreaterThan(String value) {
            addCriterion("MEMBER_CODE >", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_CODE >=", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLessThan(String value) {
            addCriterion("MEMBER_CODE <", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_CODE <=", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeLike(String value) {
            addCriterion("MEMBER_CODE like", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotLike(String value) {
            addCriterion("MEMBER_CODE not like", value, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeIn(List<String> values) {
            addCriterion("MEMBER_CODE in", values, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotIn(List<String> values) {
            addCriterion("MEMBER_CODE not in", values, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeBetween(String value1, String value2) {
            addCriterion("MEMBER_CODE between", value1, value2, "memberCode");
            return (Criteria) this;
        }

        public Criteria andMemberCodeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_CODE not between", value1, value2, "memberCode");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("SHORT_NAME =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("SHORT_NAME <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("SHORT_NAME >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("SHORT_NAME <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("SHORT_NAME <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("SHORT_NAME like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("SHORT_NAME not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("SHORT_NAME in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("SHORT_NAME not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("SHORT_NAME between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("SHORT_NAME not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("ALIAS =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("ALIAS <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("ALIAS >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("ALIAS >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("ALIAS <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("ALIAS <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("ALIAS like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("ALIAS not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("ALIAS in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("ALIAS not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("ALIAS between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("ALIAS not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNull() {
            addCriterion("CLASS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNotNull() {
            addCriterion("CLASS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualTo(String value) {
            addCriterion("CLASS_TYPE =", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualTo(String value) {
            addCriterion("CLASS_TYPE <>", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThan(String value) {
            addCriterion("CLASS_TYPE >", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_TYPE >=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThan(String value) {
            addCriterion("CLASS_TYPE <", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualTo(String value) {
            addCriterion("CLASS_TYPE <=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLike(String value) {
            addCriterion("CLASS_TYPE like", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotLike(String value) {
            addCriterion("CLASS_TYPE not like", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeIn(List<String> values) {
            addCriterion("CLASS_TYPE in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotIn(List<String> values) {
            addCriterion("CLASS_TYPE not in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeBetween(String value1, String value2) {
            addCriterion("CLASS_TYPE between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotBetween(String value1, String value2) {
            addCriterion("CLASS_TYPE not between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIsNull() {
            addCriterion("SOCIAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIsNotNull() {
            addCriterion("SOCIAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCodeEqualTo(String value) {
            addCriterion("SOCIAL_CODE =", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotEqualTo(String value) {
            addCriterion("SOCIAL_CODE <>", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeGreaterThan(String value) {
            addCriterion("SOCIAL_CODE >", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIAL_CODE >=", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLessThan(String value) {
            addCriterion("SOCIAL_CODE <", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLessThanOrEqualTo(String value) {
            addCriterion("SOCIAL_CODE <=", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeLike(String value) {
            addCriterion("SOCIAL_CODE like", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotLike(String value) {
            addCriterion("SOCIAL_CODE not like", value, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeIn(List<String> values) {
            addCriterion("SOCIAL_CODE in", values, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotIn(List<String> values) {
            addCriterion("SOCIAL_CODE not in", values, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeBetween(String value1, String value2) {
            addCriterion("SOCIAL_CODE between", value1, value2, "socialCode");
            return (Criteria) this;
        }

        public Criteria andSocialCodeNotBetween(String value1, String value2) {
            addCriterion("SOCIAL_CODE not between", value1, value2, "socialCode");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameIsNull() {
            addCriterion("ACCT_BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameIsNotNull() {
            addCriterion("ACCT_BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameEqualTo(String value) {
            addCriterion("ACCT_BANK_NAME =", value, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameNotEqualTo(String value) {
            addCriterion("ACCT_BANK_NAME <>", value, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameGreaterThan(String value) {
            addCriterion("ACCT_BANK_NAME >", value, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_BANK_NAME >=", value, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameLessThan(String value) {
            addCriterion("ACCT_BANK_NAME <", value, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameLessThanOrEqualTo(String value) {
            addCriterion("ACCT_BANK_NAME <=", value, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameLike(String value) {
            addCriterion("ACCT_BANK_NAME like", value, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameNotLike(String value) {
            addCriterion("ACCT_BANK_NAME not like", value, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameIn(List<String> values) {
            addCriterion("ACCT_BANK_NAME in", values, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameNotIn(List<String> values) {
            addCriterion("ACCT_BANK_NAME not in", values, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameBetween(String value1, String value2) {
            addCriterion("ACCT_BANK_NAME between", value1, value2, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctBankNameNotBetween(String value1, String value2) {
            addCriterion("ACCT_BANK_NAME not between", value1, value2, "acctBankName");
            return (Criteria) this;
        }

        public Criteria andAcctNameIsNull() {
            addCriterion("ACCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAcctNameIsNotNull() {
            addCriterion("ACCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAcctNameEqualTo(String value) {
            addCriterion("ACCT_NAME =", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotEqualTo(String value) {
            addCriterion("ACCT_NAME <>", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThan(String value) {
            addCriterion("ACCT_NAME >", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_NAME >=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThan(String value) {
            addCriterion("ACCT_NAME <", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLessThanOrEqualTo(String value) {
            addCriterion("ACCT_NAME <=", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameLike(String value) {
            addCriterion("ACCT_NAME like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotLike(String value) {
            addCriterion("ACCT_NAME not like", value, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameIn(List<String> values) {
            addCriterion("ACCT_NAME in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotIn(List<String> values) {
            addCriterion("ACCT_NAME not in", values, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameBetween(String value1, String value2) {
            addCriterion("ACCT_NAME between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctNameNotBetween(String value1, String value2) {
            addCriterion("ACCT_NAME not between", value1, value2, "acctName");
            return (Criteria) this;
        }

        public Criteria andAcctCodeIsNull() {
            addCriterion("ACCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAcctCodeIsNotNull() {
            addCriterion("ACCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAcctCodeEqualTo(String value) {
            addCriterion("ACCT_CODE =", value, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeNotEqualTo(String value) {
            addCriterion("ACCT_CODE <>", value, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeGreaterThan(String value) {
            addCriterion("ACCT_CODE >", value, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_CODE >=", value, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeLessThan(String value) {
            addCriterion("ACCT_CODE <", value, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeLessThanOrEqualTo(String value) {
            addCriterion("ACCT_CODE <=", value, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeLike(String value) {
            addCriterion("ACCT_CODE like", value, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeNotLike(String value) {
            addCriterion("ACCT_CODE not like", value, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeIn(List<String> values) {
            addCriterion("ACCT_CODE in", values, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeNotIn(List<String> values) {
            addCriterion("ACCT_CODE not in", values, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeBetween(String value1, String value2) {
            addCriterion("ACCT_CODE between", value1, value2, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctCodeNotBetween(String value1, String value2) {
            addCriterion("ACCT_CODE not between", value1, value2, "acctCode");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonIsNull() {
            addCriterion("ACCT_LIAISON is null");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonIsNotNull() {
            addCriterion("ACCT_LIAISON is not null");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonEqualTo(String value) {
            addCriterion("ACCT_LIAISON =", value, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonNotEqualTo(String value) {
            addCriterion("ACCT_LIAISON <>", value, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonGreaterThan(String value) {
            addCriterion("ACCT_LIAISON >", value, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_LIAISON >=", value, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonLessThan(String value) {
            addCriterion("ACCT_LIAISON <", value, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonLessThanOrEqualTo(String value) {
            addCriterion("ACCT_LIAISON <=", value, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonLike(String value) {
            addCriterion("ACCT_LIAISON like", value, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonNotLike(String value) {
            addCriterion("ACCT_LIAISON not like", value, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonIn(List<String> values) {
            addCriterion("ACCT_LIAISON in", values, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonNotIn(List<String> values) {
            addCriterion("ACCT_LIAISON not in", values, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonBetween(String value1, String value2) {
            addCriterion("ACCT_LIAISON between", value1, value2, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andAcctLiaisonNotBetween(String value1, String value2) {
            addCriterion("ACCT_LIAISON not between", value1, value2, "acctLiaison");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("COMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("COMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(String value) {
            addCriterion("COMPANYID =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(String value) {
            addCriterion("COMPANYID <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(String value) {
            addCriterion("COMPANYID >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYID >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(String value) {
            addCriterion("COMPANYID <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(String value) {
            addCriterion("COMPANYID <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLike(String value) {
            addCriterion("COMPANYID like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotLike(String value) {
            addCriterion("COMPANYID not like", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<String> values) {
            addCriterion("COMPANYID in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<String> values) {
            addCriterion("COMPANYID not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(String value1, String value2) {
            addCriterion("COMPANYID between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(String value1, String value2) {
            addCriterion("COMPANYID not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNull() {
            addCriterion("MEMBER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIsNotNull() {
            addCriterion("MEMBER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTypeEqualTo(String value) {
            addCriterion("MEMBER_TYPE =", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotEqualTo(String value) {
            addCriterion("MEMBER_TYPE <>", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThan(String value) {
            addCriterion("MEMBER_TYPE >", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_TYPE >=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThan(String value) {
            addCriterion("MEMBER_TYPE <", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_TYPE <=", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeLike(String value) {
            addCriterion("MEMBER_TYPE like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotLike(String value) {
            addCriterion("MEMBER_TYPE not like", value, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeIn(List<String> values) {
            addCriterion("MEMBER_TYPE in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotIn(List<String> values) {
            addCriterion("MEMBER_TYPE not in", values, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeBetween(String value1, String value2) {
            addCriterion("MEMBER_TYPE between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andMemberTypeNotBetween(String value1, String value2) {
            addCriterion("MEMBER_TYPE not between", value1, value2, "memberType");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityIsNull() {
            addCriterion("INSTALL_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityIsNotNull() {
            addCriterion("INSTALL_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityEqualTo(BigDecimal value) {
            addCriterion("INSTALL_CAPACITY =", value, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityNotEqualTo(BigDecimal value) {
            addCriterion("INSTALL_CAPACITY <>", value, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityGreaterThan(BigDecimal value) {
            addCriterion("INSTALL_CAPACITY >", value, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSTALL_CAPACITY >=", value, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityLessThan(BigDecimal value) {
            addCriterion("INSTALL_CAPACITY <", value, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSTALL_CAPACITY <=", value, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityIn(List<BigDecimal> values) {
            addCriterion("INSTALL_CAPACITY in", values, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityNotIn(List<BigDecimal> values) {
            addCriterion("INSTALL_CAPACITY not in", values, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSTALL_CAPACITY between", value1, value2, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andInstallCapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSTALL_CAPACITY not between", value1, value2, "installCapacity");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIsNull() {
            addCriterion("VOLTAGE_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIsNotNull() {
            addCriterion("VOLTAGE_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeEqualTo(String value) {
            addCriterion("VOLTAGE_GRADE =", value, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNotEqualTo(String value) {
            addCriterion("VOLTAGE_GRADE <>", value, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeGreaterThan(String value) {
            addCriterion("VOLTAGE_GRADE >", value, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeGreaterThanOrEqualTo(String value) {
            addCriterion("VOLTAGE_GRADE >=", value, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeLessThan(String value) {
            addCriterion("VOLTAGE_GRADE <", value, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeLessThanOrEqualTo(String value) {
            addCriterion("VOLTAGE_GRADE <=", value, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeLike(String value) {
            addCriterion("VOLTAGE_GRADE like", value, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNotLike(String value) {
            addCriterion("VOLTAGE_GRADE not like", value, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIn(List<String> values) {
            addCriterion("VOLTAGE_GRADE in", values, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNotIn(List<String> values) {
            addCriterion("VOLTAGE_GRADE not in", values, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeBetween(String value1, String value2) {
            addCriterion("VOLTAGE_GRADE between", value1, value2, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNotBetween(String value1, String value2) {
            addCriterion("VOLTAGE_GRADE not between", value1, value2, "voltageGrade");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeIsNull() {
            addCriterion("POWER_PLANT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeIsNotNull() {
            addCriterion("POWER_PLANT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeEqualTo(String value) {
            addCriterion("POWER_PLANT_TYPE =", value, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeNotEqualTo(String value) {
            addCriterion("POWER_PLANT_TYPE <>", value, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeGreaterThan(String value) {
            addCriterion("POWER_PLANT_TYPE >", value, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_PLANT_TYPE >=", value, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeLessThan(String value) {
            addCriterion("POWER_PLANT_TYPE <", value, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeLessThanOrEqualTo(String value) {
            addCriterion("POWER_PLANT_TYPE <=", value, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeLike(String value) {
            addCriterion("POWER_PLANT_TYPE like", value, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeNotLike(String value) {
            addCriterion("POWER_PLANT_TYPE not like", value, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeIn(List<String> values) {
            addCriterion("POWER_PLANT_TYPE in", values, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeNotIn(List<String> values) {
            addCriterion("POWER_PLANT_TYPE not in", values, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeBetween(String value1, String value2) {
            addCriterion("POWER_PLANT_TYPE between", value1, value2, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andPowerPlantTypeNotBetween(String value1, String value2) {
            addCriterion("POWER_PLANT_TYPE not between", value1, value2, "powerPlantType");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityIsNull() {
            addCriterion("STORAGE_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityIsNotNull() {
            addCriterion("STORAGE_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityEqualTo(BigDecimal value) {
            addCriterion("STORAGE_CAPACITY =", value, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityNotEqualTo(BigDecimal value) {
            addCriterion("STORAGE_CAPACITY <>", value, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityGreaterThan(BigDecimal value) {
            addCriterion("STORAGE_CAPACITY >", value, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STORAGE_CAPACITY >=", value, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityLessThan(BigDecimal value) {
            addCriterion("STORAGE_CAPACITY <", value, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STORAGE_CAPACITY <=", value, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityIn(List<BigDecimal> values) {
            addCriterion("STORAGE_CAPACITY in", values, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityNotIn(List<BigDecimal> values) {
            addCriterion("STORAGE_CAPACITY not in", values, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORAGE_CAPACITY between", value1, value2, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andStorageCapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORAGE_CAPACITY not between", value1, value2, "storageCapacity");
            return (Criteria) this;
        }

        public Criteria andGeogRegionIsNull() {
            addCriterion("GEOG_REGION is null");
            return (Criteria) this;
        }

        public Criteria andGeogRegionIsNotNull() {
            addCriterion("GEOG_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andGeogRegionEqualTo(String value) {
            addCriterion("GEOG_REGION =", value, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionNotEqualTo(String value) {
            addCriterion("GEOG_REGION <>", value, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionGreaterThan(String value) {
            addCriterion("GEOG_REGION >", value, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionGreaterThanOrEqualTo(String value) {
            addCriterion("GEOG_REGION >=", value, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionLessThan(String value) {
            addCriterion("GEOG_REGION <", value, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionLessThanOrEqualTo(String value) {
            addCriterion("GEOG_REGION <=", value, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionLike(String value) {
            addCriterion("GEOG_REGION like", value, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionNotLike(String value) {
            addCriterion("GEOG_REGION not like", value, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionIn(List<String> values) {
            addCriterion("GEOG_REGION in", values, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionNotIn(List<String> values) {
            addCriterion("GEOG_REGION not in", values, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionBetween(String value1, String value2) {
            addCriterion("GEOG_REGION between", value1, value2, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andGeogRegionNotBetween(String value1, String value2) {
            addCriterion("GEOG_REGION not between", value1, value2, "geogRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionIsNull() {
            addCriterion("CONTROL_REGION is null");
            return (Criteria) this;
        }

        public Criteria andControlRegionIsNotNull() {
            addCriterion("CONTROL_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andControlRegionEqualTo(String value) {
            addCriterion("CONTROL_REGION =", value, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionNotEqualTo(String value) {
            addCriterion("CONTROL_REGION <>", value, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionGreaterThan(String value) {
            addCriterion("CONTROL_REGION >", value, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionGreaterThanOrEqualTo(String value) {
            addCriterion("CONTROL_REGION >=", value, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionLessThan(String value) {
            addCriterion("CONTROL_REGION <", value, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionLessThanOrEqualTo(String value) {
            addCriterion("CONTROL_REGION <=", value, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionLike(String value) {
            addCriterion("CONTROL_REGION like", value, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionNotLike(String value) {
            addCriterion("CONTROL_REGION not like", value, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionIn(List<String> values) {
            addCriterion("CONTROL_REGION in", values, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionNotIn(List<String> values) {
            addCriterion("CONTROL_REGION not in", values, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionBetween(String value1, String value2) {
            addCriterion("CONTROL_REGION between", value1, value2, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andControlRegionNotBetween(String value1, String value2) {
            addCriterion("CONTROL_REGION not between", value1, value2, "controlRegion");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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

        public Criteria andLegalRepreIsNull() {
            addCriterion("LEGAL_REPRE is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepreIsNotNull() {
            addCriterion("LEGAL_REPRE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepreEqualTo(String value) {
            addCriterion("LEGAL_REPRE =", value, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreNotEqualTo(String value) {
            addCriterion("LEGAL_REPRE <>", value, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreGreaterThan(String value) {
            addCriterion("LEGAL_REPRE >", value, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL_REPRE >=", value, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreLessThan(String value) {
            addCriterion("LEGAL_REPRE <", value, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreLessThanOrEqualTo(String value) {
            addCriterion("LEGAL_REPRE <=", value, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreLike(String value) {
            addCriterion("LEGAL_REPRE like", value, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreNotLike(String value) {
            addCriterion("LEGAL_REPRE not like", value, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreIn(List<String> values) {
            addCriterion("LEGAL_REPRE in", values, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreNotIn(List<String> values) {
            addCriterion("LEGAL_REPRE not in", values, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreBetween(String value1, String value2) {
            addCriterion("LEGAL_REPRE between", value1, value2, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andLegalRepreNotBetween(String value1, String value2) {
            addCriterion("LEGAL_REPRE not between", value1, value2, "legalRepre");
            return (Criteria) this;
        }

        public Criteria andReditMoneyIsNull() {
            addCriterion("REDIT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andReditMoneyIsNotNull() {
            addCriterion("REDIT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andReditMoneyEqualTo(BigDecimal value) {
            addCriterion("REDIT_MONEY =", value, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyNotEqualTo(BigDecimal value) {
            addCriterion("REDIT_MONEY <>", value, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyGreaterThan(BigDecimal value) {
            addCriterion("REDIT_MONEY >", value, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REDIT_MONEY >=", value, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyLessThan(BigDecimal value) {
            addCriterion("REDIT_MONEY <", value, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REDIT_MONEY <=", value, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyIn(List<BigDecimal> values) {
            addCriterion("REDIT_MONEY in", values, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyNotIn(List<BigDecimal> values) {
            addCriterion("REDIT_MONEY not in", values, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REDIT_MONEY between", value1, value2, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andReditMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REDIT_MONEY not between", value1, value2, "reditMoney");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityIsNull() {
            addCriterion("PROXY_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityIsNotNull() {
            addCriterion("PROXY_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityEqualTo(Long value) {
            addCriterion("PROXY_CAPACITY =", value, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityNotEqualTo(Long value) {
            addCriterion("PROXY_CAPACITY <>", value, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityGreaterThan(Long value) {
            addCriterion("PROXY_CAPACITY >", value, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityGreaterThanOrEqualTo(Long value) {
            addCriterion("PROXY_CAPACITY >=", value, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityLessThan(Long value) {
            addCriterion("PROXY_CAPACITY <", value, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityLessThanOrEqualTo(Long value) {
            addCriterion("PROXY_CAPACITY <=", value, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityIn(List<Long> values) {
            addCriterion("PROXY_CAPACITY in", values, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityNotIn(List<Long> values) {
            addCriterion("PROXY_CAPACITY not in", values, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityBetween(Long value1, Long value2) {
            addCriterion("PROXY_CAPACITY between", value1, value2, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andProxyCapacityNotBetween(Long value1, Long value2) {
            addCriterion("PROXY_CAPACITY not between", value1, value2, "proxyCapacity");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIsNull() {
            addCriterion("BUY_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIsNotNull() {
            addCriterion("BUY_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyLevelEqualTo(String value) {
            addCriterion("BUY_LEVEL =", value, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelNotEqualTo(String value) {
            addCriterion("BUY_LEVEL <>", value, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelGreaterThan(String value) {
            addCriterion("BUY_LEVEL >", value, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_LEVEL >=", value, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelLessThan(String value) {
            addCriterion("BUY_LEVEL <", value, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelLessThanOrEqualTo(String value) {
            addCriterion("BUY_LEVEL <=", value, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelLike(String value) {
            addCriterion("BUY_LEVEL like", value, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelNotLike(String value) {
            addCriterion("BUY_LEVEL not like", value, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelIn(List<String> values) {
            addCriterion("BUY_LEVEL in", values, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelNotIn(List<String> values) {
            addCriterion("BUY_LEVEL not in", values, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelBetween(String value1, String value2) {
            addCriterion("BUY_LEVEL between", value1, value2, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andBuyLevelNotBetween(String value1, String value2) {
            addCriterion("BUY_LEVEL not between", value1, value2, "buyLevel");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdIsNull() {
            addCriterion("SETTLE_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdIsNotNull() {
            addCriterion("SETTLE_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdEqualTo(String value) {
            addCriterion("SETTLE_COMPANY_ID =", value, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdNotEqualTo(String value) {
            addCriterion("SETTLE_COMPANY_ID <>", value, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdGreaterThan(String value) {
            addCriterion("SETTLE_COMPANY_ID >", value, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_COMPANY_ID >=", value, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdLessThan(String value) {
            addCriterion("SETTLE_COMPANY_ID <", value, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_COMPANY_ID <=", value, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdLike(String value) {
            addCriterion("SETTLE_COMPANY_ID like", value, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdNotLike(String value) {
            addCriterion("SETTLE_COMPANY_ID not like", value, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdIn(List<String> values) {
            addCriterion("SETTLE_COMPANY_ID in", values, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdNotIn(List<String> values) {
            addCriterion("SETTLE_COMPANY_ID not in", values, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdBetween(String value1, String value2) {
            addCriterion("SETTLE_COMPANY_ID between", value1, value2, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andSettleCompanyIdNotBetween(String value1, String value2) {
            addCriterion("SETTLE_COMPANY_ID not between", value1, value2, "settleCompanyId");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeIsNull() {
            addCriterion("AGREEMENT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeIsNotNull() {
            addCriterion("AGREEMENT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeEqualTo(String value) {
            addCriterion("AGREEMENT_CODE =", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeNotEqualTo(String value) {
            addCriterion("AGREEMENT_CODE <>", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeGreaterThan(String value) {
            addCriterion("AGREEMENT_CODE >", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AGREEMENT_CODE >=", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeLessThan(String value) {
            addCriterion("AGREEMENT_CODE <", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeLessThanOrEqualTo(String value) {
            addCriterion("AGREEMENT_CODE <=", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeLike(String value) {
            addCriterion("AGREEMENT_CODE like", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeNotLike(String value) {
            addCriterion("AGREEMENT_CODE not like", value, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeIn(List<String> values) {
            addCriterion("AGREEMENT_CODE in", values, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeNotIn(List<String> values) {
            addCriterion("AGREEMENT_CODE not in", values, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeBetween(String value1, String value2) {
            addCriterion("AGREEMENT_CODE between", value1, value2, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andAgreementCodeNotBetween(String value1, String value2) {
            addCriterion("AGREEMENT_CODE not between", value1, value2, "agreementCode");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityIsNull() {
            addCriterion("NEWSPAPER_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityIsNotNull() {
            addCriterion("NEWSPAPER_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityEqualTo(Long value) {
            addCriterion("NEWSPAPER_CAPACITY =", value, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityNotEqualTo(Long value) {
            addCriterion("NEWSPAPER_CAPACITY <>", value, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityGreaterThan(Long value) {
            addCriterion("NEWSPAPER_CAPACITY >", value, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityGreaterThanOrEqualTo(Long value) {
            addCriterion("NEWSPAPER_CAPACITY >=", value, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityLessThan(Long value) {
            addCriterion("NEWSPAPER_CAPACITY <", value, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityLessThanOrEqualTo(Long value) {
            addCriterion("NEWSPAPER_CAPACITY <=", value, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityIn(List<Long> values) {
            addCriterion("NEWSPAPER_CAPACITY in", values, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityNotIn(List<Long> values) {
            addCriterion("NEWSPAPER_CAPACITY not in", values, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityBetween(Long value1, Long value2) {
            addCriterion("NEWSPAPER_CAPACITY between", value1, value2, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andNewspaperCapacityNotBetween(Long value1, Long value2) {
            addCriterion("NEWSPAPER_CAPACITY not between", value1, value2, "newspaperCapacity");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusIsNull() {
            addCriterion("AGREEMENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusIsNotNull() {
            addCriterion("AGREEMENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusEqualTo(String value) {
            addCriterion("AGREEMENT_STATUS =", value, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusNotEqualTo(String value) {
            addCriterion("AGREEMENT_STATUS <>", value, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusGreaterThan(String value) {
            addCriterion("AGREEMENT_STATUS >", value, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusGreaterThanOrEqualTo(String value) {
            addCriterion("AGREEMENT_STATUS >=", value, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusLessThan(String value) {
            addCriterion("AGREEMENT_STATUS <", value, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusLessThanOrEqualTo(String value) {
            addCriterion("AGREEMENT_STATUS <=", value, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusLike(String value) {
            addCriterion("AGREEMENT_STATUS like", value, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusNotLike(String value) {
            addCriterion("AGREEMENT_STATUS not like", value, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusIn(List<String> values) {
            addCriterion("AGREEMENT_STATUS in", values, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusNotIn(List<String> values) {
            addCriterion("AGREEMENT_STATUS not in", values, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusBetween(String value1, String value2) {
            addCriterion("AGREEMENT_STATUS between", value1, value2, "agreementStatus");
            return (Criteria) this;
        }

        public Criteria andAgreementStatusNotBetween(String value1, String value2) {
            addCriterion("AGREEMENT_STATUS not between", value1, value2, "agreementStatus");
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

        public Criteria andSupplierCodeIsNull() {
            addCriterion("SUPPLIER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIsNotNull() {
            addCriterion("SUPPLIER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeEqualTo(String value) {
            addCriterion("SUPPLIER_CODE =", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotEqualTo(String value) {
            addCriterion("SUPPLIER_CODE <>", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThan(String value) {
            addCriterion("SUPPLIER_CODE >", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CODE >=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThan(String value) {
            addCriterion("SUPPLIER_CODE <", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLessThanOrEqualTo(String value) {
            addCriterion("SUPPLIER_CODE <=", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeLike(String value) {
            addCriterion("SUPPLIER_CODE like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotLike(String value) {
            addCriterion("SUPPLIER_CODE not like", value, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeIn(List<String> values) {
            addCriterion("SUPPLIER_CODE in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotIn(List<String> values) {
            addCriterion("SUPPLIER_CODE not in", values, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CODE between", value1, value2, "supplierCode");
            return (Criteria) this;
        }

        public Criteria andSupplierCodeNotBetween(String value1, String value2) {
            addCriterion("SUPPLIER_CODE not between", value1, value2, "supplierCode");
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

        public Criteria andMemberStatusIsNull() {
            addCriterion("MEMBER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMemberStatusIsNotNull() {
            addCriterion("MEMBER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMemberStatusEqualTo(String value) {
            addCriterion("MEMBER_STATUS =", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotEqualTo(String value) {
            addCriterion("MEMBER_STATUS <>", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusGreaterThan(String value) {
            addCriterion("MEMBER_STATUS >", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_STATUS >=", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusLessThan(String value) {
            addCriterion("MEMBER_STATUS <", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_STATUS <=", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusLike(String value) {
            addCriterion("MEMBER_STATUS like", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotLike(String value) {
            addCriterion("MEMBER_STATUS not like", value, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusIn(List<String> values) {
            addCriterion("MEMBER_STATUS in", values, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotIn(List<String> values) {
            addCriterion("MEMBER_STATUS not in", values, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusBetween(String value1, String value2) {
            addCriterion("MEMBER_STATUS between", value1, value2, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andMemberStatusNotBetween(String value1, String value2) {
            addCriterion("MEMBER_STATUS not between", value1, value2, "memberStatus");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("RATE is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("RATE =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("RATE <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("RATE >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("RATE >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("RATE <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("RATE <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("RATE like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("RATE not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("RATE in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("RATE not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("RATE between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("RATE not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andElectroTypeIsNull() {
            addCriterion("ELECTRO_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andElectroTypeIsNotNull() {
            addCriterion("ELECTRO_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andElectroTypeEqualTo(String value) {
            addCriterion("ELECTRO_TYPE =", value, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeNotEqualTo(String value) {
            addCriterion("ELECTRO_TYPE <>", value, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeGreaterThan(String value) {
            addCriterion("ELECTRO_TYPE >", value, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ELECTRO_TYPE >=", value, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeLessThan(String value) {
            addCriterion("ELECTRO_TYPE <", value, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeLessThanOrEqualTo(String value) {
            addCriterion("ELECTRO_TYPE <=", value, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeLike(String value) {
            addCriterion("ELECTRO_TYPE like", value, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeNotLike(String value) {
            addCriterion("ELECTRO_TYPE not like", value, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeIn(List<String> values) {
            addCriterion("ELECTRO_TYPE in", values, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeNotIn(List<String> values) {
            addCriterion("ELECTRO_TYPE not in", values, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeBetween(String value1, String value2) {
            addCriterion("ELECTRO_TYPE between", value1, value2, "electroType");
            return (Criteria) this;
        }

        public Criteria andElectroTypeNotBetween(String value1, String value2) {
            addCriterion("ELECTRO_TYPE not between", value1, value2, "electroType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
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

        public Criteria andUnderBlocNameIsNull() {
            addCriterion("UNDER_BLOC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameIsNotNull() {
            addCriterion("UNDER_BLOC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameEqualTo(String value) {
            addCriterion("UNDER_BLOC_NAME =", value, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameNotEqualTo(String value) {
            addCriterion("UNDER_BLOC_NAME <>", value, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameGreaterThan(String value) {
            addCriterion("UNDER_BLOC_NAME >", value, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameGreaterThanOrEqualTo(String value) {
            addCriterion("UNDER_BLOC_NAME >=", value, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameLessThan(String value) {
            addCriterion("UNDER_BLOC_NAME <", value, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameLessThanOrEqualTo(String value) {
            addCriterion("UNDER_BLOC_NAME <=", value, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameLike(String value) {
            addCriterion("UNDER_BLOC_NAME like", value, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameNotLike(String value) {
            addCriterion("UNDER_BLOC_NAME not like", value, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameIn(List<String> values) {
            addCriterion("UNDER_BLOC_NAME in", values, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameNotIn(List<String> values) {
            addCriterion("UNDER_BLOC_NAME not in", values, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameBetween(String value1, String value2) {
            addCriterion("UNDER_BLOC_NAME between", value1, value2, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andUnderBlocNameNotBetween(String value1, String value2) {
            addCriterion("UNDER_BLOC_NAME not between", value1, value2, "underBlocName");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeIsNull() {
            addCriterion("ELECTRIC_ENERGY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeIsNotNull() {
            addCriterion("ELECTRIC_ENERGY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeEqualTo(String value) {
            addCriterion("ELECTRIC_ENERGY_TYPE =", value, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeNotEqualTo(String value) {
            addCriterion("ELECTRIC_ENERGY_TYPE <>", value, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeGreaterThan(String value) {
            addCriterion("ELECTRIC_ENERGY_TYPE >", value, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ELECTRIC_ENERGY_TYPE >=", value, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeLessThan(String value) {
            addCriterion("ELECTRIC_ENERGY_TYPE <", value, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeLessThanOrEqualTo(String value) {
            addCriterion("ELECTRIC_ENERGY_TYPE <=", value, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeLike(String value) {
            addCriterion("ELECTRIC_ENERGY_TYPE like", value, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeNotLike(String value) {
            addCriterion("ELECTRIC_ENERGY_TYPE not like", value, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeIn(List<String> values) {
            addCriterion("ELECTRIC_ENERGY_TYPE in", values, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeNotIn(List<String> values) {
            addCriterion("ELECTRIC_ENERGY_TYPE not in", values, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeBetween(String value1, String value2) {
            addCriterion("ELECTRIC_ENERGY_TYPE between", value1, value2, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andElectricEnergyTypeNotBetween(String value1, String value2) {
            addCriterion("ELECTRIC_ENERGY_TYPE not between", value1, value2, "electricEnergyType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeIsNull() {
            addCriterion("STATE_GRID_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeIsNotNull() {
            addCriterion("STATE_GRID_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeEqualTo(String value) {
            addCriterion("STATE_GRID_TYPE =", value, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeNotEqualTo(String value) {
            addCriterion("STATE_GRID_TYPE <>", value, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeGreaterThan(String value) {
            addCriterion("STATE_GRID_TYPE >", value, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STATE_GRID_TYPE >=", value, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeLessThan(String value) {
            addCriterion("STATE_GRID_TYPE <", value, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeLessThanOrEqualTo(String value) {
            addCriterion("STATE_GRID_TYPE <=", value, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeLike(String value) {
            addCriterion("STATE_GRID_TYPE like", value, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeNotLike(String value) {
            addCriterion("STATE_GRID_TYPE not like", value, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeIn(List<String> values) {
            addCriterion("STATE_GRID_TYPE in", values, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeNotIn(List<String> values) {
            addCriterion("STATE_GRID_TYPE not in", values, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeBetween(String value1, String value2) {
            addCriterion("STATE_GRID_TYPE between", value1, value2, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andStateGridTypeNotBetween(String value1, String value2) {
            addCriterion("STATE_GRID_TYPE not between", value1, value2, "stateGridType");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoIsNull() {
            addCriterion("MARKETING_USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoIsNotNull() {
            addCriterion("MARKETING_USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoEqualTo(String value) {
            addCriterion("MARKETING_USER_NO =", value, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoNotEqualTo(String value) {
            addCriterion("MARKETING_USER_NO <>", value, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoGreaterThan(String value) {
            addCriterion("MARKETING_USER_NO >", value, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("MARKETING_USER_NO >=", value, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoLessThan(String value) {
            addCriterion("MARKETING_USER_NO <", value, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoLessThanOrEqualTo(String value) {
            addCriterion("MARKETING_USER_NO <=", value, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoLike(String value) {
            addCriterion("MARKETING_USER_NO like", value, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoNotLike(String value) {
            addCriterion("MARKETING_USER_NO not like", value, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoIn(List<String> values) {
            addCriterion("MARKETING_USER_NO in", values, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoNotIn(List<String> values) {
            addCriterion("MARKETING_USER_NO not in", values, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoBetween(String value1, String value2) {
            addCriterion("MARKETING_USER_NO between", value1, value2, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andMarketingUserNoNotBetween(String value1, String value2) {
            addCriterion("MARKETING_USER_NO not between", value1, value2, "marketingUserNo");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeIsNull() {
            addCriterion("SALE_MEMBER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeIsNotNull() {
            addCriterion("SALE_MEMBER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeEqualTo(String value) {
            addCriterion("SALE_MEMBER_TYPE =", value, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeNotEqualTo(String value) {
            addCriterion("SALE_MEMBER_TYPE <>", value, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeGreaterThan(String value) {
            addCriterion("SALE_MEMBER_TYPE >", value, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_MEMBER_TYPE >=", value, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeLessThan(String value) {
            addCriterion("SALE_MEMBER_TYPE <", value, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeLessThanOrEqualTo(String value) {
            addCriterion("SALE_MEMBER_TYPE <=", value, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeLike(String value) {
            addCriterion("SALE_MEMBER_TYPE like", value, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeNotLike(String value) {
            addCriterion("SALE_MEMBER_TYPE not like", value, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeIn(List<String> values) {
            addCriterion("SALE_MEMBER_TYPE in", values, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeNotIn(List<String> values) {
            addCriterion("SALE_MEMBER_TYPE not in", values, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeBetween(String value1, String value2) {
            addCriterion("SALE_MEMBER_TYPE between", value1, value2, "saleMemberType");
            return (Criteria) this;
        }

        public Criteria andSaleMemberTypeNotBetween(String value1, String value2) {
            addCriterion("SALE_MEMBER_TYPE not between", value1, value2, "saleMemberType");
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