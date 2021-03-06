package com.lovers.java.mapper;

import com.lovers.java.domain.LoversIncident;
import com.lovers.java.domain.LoversIncidentExample;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface LoversIncidentMapper{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    long countByExample(LoversIncidentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByExample(LoversIncidentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByPrimaryKey(Integer incidentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insert(LoversIncident record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insertSelective(LoversIncident record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    List<LoversIncident> selectByExample(LoversIncidentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    LoversIncident selectByPrimaryKey(Integer incidentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") LoversIncident record, @Param("example") LoversIncidentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExample(@Param("record") LoversIncident record, @Param("example") LoversIncidentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKeySelective(LoversIncident record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_incident
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKey(LoversIncident record);
}