package com.jegalab.thymeleaflesson.service;

import com.jegalab.thymeleaflesson.domain.Category;
import com.jegalab.thymeleaflesson.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();
}
