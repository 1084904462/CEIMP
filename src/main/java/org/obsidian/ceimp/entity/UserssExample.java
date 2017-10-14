package org.obsidian.ceimp.entity;

import java.util.ArrayList;
import java.util.List;

public class UserssExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserssExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(String value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(String value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(String value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(String value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(String value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(String value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLike(String value) {
            addCriterion("class_id like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotLike(String value) {
            addCriterion("class_id not like", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<String> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<String> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(String value1, String value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(String value1, String value2) {
            addCriterion("class_id not between", value1, value2, "classId");
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

        public Criteria andCharacterIsNull() {
            addCriterion("character is null");
            return (Criteria) this;
        }

        public Criteria andCharacterIsNotNull() {
            addCriterion("character is not null");
            return (Criteria) this;
        }

        public Criteria andCharacterEqualTo(String value) {
            addCriterion("character =", value, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterNotEqualTo(String value) {
            addCriterion("character <>", value, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterGreaterThan(String value) {
            addCriterion("character >", value, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("character >=", value, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterLessThan(String value) {
            addCriterion("character <", value, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterLessThanOrEqualTo(String value) {
            addCriterion("character <=", value, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterLike(String value) {
            addCriterion("character like", value, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterNotLike(String value) {
            addCriterion("character not like", value, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterIn(List<String> values) {
            addCriterion("character in", values, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterNotIn(List<String> values) {
            addCriterion("character not in", values, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterBetween(String value1, String value2) {
            addCriterion("character between", value1, value2, "character");
            return (Criteria) this;
        }

        public Criteria andCharacterNotBetween(String value1, String value2) {
            addCriterion("character not between", value1, value2, "character");
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

        public Criteria andAllIsNull() {
            addCriterion("all is null");
            return (Criteria) this;
        }

        public Criteria andAllIsNotNull() {
            addCriterion("all is not null");
            return (Criteria) this;
        }

        public Criteria andAllEqualTo(String value) {
            addCriterion("all =", value, "all");
            return (Criteria) this;
        }

        public Criteria andAllNotEqualTo(String value) {
            addCriterion("all <>", value, "all");
            return (Criteria) this;
        }

        public Criteria andAllGreaterThan(String value) {
            addCriterion("all >", value, "all");
            return (Criteria) this;
        }

        public Criteria andAllGreaterThanOrEqualTo(String value) {
            addCriterion("all >=", value, "all");
            return (Criteria) this;
        }

        public Criteria andAllLessThan(String value) {
            addCriterion("all <", value, "all");
            return (Criteria) this;
        }

        public Criteria andAllLessThanOrEqualTo(String value) {
            addCriterion("all <=", value, "all");
            return (Criteria) this;
        }

        public Criteria andAllLike(String value) {
            addCriterion("all like", value, "all");
            return (Criteria) this;
        }

        public Criteria andAllNotLike(String value) {
            addCriterion("all not like", value, "all");
            return (Criteria) this;
        }

        public Criteria andAllIn(List<String> values) {
            addCriterion("all in", values, "all");
            return (Criteria) this;
        }

        public Criteria andAllNotIn(List<String> values) {
            addCriterion("all not in", values, "all");
            return (Criteria) this;
        }

        public Criteria andAllBetween(String value1, String value2) {
            addCriterion("all between", value1, value2, "all");
            return (Criteria) this;
        }

        public Criteria andAllNotBetween(String value1, String value2) {
            addCriterion("all not between", value1, value2, "all");
            return (Criteria) this;
        }

        public Criteria andGpIsNull() {
            addCriterion("gp is null");
            return (Criteria) this;
        }

        public Criteria andGpIsNotNull() {
            addCriterion("gp is not null");
            return (Criteria) this;
        }

        public Criteria andGpEqualTo(String value) {
            addCriterion("gp =", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotEqualTo(String value) {
            addCriterion("gp <>", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpGreaterThan(String value) {
            addCriterion("gp >", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpGreaterThanOrEqualTo(String value) {
            addCriterion("gp >=", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpLessThan(String value) {
            addCriterion("gp <", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpLessThanOrEqualTo(String value) {
            addCriterion("gp <=", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpLike(String value) {
            addCriterion("gp like", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotLike(String value) {
            addCriterion("gp not like", value, "gp");
            return (Criteria) this;
        }

        public Criteria andGpIn(List<String> values) {
            addCriterion("gp in", values, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotIn(List<String> values) {
            addCriterion("gp not in", values, "gp");
            return (Criteria) this;
        }

        public Criteria andGpBetween(String value1, String value2) {
            addCriterion("gp between", value1, value2, "gp");
            return (Criteria) this;
        }

        public Criteria andGpNotBetween(String value1, String value2) {
            addCriterion("gp not between", value1, value2, "gp");
            return (Criteria) this;
        }

        public Criteria andCeIsNull() {
            addCriterion("ce is null");
            return (Criteria) this;
        }

        public Criteria andCeIsNotNull() {
            addCriterion("ce is not null");
            return (Criteria) this;
        }

        public Criteria andCeEqualTo(String value) {
            addCriterion("ce =", value, "ce");
            return (Criteria) this;
        }

        public Criteria andCeNotEqualTo(String value) {
            addCriterion("ce <>", value, "ce");
            return (Criteria) this;
        }

        public Criteria andCeGreaterThan(String value) {
            addCriterion("ce >", value, "ce");
            return (Criteria) this;
        }

        public Criteria andCeGreaterThanOrEqualTo(String value) {
            addCriterion("ce >=", value, "ce");
            return (Criteria) this;
        }

        public Criteria andCeLessThan(String value) {
            addCriterion("ce <", value, "ce");
            return (Criteria) this;
        }

        public Criteria andCeLessThanOrEqualTo(String value) {
            addCriterion("ce <=", value, "ce");
            return (Criteria) this;
        }

        public Criteria andCeLike(String value) {
            addCriterion("ce like", value, "ce");
            return (Criteria) this;
        }

        public Criteria andCeNotLike(String value) {
            addCriterion("ce not like", value, "ce");
            return (Criteria) this;
        }

        public Criteria andCeIn(List<String> values) {
            addCriterion("ce in", values, "ce");
            return (Criteria) this;
        }

        public Criteria andCeNotIn(List<String> values) {
            addCriterion("ce not in", values, "ce");
            return (Criteria) this;
        }

        public Criteria andCeBetween(String value1, String value2) {
            addCriterion("ce between", value1, value2, "ce");
            return (Criteria) this;
        }

        public Criteria andCeNotBetween(String value1, String value2) {
            addCriterion("ce not between", value1, value2, "ce");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("birth is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("birth is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(String value) {
            addCriterion("birth =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(String value) {
            addCriterion("birth <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(String value) {
            addCriterion("birth >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(String value) {
            addCriterion("birth >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(String value) {
            addCriterion("birth <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(String value) {
            addCriterion("birth <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLike(String value) {
            addCriterion("birth like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotLike(String value) {
            addCriterion("birth not like", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<String> values) {
            addCriterion("birth in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<String> values) {
            addCriterion("birth not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(String value1, String value2) {
            addCriterion("birth between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(String value1, String value2) {
            addCriterion("birth not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andEntranceIsNull() {
            addCriterion("entrance is null");
            return (Criteria) this;
        }

        public Criteria andEntranceIsNotNull() {
            addCriterion("entrance is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceEqualTo(String value) {
            addCriterion("entrance =", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceNotEqualTo(String value) {
            addCriterion("entrance <>", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceGreaterThan(String value) {
            addCriterion("entrance >", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceGreaterThanOrEqualTo(String value) {
            addCriterion("entrance >=", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceLessThan(String value) {
            addCriterion("entrance <", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceLessThanOrEqualTo(String value) {
            addCriterion("entrance <=", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceLike(String value) {
            addCriterion("entrance like", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceNotLike(String value) {
            addCriterion("entrance not like", value, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceIn(List<String> values) {
            addCriterion("entrance in", values, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceNotIn(List<String> values) {
            addCriterion("entrance not in", values, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceBetween(String value1, String value2) {
            addCriterion("entrance between", value1, value2, "entrance");
            return (Criteria) this;
        }

        public Criteria andEntranceNotBetween(String value1, String value2) {
            addCriterion("entrance not between", value1, value2, "entrance");
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

        public Criteria andIdentityIsNull() {
            addCriterion("identity is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("identity is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("identity =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("identity <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("identity >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("identity >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("identity <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("identity <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("identity like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("identity not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("identity in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("identity not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("identity between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("identity not between", value1, value2, "identity");
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

        public Criteria andSubSumIsNull() {
            addCriterion("sub_sum is null");
            return (Criteria) this;
        }

        public Criteria andSubSumIsNotNull() {
            addCriterion("sub_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSubSumEqualTo(String value) {
            addCriterion("sub_sum =", value, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumNotEqualTo(String value) {
            addCriterion("sub_sum <>", value, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumGreaterThan(String value) {
            addCriterion("sub_sum >", value, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumGreaterThanOrEqualTo(String value) {
            addCriterion("sub_sum >=", value, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumLessThan(String value) {
            addCriterion("sub_sum <", value, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumLessThanOrEqualTo(String value) {
            addCriterion("sub_sum <=", value, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumLike(String value) {
            addCriterion("sub_sum like", value, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumNotLike(String value) {
            addCriterion("sub_sum not like", value, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumIn(List<String> values) {
            addCriterion("sub_sum in", values, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumNotIn(List<String> values) {
            addCriterion("sub_sum not in", values, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumBetween(String value1, String value2) {
            addCriterion("sub_sum between", value1, value2, "subSum");
            return (Criteria) this;
        }

        public Criteria andSubSumNotBetween(String value1, String value2) {
            addCriterion("sub_sum not between", value1, value2, "subSum");
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