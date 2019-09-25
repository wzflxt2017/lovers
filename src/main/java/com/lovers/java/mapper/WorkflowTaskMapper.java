package com.lovers.java.mapper;

import com.lovers.java.domain.WorkflowTask;
import com.lovers.java.domain.WorkflowTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkflowTaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    long countByExample(WorkflowTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByExample(WorkflowTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insert(WorkflowTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insertSelective(WorkflowTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    List<WorkflowTask> selectByExample(WorkflowTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    WorkflowTask selectByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") WorkflowTask record, @Param("example") WorkflowTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExample(@Param("record") WorkflowTask record, @Param("example") WorkflowTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKeySelective(WorkflowTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow_task
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKey(WorkflowTask record);
}