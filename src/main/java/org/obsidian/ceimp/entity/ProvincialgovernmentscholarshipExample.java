package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class ProvincialgovernmentscholarshipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProvincialgovernmentscholarshipExample() {
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

        public Criteria andApplyreasonIsNull() {
            addCriterion("applyReason is null");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIsNotNull() {
            addCriterion("applyReason is not null");
            return (Criteria) this;
        }

        public Criteria andApplyreasonEqualTo(String value) {
            addCriterion("applyReason =", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotEqualTo(String value) {
            addCriterion("applyReason <>", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonGreaterThan(String value) {
            addCriterion("applyReason >", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonGreaterThanOrEqualTo(String value) {
            addCriterion("applyReason >=", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLessThan(String value) {
            addCriterion("applyReason <", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLessThanOrEqualTo(String value) {
            addCriterion("applyReason <=", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonLike(String value) {
            addCriterion("applyReason like", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotLike(String value) {
            addCriterion("applyReason not like", value, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonIn(List<String> values) {
            addCriterion("applyReason in", values, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotIn(List<String> values) {
            addCriterion("applyReason not in", values, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonBetween(String value1, String value2) {
            addCriterion("applyReason between", value1, value2, "applyreason");
            return (Criteria) this;
        }

        public Criteria andApplyreasonNotBetween(String value1, String value2) {
            addCriterion("applyReason not between", value1, value2, "applyreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonIsNull() {
            addCriterion("recommendReason is null");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonIsNotNull() {
            addCriterion("recommendReason is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonEqualTo(String value) {
            addCriterion("recommendReason =", value, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonNotEqualTo(String value) {
            addCriterion("recommendReason <>", value, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonGreaterThan(String value) {
            addCriterion("recommendReason >", value, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonGreaterThanOrEqualTo(String value) {
            addCriterion("recommendReason >=", value, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonLessThan(String value) {
            addCriterion("recommendReason <", value, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonLessThanOrEqualTo(String value) {
            addCriterion("recommendReason <=", value, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonLike(String value) {
            addCriterion("recommendReason like", value, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonNotLike(String value) {
            addCriterion("recommendReason not like", value, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonIn(List<String> values) {
            addCriterion("recommendReason in", values, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonNotIn(List<String> values) {
            addCriterion("recommendReason not in", values, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonBetween(String value1, String value2) {
            addCriterion("recommendReason between", value1, value2, "recommendreason");
            return (Criteria) this;
        }

        public Criteria andRecommendreasonNotBetween(String value1, String value2) {
            addCriterion("recommendReason not between", value1, value2, "recommendreason");
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