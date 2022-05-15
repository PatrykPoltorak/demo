package com.example.demo.service.cartsService;

import com.example.demo.model.cart.Cart;
import com.example.demo.model.cart.Products;
import com.example.demo.model.product.Product;
import com.example.demo.model.user.Name;
import com.example.demo.model.user.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CartsService {
    private String url = "https://fakestoreapi.com/carts";
    private RestTemplate restTemplate = new RestTemplate();

    public List getCarts() {
        Cart[] cart = restTemplate.getForObject(url, Cart[].class);
        List<Cart> list = new ArrayList<Cart>(Arrays.asList(cart));
        return list;
    }


    public String getHighestValue(List<Product> products, List<User> users) {
        float count = 0;
        User user = new User();
        List<Cart> list = this.getCarts();
        for (Cart cart : list) {
            float tmpCount = 0;
            int userId = cart.getUserId();
            List<Products> productId =  cart.getProducts();
            for (Products tmpProducts : productId) {
                double price = searchPrice(products, tmpProducts);
                tmpCount +=  tmpProducts.getQuantity() * price;
                if(count < tmpCount){
                    count = tmpCount;
                    user = searchUser(users, userId);
                }
            }
        }
        return "highest value: " + count+
                "user name" + user.getName();
    }

    public User searchUser(List<User> users, int id){
        for(User user: users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    private float searchPrice(List<Product> products, Products tmpProducts){
        for (Product tmpProduct : products){
            if(tmpProduct.getId() == tmpProducts.getProductId()){
                return tmpProduct.getPrice();
            }
        }
        return 0;
    }
}
