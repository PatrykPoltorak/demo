package com.example.demo.ProductTest;
import com.example.demo.model.product.Product;
import com.example.demo.service.producttsService.ProductsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ProductTest {

    ProductsService productService = new ProductsService();

    @Test
    void productNotEmpty(){
        List<Product> list = productService.getProducts();
        assertNotNull(list.size());
    }

    @Test
    void productHaveFourCategory(){
        assertTrue(productService.getProductCategory().size() ==4);
    }
}
