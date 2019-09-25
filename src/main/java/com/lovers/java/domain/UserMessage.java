package com.lovers.java.domain;

import java.util.Date;

public class UserMessage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer messageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.sender_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer senderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.receiver_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer receiverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_type
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String messageType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String messageContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.is_read
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer isRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_file_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String messageFileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_file_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer messageFileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Date messageTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.message_id
     *
     * @return the value of user_message.message_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.message_id
     *
     * @param messageId the value for user_message.message_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.sender_id
     *
     * @return the value of user_message.sender_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getSenderId() {
        return senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.sender_id
     *
     * @param senderId the value for user_message.sender_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.receiver_id
     *
     * @return the value of user_message.receiver_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getReceiverId() {
        return receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.receiver_id
     *
     * @param receiverId the value for user_message.receiver_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setReceiverId(Integer receiverId) {
        this.receiverId = receiverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.message_type
     *
     * @return the value of user_message.message_type
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.message_type
     *
     * @param messageType the value for user_message.message_type
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType == null ? null : messageType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.message_content
     *
     * @return the value of user_message.message_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.message_content
     *
     * @param messageContent the value for user_message.message_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent == null ? null : messageContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.is_read
     *
     * @return the value of user_message.is_read
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getIsRead() {
        return isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.is_read
     *
     * @param isRead the value for user_message.is_read
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.message_file_name
     *
     * @return the value of user_message.message_file_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getMessageFileName() {
        return messageFileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.message_file_name
     *
     * @param messageFileName the value for user_message.message_file_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setMessageFileName(String messageFileName) {
        this.messageFileName = messageFileName == null ? null : messageFileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.message_file_id
     *
     * @return the value of user_message.message_file_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getMessageFileId() {
        return messageFileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.message_file_id
     *
     * @param messageFileId the value for user_message.message_file_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setMessageFileId(Integer messageFileId) {
        this.messageFileId = messageFileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_message.message_time
     *
     * @return the value of user_message.message_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Date getMessageTime() {
        return messageTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_message.message_time
     *
     * @param messageTime the value for user_message.message_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }
}