package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class SsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SsExample() {
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

        public Criteria andSsIdIsNull() {
            addCriterion("ss_id is null");
            return (Criteria) this;
        }

        public Criteria andSsIdIsNotNull() {
            addCriterion("ss_id is not null");
            return (Criteria) this;
        }

        public Criteria andSsIdEqualTo(Long value) {
            addCriterion("ss_id =", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotEqualTo(Long value) {
            addCriterion("ss_id <>", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThan(Long value) {
            addCriterion("ss_id >", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ss_id >=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThan(Long value) {
            addCriterion("ss_id <", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdLessThanOrEqualTo(Long value) {
            addCriterion("ss_id <=", value, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdIn(List<Long> values) {
            addCriterion("ss_id in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotIn(List<Long> values) {
            addCriterion("ss_id not in", values, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdBetween(Long value1, Long value2) {
            addCriterion("ss_id between", value1, value2, "ssId");
            return (Criteria) this;
        }

        public Criteria andSsIdNotBetween(Long value1, Long value2) {
            addCriterion("ss_id not between", value1, value2, "ssId");
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