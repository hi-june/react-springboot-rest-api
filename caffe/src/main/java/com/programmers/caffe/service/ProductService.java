package com.programmers.caffe.service;

import com.programmers.caffe.model.Category;
import com.programmers.caffe.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProductsByCategory(Category category);

    List<Product> getAllProducts();

    Product createProduct(String productName, Category category, long price);

    Product createProduct(String productName, Category category, long price, String description);
}
