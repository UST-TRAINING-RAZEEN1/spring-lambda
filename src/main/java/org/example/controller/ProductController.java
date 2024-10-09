package org.example.controller;

import org.example.model.ProductPojo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    List<ProductPojo> allProduct=List.of(new ProductPojo(101,"mobile"),new ProductPojo(102,"laptop"));
    @GetMapping("/product")
    public List<ProductPojo> getAllProduct(){
        return allProduct;
    }
}
