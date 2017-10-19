package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class NationalGrantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NationalGrantExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andResidentIsNull() {
            addCriterion("resident is null");
            return (Criteria) this;
        }

        public Criteria andResidentIsNotNull() {
            addCriterion("resident is not null");
            return (Criteria) this;
        }

        public Criteria andResidentEqualTo(String value) {
            addCriterion("resident =", value, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentNotEqualTo(String value) {
            addCriterion("resident <>", value, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentGreaterThan(String value) {
            addCriterion("resident >", value, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentGreaterThanOrEqualTo(String value) {
            addCriterion("resident >=", value, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentLessThan(String value) {
            addCriterion("resident <", value, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentLessThanOrEqualTo(String value) {
            addCriterion("resident <=", value, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentLike(String value) {
            addCriterion("resident like", value, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentNotLike(String value) {
            addCriterion("resident not like", value, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentIn(List<String> values) {
            addCriterion("resident in", values, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentNotIn(List<String> values) {
            addCriterion("resident not in", values, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentBetween(String value1, String value2) {
            addCriterion("resident between", value1, value2, "resident");
            return (Criteria) this;
        }

        public Criteria andResidentNotBetween(String value1, String value2) {
            addCriterion("resident not between", value1, value2, "resident");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceIsNull() {
            addCriterion("income_source is null");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceIsNotNull() {
            addCriterion("income_source is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceEqualTo(String value) {
            addCriterion("income_source =", value, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceNotEqualTo(String value) {
            addCriterion("income_source <>", value, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceGreaterThan(String value) {
            addCriterion("income_source >", value, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceGreaterThanOrEqualTo(String value) {
            addCriterion("income_source >=", value, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceLessThan(String value) {
            addCriterion("income_source <", value, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceLessThanOrEqualTo(String value) {
            addCriterion("income_source <=", value, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceLike(String value) {
            addCriterion("income_source like", value, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceNotLike(String value) {
            addCriterion("income_source not like", value, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceIn(List<String> values) {
            addCriterion("income_source in", values, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceNotIn(List<String> values) {
            addCriterion("income_source not in", values, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceBetween(String value1, String value2) {
            addCriterion("income_source between", value1, value2, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andIncomeSourceNotBetween(String value1, String value2) {
            addCriterion("income_source not between", value1, value2, "incomeSource");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNull() {
            addCriterion("month_income is null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIsNotNull() {
            addCriterion("month_income is not null");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeEqualTo(String value) {
            addCriterion("month_income =", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotEqualTo(String value) {
            addCriterion("month_income <>", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThan(String value) {
            addCriterion("month_income >", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("month_income >=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThan(String value) {
            addCriterion("month_income <", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLessThanOrEqualTo(String value) {
            addCriterion("month_income <=", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeLike(String value) {
            addCriterion("month_income like", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotLike(String value) {
            addCriterion("month_income not like", value, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeIn(List<String> values) {
            addCriterion("month_income in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotIn(List<String> values) {
            addCriterion("month_income not in", values, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeBetween(String value1, String value2) {
            addCriterion("month_income between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andMonthIncomeNotBetween(String value1, String value2) {
            addCriterion("month_income not between", value1, value2, "monthIncome");
            return (Criteria) this;
        }

        public Criteria andFamilySumIsNull() {
            addCriterion("family_sum is null");
            return (Criteria) this;
        }

        public Criteria andFamilySumIsNotNull() {
            addCriterion("family_sum is not null");
            return (Criteria) this;
        }

        public Criteria andFamilySumEqualTo(String value) {
            addCriterion("family_sum =", value, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumNotEqualTo(String value) {
            addCriterion("family_sum <>", value, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumGreaterThan(String value) {
            addCriterion("family_sum >", value, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumGreaterThanOrEqualTo(String value) {
            addCriterion("family_sum >=", value, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumLessThan(String value) {
            addCriterion("family_sum <", value, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumLessThanOrEqualTo(String value) {
            addCriterion("family_sum <=", value, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumLike(String value) {
            addCriterion("family_sum like", value, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumNotLike(String value) {
            addCriterion("family_sum not like", value, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumIn(List<String> values) {
            addCriterion("family_sum in", values, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumNotIn(List<String> values) {
            addCriterion("family_sum not in", values, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumBetween(String value1, String value2) {
            addCriterion("family_sum between", value1, value2, "familySum");
            return (Criteria) this;
        }

        public Criteria andFamilySumNotBetween(String value1, String value2) {
            addCriterion("family_sum not between", value1, value2, "familySum");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNull() {
            addCriterion("postal_code is null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIsNotNull() {
            addCriterion("postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostalCodeEqualTo(String value) {
            addCriterion("postal_code =", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotEqualTo(String value) {
            addCriterion("postal_code <>", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThan(String value) {
            addCriterion("postal_code >", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("postal_code >=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThan(String value) {
            addCriterion("postal_code <", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("postal_code <=", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeLike(String value) {
            addCriterion("postal_code like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotLike(String value) {
            addCriterion("postal_code not like", value, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeIn(List<String> values) {
            addCriterion("postal_code in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotIn(List<String> values) {
            addCriterion("postal_code not in", values, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeBetween(String value1, String value2) {
            addCriterion("postal_code between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andPostalCodeNotBetween(String value1, String value2) {
            addCriterion("postal_code not between", value1, value2, "postalCode");
            return (Criteria) this;
        }

        public Criteria andSituationIsNull() {
            addCriterion("situation is null");
            return (Criteria) this;
        }

        public Criteria andSituationIsNotNull() {
            addCriterion("situation is not null");
            return (Criteria) this;
        }

        public Criteria andSituationEqualTo(String value) {
            addCriterion("situation =", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotEqualTo(String value) {
            addCriterion("situation <>", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThan(String value) {
            addCriterion("situation >", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationGreaterThanOrEqualTo(String value) {
            addCriterion("situation >=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThan(String value) {
            addCriterion("situation <", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLessThanOrEqualTo(String value) {
            addCriterion("situation <=", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationLike(String value) {
            addCriterion("situation like", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotLike(String value) {
            addCriterion("situation not like", value, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationIn(List<String> values) {
            addCriterion("situation in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotIn(List<String> values) {
            addCriterion("situation not in", values, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationBetween(String value1, String value2) {
            addCriterion("situation between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andSituationNotBetween(String value1, String value2) {
            addCriterion("situation not between", value1, value2, "situation");
            return (Criteria) this;
        }

        public Criteria andFName1IsNull() {
            addCriterion("f_name1 is null");
            return (Criteria) this;
        }

        public Criteria andFName1IsNotNull() {
            addCriterion("f_name1 is not null");
            return (Criteria) this;
        }

        public Criteria andFName1EqualTo(String value) {
            addCriterion("f_name1 =", value, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1NotEqualTo(String value) {
            addCriterion("f_name1 <>", value, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1GreaterThan(String value) {
            addCriterion("f_name1 >", value, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1GreaterThanOrEqualTo(String value) {
            addCriterion("f_name1 >=", value, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1LessThan(String value) {
            addCriterion("f_name1 <", value, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1LessThanOrEqualTo(String value) {
            addCriterion("f_name1 <=", value, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1Like(String value) {
            addCriterion("f_name1 like", value, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1NotLike(String value) {
            addCriterion("f_name1 not like", value, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1In(List<String> values) {
            addCriterion("f_name1 in", values, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1NotIn(List<String> values) {
            addCriterion("f_name1 not in", values, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1Between(String value1, String value2) {
            addCriterion("f_name1 between", value1, value2, "fName1");
            return (Criteria) this;
        }

        public Criteria andFName1NotBetween(String value1, String value2) {
            addCriterion("f_name1 not between", value1, value2, "fName1");
            return (Criteria) this;
        }

        public Criteria andAge1IsNull() {
            addCriterion("age1 is null");
            return (Criteria) this;
        }

        public Criteria andAge1IsNotNull() {
            addCriterion("age1 is not null");
            return (Criteria) this;
        }

        public Criteria andAge1EqualTo(String value) {
            addCriterion("age1 =", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1NotEqualTo(String value) {
            addCriterion("age1 <>", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1GreaterThan(String value) {
            addCriterion("age1 >", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1GreaterThanOrEqualTo(String value) {
            addCriterion("age1 >=", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1LessThan(String value) {
            addCriterion("age1 <", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1LessThanOrEqualTo(String value) {
            addCriterion("age1 <=", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1Like(String value) {
            addCriterion("age1 like", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1NotLike(String value) {
            addCriterion("age1 not like", value, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1In(List<String> values) {
            addCriterion("age1 in", values, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1NotIn(List<String> values) {
            addCriterion("age1 not in", values, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1Between(String value1, String value2) {
            addCriterion("age1 between", value1, value2, "age1");
            return (Criteria) this;
        }

        public Criteria andAge1NotBetween(String value1, String value2) {
            addCriterion("age1 not between", value1, value2, "age1");
            return (Criteria) this;
        }

        public Criteria andRelation1IsNull() {
            addCriterion("relation1 is null");
            return (Criteria) this;
        }

        public Criteria andRelation1IsNotNull() {
            addCriterion("relation1 is not null");
            return (Criteria) this;
        }

        public Criteria andRelation1EqualTo(String value) {
            addCriterion("relation1 =", value, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1NotEqualTo(String value) {
            addCriterion("relation1 <>", value, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1GreaterThan(String value) {
            addCriterion("relation1 >", value, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1GreaterThanOrEqualTo(String value) {
            addCriterion("relation1 >=", value, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1LessThan(String value) {
            addCriterion("relation1 <", value, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1LessThanOrEqualTo(String value) {
            addCriterion("relation1 <=", value, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1Like(String value) {
            addCriterion("relation1 like", value, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1NotLike(String value) {
            addCriterion("relation1 not like", value, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1In(List<String> values) {
            addCriterion("relation1 in", values, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1NotIn(List<String> values) {
            addCriterion("relation1 not in", values, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1Between(String value1, String value2) {
            addCriterion("relation1 between", value1, value2, "relation1");
            return (Criteria) this;
        }

        public Criteria andRelation1NotBetween(String value1, String value2) {
            addCriterion("relation1 not between", value1, value2, "relation1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1IsNull() {
            addCriterion("work_place1 is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1IsNotNull() {
            addCriterion("work_place1 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1EqualTo(String value) {
            addCriterion("work_place1 =", value, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1NotEqualTo(String value) {
            addCriterion("work_place1 <>", value, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1GreaterThan(String value) {
            addCriterion("work_place1 >", value, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1GreaterThanOrEqualTo(String value) {
            addCriterion("work_place1 >=", value, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1LessThan(String value) {
            addCriterion("work_place1 <", value, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1LessThanOrEqualTo(String value) {
            addCriterion("work_place1 <=", value, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1Like(String value) {
            addCriterion("work_place1 like", value, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1NotLike(String value) {
            addCriterion("work_place1 not like", value, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1In(List<String> values) {
            addCriterion("work_place1 in", values, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1NotIn(List<String> values) {
            addCriterion("work_place1 not in", values, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1Between(String value1, String value2) {
            addCriterion("work_place1 between", value1, value2, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andWorkPlace1NotBetween(String value1, String value2) {
            addCriterion("work_place1 not between", value1, value2, "workPlace1");
            return (Criteria) this;
        }

        public Criteria andFName2IsNull() {
            addCriterion("f_name2 is null");
            return (Criteria) this;
        }

        public Criteria andFName2IsNotNull() {
            addCriterion("f_name2 is not null");
            return (Criteria) this;
        }

        public Criteria andFName2EqualTo(String value) {
            addCriterion("f_name2 =", value, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2NotEqualTo(String value) {
            addCriterion("f_name2 <>", value, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2GreaterThan(String value) {
            addCriterion("f_name2 >", value, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2GreaterThanOrEqualTo(String value) {
            addCriterion("f_name2 >=", value, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2LessThan(String value) {
            addCriterion("f_name2 <", value, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2LessThanOrEqualTo(String value) {
            addCriterion("f_name2 <=", value, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2Like(String value) {
            addCriterion("f_name2 like", value, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2NotLike(String value) {
            addCriterion("f_name2 not like", value, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2In(List<String> values) {
            addCriterion("f_name2 in", values, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2NotIn(List<String> values) {
            addCriterion("f_name2 not in", values, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2Between(String value1, String value2) {
            addCriterion("f_name2 between", value1, value2, "fName2");
            return (Criteria) this;
        }

        public Criteria andFName2NotBetween(String value1, String value2) {
            addCriterion("f_name2 not between", value1, value2, "fName2");
            return (Criteria) this;
        }

        public Criteria andAge2IsNull() {
            addCriterion("age2 is null");
            return (Criteria) this;
        }

        public Criteria andAge2IsNotNull() {
            addCriterion("age2 is not null");
            return (Criteria) this;
        }

        public Criteria andAge2EqualTo(String value) {
            addCriterion("age2 =", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2NotEqualTo(String value) {
            addCriterion("age2 <>", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2GreaterThan(String value) {
            addCriterion("age2 >", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2GreaterThanOrEqualTo(String value) {
            addCriterion("age2 >=", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2LessThan(String value) {
            addCriterion("age2 <", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2LessThanOrEqualTo(String value) {
            addCriterion("age2 <=", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2Like(String value) {
            addCriterion("age2 like", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2NotLike(String value) {
            addCriterion("age2 not like", value, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2In(List<String> values) {
            addCriterion("age2 in", values, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2NotIn(List<String> values) {
            addCriterion("age2 not in", values, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2Between(String value1, String value2) {
            addCriterion("age2 between", value1, value2, "age2");
            return (Criteria) this;
        }

        public Criteria andAge2NotBetween(String value1, String value2) {
            addCriterion("age2 not between", value1, value2, "age2");
            return (Criteria) this;
        }

        public Criteria andRelation2IsNull() {
            addCriterion("relation2 is null");
            return (Criteria) this;
        }

        public Criteria andRelation2IsNotNull() {
            addCriterion("relation2 is not null");
            return (Criteria) this;
        }

        public Criteria andRelation2EqualTo(String value) {
            addCriterion("relation2 =", value, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2NotEqualTo(String value) {
            addCriterion("relation2 <>", value, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2GreaterThan(String value) {
            addCriterion("relation2 >", value, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2GreaterThanOrEqualTo(String value) {
            addCriterion("relation2 >=", value, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2LessThan(String value) {
            addCriterion("relation2 <", value, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2LessThanOrEqualTo(String value) {
            addCriterion("relation2 <=", value, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2Like(String value) {
            addCriterion("relation2 like", value, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2NotLike(String value) {
            addCriterion("relation2 not like", value, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2In(List<String> values) {
            addCriterion("relation2 in", values, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2NotIn(List<String> values) {
            addCriterion("relation2 not in", values, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2Between(String value1, String value2) {
            addCriterion("relation2 between", value1, value2, "relation2");
            return (Criteria) this;
        }

        public Criteria andRelation2NotBetween(String value1, String value2) {
            addCriterion("relation2 not between", value1, value2, "relation2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2IsNull() {
            addCriterion("work_place2 is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2IsNotNull() {
            addCriterion("work_place2 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2EqualTo(String value) {
            addCriterion("work_place2 =", value, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2NotEqualTo(String value) {
            addCriterion("work_place2 <>", value, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2GreaterThan(String value) {
            addCriterion("work_place2 >", value, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2GreaterThanOrEqualTo(String value) {
            addCriterion("work_place2 >=", value, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2LessThan(String value) {
            addCriterion("work_place2 <", value, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2LessThanOrEqualTo(String value) {
            addCriterion("work_place2 <=", value, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2Like(String value) {
            addCriterion("work_place2 like", value, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2NotLike(String value) {
            addCriterion("work_place2 not like", value, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2In(List<String> values) {
            addCriterion("work_place2 in", values, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2NotIn(List<String> values) {
            addCriterion("work_place2 not in", values, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2Between(String value1, String value2) {
            addCriterion("work_place2 between", value1, value2, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andWorkPlace2NotBetween(String value1, String value2) {
            addCriterion("work_place2 not between", value1, value2, "workPlace2");
            return (Criteria) this;
        }

        public Criteria andFName3IsNull() {
            addCriterion("f_name3 is null");
            return (Criteria) this;
        }

        public Criteria andFName3IsNotNull() {
            addCriterion("f_name3 is not null");
            return (Criteria) this;
        }

        public Criteria andFName3EqualTo(String value) {
            addCriterion("f_name3 =", value, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3NotEqualTo(String value) {
            addCriterion("f_name3 <>", value, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3GreaterThan(String value) {
            addCriterion("f_name3 >", value, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3GreaterThanOrEqualTo(String value) {
            addCriterion("f_name3 >=", value, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3LessThan(String value) {
            addCriterion("f_name3 <", value, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3LessThanOrEqualTo(String value) {
            addCriterion("f_name3 <=", value, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3Like(String value) {
            addCriterion("f_name3 like", value, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3NotLike(String value) {
            addCriterion("f_name3 not like", value, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3In(List<String> values) {
            addCriterion("f_name3 in", values, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3NotIn(List<String> values) {
            addCriterion("f_name3 not in", values, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3Between(String value1, String value2) {
            addCriterion("f_name3 between", value1, value2, "fName3");
            return (Criteria) this;
        }

        public Criteria andFName3NotBetween(String value1, String value2) {
            addCriterion("f_name3 not between", value1, value2, "fName3");
            return (Criteria) this;
        }

        public Criteria andAge3IsNull() {
            addCriterion("age3 is null");
            return (Criteria) this;
        }

        public Criteria andAge3IsNotNull() {
            addCriterion("age3 is not null");
            return (Criteria) this;
        }

        public Criteria andAge3EqualTo(String value) {
            addCriterion("age3 =", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3NotEqualTo(String value) {
            addCriterion("age3 <>", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3GreaterThan(String value) {
            addCriterion("age3 >", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3GreaterThanOrEqualTo(String value) {
            addCriterion("age3 >=", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3LessThan(String value) {
            addCriterion("age3 <", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3LessThanOrEqualTo(String value) {
            addCriterion("age3 <=", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3Like(String value) {
            addCriterion("age3 like", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3NotLike(String value) {
            addCriterion("age3 not like", value, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3In(List<String> values) {
            addCriterion("age3 in", values, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3NotIn(List<String> values) {
            addCriterion("age3 not in", values, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3Between(String value1, String value2) {
            addCriterion("age3 between", value1, value2, "age3");
            return (Criteria) this;
        }

        public Criteria andAge3NotBetween(String value1, String value2) {
            addCriterion("age3 not between", value1, value2, "age3");
            return (Criteria) this;
        }

        public Criteria andRelation3IsNull() {
            addCriterion("relation3 is null");
            return (Criteria) this;
        }

        public Criteria andRelation3IsNotNull() {
            addCriterion("relation3 is not null");
            return (Criteria) this;
        }

        public Criteria andRelation3EqualTo(String value) {
            addCriterion("relation3 =", value, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3NotEqualTo(String value) {
            addCriterion("relation3 <>", value, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3GreaterThan(String value) {
            addCriterion("relation3 >", value, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3GreaterThanOrEqualTo(String value) {
            addCriterion("relation3 >=", value, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3LessThan(String value) {
            addCriterion("relation3 <", value, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3LessThanOrEqualTo(String value) {
            addCriterion("relation3 <=", value, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3Like(String value) {
            addCriterion("relation3 like", value, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3NotLike(String value) {
            addCriterion("relation3 not like", value, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3In(List<String> values) {
            addCriterion("relation3 in", values, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3NotIn(List<String> values) {
            addCriterion("relation3 not in", values, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3Between(String value1, String value2) {
            addCriterion("relation3 between", value1, value2, "relation3");
            return (Criteria) this;
        }

        public Criteria andRelation3NotBetween(String value1, String value2) {
            addCriterion("relation3 not between", value1, value2, "relation3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3IsNull() {
            addCriterion("work_place3 is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3IsNotNull() {
            addCriterion("work_place3 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3EqualTo(String value) {
            addCriterion("work_place3 =", value, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3NotEqualTo(String value) {
            addCriterion("work_place3 <>", value, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3GreaterThan(String value) {
            addCriterion("work_place3 >", value, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3GreaterThanOrEqualTo(String value) {
            addCriterion("work_place3 >=", value, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3LessThan(String value) {
            addCriterion("work_place3 <", value, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3LessThanOrEqualTo(String value) {
            addCriterion("work_place3 <=", value, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3Like(String value) {
            addCriterion("work_place3 like", value, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3NotLike(String value) {
            addCriterion("work_place3 not like", value, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3In(List<String> values) {
            addCriterion("work_place3 in", values, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3NotIn(List<String> values) {
            addCriterion("work_place3 not in", values, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3Between(String value1, String value2) {
            addCriterion("work_place3 between", value1, value2, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andWorkPlace3NotBetween(String value1, String value2) {
            addCriterion("work_place3 not between", value1, value2, "workPlace3");
            return (Criteria) this;
        }

        public Criteria andFName4IsNull() {
            addCriterion("f_name4 is null");
            return (Criteria) this;
        }

        public Criteria andFName4IsNotNull() {
            addCriterion("f_name4 is not null");
            return (Criteria) this;
        }

        public Criteria andFName4EqualTo(String value) {
            addCriterion("f_name4 =", value, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4NotEqualTo(String value) {
            addCriterion("f_name4 <>", value, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4GreaterThan(String value) {
            addCriterion("f_name4 >", value, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4GreaterThanOrEqualTo(String value) {
            addCriterion("f_name4 >=", value, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4LessThan(String value) {
            addCriterion("f_name4 <", value, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4LessThanOrEqualTo(String value) {
            addCriterion("f_name4 <=", value, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4Like(String value) {
            addCriterion("f_name4 like", value, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4NotLike(String value) {
            addCriterion("f_name4 not like", value, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4In(List<String> values) {
            addCriterion("f_name4 in", values, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4NotIn(List<String> values) {
            addCriterion("f_name4 not in", values, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4Between(String value1, String value2) {
            addCriterion("f_name4 between", value1, value2, "fName4");
            return (Criteria) this;
        }

        public Criteria andFName4NotBetween(String value1, String value2) {
            addCriterion("f_name4 not between", value1, value2, "fName4");
            return (Criteria) this;
        }

        public Criteria andAge4IsNull() {
            addCriterion("age4 is null");
            return (Criteria) this;
        }

        public Criteria andAge4IsNotNull() {
            addCriterion("age4 is not null");
            return (Criteria) this;
        }

        public Criteria andAge4EqualTo(String value) {
            addCriterion("age4 =", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4NotEqualTo(String value) {
            addCriterion("age4 <>", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4GreaterThan(String value) {
            addCriterion("age4 >", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4GreaterThanOrEqualTo(String value) {
            addCriterion("age4 >=", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4LessThan(String value) {
            addCriterion("age4 <", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4LessThanOrEqualTo(String value) {
            addCriterion("age4 <=", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4Like(String value) {
            addCriterion("age4 like", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4NotLike(String value) {
            addCriterion("age4 not like", value, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4In(List<String> values) {
            addCriterion("age4 in", values, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4NotIn(List<String> values) {
            addCriterion("age4 not in", values, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4Between(String value1, String value2) {
            addCriterion("age4 between", value1, value2, "age4");
            return (Criteria) this;
        }

        public Criteria andAge4NotBetween(String value1, String value2) {
            addCriterion("age4 not between", value1, value2, "age4");
            return (Criteria) this;
        }

        public Criteria andRelation4IsNull() {
            addCriterion("relation4 is null");
            return (Criteria) this;
        }

        public Criteria andRelation4IsNotNull() {
            addCriterion("relation4 is not null");
            return (Criteria) this;
        }

        public Criteria andRelation4EqualTo(String value) {
            addCriterion("relation4 =", value, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4NotEqualTo(String value) {
            addCriterion("relation4 <>", value, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4GreaterThan(String value) {
            addCriterion("relation4 >", value, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4GreaterThanOrEqualTo(String value) {
            addCriterion("relation4 >=", value, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4LessThan(String value) {
            addCriterion("relation4 <", value, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4LessThanOrEqualTo(String value) {
            addCriterion("relation4 <=", value, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4Like(String value) {
            addCriterion("relation4 like", value, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4NotLike(String value) {
            addCriterion("relation4 not like", value, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4In(List<String> values) {
            addCriterion("relation4 in", values, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4NotIn(List<String> values) {
            addCriterion("relation4 not in", values, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4Between(String value1, String value2) {
            addCriterion("relation4 between", value1, value2, "relation4");
            return (Criteria) this;
        }

        public Criteria andRelation4NotBetween(String value1, String value2) {
            addCriterion("relation4 not between", value1, value2, "relation4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4IsNull() {
            addCriterion("work_place4 is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4IsNotNull() {
            addCriterion("work_place4 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4EqualTo(String value) {
            addCriterion("work_place4 =", value, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4NotEqualTo(String value) {
            addCriterion("work_place4 <>", value, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4GreaterThan(String value) {
            addCriterion("work_place4 >", value, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4GreaterThanOrEqualTo(String value) {
            addCriterion("work_place4 >=", value, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4LessThan(String value) {
            addCriterion("work_place4 <", value, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4LessThanOrEqualTo(String value) {
            addCriterion("work_place4 <=", value, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4Like(String value) {
            addCriterion("work_place4 like", value, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4NotLike(String value) {
            addCriterion("work_place4 not like", value, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4In(List<String> values) {
            addCriterion("work_place4 in", values, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4NotIn(List<String> values) {
            addCriterion("work_place4 not in", values, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4Between(String value1, String value2) {
            addCriterion("work_place4 between", value1, value2, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andWorkPlace4NotBetween(String value1, String value2) {
            addCriterion("work_place4 not between", value1, value2, "workPlace4");
            return (Criteria) this;
        }

        public Criteria andFName5IsNull() {
            addCriterion("f_name5 is null");
            return (Criteria) this;
        }

        public Criteria andFName5IsNotNull() {
            addCriterion("f_name5 is not null");
            return (Criteria) this;
        }

        public Criteria andFName5EqualTo(String value) {
            addCriterion("f_name5 =", value, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5NotEqualTo(String value) {
            addCriterion("f_name5 <>", value, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5GreaterThan(String value) {
            addCriterion("f_name5 >", value, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5GreaterThanOrEqualTo(String value) {
            addCriterion("f_name5 >=", value, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5LessThan(String value) {
            addCriterion("f_name5 <", value, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5LessThanOrEqualTo(String value) {
            addCriterion("f_name5 <=", value, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5Like(String value) {
            addCriterion("f_name5 like", value, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5NotLike(String value) {
            addCriterion("f_name5 not like", value, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5In(List<String> values) {
            addCriterion("f_name5 in", values, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5NotIn(List<String> values) {
            addCriterion("f_name5 not in", values, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5Between(String value1, String value2) {
            addCriterion("f_name5 between", value1, value2, "fName5");
            return (Criteria) this;
        }

        public Criteria andFName5NotBetween(String value1, String value2) {
            addCriterion("f_name5 not between", value1, value2, "fName5");
            return (Criteria) this;
        }

        public Criteria andAge5IsNull() {
            addCriterion("age5 is null");
            return (Criteria) this;
        }

        public Criteria andAge5IsNotNull() {
            addCriterion("age5 is not null");
            return (Criteria) this;
        }

        public Criteria andAge5EqualTo(String value) {
            addCriterion("age5 =", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5NotEqualTo(String value) {
            addCriterion("age5 <>", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5GreaterThan(String value) {
            addCriterion("age5 >", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5GreaterThanOrEqualTo(String value) {
            addCriterion("age5 >=", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5LessThan(String value) {
            addCriterion("age5 <", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5LessThanOrEqualTo(String value) {
            addCriterion("age5 <=", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5Like(String value) {
            addCriterion("age5 like", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5NotLike(String value) {
            addCriterion("age5 not like", value, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5In(List<String> values) {
            addCriterion("age5 in", values, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5NotIn(List<String> values) {
            addCriterion("age5 not in", values, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5Between(String value1, String value2) {
            addCriterion("age5 between", value1, value2, "age5");
            return (Criteria) this;
        }

        public Criteria andAge5NotBetween(String value1, String value2) {
            addCriterion("age5 not between", value1, value2, "age5");
            return (Criteria) this;
        }

        public Criteria andRelation5IsNull() {
            addCriterion("relation5 is null");
            return (Criteria) this;
        }

        public Criteria andRelation5IsNotNull() {
            addCriterion("relation5 is not null");
            return (Criteria) this;
        }

        public Criteria andRelation5EqualTo(String value) {
            addCriterion("relation5 =", value, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5NotEqualTo(String value) {
            addCriterion("relation5 <>", value, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5GreaterThan(String value) {
            addCriterion("relation5 >", value, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5GreaterThanOrEqualTo(String value) {
            addCriterion("relation5 >=", value, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5LessThan(String value) {
            addCriterion("relation5 <", value, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5LessThanOrEqualTo(String value) {
            addCriterion("relation5 <=", value, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5Like(String value) {
            addCriterion("relation5 like", value, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5NotLike(String value) {
            addCriterion("relation5 not like", value, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5In(List<String> values) {
            addCriterion("relation5 in", values, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5NotIn(List<String> values) {
            addCriterion("relation5 not in", values, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5Between(String value1, String value2) {
            addCriterion("relation5 between", value1, value2, "relation5");
            return (Criteria) this;
        }

        public Criteria andRelation5NotBetween(String value1, String value2) {
            addCriterion("relation5 not between", value1, value2, "relation5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5IsNull() {
            addCriterion("work_place5 is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5IsNotNull() {
            addCriterion("work_place5 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5EqualTo(String value) {
            addCriterion("work_place5 =", value, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5NotEqualTo(String value) {
            addCriterion("work_place5 <>", value, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5GreaterThan(String value) {
            addCriterion("work_place5 >", value, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5GreaterThanOrEqualTo(String value) {
            addCriterion("work_place5 >=", value, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5LessThan(String value) {
            addCriterion("work_place5 <", value, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5LessThanOrEqualTo(String value) {
            addCriterion("work_place5 <=", value, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5Like(String value) {
            addCriterion("work_place5 like", value, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5NotLike(String value) {
            addCriterion("work_place5 not like", value, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5In(List<String> values) {
            addCriterion("work_place5 in", values, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5NotIn(List<String> values) {
            addCriterion("work_place5 not in", values, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5Between(String value1, String value2) {
            addCriterion("work_place5 between", value1, value2, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andWorkPlace5NotBetween(String value1, String value2) {
            addCriterion("work_place5 not between", value1, value2, "workPlace5");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNull() {
            addCriterion("apply_reason is null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNotNull() {
            addCriterion("apply_reason is not null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonEqualTo(String value) {
            addCriterion("apply_reason =", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotEqualTo(String value) {
            addCriterion("apply_reason <>", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThan(String value) {
            addCriterion("apply_reason >", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("apply_reason >=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThan(String value) {
            addCriterion("apply_reason <", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThanOrEqualTo(String value) {
            addCriterion("apply_reason <=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLike(String value) {
            addCriterion("apply_reason like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotLike(String value) {
            addCriterion("apply_reason not like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIn(List<String> values) {
            addCriterion("apply_reason in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotIn(List<String> values) {
            addCriterion("apply_reason not in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonBetween(String value1, String value2) {
            addCriterion("apply_reason between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotBetween(String value1, String value2) {
            addCriterion("apply_reason not between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNull() {
            addCriterion("opinion is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIsNotNull() {
            addCriterion("opinion is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionEqualTo(String value) {
            addCriterion("opinion =", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotEqualTo(String value) {
            addCriterion("opinion <>", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThan(String value) {
            addCriterion("opinion >", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("opinion >=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThan(String value) {
            addCriterion("opinion <", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLessThanOrEqualTo(String value) {
            addCriterion("opinion <=", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionLike(String value) {
            addCriterion("opinion like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotLike(String value) {
            addCriterion("opinion not like", value, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionIn(List<String> values) {
            addCriterion("opinion in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotIn(List<String> values) {
            addCriterion("opinion not in", values, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionBetween(String value1, String value2) {
            addCriterion("opinion between", value1, value2, "opinion");
            return (Criteria) this;
        }

        public Criteria andOpinionNotBetween(String value1, String value2) {
            addCriterion("opinion not between", value1, value2, "opinion");
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