package com.miwo.dao;

import com.miwo.model.MiPic;
import com.miwo.model.MiPicExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface MiPicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    long countByExample(MiPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    int deleteByExample(MiPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    int deleteByPrimaryKey(Long miId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    int insert(MiPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    int insertSelective(MiPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    List<MiPic> selectByExample(MiPicExample example);
    
    List<MiPic> selectRandom(Map param);
    List<MiPic> selectByPage(Map param);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    MiPic selectByPrimaryKey(Long miId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    int updateByExampleSelective(@Param("record") MiPic record, @Param("example") MiPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    int updateByExample(@Param("record") MiPic record, @Param("example") MiPicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    int updateByPrimaryKeySelective(MiPic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mi_pic
     *
     * @mbg.generated Fri May 04 13:55:17 CST 2018
     */
    int updateByPrimaryKey(MiPic record);

	List<MiPic> selectByDay(Map param);
}