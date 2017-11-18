package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class OpinionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpinionExample() {
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

        public Criteria andOpinionIdIsNull() {
            addCriterion("opinion_id is null");
            return (Criteria) this;
        }

        public Criteria andOpinionIdIsNotNull() {
            addCriterion("opinion_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpinionIdEqualTo(Long value) {
            addCriterion("opinion_id =", value, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdNotEqualTo(Long value) {
            addCriterion("opinion_id <>", value, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdGreaterThan(Long value) {
            addCriterion("opinion_id >", value, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("opinion_id >=", value, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdLessThan(Long value) {
            addCriterion("opinion_id <", value, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdLessThanOrEqualTo(Long value) {
            addCriterion("opinion_id <=", value, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdIn(List<Long> values) {
            addCriterion("opinion_id in", values, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdNotIn(List<Long> values) {
            addCriterion("opinion_id not in", values, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdBetween(Long value1, Long value2) {
            addCriterion("opinion_id between", value1, value2, "opinionId");
            return (Criteria) this;
        }

        public Criteria andOpinionIdNotBetween(Long value1, Long value2) {
            addCriterion("opinion_id not between", value1, value2, "opinionId");
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

        public Criteria andManagerIdEqualTo(Long value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Long value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Long value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Long value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Long value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Long> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Long> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Long value1, Long value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Long value1, Long value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
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

        public Criteria andNisOpinionIsNull() {
            addCriterion("nis_opinion is null");
            return (Criteria) this;
        }

        public Criteria andNisOpinionIsNotNull() {
            addCriterion("nis_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andNisOpinionEqualTo(String value) {
            addCriterion("nis_opinion =", value, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionNotEqualTo(String value) {
            addCriterion("nis_opinion <>", value, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionGreaterThan(String value) {
            addCriterion("nis_opinion >", value, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("nis_opinion >=", value, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionLessThan(String value) {
            addCriterion("nis_opinion <", value, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionLessThanOrEqualTo(String value) {
            addCriterion("nis_opinion <=", value, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionLike(String value) {
            addCriterion("nis_opinion like", value, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionNotLike(String value) {
            addCriterion("nis_opinion not like", value, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionIn(List<String> values) {
            addCriterion("nis_opinion in", values, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionNotIn(List<String> values) {
            addCriterion("nis_opinion not in", values, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionBetween(String value1, String value2) {
            addCriterion("nis_opinion between", value1, value2, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andNisOpinionNotBetween(String value1, String value2) {
            addCriterion("nis_opinion not between", value1, value2, "nisOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendIsNull() {
            addCriterion("pgs_recommend is null");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendIsNotNull() {
            addCriterion("pgs_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendEqualTo(String value) {
            addCriterion("pgs_recommend =", value, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendNotEqualTo(String value) {
            addCriterion("pgs_recommend <>", value, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendGreaterThan(String value) {
            addCriterion("pgs_recommend >", value, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("pgs_recommend >=", value, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendLessThan(String value) {
            addCriterion("pgs_recommend <", value, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendLessThanOrEqualTo(String value) {
            addCriterion("pgs_recommend <=", value, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendLike(String value) {
            addCriterion("pgs_recommend like", value, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendNotLike(String value) {
            addCriterion("pgs_recommend not like", value, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendIn(List<String> values) {
            addCriterion("pgs_recommend in", values, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendNotIn(List<String> values) {
            addCriterion("pgs_recommend not in", values, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendBetween(String value1, String value2) {
            addCriterion("pgs_recommend between", value1, value2, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsRecommendNotBetween(String value1, String value2) {
            addCriterion("pgs_recommend not between", value1, value2, "pgsRecommend");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionIsNull() {
            addCriterion("pgs_opinion is null");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionIsNotNull() {
            addCriterion("pgs_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionEqualTo(String value) {
            addCriterion("pgs_opinion =", value, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionNotEqualTo(String value) {
            addCriterion("pgs_opinion <>", value, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionGreaterThan(String value) {
            addCriterion("pgs_opinion >", value, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("pgs_opinion >=", value, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionLessThan(String value) {
            addCriterion("pgs_opinion <", value, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionLessThanOrEqualTo(String value) {
            addCriterion("pgs_opinion <=", value, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionLike(String value) {
            addCriterion("pgs_opinion like", value, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionNotLike(String value) {
            addCriterion("pgs_opinion not like", value, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionIn(List<String> values) {
            addCriterion("pgs_opinion in", values, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionNotIn(List<String> values) {
            addCriterion("pgs_opinion not in", values, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionBetween(String value1, String value2) {
            addCriterion("pgs_opinion between", value1, value2, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andPgsOpinionNotBetween(String value1, String value2) {
            addCriterion("pgs_opinion not between", value1, value2, "pgsOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionIsNull() {
            addCriterion("ss_opinion is null");
            return (Criteria) this;
        }

        public Criteria andSsOpinionIsNotNull() {
            addCriterion("ss_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andSsOpinionEqualTo(String value) {
            addCriterion("ss_opinion =", value, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionNotEqualTo(String value) {
            addCriterion("ss_opinion <>", value, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionGreaterThan(String value) {
            addCriterion("ss_opinion >", value, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("ss_opinion >=", value, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionLessThan(String value) {
            addCriterion("ss_opinion <", value, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionLessThanOrEqualTo(String value) {
            addCriterion("ss_opinion <=", value, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionLike(String value) {
            addCriterion("ss_opinion like", value, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionNotLike(String value) {
            addCriterion("ss_opinion not like", value, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionIn(List<String> values) {
            addCriterion("ss_opinion in", values, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionNotIn(List<String> values) {
            addCriterion("ss_opinion not in", values, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionBetween(String value1, String value2) {
            addCriterion("ss_opinion between", value1, value2, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andSsOpinionNotBetween(String value1, String value2) {
            addCriterion("ss_opinion not between", value1, value2, "ssOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionIsNull() {
            addCriterion("tas_opinion is null");
            return (Criteria) this;
        }

        public Criteria andTasOpinionIsNotNull() {
            addCriterion("tas_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andTasOpinionEqualTo(String value) {
            addCriterion("tas_opinion =", value, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionNotEqualTo(String value) {
            addCriterion("tas_opinion <>", value, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionGreaterThan(String value) {
            addCriterion("tas_opinion >", value, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("tas_opinion >=", value, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionLessThan(String value) {
            addCriterion("tas_opinion <", value, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionLessThanOrEqualTo(String value) {
            addCriterion("tas_opinion <=", value, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionLike(String value) {
            addCriterion("tas_opinion like", value, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionNotLike(String value) {
            addCriterion("tas_opinion not like", value, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionIn(List<String> values) {
            addCriterion("tas_opinion in", values, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionNotIn(List<String> values) {
            addCriterion("tas_opinion not in", values, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionBetween(String value1, String value2) {
            addCriterion("tas_opinion between", value1, value2, "tasOpinion");
            return (Criteria) this;
        }

        public Criteria andTasOpinionNotBetween(String value1, String value2) {
            addCriterion("tas_opinion not between", value1, value2, "tasOpinion");
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