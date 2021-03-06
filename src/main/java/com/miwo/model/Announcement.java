package com.miwo.model;

public class Announcement {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.announce_id
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    private Long announceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.announce_text
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    private String announceText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.announce_cover
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    private Long announceCover;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column announcement.article_id
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    private Long articleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.announce_id
     *
     * @return the value of announcement.announce_id
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public Long getAnnounceId() {
        return announceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.announce_id
     *
     * @param announceId the value for announcement.announce_id
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public void setAnnounceId(Long announceId) {
        this.announceId = announceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.announce_text
     *
     * @return the value of announcement.announce_text
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public String getAnnounceText() {
        return announceText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.announce_text
     *
     * @param announceText the value for announcement.announce_text
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public void setAnnounceText(String announceText) {
        this.announceText = announceText == null ? null : announceText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.announce_cover
     *
     * @return the value of announcement.announce_cover
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public Long getAnnounceCover() {
        return announceCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.announce_cover
     *
     * @param announceCover the value for announcement.announce_cover
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public void setAnnounceCover(Long announceCover) {
        this.announceCover = announceCover;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column announcement.article_id
     *
     * @return the value of announcement.article_id
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column announcement.article_id
     *
     * @param articleId the value for announcement.article_id
     *
     * @mbg.generated Thu May 03 17:03:27 CST 2018
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }
}