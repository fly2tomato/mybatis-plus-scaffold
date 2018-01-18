package com.arkmon;

import com.arkmon.domain.ProductCategory;
import com.arkmon.mapper.ProductCategoryMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Wrapper;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

	@Autowired
	private ProductCategoryMapper productCategoryMapper;



//    @Test
//	public void findByName() {
//        ProductCategory productCategory = productCategoryMapper.findByName("xj");
//		Assert.assertEquals(1, productCategory.getCategoryType().intValue());
//	}

	@Test
    public void select() {
        List<ProductCategory> productCategories = productCategoryMapper.selectList(
                new EntityWrapper<ProductCategory>().eq("category_name","xxxjjj")
        );
        System.out.println(productCategories.get(1));
    }

    @Test
    public void insert() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("xxxjjjj");
        productCategory.setCategoryType(new Integer(3));
        System.out.println(productCategoryMapper.insert(productCategory));
    }

    @Test
    public void delete() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("xxxjjj3");
        productCategoryMapper.delete(new EntityWrapper<ProductCategory>().eq("category_name",
                "auto_name"));
    }



    @Test
	public void contextLoads() {
	}

}
