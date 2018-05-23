package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andInfoIdIsNull() {
            addCriterion("info_id is null");
            return (Criteria) this;
        }

        public Criteria andInfoIdIsNotNull() {
            addCriterion("info_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfoIdEqualTo(Long value) {
            addCriterion("info_id =", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotEqualTo(Long value) {
            addCriterion("info_id <>", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThan(Long value) {
            addCriterion("info_id >", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("info_id >=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThan(Long value) {
            addCriterion("info_id <", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("info_id <=", value, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdIn(List<Long> values) {
            addCriterion("info_id in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotIn(List<Long> values) {
            addCriterion("info_id not in", values, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdBetween(Long value1, Long value2) {
            addCriterion("info_id between", value1, value2, "infoId");
            return (Criteria) this;
        }

        public Criteria andInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("info_id not between", value1, value2, "infoId");
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

        public Criteria andClassNumIdIsNull() {
            addCriterion("class_num_id is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIdIsNotNull() {
            addCriterion("class_num_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumIdEqualTo(Long value) {
            addCriterion("class_num_id =", value, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdNotEqualTo(Long value) {
            addCriterion("class_num_id <>", value, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdGreaterThan(Long value) {
            addCriterion("class_num_id >", value, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("class_num_id >=", value, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdLessThan(Long value) {
            addCriterion("class_num_id <", value, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdLessThanOrEqualTo(Long value) {
            addCriterion("class_num_id <=", value, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdIn(List<Long> values) {
            addCriterion("class_num_id in", values, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdNotIn(List<Long> values) {
            addCriterion("class_num_id not in", values, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdBetween(Long value1, Long value2) {
            addCriterion("class_num_id between", value1, value2, "classNumId");
            return (Criteria) this;
        }

        public Criteria andClassNumIdNotBetween(Long value1, Long value2) {
            addCriterion("class_num_id not between", value1, value2, "classNumId");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNull() {
            addCriterion("political is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalIsNotNull() {
            addCriterion("political is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalEqualTo(String value) {
            addCriterion("political =", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotEqualTo(String value) {
            addCriterion("political <>", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThan(String value) {
            addCriterion("political >", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalGreaterThanOrEqualTo(String value) {
            addCriterion("political >=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThan(String value) {
            addCriterion("political <", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLessThanOrEqualTo(String value) {
            addCriterion("political <=", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalLike(String value) {
            addCriterion("political like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotLike(String value) {
            addCriterion("political not like", value, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalIn(List<String> values) {
            addCriterion("political in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotIn(List<String> values) {
            addCriterion("political not in", values, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalBetween(String value1, String value2) {
            addCriterion("political between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andPoliticalNotBetween(String value1, String value2) {
            addCriterion("political not between", value1, value2, "political");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andCharactIsNull() {
            addCriterion("charact is null");
            return (Criteria) this;
        }

        public Criteria andCharactIsNotNull() {
            addCriterion("charact is not null");
            return (Criteria) this;
        }

        public Criteria andCharactEqualTo(String value) {
            addCriterion("charact =", value, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactNotEqualTo(String value) {
            addCriterion("charact <>", value, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactGreaterThan(String value) {
            addCriterion("charact >", value, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactGreaterThanOrEqualTo(String value) {
            addCriterion("charact >=", value, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactLessThan(String value) {
            addCriterion("charact <", value, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactLessThanOrEqualTo(String value) {
            addCriterion("charact <=", value, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactLike(String value) {
            addCriterion("charact like", value, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactNotLike(String value) {
            addCriterion("charact not like", value, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactIn(List<String> values) {
            addCriterion("charact in", values, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactNotIn(List<String> values) {
            addCriterion("charact not in", values, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactBetween(String value1, String value2) {
            addCriterion("charact between", value1, value2, "charact");
            return (Criteria) this;
        }

        public Criteria andCharactNotBetween(String value1, String value2) {
            addCriterion("charact not between", value1, value2, "charact");
            return (Criteria) this;
        }

        public Criteria andStudyIsNull() {
            addCriterion("study is null");
            return (Criteria) this;
        }

        public Criteria andStudyIsNotNull() {
            addCriterion("study is not null");
            return (Criteria) this;
        }

        public Criteria andStudyEqualTo(String value) {
            addCriterion("study =", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyNotEqualTo(String value) {
            addCriterion("study <>", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyGreaterThan(String value) {
            addCriterion("study >", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyGreaterThanOrEqualTo(String value) {
            addCriterion("study >=", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyLessThan(String value) {
            addCriterion("study <", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyLessThanOrEqualTo(String value) {
            addCriterion("study <=", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyLike(String value) {
            addCriterion("study like", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyNotLike(String value) {
            addCriterion("study not like", value, "study");
            return (Criteria) this;
        }

        public Criteria andStudyIn(List<String> values) {
            addCriterion("study in", values, "study");
            return (Criteria) this;
        }

        public Criteria andStudyNotIn(List<String> values) {
            addCriterion("study not in", values, "study");
            return (Criteria) this;
        }

        public Criteria andStudyBetween(String value1, String value2) {
            addCriterion("study between", value1, value2, "study");
            return (Criteria) this;
        }

        public Criteria andStudyNotBetween(String value1, String value2) {
            addCriterion("study not between", value1, value2, "study");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNull() {
            addCriterion("ability is null");
            return (Criteria) this;
        }

        public Criteria andAbilityIsNotNull() {
            addCriterion("ability is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityEqualTo(String value) {
            addCriterion("ability =", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotEqualTo(String value) {
            addCriterion("ability <>", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThan(String value) {
            addCriterion("ability >", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityGreaterThanOrEqualTo(String value) {
            addCriterion("ability >=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThan(String value) {
            addCriterion("ability <", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLessThanOrEqualTo(String value) {
            addCriterion("ability <=", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityLike(String value) {
            addCriterion("ability like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotLike(String value) {
            addCriterion("ability not like", value, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityIn(List<String> values) {
            addCriterion("ability in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotIn(List<String> values) {
            addCriterion("ability not in", values, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityBetween(String value1, String value2) {
            addCriterion("ability between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andAbilityNotBetween(String value1, String value2) {
            addCriterion("ability not between", value1, value2, "ability");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(String value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(String value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(String value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(String value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(String value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(String value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLike(String value) {
            addCriterion("total like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotLike(String value) {
            addCriterion("total not like", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<String> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<String> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(String value1, String value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(String value1, String value2) {
            addCriterion("total not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andGpRankIsNull() {
            addCriterion("gp_rank is null");
            return (Criteria) this;
        }

        public Criteria andGpRankIsNotNull() {
            addCriterion("gp_rank is not null");
            return (Criteria) this;
        }

        public Criteria andGpRankEqualTo(String value) {
            addCriterion("gp_rank =", value, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankNotEqualTo(String value) {
            addCriterion("gp_rank <>", value, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankGreaterThan(String value) {
            addCriterion("gp_rank >", value, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankGreaterThanOrEqualTo(String value) {
            addCriterion("gp_rank >=", value, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankLessThan(String value) {
            addCriterion("gp_rank <", value, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankLessThanOrEqualTo(String value) {
            addCriterion("gp_rank <=", value, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankLike(String value) {
            addCriterion("gp_rank like", value, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankNotLike(String value) {
            addCriterion("gp_rank not like", value, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankIn(List<String> values) {
            addCriterion("gp_rank in", values, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankNotIn(List<String> values) {
            addCriterion("gp_rank not in", values, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankBetween(String value1, String value2) {
            addCriterion("gp_rank between", value1, value2, "gpRank");
            return (Criteria) this;
        }

        public Criteria andGpRankNotBetween(String value1, String value2) {
            addCriterion("gp_rank not between", value1, value2, "gpRank");
            return (Criteria) this;
        }

        public Criteria andCeRankIsNull() {
            addCriterion("ce_rank is null");
            return (Criteria) this;
        }

        public Criteria andCeRankIsNotNull() {
            addCriterion("ce_rank is not null");
            return (Criteria) this;
        }

        public Criteria andCeRankEqualTo(String value) {
            addCriterion("ce_rank =", value, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankNotEqualTo(String value) {
            addCriterion("ce_rank <>", value, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankGreaterThan(String value) {
            addCriterion("ce_rank >", value, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankGreaterThanOrEqualTo(String value) {
            addCriterion("ce_rank >=", value, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankLessThan(String value) {
            addCriterion("ce_rank <", value, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankLessThanOrEqualTo(String value) {
            addCriterion("ce_rank <=", value, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankLike(String value) {
            addCriterion("ce_rank like", value, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankNotLike(String value) {
            addCriterion("ce_rank not like", value, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankIn(List<String> values) {
            addCriterion("ce_rank in", values, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankNotIn(List<String> values) {
            addCriterion("ce_rank not in", values, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankBetween(String value1, String value2) {
            addCriterion("ce_rank between", value1, value2, "ceRank");
            return (Criteria) this;
        }

        public Criteria andCeRankNotBetween(String value1, String value2) {
            addCriterion("ce_rank not between", value1, value2, "ceRank");
            return (Criteria) this;
        }

        public Criteria andPassSumIsNull() {
            addCriterion("pass_sum is null");
            return (Criteria) this;
        }

        public Criteria andPassSumIsNotNull() {
            addCriterion("pass_sum is not null");
            return (Criteria) this;
        }

        public Criteria andPassSumEqualTo(String value) {
            addCriterion("pass_sum =", value, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumNotEqualTo(String value) {
            addCriterion("pass_sum <>", value, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumGreaterThan(String value) {
            addCriterion("pass_sum >", value, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumGreaterThanOrEqualTo(String value) {
            addCriterion("pass_sum >=", value, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumLessThan(String value) {
            addCriterion("pass_sum <", value, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumLessThanOrEqualTo(String value) {
            addCriterion("pass_sum <=", value, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumLike(String value) {
            addCriterion("pass_sum like", value, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumNotLike(String value) {
            addCriterion("pass_sum not like", value, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumIn(List<String> values) {
            addCriterion("pass_sum in", values, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumNotIn(List<String> values) {
            addCriterion("pass_sum not in", values, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumBetween(String value1, String value2) {
            addCriterion("pass_sum between", value1, value2, "passSum");
            return (Criteria) this;
        }

        public Criteria andPassSumNotBetween(String value1, String value2) {
            addCriterion("pass_sum not between", value1, value2, "passSum");
            return (Criteria) this;
        }

        public Criteria andClassSumIsNull() {
            addCriterion("class_sum is null");
            return (Criteria) this;
        }

        public Criteria andClassSumIsNotNull() {
            addCriterion("class_sum is not null");
            return (Criteria) this;
        }

        public Criteria andClassSumEqualTo(String value) {
            addCriterion("class_sum =", value, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumNotEqualTo(String value) {
            addCriterion("class_sum <>", value, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumGreaterThan(String value) {
            addCriterion("class_sum >", value, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumGreaterThanOrEqualTo(String value) {
            addCriterion("class_sum >=", value, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumLessThan(String value) {
            addCriterion("class_sum <", value, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumLessThanOrEqualTo(String value) {
            addCriterion("class_sum <=", value, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumLike(String value) {
            addCriterion("class_sum like", value, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumNotLike(String value) {
            addCriterion("class_sum not like", value, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumIn(List<String> values) {
            addCriterion("class_sum in", values, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumNotIn(List<String> values) {
            addCriterion("class_sum not in", values, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumBetween(String value1, String value2) {
            addCriterion("class_sum between", value1, value2, "classSum");
            return (Criteria) this;
        }

        public Criteria andClassSumNotBetween(String value1, String value2) {
            addCriterion("class_sum not between", value1, value2, "classSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumIsNull() {
            addCriterion("major_sum is null");
            return (Criteria) this;
        }

        public Criteria andMajorSumIsNotNull() {
            addCriterion("major_sum is not null");
            return (Criteria) this;
        }

        public Criteria andMajorSumEqualTo(String value) {
            addCriterion("major_sum =", value, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumNotEqualTo(String value) {
            addCriterion("major_sum <>", value, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumGreaterThan(String value) {
            addCriterion("major_sum >", value, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumGreaterThanOrEqualTo(String value) {
            addCriterion("major_sum >=", value, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumLessThan(String value) {
            addCriterion("major_sum <", value, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumLessThanOrEqualTo(String value) {
            addCriterion("major_sum <=", value, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumLike(String value) {
            addCriterion("major_sum like", value, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumNotLike(String value) {
            addCriterion("major_sum not like", value, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumIn(List<String> values) {
            addCriterion("major_sum in", values, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumNotIn(List<String> values) {
            addCriterion("major_sum not in", values, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumBetween(String value1, String value2) {
            addCriterion("major_sum between", value1, value2, "majorSum");
            return (Criteria) this;
        }

        public Criteria andMajorSumNotBetween(String value1, String value2) {
            addCriterion("major_sum not between", value1, value2, "majorSum");
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