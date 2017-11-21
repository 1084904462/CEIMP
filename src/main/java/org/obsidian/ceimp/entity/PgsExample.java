package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class PgsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PgsExample() {
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

        public Criteria andPgsIdIsNull() {
            addCriterion("pgs_id is null");
            return (Criteria) this;
        }

        public Criteria andPgsIdIsNotNull() {
            addCriterion("pgs_id is not null");
            return (Criteria) this;
        }

        public Criteria andPgsIdEqualTo(Long value) {
            addCriterion("pgs_id =", value, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdNotEqualTo(Long value) {
            addCriterion("pgs_id <>", value, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdGreaterThan(Long value) {
            addCriterion("pgs_id >", value, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pgs_id >=", value, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdLessThan(Long value) {
            addCriterion("pgs_id <", value, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdLessThanOrEqualTo(Long value) {
            addCriterion("pgs_id <=", value, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdIn(List<Long> values) {
            addCriterion("pgs_id in", values, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdNotIn(List<Long> values) {
            addCriterion("pgs_id not in", values, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdBetween(Long value1, Long value2) {
            addCriterion("pgs_id between", value1, value2, "pgsId");
            return (Criteria) this;
        }

        public Criteria andPgsIdNotBetween(Long value1, Long value2) {
            addCriterion("pgs_id not between", value1, value2, "pgsId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andYearScopeIsNull() {
            addCriterion("year_scope is null");
            return (Criteria) this;
        }

        public Criteria andYearScopeIsNotNull() {
            addCriterion("year_scope is not null");
            return (Criteria) this;
        }

        public Criteria andYearScopeEqualTo(Integer value) {
            addCriterion("year_scope =", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeNotEqualTo(Integer value) {
            addCriterion("year_scope <>", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeGreaterThan(Integer value) {
            addCriterion("year_scope >", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeGreaterThanOrEqualTo(Integer value) {
            addCriterion("year_scope >=", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeLessThan(Integer value) {
            addCriterion("year_scope <", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeLessThanOrEqualTo(Integer value) {
            addCriterion("year_scope <=", value, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeIn(List<Integer> values) {
            addCriterion("year_scope in", values, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeNotIn(List<Integer> values) {
            addCriterion("year_scope not in", values, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeBetween(Integer value1, Integer value2) {
            addCriterion("year_scope between", value1, value2, "yearScope");
            return (Criteria) this;
        }

        public Criteria andYearScopeNotBetween(Integer value1, Integer value2) {
            addCriterion("year_scope not between", value1, value2, "yearScope");
            return (Criteria) this;
        }

        public Criteria andDate1IsNull() {
            addCriterion("date1 is null");
            return (Criteria) this;
        }

        public Criteria andDate1IsNotNull() {
            addCriterion("date1 is not null");
            return (Criteria) this;
        }

        public Criteria andDate1EqualTo(String value) {
            addCriterion("date1 =", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotEqualTo(String value) {
            addCriterion("date1 <>", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThan(String value) {
            addCriterion("date1 >", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1GreaterThanOrEqualTo(String value) {
            addCriterion("date1 >=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThan(String value) {
            addCriterion("date1 <", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1LessThanOrEqualTo(String value) {
            addCriterion("date1 <=", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Like(String value) {
            addCriterion("date1 like", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotLike(String value) {
            addCriterion("date1 not like", value, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1In(List<String> values) {
            addCriterion("date1 in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotIn(List<String> values) {
            addCriterion("date1 not in", values, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1Between(String value1, String value2) {
            addCriterion("date1 between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andDate1NotBetween(String value1, String value2) {
            addCriterion("date1 not between", value1, value2, "date1");
            return (Criteria) this;
        }

        public Criteria andAward1IsNull() {
            addCriterion("award1 is null");
            return (Criteria) this;
        }

        public Criteria andAward1IsNotNull() {
            addCriterion("award1 is not null");
            return (Criteria) this;
        }

        public Criteria andAward1EqualTo(String value) {
            addCriterion("award1 =", value, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1NotEqualTo(String value) {
            addCriterion("award1 <>", value, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1GreaterThan(String value) {
            addCriterion("award1 >", value, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1GreaterThanOrEqualTo(String value) {
            addCriterion("award1 >=", value, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1LessThan(String value) {
            addCriterion("award1 <", value, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1LessThanOrEqualTo(String value) {
            addCriterion("award1 <=", value, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1Like(String value) {
            addCriterion("award1 like", value, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1NotLike(String value) {
            addCriterion("award1 not like", value, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1In(List<String> values) {
            addCriterion("award1 in", values, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1NotIn(List<String> values) {
            addCriterion("award1 not in", values, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1Between(String value1, String value2) {
            addCriterion("award1 between", value1, value2, "award1");
            return (Criteria) this;
        }

        public Criteria andAward1NotBetween(String value1, String value2) {
            addCriterion("award1 not between", value1, value2, "award1");
            return (Criteria) this;
        }

        public Criteria andUnit1IsNull() {
            addCriterion("unit1 is null");
            return (Criteria) this;
        }

        public Criteria andUnit1IsNotNull() {
            addCriterion("unit1 is not null");
            return (Criteria) this;
        }

        public Criteria andUnit1EqualTo(String value) {
            addCriterion("unit1 =", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1NotEqualTo(String value) {
            addCriterion("unit1 <>", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1GreaterThan(String value) {
            addCriterion("unit1 >", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1GreaterThanOrEqualTo(String value) {
            addCriterion("unit1 >=", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1LessThan(String value) {
            addCriterion("unit1 <", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1LessThanOrEqualTo(String value) {
            addCriterion("unit1 <=", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1Like(String value) {
            addCriterion("unit1 like", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1NotLike(String value) {
            addCriterion("unit1 not like", value, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1In(List<String> values) {
            addCriterion("unit1 in", values, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1NotIn(List<String> values) {
            addCriterion("unit1 not in", values, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1Between(String value1, String value2) {
            addCriterion("unit1 between", value1, value2, "unit1");
            return (Criteria) this;
        }

        public Criteria andUnit1NotBetween(String value1, String value2) {
            addCriterion("unit1 not between", value1, value2, "unit1");
            return (Criteria) this;
        }

        public Criteria andDate2IsNull() {
            addCriterion("date2 is null");
            return (Criteria) this;
        }

        public Criteria andDate2IsNotNull() {
            addCriterion("date2 is not null");
            return (Criteria) this;
        }

        public Criteria andDate2EqualTo(String value) {
            addCriterion("date2 =", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotEqualTo(String value) {
            addCriterion("date2 <>", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2GreaterThan(String value) {
            addCriterion("date2 >", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2GreaterThanOrEqualTo(String value) {
            addCriterion("date2 >=", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2LessThan(String value) {
            addCriterion("date2 <", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2LessThanOrEqualTo(String value) {
            addCriterion("date2 <=", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2Like(String value) {
            addCriterion("date2 like", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotLike(String value) {
            addCriterion("date2 not like", value, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2In(List<String> values) {
            addCriterion("date2 in", values, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotIn(List<String> values) {
            addCriterion("date2 not in", values, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2Between(String value1, String value2) {
            addCriterion("date2 between", value1, value2, "date2");
            return (Criteria) this;
        }

        public Criteria andDate2NotBetween(String value1, String value2) {
            addCriterion("date2 not between", value1, value2, "date2");
            return (Criteria) this;
        }

        public Criteria andAward2IsNull() {
            addCriterion("award2 is null");
            return (Criteria) this;
        }

        public Criteria andAward2IsNotNull() {
            addCriterion("award2 is not null");
            return (Criteria) this;
        }

        public Criteria andAward2EqualTo(String value) {
            addCriterion("award2 =", value, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2NotEqualTo(String value) {
            addCriterion("award2 <>", value, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2GreaterThan(String value) {
            addCriterion("award2 >", value, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2GreaterThanOrEqualTo(String value) {
            addCriterion("award2 >=", value, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2LessThan(String value) {
            addCriterion("award2 <", value, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2LessThanOrEqualTo(String value) {
            addCriterion("award2 <=", value, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2Like(String value) {
            addCriterion("award2 like", value, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2NotLike(String value) {
            addCriterion("award2 not like", value, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2In(List<String> values) {
            addCriterion("award2 in", values, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2NotIn(List<String> values) {
            addCriterion("award2 not in", values, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2Between(String value1, String value2) {
            addCriterion("award2 between", value1, value2, "award2");
            return (Criteria) this;
        }

        public Criteria andAward2NotBetween(String value1, String value2) {
            addCriterion("award2 not between", value1, value2, "award2");
            return (Criteria) this;
        }

        public Criteria andUnit2IsNull() {
            addCriterion("unit2 is null");
            return (Criteria) this;
        }

        public Criteria andUnit2IsNotNull() {
            addCriterion("unit2 is not null");
            return (Criteria) this;
        }

        public Criteria andUnit2EqualTo(String value) {
            addCriterion("unit2 =", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2NotEqualTo(String value) {
            addCriterion("unit2 <>", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2GreaterThan(String value) {
            addCriterion("unit2 >", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2GreaterThanOrEqualTo(String value) {
            addCriterion("unit2 >=", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2LessThan(String value) {
            addCriterion("unit2 <", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2LessThanOrEqualTo(String value) {
            addCriterion("unit2 <=", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2Like(String value) {
            addCriterion("unit2 like", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2NotLike(String value) {
            addCriterion("unit2 not like", value, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2In(List<String> values) {
            addCriterion("unit2 in", values, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2NotIn(List<String> values) {
            addCriterion("unit2 not in", values, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2Between(String value1, String value2) {
            addCriterion("unit2 between", value1, value2, "unit2");
            return (Criteria) this;
        }

        public Criteria andUnit2NotBetween(String value1, String value2) {
            addCriterion("unit2 not between", value1, value2, "unit2");
            return (Criteria) this;
        }

        public Criteria andDate3IsNull() {
            addCriterion("date3 is null");
            return (Criteria) this;
        }

        public Criteria andDate3IsNotNull() {
            addCriterion("date3 is not null");
            return (Criteria) this;
        }

        public Criteria andDate3EqualTo(String value) {
            addCriterion("date3 =", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3NotEqualTo(String value) {
            addCriterion("date3 <>", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3GreaterThan(String value) {
            addCriterion("date3 >", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3GreaterThanOrEqualTo(String value) {
            addCriterion("date3 >=", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3LessThan(String value) {
            addCriterion("date3 <", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3LessThanOrEqualTo(String value) {
            addCriterion("date3 <=", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3Like(String value) {
            addCriterion("date3 like", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3NotLike(String value) {
            addCriterion("date3 not like", value, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3In(List<String> values) {
            addCriterion("date3 in", values, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3NotIn(List<String> values) {
            addCriterion("date3 not in", values, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3Between(String value1, String value2) {
            addCriterion("date3 between", value1, value2, "date3");
            return (Criteria) this;
        }

        public Criteria andDate3NotBetween(String value1, String value2) {
            addCriterion("date3 not between", value1, value2, "date3");
            return (Criteria) this;
        }

        public Criteria andAward3IsNull() {
            addCriterion("award3 is null");
            return (Criteria) this;
        }

        public Criteria andAward3IsNotNull() {
            addCriterion("award3 is not null");
            return (Criteria) this;
        }

        public Criteria andAward3EqualTo(String value) {
            addCriterion("award3 =", value, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3NotEqualTo(String value) {
            addCriterion("award3 <>", value, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3GreaterThan(String value) {
            addCriterion("award3 >", value, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3GreaterThanOrEqualTo(String value) {
            addCriterion("award3 >=", value, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3LessThan(String value) {
            addCriterion("award3 <", value, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3LessThanOrEqualTo(String value) {
            addCriterion("award3 <=", value, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3Like(String value) {
            addCriterion("award3 like", value, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3NotLike(String value) {
            addCriterion("award3 not like", value, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3In(List<String> values) {
            addCriterion("award3 in", values, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3NotIn(List<String> values) {
            addCriterion("award3 not in", values, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3Between(String value1, String value2) {
            addCriterion("award3 between", value1, value2, "award3");
            return (Criteria) this;
        }

        public Criteria andAward3NotBetween(String value1, String value2) {
            addCriterion("award3 not between", value1, value2, "award3");
            return (Criteria) this;
        }

        public Criteria andUnit3IsNull() {
            addCriterion("unit3 is null");
            return (Criteria) this;
        }

        public Criteria andUnit3IsNotNull() {
            addCriterion("unit3 is not null");
            return (Criteria) this;
        }

        public Criteria andUnit3EqualTo(String value) {
            addCriterion("unit3 =", value, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3NotEqualTo(String value) {
            addCriterion("unit3 <>", value, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3GreaterThan(String value) {
            addCriterion("unit3 >", value, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3GreaterThanOrEqualTo(String value) {
            addCriterion("unit3 >=", value, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3LessThan(String value) {
            addCriterion("unit3 <", value, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3LessThanOrEqualTo(String value) {
            addCriterion("unit3 <=", value, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3Like(String value) {
            addCriterion("unit3 like", value, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3NotLike(String value) {
            addCriterion("unit3 not like", value, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3In(List<String> values) {
            addCriterion("unit3 in", values, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3NotIn(List<String> values) {
            addCriterion("unit3 not in", values, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3Between(String value1, String value2) {
            addCriterion("unit3 between", value1, value2, "unit3");
            return (Criteria) this;
        }

        public Criteria andUnit3NotBetween(String value1, String value2) {
            addCriterion("unit3 not between", value1, value2, "unit3");
            return (Criteria) this;
        }

        public Criteria andDate4IsNull() {
            addCriterion("date4 is null");
            return (Criteria) this;
        }

        public Criteria andDate4IsNotNull() {
            addCriterion("date4 is not null");
            return (Criteria) this;
        }

        public Criteria andDate4EqualTo(String value) {
            addCriterion("date4 =", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4NotEqualTo(String value) {
            addCriterion("date4 <>", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4GreaterThan(String value) {
            addCriterion("date4 >", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4GreaterThanOrEqualTo(String value) {
            addCriterion("date4 >=", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4LessThan(String value) {
            addCriterion("date4 <", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4LessThanOrEqualTo(String value) {
            addCriterion("date4 <=", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4Like(String value) {
            addCriterion("date4 like", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4NotLike(String value) {
            addCriterion("date4 not like", value, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4In(List<String> values) {
            addCriterion("date4 in", values, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4NotIn(List<String> values) {
            addCriterion("date4 not in", values, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4Between(String value1, String value2) {
            addCriterion("date4 between", value1, value2, "date4");
            return (Criteria) this;
        }

        public Criteria andDate4NotBetween(String value1, String value2) {
            addCriterion("date4 not between", value1, value2, "date4");
            return (Criteria) this;
        }

        public Criteria andAward4IsNull() {
            addCriterion("award4 is null");
            return (Criteria) this;
        }

        public Criteria andAward4IsNotNull() {
            addCriterion("award4 is not null");
            return (Criteria) this;
        }

        public Criteria andAward4EqualTo(String value) {
            addCriterion("award4 =", value, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4NotEqualTo(String value) {
            addCriterion("award4 <>", value, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4GreaterThan(String value) {
            addCriterion("award4 >", value, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4GreaterThanOrEqualTo(String value) {
            addCriterion("award4 >=", value, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4LessThan(String value) {
            addCriterion("award4 <", value, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4LessThanOrEqualTo(String value) {
            addCriterion("award4 <=", value, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4Like(String value) {
            addCriterion("award4 like", value, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4NotLike(String value) {
            addCriterion("award4 not like", value, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4In(List<String> values) {
            addCriterion("award4 in", values, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4NotIn(List<String> values) {
            addCriterion("award4 not in", values, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4Between(String value1, String value2) {
            addCriterion("award4 between", value1, value2, "award4");
            return (Criteria) this;
        }

        public Criteria andAward4NotBetween(String value1, String value2) {
            addCriterion("award4 not between", value1, value2, "award4");
            return (Criteria) this;
        }

        public Criteria andUnit4IsNull() {
            addCriterion("unit4 is null");
            return (Criteria) this;
        }

        public Criteria andUnit4IsNotNull() {
            addCriterion("unit4 is not null");
            return (Criteria) this;
        }

        public Criteria andUnit4EqualTo(String value) {
            addCriterion("unit4 =", value, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4NotEqualTo(String value) {
            addCriterion("unit4 <>", value, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4GreaterThan(String value) {
            addCriterion("unit4 >", value, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4GreaterThanOrEqualTo(String value) {
            addCriterion("unit4 >=", value, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4LessThan(String value) {
            addCriterion("unit4 <", value, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4LessThanOrEqualTo(String value) {
            addCriterion("unit4 <=", value, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4Like(String value) {
            addCriterion("unit4 like", value, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4NotLike(String value) {
            addCriterion("unit4 not like", value, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4In(List<String> values) {
            addCriterion("unit4 in", values, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4NotIn(List<String> values) {
            addCriterion("unit4 not in", values, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4Between(String value1, String value2) {
            addCriterion("unit4 between", value1, value2, "unit4");
            return (Criteria) this;
        }

        public Criteria andUnit4NotBetween(String value1, String value2) {
            addCriterion("unit4 not between", value1, value2, "unit4");
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