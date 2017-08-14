package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class CompetitionLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionLevelExample() {
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

        public Criteria andCompetitionLevelIdIsNull() {
            addCriterion("competition_level_id is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdIsNotNull() {
            addCriterion("competition_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdEqualTo(Integer value) {
            addCriterion("competition_level_id =", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotEqualTo(Integer value) {
            addCriterion("competition_level_id <>", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdGreaterThan(Integer value) {
            addCriterion("competition_level_id >", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("competition_level_id >=", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdLessThan(Integer value) {
            addCriterion("competition_level_id <", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdLessThanOrEqualTo(Integer value) {
            addCriterion("competition_level_id <=", value, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdIn(List<Integer> values) {
            addCriterion("competition_level_id in", values, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotIn(List<Integer> values) {
            addCriterion("competition_level_id not in", values, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdBetween(Integer value1, Integer value2) {
            addCriterion("competition_level_id between", value1, value2, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("competition_level_id not between", value1, value2, "competitionLevelId");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIsNull() {
            addCriterion("competition_level is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIsNotNull() {
            addCriterion("competition_level is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelEqualTo(String value) {
            addCriterion("competition_level =", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotEqualTo(String value) {
            addCriterion("competition_level <>", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelGreaterThan(String value) {
            addCriterion("competition_level >", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("competition_level >=", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLessThan(String value) {
            addCriterion("competition_level <", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLessThanOrEqualTo(String value) {
            addCriterion("competition_level <=", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelLike(String value) {
            addCriterion("competition_level like", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotLike(String value) {
            addCriterion("competition_level not like", value, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelIn(List<String> values) {
            addCriterion("competition_level in", values, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotIn(List<String> values) {
            addCriterion("competition_level not in", values, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelBetween(String value1, String value2) {
            addCriterion("competition_level between", value1, value2, "competitionLevel");
            return (Criteria) this;
        }

        public Criteria andCompetitionLevelNotBetween(String value1, String value2) {
            addCriterion("competition_level not between", value1, value2, "competitionLevel");
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