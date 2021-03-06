package com.miwo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdviceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public AdviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
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

        public Criteria andAdviceIdIsNull() {
            addCriterion("advice_id is null");
            return (Criteria) this;
        }

        public Criteria andAdviceIdIsNotNull() {
            addCriterion("advice_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceIdEqualTo(Long value) {
            addCriterion("advice_id =", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdNotEqualTo(Long value) {
            addCriterion("advice_id <>", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdGreaterThan(Long value) {
            addCriterion("advice_id >", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("advice_id >=", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdLessThan(Long value) {
            addCriterion("advice_id <", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdLessThanOrEqualTo(Long value) {
            addCriterion("advice_id <=", value, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdIn(List<Long> values) {
            addCriterion("advice_id in", values, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdNotIn(List<Long> values) {
            addCriterion("advice_id not in", values, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdBetween(Long value1, Long value2) {
            addCriterion("advice_id between", value1, value2, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceIdNotBetween(Long value1, Long value2) {
            addCriterion("advice_id not between", value1, value2, "adviceId");
            return (Criteria) this;
        }

        public Criteria andAdviceContentIsNull() {
            addCriterion("advice_content is null");
            return (Criteria) this;
        }

        public Criteria andAdviceContentIsNotNull() {
            addCriterion("advice_content is not null");
            return (Criteria) this;
        }

        public Criteria andAdviceContentEqualTo(String value) {
            addCriterion("advice_content =", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentNotEqualTo(String value) {
            addCriterion("advice_content <>", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentGreaterThan(String value) {
            addCriterion("advice_content >", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentGreaterThanOrEqualTo(String value) {
            addCriterion("advice_content >=", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentLessThan(String value) {
            addCriterion("advice_content <", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentLessThanOrEqualTo(String value) {
            addCriterion("advice_content <=", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentLike(String value) {
            addCriterion("advice_content like", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentNotLike(String value) {
            addCriterion("advice_content not like", value, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentIn(List<String> values) {
            addCriterion("advice_content in", values, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentNotIn(List<String> values) {
            addCriterion("advice_content not in", values, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentBetween(String value1, String value2) {
            addCriterion("advice_content between", value1, value2, "adviceContent");
            return (Criteria) this;
        }

        public Criteria andAdviceContentNotBetween(String value1, String value2) {
            addCriterion("advice_content not between", value1, value2, "adviceContent");
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

        public Criteria andAddDateIsNull() {
            addCriterion("add_date is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("add_date is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterion("add_date =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterion("add_date <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterion("add_date >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterion("add_date >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterion("add_date <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterion("add_date <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterion("add_date in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterion("add_date not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterion("add_date between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterion("add_date not between", value1, value2, "addDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table advice
     *
     * @mbg.generated do_not_delete_during_merge Thu May 03 13:55:30 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table advice
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
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