package com.jegalab.thymeleaflesson.controller;

import com.jegalab.thymeleaflesson.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/")
    public String getIndex(Model model){
        model.addAttribute("products", productService.listProducts());

        return "index";
    }
}
