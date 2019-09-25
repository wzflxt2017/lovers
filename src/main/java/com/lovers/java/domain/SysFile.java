package com.lovers.java.domain;

import java.util.Date;

public class SysFile {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_file.file_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer fileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_file.file_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String fileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_file.file_suffix
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String fileSuffix;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_file.file_type
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String fileType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_file.file_full_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String fileFullName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_file.for_module
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String forModule;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_file.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_file.upload_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Date uploadTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_file.file_id
     *
     * @return the value of sys_file.file_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_file.file_id
     *
     * @param fileId the value for sys_file.file_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_file.file_name
     *
     * @return the value of sys_file.file_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_file.file_name
     *
     * @param fileName the value for sys_file.file_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_file.file_suffix
     *
     * @return the value of sys_file.file_suffix
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getFileSuffix() {
        return fileSuffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_file.file_suffix
     *
     * @param fileSuffix the value for sys_file.file_suffix
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix == null ? null : fileSuffix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_file.file_type
     *
     * @return the value of sys_file.file_type
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_file.file_type
     *
     * @param fileType the value for sys_file.file_type
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_file.file_full_name
     *
     * @return the value of sys_file.file_full_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getFileFullName() {
        return fileFullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_file.file_full_name
     *
     * @param fileFullName the value for sys_file.file_full_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setFileFullName(String fileFullName) {
        this.fileFullName = fileFullName == null ? null : fileFullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_file.for_module
     *
     * @return the value of sys_file.for_module
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getForModule() {
        return forModule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_file.for_module
     *
     * @param forModule the value for sys_file.for_module
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setForModule(String forModule) {
        this.forModule = forModule == null ? null : forModule.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_file.user_id
     *
     * @return the value of sys_file.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_file.user_id
     *
     * @param userId the value for sys_file.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_file.upload_time
     *
     * @return the value of sys_file.upload_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_file.upload_time
     *
     * @param uploadTime the value for sys_file.upload_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }
}