package com.arkmon.mapper;

import com.arkmon.domain.ProductCategory;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.Map;

/**
 * Author: 傅里葉的西紅柿
 * Date: 2018/1/18
 */
@Mapper
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

//    @Select("SELECT * FROM product_category WHERE 1=1 AND category_name = #{name}")
//    ProductCategory findByName(@Param("name") String name);
//
//    @Insert("INSERT INTO product_category(category_name, category_type) VALUES(#{categoryName}, #{categoryType})")
//    int insert(ProductCategory productCategory);
//
//    @Insert("INSERT INTO product_category(category_name, category_type) VALUES(#{categoryName,jdbcType=VARCHAR}," +
//            " #{categoryType,jdbcType=INTEGER})")
//    int insertByMap(Map<String, Object> map);
//
//    @Delete("DELETE FROM product_category WHERE category_name = #{categoryName}")
//    void delete(ProductCategory productCategory);
//
//    @Update("UPDATE product_category SET category_name = #{categoryName}, category_type = #{categoryType} WHERE " +
//            "category_name = #{categoryName}")
//    void update(ProductCategory productCategory);
//
//    @Select("SELECT * FROM product_category WHERE 1=1 AND category_name = #{categoryName}")
//    int select(ProductCategory productCategory);

}
