package com.myframework.code.entity;

import java.util.ArrayList;
import java.util.List;

public class TbLayerOneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLayerOneExample() {
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

        public Criteria andLayerOneIdIsNull() {
            addCriterion("layer_one_id is null");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdIsNotNull() {
            addCriterion("layer_one_id is not null");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdEqualTo(String value) {
            addCriterion("layer_one_id =", value, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdNotEqualTo(String value) {
            addCriterion("layer_one_id <>", value, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdGreaterThan(String value) {
            addCriterion("layer_one_id >", value, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdGreaterThanOrEqualTo(String value) {
            addCriterion("layer_one_id >=", value, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdLessThan(String value) {
            addCriterion("layer_one_id <", value, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdLessThanOrEqualTo(String value) {
            addCriterion("layer_one_id <=", value, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdLike(String value) {
            addCriterion("layer_one_id like", value, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdNotLike(String value) {
            addCriterion("layer_one_id not like", value, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdIn(List<String> values) {
            addCriterion("layer_one_id in", values, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdNotIn(List<String> values) {
            addCriterion("layer_one_id not in", values, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdBetween(String value1, String value2) {
            addCriterion("layer_one_id between", value1, value2, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneIdNotBetween(String value1, String value2) {
            addCriterion("layer_one_id not between", value1, value2, "layerOneId");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameIsNull() {
            addCriterion("layer_one_name is null");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameIsNotNull() {
            addCriterion("layer_one_name is not null");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameEqualTo(String value) {
            addCriterion("layer_one_name =", value, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameNotEqualTo(String value) {
            addCriterion("layer_one_name <>", value, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameGreaterThan(String value) {
            addCriterion("layer_one_name >", value, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameGreaterThanOrEqualTo(String value) {
            addCriterion("layer_one_name >=", value, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameLessThan(String value) {
            addCriterion("layer_one_name <", value, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameLessThanOrEqualTo(String value) {
            addCriterion("layer_one_name <=", value, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameLike(String value) {
            addCriterion("layer_one_name like", value, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameNotLike(String value) {
            addCriterion("layer_one_name not like", value, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameIn(List<String> values) {
            addCriterion("layer_one_name in", values, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameNotIn(List<String> values) {
            addCriterion("layer_one_name not in", values, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameBetween(String value1, String value2) {
            addCriterion("layer_one_name between", value1, value2, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneNameNotBetween(String value1, String value2) {
            addCriterion("layer_one_name not between", value1, value2, "layerOneName");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentIsNull() {
            addCriterion("layer_one_other_content is null");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentIsNotNull() {
            addCriterion("layer_one_other_content is not null");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentEqualTo(String value) {
            addCriterion("layer_one_other_content =", value, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentNotEqualTo(String value) {
            addCriterion("layer_one_other_content <>", value, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentGreaterThan(String value) {
            addCriterion("layer_one_other_content >", value, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentGreaterThanOrEqualTo(String value) {
            addCriterion("layer_one_other_content >=", value, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentLessThan(String value) {
            addCriterion("layer_one_other_content <", value, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentLessThanOrEqualTo(String value) {
            addCriterion("layer_one_other_content <=", value, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentLike(String value) {
            addCriterion("layer_one_other_content like", value, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentNotLike(String value) {
            addCriterion("layer_one_other_content not like", value, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentIn(List<String> values) {
            addCriterion("layer_one_other_content in", values, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentNotIn(List<String> values) {
            addCriterion("layer_one_other_content not in", values, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentBetween(String value1, String value2) {
            addCriterion("layer_one_other_content between", value1, value2, "layerOneOtherContent");
            return (Criteria) this;
        }

        public Criteria andLayerOneOtherContentNotBetween(String value1, String value2) {
            addCriterion("layer_one_other_content not between", value1, value2, "layerOneOtherContent");
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