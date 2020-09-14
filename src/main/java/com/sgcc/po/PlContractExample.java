package com.sgcc.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PlContractExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlContractExample() {
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

        public Criteria andContractCodeIsNull() {
            addCriterion("CONTRACT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andContractCodeIsNotNull() {
            addCriterion("CONTRACT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andContractCodeEqualTo(String value) {
            addCriterion("CONTRACT_CODE =", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotEqualTo(String value) {
            addCriterion("CONTRACT_CODE <>", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThan(String value) {
            addCriterion("CONTRACT_CODE >", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CODE >=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThan(String value) {
            addCriterion("CONTRACT_CODE <", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_CODE <=", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeLike(String value) {
            addCriterion("CONTRACT_CODE like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotLike(String value) {
            addCriterion("CONTRACT_CODE not like", value, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeIn(List<String> values) {
            addCriterion("CONTRACT_CODE in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotIn(List<String> values) {
            addCriterion("CONTRACT_CODE not in", values, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeBetween(String value1, String value2) {
            addCriterion("CONTRACT_CODE between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractCodeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_CODE not between", value1, value2, "contractCode");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNull() {
            addCriterion("CONTRACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContractNameIsNotNull() {
            addCriterion("CONTRACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContractNameEqualTo(String value) {
            addCriterion("CONTRACT_NAME =", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotEqualTo(String value) {
            addCriterion("CONTRACT_NAME <>", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThan(String value) {
            addCriterion("CONTRACT_NAME >", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NAME >=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThan(String value) {
            addCriterion("CONTRACT_NAME <", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_NAME <=", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameLike(String value) {
            addCriterion("CONTRACT_NAME like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotLike(String value) {
            addCriterion("CONTRACT_NAME not like", value, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameIn(List<String> values) {
            addCriterion("CONTRACT_NAME in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotIn(List<String> values) {
            addCriterion("CONTRACT_NAME not in", values, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameBetween(String value1, String value2) {
            addCriterion("CONTRACT_NAME between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractNameNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_NAME not between", value1, value2, "contractName");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("CONTRACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("CONTRACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("CONTRACT_TYPE =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("CONTRACT_TYPE >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("CONTRACT_TYPE <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("CONTRACT_TYPE like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("CONTRACT_TYPE not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("CONTRACT_TYPE in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("CONTRACT_TYPE not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
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

        public Criteria andSalerIdIsNull() {
            addCriterion("SALER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalerIdIsNotNull() {
            addCriterion("SALER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalerIdEqualTo(String value) {
            addCriterion("SALER_ID =", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotEqualTo(String value) {
            addCriterion("SALER_ID <>", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdGreaterThan(String value) {
            addCriterion("SALER_ID >", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdGreaterThanOrEqualTo(String value) {
            addCriterion("SALER_ID >=", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLessThan(String value) {
            addCriterion("SALER_ID <", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLessThanOrEqualTo(String value) {
            addCriterion("SALER_ID <=", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLike(String value) {
            addCriterion("SALER_ID like", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotLike(String value) {
            addCriterion("SALER_ID not like", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdIn(List<String> values) {
            addCriterion("SALER_ID in", values, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotIn(List<String> values) {
            addCriterion("SALER_ID not in", values, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdBetween(String value1, String value2) {
            addCriterion("SALER_ID between", value1, value2, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotBetween(String value1, String value2) {
            addCriterion("SALER_ID not between", value1, value2, "salerId");
            return (Criteria) this;
        }

        public Criteria andTransferIdIsNull() {
            addCriterion("TRANSFER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransferIdIsNotNull() {
            addCriterion("TRANSFER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransferIdEqualTo(String value) {
            addCriterion("TRANSFER_ID =", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotEqualTo(String value) {
            addCriterion("TRANSFER_ID <>", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThan(String value) {
            addCriterion("TRANSFER_ID >", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_ID >=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThan(String value) {
            addCriterion("TRANSFER_ID <", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_ID <=", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdLike(String value) {
            addCriterion("TRANSFER_ID like", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotLike(String value) {
            addCriterion("TRANSFER_ID not like", value, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdIn(List<String> values) {
            addCriterion("TRANSFER_ID in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotIn(List<String> values) {
            addCriterion("TRANSFER_ID not in", values, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdBetween(String value1, String value2) {
            addCriterion("TRANSFER_ID between", value1, value2, "transferId");
            return (Criteria) this;
        }

        public Criteria andTransferIdNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_ID not between", value1, value2, "transferId");
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

        public Criteria andVersionEqualTo(Integer value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Integer value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Integer value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Integer value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Integer value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Integer> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Integer> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Integer value1, Integer value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andContractEnergyIsNull() {
            addCriterion("CONTRACT_ENERGY is null");
            return (Criteria) this;
        }

        public Criteria andContractEnergyIsNotNull() {
            addCriterion("CONTRACT_ENERGY is not null");
            return (Criteria) this;
        }

        public Criteria andContractEnergyEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_ENERGY =", value, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_ENERGY <>", value, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyGreaterThan(BigDecimal value) {
            addCriterion("CONTRACT_ENERGY >", value, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_ENERGY >=", value, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyLessThan(BigDecimal value) {
            addCriterion("CONTRACT_ENERGY <", value, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_ENERGY <=", value, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_ENERGY in", values, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_ENERGY not in", values, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_ENERGY between", value1, value2, "contractEnergy");
            return (Criteria) this;
        }

        public Criteria andContractEnergyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_ENERGY not between", value1, value2, "contractEnergy");
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

        public Criteria andContractPriceIsNull() {
            addCriterion("CONTRACT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andContractPriceIsNotNull() {
            addCriterion("CONTRACT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andContractPriceEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PRICE =", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PRICE <>", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceGreaterThan(BigDecimal value) {
            addCriterion("CONTRACT_PRICE >", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PRICE >=", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceLessThan(BigDecimal value) {
            addCriterion("CONTRACT_PRICE <", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACT_PRICE <=", value, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_PRICE in", values, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACT_PRICE not in", values, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_PRICE between", value1, value2, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andContractPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACT_PRICE not between", value1, value2, "contractPrice");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(String value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(String value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(String value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(String value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(String value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(String value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLike(String value) {
            addCriterion("START_DATE like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotLike(String value) {
            addCriterion("START_DATE not like", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<String> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<String> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(String value1, String value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(String value1, String value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(String value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(String value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(String value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(String value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(String value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(String value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLike(String value) {
            addCriterion("END_DATE like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotLike(String value) {
            addCriterion("END_DATE not like", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<String> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<String> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(String value1, String value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(String value1, String value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleIsNull() {
            addCriterion("TRANSACTION_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleIsNotNull() {
            addCriterion("TRANSACTION_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleEqualTo(String value) {
            addCriterion("TRANSACTION_CYCLE =", value, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleNotEqualTo(String value) {
            addCriterion("TRANSACTION_CYCLE <>", value, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleGreaterThan(String value) {
            addCriterion("TRANSACTION_CYCLE >", value, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_CYCLE >=", value, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleLessThan(String value) {
            addCriterion("TRANSACTION_CYCLE <", value, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_CYCLE <=", value, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleLike(String value) {
            addCriterion("TRANSACTION_CYCLE like", value, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleNotLike(String value) {
            addCriterion("TRANSACTION_CYCLE not like", value, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleIn(List<String> values) {
            addCriterion("TRANSACTION_CYCLE in", values, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleNotIn(List<String> values) {
            addCriterion("TRANSACTION_CYCLE not in", values, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleBetween(String value1, String value2) {
            addCriterion("TRANSACTION_CYCLE between", value1, value2, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andTransactionCycleNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_CYCLE not between", value1, value2, "transactionCycle");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIsNull() {
            addCriterion("SIGNING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIsNotNull() {
            addCriterion("SIGNING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSigningTimeEqualTo(String value) {
            addCriterion("SIGNING_TIME =", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotEqualTo(String value) {
            addCriterion("SIGNING_TIME <>", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeGreaterThan(String value) {
            addCriterion("SIGNING_TIME >", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNING_TIME >=", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeLessThan(String value) {
            addCriterion("SIGNING_TIME <", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeLessThanOrEqualTo(String value) {
            addCriterion("SIGNING_TIME <=", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeLike(String value) {
            addCriterion("SIGNING_TIME like", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotLike(String value) {
            addCriterion("SIGNING_TIME not like", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIn(List<String> values) {
            addCriterion("SIGNING_TIME in", values, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotIn(List<String> values) {
            addCriterion("SIGNING_TIME not in", values, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeBetween(String value1, String value2) {
            addCriterion("SIGNING_TIME between", value1, value2, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotBetween(String value1, String value2) {
            addCriterion("SIGNING_TIME not between", value1, value2, "signingTime");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameIsNull() {
            addCriterion("GENERATION_RIGHTS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameIsNotNull() {
            addCriterion("GENERATION_RIGHTS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameEqualTo(String value) {
            addCriterion("GENERATION_RIGHTS_NAME =", value, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameNotEqualTo(String value) {
            addCriterion("GENERATION_RIGHTS_NAME <>", value, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameGreaterThan(String value) {
            addCriterion("GENERATION_RIGHTS_NAME >", value, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATION_RIGHTS_NAME >=", value, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameLessThan(String value) {
            addCriterion("GENERATION_RIGHTS_NAME <", value, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameLessThanOrEqualTo(String value) {
            addCriterion("GENERATION_RIGHTS_NAME <=", value, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameLike(String value) {
            addCriterion("GENERATION_RIGHTS_NAME like", value, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameNotLike(String value) {
            addCriterion("GENERATION_RIGHTS_NAME not like", value, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameIn(List<String> values) {
            addCriterion("GENERATION_RIGHTS_NAME in", values, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameNotIn(List<String> values) {
            addCriterion("GENERATION_RIGHTS_NAME not in", values, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameBetween(String value1, String value2) {
            addCriterion("GENERATION_RIGHTS_NAME between", value1, value2, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andGenerationRightsNameNotBetween(String value1, String value2) {
            addCriterion("GENERATION_RIGHTS_NAME not between", value1, value2, "generationRightsName");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeIsNull() {
            addCriterion("REPLACE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeIsNotNull() {
            addCriterion("REPLACE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeEqualTo(String value) {
            addCriterion("REPLACE_TYPE =", value, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeNotEqualTo(String value) {
            addCriterion("REPLACE_TYPE <>", value, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeGreaterThan(String value) {
            addCriterion("REPLACE_TYPE >", value, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPLACE_TYPE >=", value, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeLessThan(String value) {
            addCriterion("REPLACE_TYPE <", value, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeLessThanOrEqualTo(String value) {
            addCriterion("REPLACE_TYPE <=", value, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeLike(String value) {
            addCriterion("REPLACE_TYPE like", value, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeNotLike(String value) {
            addCriterion("REPLACE_TYPE not like", value, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeIn(List<String> values) {
            addCriterion("REPLACE_TYPE in", values, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeNotIn(List<String> values) {
            addCriterion("REPLACE_TYPE not in", values, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeBetween(String value1, String value2) {
            addCriterion("REPLACE_TYPE between", value1, value2, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceTypeNotBetween(String value1, String value2) {
            addCriterion("REPLACE_TYPE not between", value1, value2, "replaceType");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdIsNull() {
            addCriterion("REPLACE_CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdIsNotNull() {
            addCriterion("REPLACE_CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdEqualTo(String value) {
            addCriterion("REPLACE_CONTRACT_ID =", value, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdNotEqualTo(String value) {
            addCriterion("REPLACE_CONTRACT_ID <>", value, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdGreaterThan(String value) {
            addCriterion("REPLACE_CONTRACT_ID >", value, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPLACE_CONTRACT_ID >=", value, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdLessThan(String value) {
            addCriterion("REPLACE_CONTRACT_ID <", value, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdLessThanOrEqualTo(String value) {
            addCriterion("REPLACE_CONTRACT_ID <=", value, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdLike(String value) {
            addCriterion("REPLACE_CONTRACT_ID like", value, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdNotLike(String value) {
            addCriterion("REPLACE_CONTRACT_ID not like", value, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdIn(List<String> values) {
            addCriterion("REPLACE_CONTRACT_ID in", values, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdNotIn(List<String> values) {
            addCriterion("REPLACE_CONTRACT_ID not in", values, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdBetween(String value1, String value2) {
            addCriterion("REPLACE_CONTRACT_ID between", value1, value2, "replaceContractId");
            return (Criteria) this;
        }

        public Criteria andReplaceContractIdNotBetween(String value1, String value2) {
            addCriterion("REPLACE_CONTRACT_ID not between", value1, value2, "replaceContractId");
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

        public Criteria andContractStatusIsNull() {
            addCriterion("CONTRACT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andContractStatusIsNotNull() {
            addCriterion("CONTRACT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andContractStatusEqualTo(String value) {
            addCriterion("CONTRACT_STATUS =", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotEqualTo(String value) {
            addCriterion("CONTRACT_STATUS <>", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThan(String value) {
            addCriterion("CONTRACT_STATUS >", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_STATUS >=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThan(String value) {
            addCriterion("CONTRACT_STATUS <", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_STATUS <=", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusLike(String value) {
            addCriterion("CONTRACT_STATUS like", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotLike(String value) {
            addCriterion("CONTRACT_STATUS not like", value, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusIn(List<String> values) {
            addCriterion("CONTRACT_STATUS in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotIn(List<String> values) {
            addCriterion("CONTRACT_STATUS not in", values, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusBetween(String value1, String value2) {
            addCriterion("CONTRACT_STATUS between", value1, value2, "contractStatus");
            return (Criteria) this;
        }

        public Criteria andContractStatusNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_STATUS not between", value1, value2, "contractStatus");
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