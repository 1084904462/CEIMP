package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class ScholarshipOpinionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScholarshipOpinionExample() {
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

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(String value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(String value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(String value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(String value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(String value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLike(String value) {
            addCriterion("manager_id like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotLike(String value) {
            addCriterion("manager_id not like", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<String> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<String> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(String value1, String value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(String value1, String value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionIsNull() {
            addCriterion("national_opinion is null");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionIsNotNull() {
            addCriterion("national_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionEqualTo(String value) {
            addCriterion("national_opinion =", value, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionNotEqualTo(String value) {
            addCriterion("national_opinion <>", value, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionGreaterThan(String value) {
            addCriterion("national_opinion >", value, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("national_opinion >=", value, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionLessThan(String value) {
            addCriterion("national_opinion <", value, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionLessThanOrEqualTo(String value) {
            addCriterion("national_opinion <=", value, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionLike(String value) {
            addCriterion("national_opinion like", value, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionNotLike(String value) {
            addCriterion("national_opinion not like", value, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionIn(List<String> values) {
            addCriterion("national_opinion in", values, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionNotIn(List<String> values) {
            addCriterion("national_opinion not in", values, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionBetween(String value1, String value2) {
            addCriterion("national_opinion between", value1, value2, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andNationalOpinionNotBetween(String value1, String value2) {
            addCriterion("national_opinion not between", value1, value2, "nationalOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendIsNull() {
            addCriterion("provincial_recommend is null");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendIsNotNull() {
            addCriterion("provincial_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendEqualTo(String value) {
            addCriterion("provincial_recommend =", value, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendNotEqualTo(String value) {
            addCriterion("provincial_recommend <>", value, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendGreaterThan(String value) {
            addCriterion("provincial_recommend >", value, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("provincial_recommend >=", value, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendLessThan(String value) {
            addCriterion("provincial_recommend <", value, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendLessThanOrEqualTo(String value) {
            addCriterion("provincial_recommend <=", value, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendLike(String value) {
            addCriterion("provincial_recommend like", value, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendNotLike(String value) {
            addCriterion("provincial_recommend not like", value, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendIn(List<String> values) {
            addCriterion("provincial_recommend in", values, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendNotIn(List<String> values) {
            addCriterion("provincial_recommend not in", values, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendBetween(String value1, String value2) {
            addCriterion("provincial_recommend between", value1, value2, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialRecommendNotBetween(String value1, String value2) {
            addCriterion("provincial_recommend not between", value1, value2, "provincialRecommend");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionIsNull() {
            addCriterion("provincial_opinion is null");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionIsNotNull() {
            addCriterion("provincial_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionEqualTo(String value) {
            addCriterion("provincial_opinion =", value, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionNotEqualTo(String value) {
            addCriterion("provincial_opinion <>", value, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionGreaterThan(String value) {
            addCriterion("provincial_opinion >", value, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("provincial_opinion >=", value, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionLessThan(String value) {
            addCriterion("provincial_opinion <", value, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionLessThanOrEqualTo(String value) {
            addCriterion("provincial_opinion <=", value, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionLike(String value) {
            addCriterion("provincial_opinion like", value, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionNotLike(String value) {
            addCriterion("provincial_opinion not like", value, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionIn(List<String> values) {
            addCriterion("provincial_opinion in", values, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionNotIn(List<String> values) {
            addCriterion("provincial_opinion not in", values, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionBetween(String value1, String value2) {
            addCriterion("provincial_opinion between", value1, value2, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andProvincialOpinionNotBetween(String value1, String value2) {
            addCriterion("provincial_opinion not between", value1, value2, "provincialOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionIsNull() {
            addCriterion("school_opinion is null");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionIsNotNull() {
            addCriterion("school_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionEqualTo(String value) {
            addCriterion("school_opinion =", value, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionNotEqualTo(String value) {
            addCriterion("school_opinion <>", value, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionGreaterThan(String value) {
            addCriterion("school_opinion >", value, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("school_opinion >=", value, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionLessThan(String value) {
            addCriterion("school_opinion <", value, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionLessThanOrEqualTo(String value) {
            addCriterion("school_opinion <=", value, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionLike(String value) {
            addCriterion("school_opinion like", value, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionNotLike(String value) {
            addCriterion("school_opinion not like", value, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionIn(List<String> values) {
            addCriterion("school_opinion in", values, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionNotIn(List<String> values) {
            addCriterion("school_opinion not in", values, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionBetween(String value1, String value2) {
            addCriterion("school_opinion between", value1, value2, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andSchoolOpinionNotBetween(String value1, String value2) {
            addCriterion("school_opinion not between", value1, value2, "schoolOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionIsNull() {
            addCriterion("triplea_opinion is null");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionIsNotNull() {
            addCriterion("triplea_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionEqualTo(String value) {
            addCriterion("triplea_opinion =", value, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionNotEqualTo(String value) {
            addCriterion("triplea_opinion <>", value, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionGreaterThan(String value) {
            addCriterion("triplea_opinion >", value, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("triplea_opinion >=", value, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionLessThan(String value) {
            addCriterion("triplea_opinion <", value, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionLessThanOrEqualTo(String value) {
            addCriterion("triplea_opinion <=", value, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionLike(String value) {
            addCriterion("triplea_opinion like", value, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionNotLike(String value) {
            addCriterion("triplea_opinion not like", value, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionIn(List<String> values) {
            addCriterion("triplea_opinion in", values, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionNotIn(List<String> values) {
            addCriterion("triplea_opinion not in", values, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionBetween(String value1, String value2) {
            addCriterion("triplea_opinion between", value1, value2, "tripleaOpinion");
            return (Criteria) this;
        }

        public Criteria andTripleaOpinionNotBetween(String value1, String value2) {
            addCriterion("triplea_opinion not between", value1, value2, "tripleaOpinion");
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