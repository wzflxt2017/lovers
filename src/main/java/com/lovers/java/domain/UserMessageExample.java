package com.lovers.java.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMessageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public UserMessageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
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
     * This method corresponds to the database table user_message
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
     * This method corresponds to the database table user_message
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
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
     * This class corresponds to the database table user_message
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Integer value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Integer value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Integer value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Integer value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Integer> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Integer> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNull() {
            addCriterion("sender_id is null");
            return (Criteria) this;
        }

        public Criteria andSenderIdIsNotNull() {
            addCriterion("sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andSenderIdEqualTo(Integer value) {
            addCriterion("sender_id =", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotEqualTo(Integer value) {
            addCriterion("sender_id <>", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThan(Integer value) {
            addCriterion("sender_id >", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sender_id >=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThan(Integer value) {
            addCriterion("sender_id <", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdLessThanOrEqualTo(Integer value) {
            addCriterion("sender_id <=", value, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdIn(List<Integer> values) {
            addCriterion("sender_id in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotIn(List<Integer> values) {
            addCriterion("sender_id not in", values, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdBetween(Integer value1, Integer value2) {
            addCriterion("sender_id between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andSenderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sender_id not between", value1, value2, "senderId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNull() {
            addCriterion("receiver_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIsNotNull() {
            addCriterion("receiver_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverIdEqualTo(Integer value) {
            addCriterion("receiver_id =", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotEqualTo(Integer value) {
            addCriterion("receiver_id <>", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThan(Integer value) {
            addCriterion("receiver_id >", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("receiver_id >=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThan(Integer value) {
            addCriterion("receiver_id <", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdLessThanOrEqualTo(Integer value) {
            addCriterion("receiver_id <=", value, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdIn(List<Integer> values) {
            addCriterion("receiver_id in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotIn(List<Integer> values) {
            addCriterion("receiver_id not in", values, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdBetween(Integer value1, Integer value2) {
            addCriterion("receiver_id between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andReceiverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("receiver_id not between", value1, value2, "receiverId");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(String value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(String value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(String value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(String value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLike(String value) {
            addCriterion("message_type like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotLike(String value) {
            addCriterion("message_type not like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<String> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<String> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(String value1, String value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(String value1, String value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNull() {
            addCriterion("message_content is null");
            return (Criteria) this;
        }

        public Criteria andMessageContentIsNotNull() {
            addCriterion("message_content is not null");
            return (Criteria) this;
        }

        public Criteria andMessageContentEqualTo(String value) {
            addCriterion("message_content =", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotEqualTo(String value) {
            addCriterion("message_content <>", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThan(String value) {
            addCriterion("message_content >", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("message_content >=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThan(String value) {
            addCriterion("message_content <", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLessThanOrEqualTo(String value) {
            addCriterion("message_content <=", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentLike(String value) {
            addCriterion("message_content like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotLike(String value) {
            addCriterion("message_content not like", value, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentIn(List<String> values) {
            addCriterion("message_content in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotIn(List<String> values) {
            addCriterion("message_content not in", values, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentBetween(String value1, String value2) {
            addCriterion("message_content between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andMessageContentNotBetween(String value1, String value2) {
            addCriterion("message_content not between", value1, value2, "messageContent");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNull() {
            addCriterion("is_read is null");
            return (Criteria) this;
        }

        public Criteria andIsReadIsNotNull() {
            addCriterion("is_read is not null");
            return (Criteria) this;
        }

        public Criteria andIsReadEqualTo(Integer value) {
            addCriterion("is_read =", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotEqualTo(Integer value) {
            addCriterion("is_read <>", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThan(Integer value) {
            addCriterion("is_read >", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_read >=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThan(Integer value) {
            addCriterion("is_read <", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadLessThanOrEqualTo(Integer value) {
            addCriterion("is_read <=", value, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadIn(List<Integer> values) {
            addCriterion("is_read in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotIn(List<Integer> values) {
            addCriterion("is_read not in", values, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadBetween(Integer value1, Integer value2) {
            addCriterion("is_read between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andIsReadNotBetween(Integer value1, Integer value2) {
            addCriterion("is_read not between", value1, value2, "isRead");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameIsNull() {
            addCriterion("message_file_name is null");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameIsNotNull() {
            addCriterion("message_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameEqualTo(String value) {
            addCriterion("message_file_name =", value, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameNotEqualTo(String value) {
            addCriterion("message_file_name <>", value, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameGreaterThan(String value) {
            addCriterion("message_file_name >", value, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("message_file_name >=", value, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameLessThan(String value) {
            addCriterion("message_file_name <", value, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameLessThanOrEqualTo(String value) {
            addCriterion("message_file_name <=", value, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameLike(String value) {
            addCriterion("message_file_name like", value, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameNotLike(String value) {
            addCriterion("message_file_name not like", value, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameIn(List<String> values) {
            addCriterion("message_file_name in", values, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameNotIn(List<String> values) {
            addCriterion("message_file_name not in", values, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameBetween(String value1, String value2) {
            addCriterion("message_file_name between", value1, value2, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileNameNotBetween(String value1, String value2) {
            addCriterion("message_file_name not between", value1, value2, "messageFileName");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdIsNull() {
            addCriterion("message_file_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdIsNotNull() {
            addCriterion("message_file_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdEqualTo(Integer value) {
            addCriterion("message_file_id =", value, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdNotEqualTo(Integer value) {
            addCriterion("message_file_id <>", value, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdGreaterThan(Integer value) {
            addCriterion("message_file_id >", value, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("message_file_id >=", value, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdLessThan(Integer value) {
            addCriterion("message_file_id <", value, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("message_file_id <=", value, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdIn(List<Integer> values) {
            addCriterion("message_file_id in", values, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdNotIn(List<Integer> values) {
            addCriterion("message_file_id not in", values, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdBetween(Integer value1, Integer value2) {
            addCriterion("message_file_id between", value1, value2, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("message_file_id not between", value1, value2, "messageFileId");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNull() {
            addCriterion("message_time is null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIsNotNull() {
            addCriterion("message_time is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTimeEqualTo(Date value) {
            addCriterion("message_time =", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotEqualTo(Date value) {
            addCriterion("message_time <>", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThan(Date value) {
            addCriterion("message_time >", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("message_time >=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThan(Date value) {
            addCriterion("message_time <", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeLessThanOrEqualTo(Date value) {
            addCriterion("message_time <=", value, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeIn(List<Date> values) {
            addCriterion("message_time in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotIn(List<Date> values) {
            addCriterion("message_time not in", values, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeBetween(Date value1, Date value2) {
            addCriterion("message_time between", value1, value2, "messageTime");
            return (Criteria) this;
        }

        public Criteria andMessageTimeNotBetween(Date value1, Date value2) {
            addCriterion("message_time not between", value1, value2, "messageTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_message
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
     * This class corresponds to the database table user_message
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