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

        public Criteria andScholarshipNameIsNull() {
            addCriterion("scholarship_name is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameIsNotNull() {
            addCriterion("scholarship_name is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameEqualTo(String value) {
            addCriterion("scholarship_name =", value, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameNotEqualTo(String value) {
            addCriterion("scholarship_name <>", value, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameGreaterThan(String value) {
            addCriterion("scholarship_name >", value, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameGreaterThanOrEqualTo(String value) {
            addCriterion("scholarship_name >=", value, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameLessThan(String value) {
            addCriterion("scholarship_name <", value, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameLessThanOrEqualTo(String value) {
            addCriterion("scholarship_name <=", value, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameLike(String value) {
            addCriterion("scholarship_name like", value, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameNotLike(String value) {
            addCriterion("scholarship_name not like", value, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameIn(List<String> values) {
            addCriterion("scholarship_name in", values, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameNotIn(List<String> values) {
            addCriterion("scholarship_name not in", values, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameBetween(String value1, String value2) {
            addCriterion("scholarship_name between", value1, value2, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andScholarshipNameNotBetween(String value1, String value2) {
            addCriterion("scholarship_name not between", value1, value2, "scholarshipName");
            return (Criteria) this;
        }

        public Criteria andAwardPercentIsNull() {
            addCriterion("award_percent is null");
            return (Criteria) this;
        }

        public Criteria andAwardPercentIsNotNull() {
            addCriterion("award_percent is not null");
            return (Criteria) this;
        }

        public Criteria andAwardPercentEqualTo(Double value) {
            addCriterion("award_percent =", value, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentNotEqualTo(Double value) {
            addCriterion("award_percent <>", value, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentGreaterThan(Double value) {
            addCriterion("award_percent >", value, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentGreaterThanOrEqualTo(Double value) {
            addCriterion("award_percent >=", value, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentLessThan(Double value) {
            addCriterion("award_percent <", value, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentLessThanOrEqualTo(Double value) {
            addCriterion("award_percent <=", value, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentIn(List<Double> values) {
            addCriterion("award_percent in", values, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentNotIn(List<Double> values) {
            addCriterion("award_percent not in", values, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentBetween(Double value1, Double value2) {
            addCriterion("award_percent between", value1, value2, "awardPercent");
            return (Criteria) this;
        }

        public Criteria andAwardPercentNotBetween(Double value1, Double value2) {
            addCriterion("award_percent not between", value1, value2, "awardPercent");
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