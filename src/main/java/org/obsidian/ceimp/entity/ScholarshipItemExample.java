package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class ScholarshipItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScholarshipItemExample() {
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

        public Criteria andScholarshipItemIdIsNull() {
            addCriterion("scholarship_item_id is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdIsNotNull() {
            addCriterion("scholarship_item_id is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdEqualTo(Integer value) {
            addCriterion("scholarship_item_id =", value, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdNotEqualTo(Integer value) {
            addCriterion("scholarship_item_id <>", value, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdGreaterThan(Integer value) {
            addCriterion("scholarship_item_id >", value, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scholarship_item_id >=", value, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdLessThan(Integer value) {
            addCriterion("scholarship_item_id <", value, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("scholarship_item_id <=", value, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdIn(List<Integer> values) {
            addCriterion("scholarship_item_id in", values, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdNotIn(List<Integer> values) {
            addCriterion("scholarship_item_id not in", values, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdBetween(Integer value1, Integer value2) {
            addCriterion("scholarship_item_id between", value1, value2, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scholarship_item_id not between", value1, value2, "scholarshipItemId");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameIsNull() {
            addCriterion("scholarship_item_name is null");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameIsNotNull() {
            addCriterion("scholarship_item_name is not null");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameEqualTo(String value) {
            addCriterion("scholarship_item_name =", value, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameNotEqualTo(String value) {
            addCriterion("scholarship_item_name <>", value, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameGreaterThan(String value) {
            addCriterion("scholarship_item_name >", value, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("scholarship_item_name >=", value, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameLessThan(String value) {
            addCriterion("scholarship_item_name <", value, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameLessThanOrEqualTo(String value) {
            addCriterion("scholarship_item_name <=", value, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameLike(String value) {
            addCriterion("scholarship_item_name like", value, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameNotLike(String value) {
            addCriterion("scholarship_item_name not like", value, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameIn(List<String> values) {
            addCriterion("scholarship_item_name in", values, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameNotIn(List<String> values) {
            addCriterion("scholarship_item_name not in", values, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameBetween(String value1, String value2) {
            addCriterion("scholarship_item_name between", value1, value2, "scholarshipItemName");
            return (Criteria) this;
        }

        public Criteria andScholarshipItemNameNotBetween(String value1, String value2) {
            addCriterion("scholarship_item_name not between", value1, value2, "scholarshipItemName");
            return (Criteria) this;
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

        public Criteria andFillInTypeIdIsNull() {
            addCriterion("fill_in_type_id is null");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdIsNotNull() {
            addCriterion("fill_in_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdEqualTo(Integer value) {
            addCriterion("fill_in_type_id =", value, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdNotEqualTo(Integer value) {
            addCriterion("fill_in_type_id <>", value, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdGreaterThan(Integer value) {
            addCriterion("fill_in_type_id >", value, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fill_in_type_id >=", value, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdLessThan(Integer value) {
            addCriterion("fill_in_type_id <", value, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("fill_in_type_id <=", value, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdIn(List<Integer> values) {
            addCriterion("fill_in_type_id in", values, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdNotIn(List<Integer> values) {
            addCriterion("fill_in_type_id not in", values, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("fill_in_type_id between", value1, value2, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fill_in_type_id not between", value1, value2, "fillInTypeId");
            return (Criteria) this;
        }

        public Criteria andFillInHintIsNull() {
            addCriterion("fill_in_hint is null");
            return (Criteria) this;
        }

        public Criteria andFillInHintIsNotNull() {
            addCriterion("fill_in_hint is not null");
            return (Criteria) this;
        }

        public Criteria andFillInHintEqualTo(String value) {
            addCriterion("fill_in_hint =", value, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintNotEqualTo(String value) {
            addCriterion("fill_in_hint <>", value, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintGreaterThan(String value) {
            addCriterion("fill_in_hint >", value, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintGreaterThanOrEqualTo(String value) {
            addCriterion("fill_in_hint >=", value, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintLessThan(String value) {
            addCriterion("fill_in_hint <", value, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintLessThanOrEqualTo(String value) {
            addCriterion("fill_in_hint <=", value, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintLike(String value) {
            addCriterion("fill_in_hint like", value, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintNotLike(String value) {
            addCriterion("fill_in_hint not like", value, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintIn(List<String> values) {
            addCriterion("fill_in_hint in", values, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintNotIn(List<String> values) {
            addCriterion("fill_in_hint not in", values, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintBetween(String value1, String value2) {
            addCriterion("fill_in_hint between", value1, value2, "fillInHint");
            return (Criteria) this;
        }

        public Criteria andFillInHintNotBetween(String value1, String value2) {
            addCriterion("fill_in_hint not between", value1, value2, "fillInHint");
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