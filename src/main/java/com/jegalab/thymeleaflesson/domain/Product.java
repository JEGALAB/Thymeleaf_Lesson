package com.jegalab.thymeleaflesson.domain;

import java.math.BigDecimal;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Product {

    private Integer id;
    private String courseName;
    private String courseSubtitle;
    private String courseDescription;
    private Author courseAuthor;
    private BigDecimal coursePrice;
    private List<Category> courseCategory;
    private String courseImageURL;

}
