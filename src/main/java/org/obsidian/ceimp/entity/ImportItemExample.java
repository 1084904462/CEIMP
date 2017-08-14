package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class ImportItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImportItemExample() {
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

        public Criteria andImportIdIsNull() {
            addCriterion("import_id is null");
            return (Criteria) this;
        }

        public Criteria andImportIdIsNotNull() {
            addCriterion("import_id is not null");
            return (Criteria) this;
        }

        public Criteria andImportIdEqualTo(Integer value) {
            addCriterion("import_id =", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotEqualTo(Integer value) {
            addCriterion("import_id <>", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdGreaterThan(Integer value) {
            addCriterion("import_id >", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("import_id >=", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdLessThan(Integer value) {
            addCriterion("import_id <", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdLessThanOrEqualTo(Integer value) {
            addCriterion("import_id <=", value, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdIn(List<Integer> values) {
            addCriterion("import_id in", values, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotIn(List<Integer> values) {
            addCriterion("import_id not in", values, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdBetween(Integer value1, Integer value2) {
            addCriterion("import_id between", value1, value2, "importId");
            return (Criteria) this;
        }

        public Criteria andImportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("import_id not between", value1, value2, "importId");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andExamFailIsNull() {
            addCriterion("exam_fail is null");
            return (Criteria) this;
        }

        public Criteria andExamFailIsNotNull() {
            addCriterion("exam_fail is not null");
            return (Criteria) this;
        }

        public Criteria andExamFailEqualTo(Integer value) {
            addCriterion("exam_fail =", value, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailNotEqualTo(Integer value) {
            addCriterion("exam_fail <>", value, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailGreaterThan(Integer value) {
            addCriterion("exam_fail >", value, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_fail >=", value, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailLessThan(Integer value) {
            addCriterion("exam_fail <", value, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailLessThanOrEqualTo(Integer value) {
            addCriterion("exam_fail <=", value, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailIn(List<Integer> values) {
            addCriterion("exam_fail in", values, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailNotIn(List<Integer> values) {
            addCriterion("exam_fail not in", values, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailBetween(Integer value1, Integer value2) {
            addCriterion("exam_fail between", value1, value2, "examFail");
            return (Criteria) this;
        }

        public Criteria andExamFailNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_fail not between", value1, value2, "examFail");
            return (Criteria) this;
        }

        public Criteria andMakeUpIsNull() {
            addCriterion("make_up is null");
            return (Criteria) this;
        }

        public Criteria andMakeUpIsNotNull() {
            addCriterion("make_up is not null");
            return (Criteria) this;
        }

        public Criteria andMakeUpEqualTo(Integer value) {
            addCriterion("make_up =", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpNotEqualTo(Integer value) {
            addCriterion("make_up <>", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpGreaterThan(Integer value) {
            addCriterion("make_up >", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("make_up >=", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpLessThan(Integer value) {
            addCriterion("make_up <", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpLessThanOrEqualTo(Integer value) {
            addCriterion("make_up <=", value, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpIn(List<Integer> values) {
            addCriterion("make_up in", values, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpNotIn(List<Integer> values) {
            addCriterion("make_up not in", values, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpBetween(Integer value1, Integer value2) {
            addCriterion("make_up between", value1, value2, "makeUp");
            return (Criteria) this;
        }

        public Criteria andMakeUpNotBetween(Integer value1, Integer value2) {
            addCriterion("make_up not between", value1, value2, "makeUp");
            return (Criteria) this;
        }

        public Criteria andCet4IsNull() {
            addCriterion("cet4 is null");
            return (Criteria) this;
        }

        public Criteria andCet4IsNotNull() {
            addCriterion("cet4 is not null");
            return (Criteria) this;
        }

        public Criteria andCet4EqualTo(Integer value) {
            addCriterion("cet4 =", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4NotEqualTo(Integer value) {
            addCriterion("cet4 <>", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4GreaterThan(Integer value) {
            addCriterion("cet4 >", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4GreaterThanOrEqualTo(Integer value) {
            addCriterion("cet4 >=", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4LessThan(Integer value) {
            addCriterion("cet4 <", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4LessThanOrEqualTo(Integer value) {
            addCriterion("cet4 <=", value, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4In(List<Integer> values) {
            addCriterion("cet4 in", values, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4NotIn(List<Integer> values) {
            addCriterion("cet4 not in", values, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4Between(Integer value1, Integer value2) {
            addCriterion("cet4 between", value1, value2, "cet4");
            return (Criteria) this;
        }

        public Criteria andCet4NotBetween(Integer value1, Integer value2) {
            addCriterion("cet4 not between", value1, value2, "cet4");
            return (Criteria) this;
        }

        public Criteria andPeIsNull() {
            addCriterion("pe is null");
            return (Criteria) this;
        }

        public Criteria andPeIsNotNull() {
            addCriterion("pe is not null");
            return (Criteria) this;
        }

        public Criteria andPeEqualTo(Double value) {
            addCriterion("pe =", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotEqualTo(Double value) {
            addCriterion("pe <>", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThan(Double value) {
            addCriterion("pe >", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThanOrEqualTo(Double value) {
            addCriterion("pe >=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThan(Double value) {
            addCriterion("pe <", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThanOrEqualTo(Double value) {
            addCriterion("pe <=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeIn(List<Double> values) {
            addCriterion("pe in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotIn(List<Double> values) {
            addCriterion("pe not in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeBetween(Double value1, Double value2) {
            addCriterion("pe between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotBetween(Double value1, Double value2) {
            addCriterion("pe not between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andGpaIsNull() {
            addCriterion("gpa is null");
            return (Criteria) this;
        }

        public Criteria andGpaIsNotNull() {
            addCriterion("gpa is not null");
            return (Criteria) this;
        }

        public Criteria andGpaEqualTo(Double value) {
            addCriterion("gpa =", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotEqualTo(Double value) {
            addCriterion("gpa <>", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaGreaterThan(Double value) {
            addCriterion("gpa >", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaGreaterThanOrEqualTo(Double value) {
            addCriterion("gpa >=", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaLessThan(Double value) {
            addCriterion("gpa <", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaLessThanOrEqualTo(Double value) {
            addCriterion("gpa <=", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaIn(List<Double> values) {
            addCriterion("gpa in", values, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotIn(List<Double> values) {
            addCriterion("gpa not in", values, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaBetween(Double value1, Double value2) {
            addCriterion("gpa between", value1, value2, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotBetween(Double value1, Double value2) {
            addCriterion("gpa not between", value1, value2, "gpa");
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