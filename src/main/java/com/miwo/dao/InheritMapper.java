package com.miwo.dao;

import com.miwo.model.Inherit;
import com.miwo.model.InheritExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InheritMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    long countByExample(InheritExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    int deleteByExample(InheritExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    int insert(Inherit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    int insertSelective(Inherit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    List<Inherit> selectByExample(InheritExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    Inherit selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") Inherit record, @Param("example") InheritExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    int updateByExample(@Param("record") Inherit record, @Param("example") InheritExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    int updateByPrimaryKeySelective(Inherit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inherit
     *
     * @mbg.generated Wed Apr 25 10:19:05 CST 2018
     */
    int updateByPrimaryKey(Inherit record);

    long countUser();
}