package com.lovers.java.mapper;

import com.lovers.java.domain.UserPhoto;
import com.lovers.java.domain.UserPhotoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;


public interface UserPhotoMapper  {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    long countByExample(UserPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByExample(UserPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int deleteByPrimaryKey(Integer photoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insert(UserPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int insertSelective(UserPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    List<UserPhoto> selectByExample(UserPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    UserPhoto selectByPrimaryKey(Integer photoId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserPhoto record, @Param("example") UserPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByExample(@Param("record") UserPhoto record, @Param("example") UserPhotoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKeySelective(UserPhoto record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_photo
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    int updateByPrimaryKey(UserPhoto record);
}