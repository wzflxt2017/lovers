package com.lovers.java.domain;

import com.lovers.base.domain.BaseDomain;

import java.util.Date;

public class UserMoodRecord implements BaseDomain<Integer> {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.record_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer recordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.record_title
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String recordTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.record_images
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String recordImages;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.record_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String recordContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.create_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.is_hidden
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer isHidden;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.visitor_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer visitorNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.comment_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer commentNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_mood_record.approver_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer approverNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.record_id
     *
     * @return the value of user_mood_record.record_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.record_id
     *
     * @param recordId the value for user_mood_record.record_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.record_title
     *
     * @return the value of user_mood_record.record_title
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getRecordTitle() {
        return recordTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.record_title
     *
     * @param recordTitle the value for user_mood_record.record_title
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setRecordTitle(String recordTitle) {
        this.recordTitle = recordTitle == null ? null : recordTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.record_images
     *
     * @return the value of user_mood_record.record_images
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getRecordImages() {
        return recordImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.record_images
     *
     * @param recordImages the value for user_mood_record.record_images
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setRecordImages(String recordImages) {
        this.recordImages = recordImages == null ? null : recordImages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.record_content
     *
     * @return the value of user_mood_record.record_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getRecordContent() {
        return recordContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.record_content
     *
     * @param recordContent the value for user_mood_record.record_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setRecordContent(String recordContent) {
        this.recordContent = recordContent == null ? null : recordContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.user_id
     *
     * @return the value of user_mood_record.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.user_id
     *
     * @param userId the value for user_mood_record.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.create_time
     *
     * @return the value of user_mood_record.create_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.create_time
     *
     * @param createTime the value for user_mood_record.create_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.is_hidden
     *
     * @return the value of user_mood_record.is_hidden
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getIsHidden() {
        return isHidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.is_hidden
     *
     * @param isHidden the value for user_mood_record.is_hidden
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setIsHidden(Integer isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.visitor_number
     *
     * @return the value of user_mood_record.visitor_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getVisitorNumber() {
        return visitorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.visitor_number
     *
     * @param visitorNumber the value for user_mood_record.visitor_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setVisitorNumber(Integer visitorNumber) {
        this.visitorNumber = visitorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.comment_number
     *
     * @return the value of user_mood_record.comment_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getCommentNumber() {
        return commentNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.comment_number
     *
     * @param commentNumber the value for user_mood_record.comment_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_mood_record.approver_number
     *
     * @return the value of user_mood_record.approver_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getApproverNumber() {
        return approverNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_mood_record.approver_number
     *
     * @param approverNumber the value for user_mood_record.approver_number
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setApproverNumber(Integer approverNumber) {
        this.approverNumber = approverNumber;
    }

    @Override
    public Integer getId() {
        return recordId;
    }

    @Override
    public void setId(Integer id) {
        this.recordId=id;
    }
}