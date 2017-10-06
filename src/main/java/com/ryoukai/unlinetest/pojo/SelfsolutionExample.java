package com.ryoukai.unlinetest.pojo;

import java.util.ArrayList;
import java.util.List;

public class SelfsolutionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SelfsolutionExample() {
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

        public Criteria andSelfsolutionIdIsNull() {
            addCriterion("selfsolution_id is null");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdIsNotNull() {
            addCriterion("selfsolution_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdEqualTo(Integer value) {
            addCriterion("selfsolution_id =", value, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdNotEqualTo(Integer value) {
            addCriterion("selfsolution_id <>", value, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdGreaterThan(Integer value) {
            addCriterion("selfsolution_id >", value, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("selfsolution_id >=", value, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdLessThan(Integer value) {
            addCriterion("selfsolution_id <", value, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdLessThanOrEqualTo(Integer value) {
            addCriterion("selfsolution_id <=", value, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdIn(List<Integer> values) {
            addCriterion("selfsolution_id in", values, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdNotIn(List<Integer> values) {
            addCriterion("selfsolution_id not in", values, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdBetween(Integer value1, Integer value2) {
            addCriterion("selfsolution_id between", value1, value2, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("selfsolution_id not between", value1, value2, "selfsolutionId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdIsNull() {
            addCriterion("selftest_id is null");
            return (Criteria) this;
        }

        public Criteria andSelftestIdIsNotNull() {
            addCriterion("selftest_id is not null");
            return (Criteria) this;
        }

        public Criteria andSelftestIdEqualTo(Integer value) {
            addCriterion("selftest_id =", value, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdNotEqualTo(Integer value) {
            addCriterion("selftest_id <>", value, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdGreaterThan(Integer value) {
            addCriterion("selftest_id >", value, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("selftest_id >=", value, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdLessThan(Integer value) {
            addCriterion("selftest_id <", value, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdLessThanOrEqualTo(Integer value) {
            addCriterion("selftest_id <=", value, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdIn(List<Integer> values) {
            addCriterion("selftest_id in", values, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdNotIn(List<Integer> values) {
            addCriterion("selftest_id not in", values, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdBetween(Integer value1, Integer value2) {
            addCriterion("selftest_id between", value1, value2, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelftestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("selftest_id not between", value1, value2, "selftestId");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathIsNull() {
            addCriterion("selfsolution_path is null");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathIsNotNull() {
            addCriterion("selfsolution_path is not null");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathEqualTo(String value) {
            addCriterion("selfsolution_path =", value, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathNotEqualTo(String value) {
            addCriterion("selfsolution_path <>", value, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathGreaterThan(String value) {
            addCriterion("selfsolution_path >", value, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathGreaterThanOrEqualTo(String value) {
            addCriterion("selfsolution_path >=", value, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathLessThan(String value) {
            addCriterion("selfsolution_path <", value, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathLessThanOrEqualTo(String value) {
            addCriterion("selfsolution_path <=", value, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathLike(String value) {
            addCriterion("selfsolution_path like", value, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathNotLike(String value) {
            addCriterion("selfsolution_path not like", value, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathIn(List<String> values) {
            addCriterion("selfsolution_path in", values, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathNotIn(List<String> values) {
            addCriterion("selfsolution_path not in", values, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathBetween(String value1, String value2) {
            addCriterion("selfsolution_path between", value1, value2, "selfsolutionPath");
            return (Criteria) this;
        }

        public Criteria andSelfsolutionPathNotBetween(String value1, String value2) {
            addCriterion("selfsolution_path not between", value1, value2, "selfsolutionPath");
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