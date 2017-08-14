package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class ScholarshipBlockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScholarshipBlockExample() {
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

        public Criteria andScholarshipBlockIdIsNull() {
            addCriterion("scholarship_block_id is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdIsNotNull() {
            addCriterion("scholarship_block_id is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdEqualTo(Integer value) {
            addCriterion("scholarship_block_id =", value, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdNotEqualTo(Integer value) {
            addCriterion("scholarship_block_id <>", value, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdGreaterThan(Integer value) {
            addCriterion("scholarship_block_id >", value, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scholarship_block_id >=", value, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdLessThan(Integer value) {
            addCriterion("scholarship_block_id <", value, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdLessThanOrEqualTo(Integer value) {
            addCriterion("scholarship_block_id <=", value, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdIn(List<Integer> values) {
            addCriterion("scholarship_block_id in", values, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdNotIn(List<Integer> values) {
            addCriterion("scholarship_block_id not in", values, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdBetween(Integer value1, Integer value2) {
            addCriterion("scholarship_block_id between", value1, value2, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scholarship_block_id not between", value1, value2, "scholarshipBlockId");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameIsNull() {
            addCriterion("scholarship_block_name is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameIsNotNull() {
            addCriterion("scholarship_block_name is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameEqualTo(String value) {
            addCriterion("scholarship_block_name =", value, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameNotEqualTo(String value) {
            addCriterion("scholarship_block_name <>", value, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameGreaterThan(String value) {
            addCriterion("scholarship_block_name >", value, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameGreaterThanOrEqualTo(String value) {
            addCriterion("scholarship_block_name >=", value, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameLessThan(String value) {
            addCriterion("scholarship_block_name <", value, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameLessThanOrEqualTo(String value) {
            addCriterion("scholarship_block_name <=", value, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameLike(String value) {
            addCriterion("scholarship_block_name like", value, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameNotLike(String value) {
            addCriterion("scholarship_block_name not like", value, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameIn(List<String> values) {
            addCriterion("scholarship_block_name in", values, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameNotIn(List<String> values) {
            addCriterion("scholarship_block_name not in", values, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameBetween(String value1, String value2) {
            addCriterion("scholarship_block_name between", value1, value2, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipBlockNameNotBetween(String value1, String value2) {
            addCriterion("scholarship_block_name not between", value1, value2, "scholarshipBlockName");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdIsNull() {
            addCriterion("scholarship_id is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdIsNotNull() {
            addCriterion("scholarship_id is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdEqualTo(Integer value) {
            addCriterion("scholarship_id =", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdNotEqualTo(Integer value) {
            addCriterion("scholarship_id <>", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdGreaterThan(Integer value) {
            addCriterion("scholarship_id >", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scholarship_id >=", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdLessThan(Integer value) {
            addCriterion("scholarship_id <", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdLessThanOrEqualTo(Integer value) {
            addCriterion("scholarship_id <=", value, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdIn(List<Integer> values) {
            addCriterion("scholarship_id in", values, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdNotIn(List<Integer> values) {
            addCriterion("scholarship_id not in", values, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdBetween(Integer value1, Integer value2) {
            addCriterion("scholarship_id between", value1, value2, "scholarshipId");
            return (Criteria) this;
        }

        public Criteria andScholarshipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scholarship_id not between", value1, value2, "scholarshipId");
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