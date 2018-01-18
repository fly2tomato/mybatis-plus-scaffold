package com.arkmon.service.impl;

import com.arkmon.domain.ProductCategory;
import com.arkmon.mapper.ProductCategoryMapper;
import com.arkmon.service.ProductCategoryService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: 傅里葉的西紅柿
 * Date: 2018/1/18
 */
@Service
//@Component
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Override
    //@Scheduled(fixedRate = 5000)
    public int insert() {
        System.out.println("insert time: " + dateFormat.format(new Date()));
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("auto_name");
        productCategory.setCategoryType(999);
        productCategoryMapper.insert(productCategory);
        return 0;
    }

    @Override
    //@Scheduled(fixedRate = 10000)
    public void delete() {
        System.out.println("delete time: " + dateFormat.format(new Date()));
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("auto_name");
        productCategoryMapper.delete(new EntityWrapper<ProductCategory>().eq("category_name","auto_name"));
    }
}
