package com.lovers.java.domain;

import java.util.Date;

public class LoversIncident {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.incident_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer incidentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.incident_title
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String incidentTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.incident_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String incidentContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.incident_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Date incidentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.incident_create_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Date incidentCreateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.user_id_man
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer userIdMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.user_id_woman
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer userIdWoman;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.user_id_create
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer userIdCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lovers_incident.incident_images
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String incidentImages;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.incident_id
     *
     * @return the value of lovers_incident.incident_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getIncidentId() {
        return incidentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.incident_id
     *
     * @param incidentId the value for lovers_incident.incident_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setIncidentId(Integer incidentId) {
        this.incidentId = incidentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.incident_title
     *
     * @return the value of lovers_incident.incident_title
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getIncidentTitle() {
        return incidentTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.incident_title
     *
     * @param incidentTitle the value for lovers_incident.incident_title
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setIncidentTitle(String incidentTitle) {
        this.incidentTitle = incidentTitle == null ? null : incidentTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.incident_content
     *
     * @return the value of lovers_incident.incident_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getIncidentContent() {
        return incidentContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.incident_content
     *
     * @param incidentContent the value for lovers_incident.incident_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setIncidentContent(String incidentContent) {
        this.incidentContent = incidentContent == null ? null : incidentContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.incident_time
     *
     * @return the value of lovers_incident.incident_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Date getIncidentTime() {
        return incidentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.incident_time
     *
     * @param incidentTime the value for lovers_incident.incident_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setIncidentTime(Date incidentTime) {
        this.incidentTime = incidentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.incident_create_time
     *
     * @return the value of lovers_incident.incident_create_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Date getIncidentCreateTime() {
        return incidentCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.incident_create_time
     *
     * @param incidentCreateTime the value for lovers_incident.incident_create_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setIncidentCreateTime(Date incidentCreateTime) {
        this.incidentCreateTime = incidentCreateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.user_id_man
     *
     * @return the value of lovers_incident.user_id_man
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getUserIdMan() {
        return userIdMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.user_id_man
     *
     * @param userIdMan the value for lovers_incident.user_id_man
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setUserIdMan(Integer userIdMan) {
        this.userIdMan = userIdMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.user_id_woman
     *
     * @return the value of lovers_incident.user_id_woman
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getUserIdWoman() {
        return userIdWoman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.user_id_woman
     *
     * @param userIdWoman the value for lovers_incident.user_id_woman
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setUserIdWoman(Integer userIdWoman) {
        this.userIdWoman = userIdWoman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.user_id_create
     *
     * @return the value of lovers_incident.user_id_create
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getUserIdCreate() {
        return userIdCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.user_id_create
     *
     * @param userIdCreate the value for lovers_incident.user_id_create
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setUserIdCreate(Integer userIdCreate) {
        this.userIdCreate = userIdCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lovers_incident.incident_images
     *
     * @return the value of lovers_incident.incident_images
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getIncidentImages() {
        return incidentImages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lovers_incident.incident_images
     *
     * @param incidentImages the value for lovers_incident.incident_images
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setIncidentImages(String incidentImages) {
        this.incidentImages = incidentImages == null ? null : incidentImages.trim();
    }
}