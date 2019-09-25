package com.lovers.java.mapper;

import com.lovers.java.domain.WorkflowLink;
import com.lovers.java.domain.WorkflowLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowLinkMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    long countByExample(WorkflowLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByExample(WorkflowLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByPrimaryKey(Integer linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insert(WorkflowLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insertSelective(WorkflowLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    List<WorkflowLink> selectByExample(WorkflowLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    WorkflowLink selectByPrimaryKey(Integer linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") WorkflowLink record, @Param("example") WorkflowLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExample(@Param("record") WorkflowLink record, @Param("example") WorkflowLinkExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKeySelective(WorkflowLink record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_link
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKey(WorkflowLink record);
}