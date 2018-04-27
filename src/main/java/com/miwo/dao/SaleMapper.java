package com.miwo.dao;

import com.miwo.model.Sale;
import com.miwo.model.SaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Fri Apr 27 16:30:54 CST 2018
     */
    long countByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Fri Apr 27 16:30:54 CST 2018
     */
    int deleteByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Fri Apr 27 16:30:54 CST 2018
     */
    int insert(Sale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Fri Apr 27 16:30:54 CST 2018
     */
    int insertSelective(Sale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Fri Apr 27 16:30:54 CST 2018
     */
    List<Sale> selectByExample(SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Fri Apr 27 16:30:54 CST 2018
     */
    int updateByExampleSelective(@Param("record") Sale record, @Param("example") SaleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale
     *
     * @mbg.generated Fri Apr 27 16:30:54 CST 2018
     */
    int updateByExample(@Param("record") Sale record, @Param("example") SaleExample example);
}