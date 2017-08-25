package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class InnovationRequireExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InnovationRequireExample() {
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

        public Criteria andRequireIdIsNull() {
            addCriterion("require_id is null");
            return (Criteria) this;
        }

        public Criteria andRequireIdIsNotNull() {
            addCriterion("require_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequireIdEqualTo(Integer value) {
            addCriterion("require_id =", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdNotEqualTo(Integer value) {
            addCriterion("require_id <>", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdGreaterThan(Integer value) {
            addCriterion("require_id >", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("require_id >=", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdLessThan(Integer value) {
            addCriterion("require_id <", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdLessThanOrEqualTo(Integer value) {
            addCriterion("require_id <=", value, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdIn(List<Integer> values) {
            addCriterion("require_id in", values, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdNotIn(List<Integer> values) {
            addCriterion("require_id not in", values, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdBetween(Integer value1, Integer value2) {
            addCriterion("require_id between", value1, value2, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIdNotBetween(Integer value1, Integer value2) {
            addCriterion("require_id not between", value1, value2, "requireId");
            return (Criteria) this;
        }

        public Criteria andRequireIsNull() {
            addCriterion("require is null");
            return (Criteria) this;
        }

        public Criteria andRequireIsNotNull() {
            addCriterion("require is not null");
            return (Criteria) this;
        }

        public Criteria andRequireEqualTo(String value) {
            addCriterion("require =", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireNotEqualTo(String value) {
            addCriterion("require <>", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireGreaterThan(String value) {
            addCriterion("require >", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireGreaterThanOrEqualTo(String value) {
            addCriterion("require >=", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireLessThan(String value) {
            addCriterion("require <", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireLessThanOrEqualTo(String value) {
            addCriterion("require <=", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireLike(String value) {
            addCriterion("require like", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireNotLike(String value) {
            addCriterion("require not like", value, "require");
            return (Criteria) this;
        }

        public Criteria andRequireIn(List<String> values) {
            addCriterion("require in", values, "require");
            return (Criteria) this;
        }

        public Criteria andRequireNotIn(List<String> values) {
            addCriterion("require not in", values, "require");
            return (Criteria) this;
        }

        public Criteria andRequireBetween(String value1, String value2) {
            addCriterion("require between", value1, value2, "require");
            return (Criteria) this;
        }

        public Criteria andRequireNotBetween(String value1, String value2) {
            addCriterion("require not between", value1, value2, "require");
            return (Criteria) this;
        }

        public Criteria andInnovationIdIsNull() {
            addCriterion("innovation_id is null");
            return (Criteria) this;
        }

        public Criteria andInnovationIdIsNotNull() {
            addCriterion("innovation_id is not null");
            return (Criteria) this;
        }

        public Criteria andInnovationIdEqualTo(Integer value) {
            addCriterion("innovation_id =", value, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdNotEqualTo(Integer value) {
            addCriterion("innovation_id <>", value, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdGreaterThan(Integer value) {
            addCriterion("innovation_id >", value, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("innovation_id >=", value, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdLessThan(Integer value) {
            addCriterion("innovation_id <", value, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdLessThanOrEqualTo(Integer value) {
            addCriterion("innovation_id <=", value, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdIn(List<Integer> values) {
            addCriterion("innovation_id in", values, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdNotIn(List<Integer> values) {
            addCriterion("innovation_id not in", values, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdBetween(Integer value1, Integer value2) {
            addCriterion("innovation_id between", value1, value2, "innovationId");
            return (Criteria) this;
        }

        public Criteria andInnovationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("innovation_id not between", value1, value2, "innovationId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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