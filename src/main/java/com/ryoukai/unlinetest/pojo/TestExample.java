package com.ryoukai.unlinetest.pojo;

import java.util.ArrayList;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
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

        public Criteria andTestIdIsNull() {
            addCriterion("test_id is null");
            return (Criteria) this;
        }

        public Criteria andTestIdIsNotNull() {
            addCriterion("test_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestIdEqualTo(Integer value) {
            addCriterion("test_id =", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotEqualTo(Integer value) {
            addCriterion("test_id <>", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThan(Integer value) {
            addCriterion("test_id >", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_id >=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThan(Integer value) {
            addCriterion("test_id <", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_id <=", value, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdIn(List<Integer> values) {
            addCriterion("test_id in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotIn(List<Integer> values) {
            addCriterion("test_id not in", values, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdBetween(Integer value1, Integer value2) {
            addCriterion("test_id between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_id not between", value1, value2, "testId");
            return (Criteria) this;
        }

        public Criteria andTestDescIsNull() {
            addCriterion("test_desc is null");
            return (Criteria) this;
        }

        public Criteria andTestDescIsNotNull() {
            addCriterion("test_desc is not null");
            return (Criteria) this;
        }

        public Criteria andTestDescEqualTo(String value) {
            addCriterion("test_desc =", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotEqualTo(String value) {
            addCriterion("test_desc <>", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescGreaterThan(String value) {
            addCriterion("test_desc >", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescGreaterThanOrEqualTo(String value) {
            addCriterion("test_desc >=", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLessThan(String value) {
            addCriterion("test_desc <", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLessThanOrEqualTo(String value) {
            addCriterion("test_desc <=", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLike(String value) {
            addCriterion("test_desc like", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotLike(String value) {
            addCriterion("test_desc not like", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescIn(List<String> values) {
            addCriterion("test_desc in", values, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotIn(List<String> values) {
            addCriterion("test_desc not in", values, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescBetween(String value1, String value2) {
            addCriterion("test_desc between", value1, value2, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotBetween(String value1, String value2) {
            addCriterion("test_desc not between", value1, value2, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestPathIsNull() {
            addCriterion("test_path is null");
            return (Criteria) this;
        }

        public Criteria andTestPathIsNotNull() {
            addCriterion("test_path is not null");
            return (Criteria) this;
        }

        public Criteria andTestPathEqualTo(String value) {
            addCriterion("test_path =", value, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathNotEqualTo(String value) {
            addCriterion("test_path <>", value, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathGreaterThan(String value) {
            addCriterion("test_path >", value, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathGreaterThanOrEqualTo(String value) {
            addCriterion("test_path >=", value, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathLessThan(String value) {
            addCriterion("test_path <", value, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathLessThanOrEqualTo(String value) {
            addCriterion("test_path <=", value, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathLike(String value) {
            addCriterion("test_path like", value, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathNotLike(String value) {
            addCriterion("test_path not like", value, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathIn(List<String> values) {
            addCriterion("test_path in", values, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathNotIn(List<String> values) {
            addCriterion("test_path not in", values, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathBetween(String value1, String value2) {
            addCriterion("test_path between", value1, value2, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestPathNotBetween(String value1, String value2) {
            addCriterion("test_path not between", value1, value2, "testPath");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNull() {
            addCriterion("test_type is null");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNotNull() {
            addCriterion("test_type is not null");
            return (Criteria) this;
        }

        public Criteria andTestTypeEqualTo(String value) {
            addCriterion("test_type =", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotEqualTo(String value) {
            addCriterion("test_type <>", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThan(String value) {
            addCriterion("test_type >", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("test_type >=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThan(String value) {
            addCriterion("test_type <", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThanOrEqualTo(String value) {
            addCriterion("test_type <=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLike(String value) {
            addCriterion("test_type like", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotLike(String value) {
            addCriterion("test_type not like", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeIn(List<String> values) {
            addCriterion("test_type in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotIn(List<String> values) {
            addCriterion("test_type not in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeBetween(String value1, String value2) {
            addCriterion("test_type between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotBetween(String value1, String value2) {
            addCriterion("test_type not between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andUploaderIdIsNull() {
            addCriterion("uploader_id is null");
            return (Criteria) this;
        }

        public Criteria andUploaderIdIsNotNull() {
            addCriterion("uploader_id is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderIdEqualTo(String value) {
            addCriterion("uploader_id =", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdNotEqualTo(String value) {
            addCriterion("uploader_id <>", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdGreaterThan(String value) {
            addCriterion("uploader_id >", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("uploader_id >=", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdLessThan(String value) {
            addCriterion("uploader_id <", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdLessThanOrEqualTo(String value) {
            addCriterion("uploader_id <=", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdLike(String value) {
            addCriterion("uploader_id like", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdNotLike(String value) {
            addCriterion("uploader_id not like", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdIn(List<String> values) {
            addCriterion("uploader_id in", values, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdNotIn(List<String> values) {
            addCriterion("uploader_id not in", values, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdBetween(String value1, String value2) {
            addCriterion("uploader_id between", value1, value2, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdNotBetween(String value1, String value2) {
            addCriterion("uploader_id not between", value1, value2, "uploaderId");
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