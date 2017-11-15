package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class ScholarshipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScholarshipExample() {
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

        public Criteria andScholarshipIdIsNull() {
            addCriterion("scholarship_id is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdIsNotNull() {
            addCriterion("scholarship_id is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdEqualTo(Long value) {
            addCriterion("scholarship_id =", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdNotEqualTo(Long value) {
            addCriterion("scholarship_id <>", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdGreaterThan(Long value) {
            addCriterion("scholarship_id >", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdGreaterThanOrEqualTo(Long value) {
            addCriterion("scholarship_id >=", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdLessThan(Long value) {
            addCriterion("scholarship_id <", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdLessThanOrEqualTo(Long value) {
            addCriterion("scholarship_id <=", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdIn(List<Long> values) {
            addCriterion("scholarship_id in", values, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdNotIn(List<Long> values) {
            addCriterion("scholarship_id not in", values, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdBetween(Long value1, Long value2) {
            addCriterion("scholarship_id between", value1, value2, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdNotBetween(Long value1, Long value2) {
            addCriterion("scholarship_id not between", value1, value2, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNull() {
            addCriterion("sub_name is null");
            return (Criteria) this;
        }

        public Criteria andSubNameIsNotNull() {
            addCriterion("sub_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubNameEqualTo(String value) {
            addCriterion("sub_name =", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotEqualTo(String value) {
            addCriterion("sub_name <>", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThan(String value) {
            addCriterion("sub_name >", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameGreaterThanOrEqualTo(String value) {
            addCriterion("sub_name >=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThan(String value) {
            addCriterion("sub_name <", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLessThanOrEqualTo(String value) {
            addCriterion("sub_name <=", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameLike(String value) {
            addCriterion("sub_name like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotLike(String value) {
            addCriterion("sub_name not like", value, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameIn(List<String> values) {
            addCriterion("sub_name in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotIn(List<String> values) {
            addCriterion("sub_name not in", values, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameBetween(String value1, String value2) {
            addCriterion("sub_name between", value1, value2, "subName");
            return (Criteria) this;
        }

        public Criteria andSubNameNotBetween(String value1, String value2) {
            addCriterion("sub_name not between", value1, value2, "subName");
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