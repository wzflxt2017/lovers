package com.lovers.java.domain;

public class UserFriend {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.user_friend_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer userFriendId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.friend_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer friendId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_friend.friend_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String friendName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.user_friend_id
     *
     * @return the value of user_friend.user_friend_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getUserFriendId() {
        return userFriendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.user_friend_id
     *
     * @param userFriendId the value for user_friend.user_friend_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setUserFriendId(Integer userFriendId) {
        this.userFriendId = userFriendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.user_id
     *
     * @return the value of user_friend.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.user_id
     *
     * @param userId the value for user_friend.user_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.friend_id
     *
     * @return the value of user_friend.friend_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public Integer getFriendId() {
        return friendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.friend_id
     *
     * @param friendId the value for user_friend.friend_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_friend.friend_name
     *
     * @return the value of user_friend.friend_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public String getFriendName() {
        return friendName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_friend.friend_name
     *
     * @param friendName the value for user_friend.friend_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    public void setFriendName(String friendName) {
        this.friendName = friendName == null ? null : friendName.trim();
    }
}