package com.miwo.model;

public class MiPic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mi_pic.mi_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    private Long miId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mi_pic.user_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mi_pic.type
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mi_pic.pic_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    private Long picId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mi_pic.thumb_up
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    private Long thumbUp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mi_pic.thumb_down
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    private Long thumbDown;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mi_pic.mi_id
     *
     * @return the value of mi_pic.mi_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public Long getMiId() {
        return miId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mi_pic.mi_id
     *
     * @param miId the value for mi_pic.mi_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public void setMiId(Long miId) {
        this.miId = miId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mi_pic.user_id
     *
     * @return the value of mi_pic.user_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mi_pic.user_id
     *
     * @param userId the value for mi_pic.user_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mi_pic.type
     *
     * @return the value of mi_pic.type
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mi_pic.type
     *
     * @param type the value for mi_pic.type
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mi_pic.pic_id
     *
     * @return the value of mi_pic.pic_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public Long getPicId() {
        return picId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mi_pic.pic_id
     *
     * @param picId the value for mi_pic.pic_id
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public void setPicId(Long picId) {
        this.picId = picId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mi_pic.thumb_up
     *
     * @return the value of mi_pic.thumb_up
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public Long getThumbUp() {
        return thumbUp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mi_pic.thumb_up
     *
     * @param thumbUp the value for mi_pic.thumb_up
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public void setThumbUp(Long thumbUp) {
        this.thumbUp = thumbUp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mi_pic.thumb_down
     *
     * @return the value of mi_pic.thumb_down
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public Long getThumbDown() {
        return thumbDown;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mi_pic.thumb_down
     *
     * @param thumbDown the value for mi_pic.thumb_down
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    public void setThumbDown(Long thumbDown) {
        this.thumbDown = thumbDown;
    }
}