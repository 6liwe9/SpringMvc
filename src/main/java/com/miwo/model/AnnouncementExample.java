package com.miwo.model;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public AnnouncementExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
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
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
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

        public Criteria andAnnounceIdIsNull() {
            addCriterion("announce_id is null");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdIsNotNull() {
            addCriterion("announce_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdEqualTo(Long value) {
            addCriterion("announce_id =", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdNotEqualTo(Long value) {
            addCriterion("announce_id <>", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdGreaterThan(Long value) {
            addCriterion("announce_id >", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("announce_id >=", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdLessThan(Long value) {
            addCriterion("announce_id <", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdLessThanOrEqualTo(Long value) {
            addCriterion("announce_id <=", value, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdIn(List<Long> values) {
            addCriterion("announce_id in", values, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdNotIn(List<Long> values) {
            addCriterion("announce_id not in", values, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdBetween(Long value1, Long value2) {
            addCriterion("announce_id between", value1, value2, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceIdNotBetween(Long value1, Long value2) {
            addCriterion("announce_id not between", value1, value2, "announceId");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextIsNull() {
            addCriterion("announce_text is null");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextIsNotNull() {
            addCriterion("announce_text is not null");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextEqualTo(String value) {
            addCriterion("announce_text =", value, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextNotEqualTo(String value) {
            addCriterion("announce_text <>", value, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextGreaterThan(String value) {
            addCriterion("announce_text >", value, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextGreaterThanOrEqualTo(String value) {
            addCriterion("announce_text >=", value, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextLessThan(String value) {
            addCriterion("announce_text <", value, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextLessThanOrEqualTo(String value) {
            addCriterion("announce_text <=", value, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextLike(String value) {
            addCriterion("announce_text like", value, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextNotLike(String value) {
            addCriterion("announce_text not like", value, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextIn(List<String> values) {
            addCriterion("announce_text in", values, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextNotIn(List<String> values) {
            addCriterion("announce_text not in", values, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextBetween(String value1, String value2) {
            addCriterion("announce_text between", value1, value2, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceTextNotBetween(String value1, String value2) {
            addCriterion("announce_text not between", value1, value2, "announceText");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverIsNull() {
            addCriterion("announce_cover is null");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverIsNotNull() {
            addCriterion("announce_cover is not null");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverEqualTo(Long value) {
            addCriterion("announce_cover =", value, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverNotEqualTo(Long value) {
            addCriterion("announce_cover <>", value, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverGreaterThan(Long value) {
            addCriterion("announce_cover >", value, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverGreaterThanOrEqualTo(Long value) {
            addCriterion("announce_cover >=", value, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverLessThan(Long value) {
            addCriterion("announce_cover <", value, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverLessThanOrEqualTo(Long value) {
            addCriterion("announce_cover <=", value, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverIn(List<Long> values) {
            addCriterion("announce_cover in", values, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverNotIn(List<Long> values) {
            addCriterion("announce_cover not in", values, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverBetween(Long value1, Long value2) {
            addCriterion("announce_cover between", value1, value2, "announceCover");
            return (Criteria) this;
        }

        public Criteria andAnnounceCoverNotBetween(Long value1, Long value2) {
            addCriterion("announce_cover not between", value1, value2, "announceCover");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticleIdIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticleIdEqualTo(Long value) {
            addCriterion("article_id =", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotEqualTo(Long value) {
            addCriterion("article_id <>", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThan(Long value) {
            addCriterion("article_id >", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("article_id >=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThan(Long value) {
            addCriterion("article_id <", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdLessThanOrEqualTo(Long value) {
            addCriterion("article_id <=", value, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdIn(List<Long> values) {
            addCriterion("article_id in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotIn(List<Long> values) {
            addCriterion("article_id not in", values, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdBetween(Long value1, Long value2) {
            addCriterion("article_id between", value1, value2, "articleId");
            return (Criteria) this;
        }

        public Criteria andArticleIdNotBetween(Long value1, Long value2) {
            addCriterion("article_id not between", value1, value2, "articleId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table announcement
     *
     * @mbg.generated do_not_delete_during_merge Thu May 03 17:03:27 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table announcement
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
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