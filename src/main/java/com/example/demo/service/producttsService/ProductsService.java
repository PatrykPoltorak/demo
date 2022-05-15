package com.example.demo.service.producttsService;

import com.example.demo.model.product.Product;
import com.example.demo.model.user.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class ProductsService {
    private String url = "https://fakestoreapi.com/products";
    private RestTemplate restTemplate = new RestTemplate();
    
    public List<Product> getProducts() {
        Product[] product = restTemplate.getForObject(url, Product[].class);
        List<Product> list = new ArrayList<Product>(Arrays.asList(product));
        return list;
    }

    public Map getProductCategory() {
        List<Product> products = this.getProducts();
        Map<String, Float> map = new HashMap();

        for(Product product : products){

            if(!map.containsKey(product.getCategory())){
                map.put(product.getCategory(), product.getPrice());
            }else{
                float price = product.getPrice();
                float mapPrice = map.get(product.getCategory());
                map.put(product.getCategory(), mapPrice+price);
            }

            System.out.println("kategoria: " + product.getCategory()+"\n cena:" + product.getPrice());

        }
        return map;
    }
}
