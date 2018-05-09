package com.miwo.dao;

import com.miwo.model.Takeaway;
import com.miwo.model.TakeawayExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TakeawayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    long countByExample(TakeawayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    int deleteByExample(TakeawayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    int deleteByPrimaryKey(Long takeawayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    int insert(Takeaway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    int insertSelective(Takeaway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    List<Takeaway> selectByExample(TakeawayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    Takeaway selectByPrimaryKey(Long takeawayId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    int updateByExampleSelective(@Param("record") Takeaway record, @Param("example") TakeawayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    int updateByExample(@Param("record") Takeaway record, @Param("example") TakeawayExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    int updateByPrimaryKeySelective(Takeaway record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table takeaway
     *
     * @mbg.generated Wed May 02 17:30:49 CST 2018
     */
    int updateByPrimaryKey(Takeaway record);

	List<Takeaway> selectByPage(Map<String, Object> param);
}