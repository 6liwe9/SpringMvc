package com.miwo.model;

public class Inherit {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inherit.id
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inherit.father_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    private String fatherType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inherit.mother_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    private String motherType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inherit.child_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    private String childType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inherit.user_id
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inherit.id
     *
     * @return the value of inherit.id
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inherit.id
     *
     * @param id the value for inherit.id
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inherit.father_type
     *
     * @return the value of inherit.father_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public String getFatherType() {
        return fatherType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inherit.father_type
     *
     * @param fatherType the value for inherit.father_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public void setFatherType(String fatherType) {
        this.fatherType = fatherType == null ? null : fatherType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inherit.mother_type
     *
     * @return the value of inherit.mother_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public String getMotherType() {
        return motherType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inherit.mother_type
     *
     * @param motherType the value for inherit.mother_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public void setMotherType(String motherType) {
        this.motherType = motherType == null ? null : motherType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inherit.child_type
     *
     * @return the value of inherit.child_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public String getChildType() {
        return childType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inherit.child_type
     *
     * @param childType the value for inherit.child_type
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public void setChildType(String childType) {
        this.childType = childType == null ? null : childType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inherit.user_id
     *
     * @return the value of inherit.user_id
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inherit.user_id
     *
     * @param userId the value for inherit.user_id
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}