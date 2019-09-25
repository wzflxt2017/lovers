package com.lovers.java.domain;

import java.util.ArrayList;
import java.util.List;

public class WorkflowExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public WorkflowExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andWorkflowIdIsNull() {
            addCriterion("workflow_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdIsNotNull() {
            addCriterion("workflow_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdEqualTo(Integer value) {
            addCriterion("workflow_id =", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotEqualTo(Integer value) {
            addCriterion("workflow_id <>", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdGreaterThan(Integer value) {
            addCriterion("workflow_id >", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("workflow_id >=", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdLessThan(Integer value) {
            addCriterion("workflow_id <", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdLessThanOrEqualTo(Integer value) {
            addCriterion("workflow_id <=", value, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdIn(List<Integer> values) {
            addCriterion("workflow_id in", values, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotIn(List<Integer> values) {
            addCriterion("workflow_id not in", values, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdBetween(Integer value1, Integer value2) {
            addCriterion("workflow_id between", value1, value2, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("workflow_id not between", value1, value2, "workflowId");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyIsNull() {
            addCriterion("workflow_key is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyIsNotNull() {
            addCriterion("workflow_key is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyEqualTo(String value) {
            addCriterion("workflow_key =", value, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyNotEqualTo(String value) {
            addCriterion("workflow_key <>", value, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyGreaterThan(String value) {
            addCriterion("workflow_key >", value, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyGreaterThanOrEqualTo(String value) {
            addCriterion("workflow_key >=", value, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyLessThan(String value) {
            addCriterion("workflow_key <", value, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyLessThanOrEqualTo(String value) {
            addCriterion("workflow_key <=", value, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyLike(String value) {
            addCriterion("workflow_key like", value, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyNotLike(String value) {
            addCriterion("workflow_key not like", value, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyIn(List<String> values) {
            addCriterion("workflow_key in", values, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyNotIn(List<String> values) {
            addCriterion("workflow_key not in", values, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyBetween(String value1, String value2) {
            addCriterion("workflow_key between", value1, value2, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowKeyNotBetween(String value1, String value2) {
            addCriterion("workflow_key not between", value1, value2, "workflowKey");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameIsNull() {
            addCriterion("workflow_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameIsNotNull() {
            addCriterion("workflow_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameEqualTo(String value) {
            addCriterion("workflow_name =", value, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameNotEqualTo(String value) {
            addCriterion("workflow_name <>", value, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameGreaterThan(String value) {
            addCriterion("workflow_name >", value, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameGreaterThanOrEqualTo(String value) {
            addCriterion("workflow_name >=", value, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameLessThan(String value) {
            addCriterion("workflow_name <", value, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameLessThanOrEqualTo(String value) {
            addCriterion("workflow_name <=", value, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameLike(String value) {
            addCriterion("workflow_name like", value, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameNotLike(String value) {
            addCriterion("workflow_name not like", value, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameIn(List<String> values) {
            addCriterion("workflow_name in", values, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameNotIn(List<String> values) {
            addCriterion("workflow_name not in", values, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameBetween(String value1, String value2) {
            addCriterion("workflow_name between", value1, value2, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowNameNotBetween(String value1, String value2) {
            addCriterion("workflow_name not between", value1, value2, "workflowName");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeIsNull() {
            addCriterion("workflow_describe is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeIsNotNull() {
            addCriterion("workflow_describe is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeEqualTo(String value) {
            addCriterion("workflow_describe =", value, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeNotEqualTo(String value) {
            addCriterion("workflow_describe <>", value, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeGreaterThan(String value) {
            addCriterion("workflow_describe >", value, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("workflow_describe >=", value, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeLessThan(String value) {
            addCriterion("workflow_describe <", value, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeLessThanOrEqualTo(String value) {
            addCriterion("workflow_describe <=", value, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeLike(String value) {
            addCriterion("workflow_describe like", value, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeNotLike(String value) {
            addCriterion("workflow_describe not like", value, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeIn(List<String> values) {
            addCriterion("workflow_describe in", values, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeNotIn(List<String> values) {
            addCriterion("workflow_describe not in", values, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeBetween(String value1, String value2) {
            addCriterion("workflow_describe between", value1, value2, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andWorkflowDescribeNotBetween(String value1, String value2) {
            addCriterion("workflow_describe not between", value1, value2, "workflowDescribe");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Integer value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Integer value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Integer value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Integer value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Integer> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Integer> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table workflow
     *
     * @mbg.generated do_not_delete_during_merge Wed Sep 25 10:59:33 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table workflow
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}