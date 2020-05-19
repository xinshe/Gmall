package com.sx.gmall.pms;

import com.sx.gmall.pms.entity.Brand;
import com.sx.gmall.pms.entity.Product;
import com.sx.gmall.pms.service.BrandService;
import com.sx.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        // 测试增删改
//        Brand brand = new Brand();
//        brand.setName("hahaha");
//        brandService.save(brand);
//        System.out.println("保存成功....");

        // 测试读
        Brand byId = brandService.getById(53);
        System.out.println("查询到...." + byId.getName());
    }

}
