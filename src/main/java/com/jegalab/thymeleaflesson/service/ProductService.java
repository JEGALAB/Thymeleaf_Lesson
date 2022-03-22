package com.jegalab.thymeleaflesson.service;

import com.jegalab.thymeleaflesson.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProducts();

}
