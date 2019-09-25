package com.lovers.java.mapper;

import com.lovers.java.domain.LoversActionWorkflow;
import com.lovers.java.domain.LoversActionWorkflowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoversActionWorkflowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    long countByExample(LoversActionWorkflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByExample(LoversActionWorkflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByPrimaryKey(Integer actionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insert(LoversActionWorkflow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insertSelective(LoversActionWorkflow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    List<LoversActionWorkflow> selectByExample(LoversActionWorkflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    LoversActionWorkflow selectByPrimaryKey(Integer actionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") LoversActionWorkflow record, @Param("example") LoversActionWorkflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExample(@Param("record") LoversActionWorkflow record, @Param("example") LoversActionWorkflowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKeySelective(LoversActionWorkflow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lovers_action_workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKey(LoversActionWorkflow record);
}