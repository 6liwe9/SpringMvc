package com.miwo.model;

import java.util.Date;

public class Advice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column advice.advice_id
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    private Long adviceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column advice.advice_content
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    private String adviceContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column advice.user_id
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column advice.add_date
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    private Date addDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column advice.advice_id
     *
     * @return the value of advice.advice_id
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public Long getAdviceId() {
        return adviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column advice.advice_id
     *
     * @param adviceId the value for advice.advice_id
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public void setAdviceId(Long adviceId) {
        this.adviceId = adviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column advice.advice_content
     *
     * @return the value of advice.advice_content
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public String getAdviceContent() {
        return adviceContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column advice.advice_content
     *
     * @param adviceContent the value for advice.advice_content
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public void setAdviceContent(String adviceContent) {
        this.adviceContent = adviceContent == null ? null : adviceContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column advice.user_id
     *
     * @return the value of advice.user_id
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column advice.user_id
     *
     * @param userId the value for advice.user_id
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column advice.add_date
     *
     * @return the value of advice.add_date
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public Date getAddDate() {
        return addDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column advice.add_date
     *
     * @param addDate the value for advice.add_date
     *
     * @mbg.generated Thu May 03 13:55:30 CST 2018
     */
    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
}