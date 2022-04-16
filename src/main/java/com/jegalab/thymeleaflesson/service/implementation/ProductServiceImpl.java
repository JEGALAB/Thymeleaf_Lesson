package com.jegalab.thymeleaflesson.service.implementation;

import com.jegalab.thymeleaflesson.domain.Author;
import com.jegalab.thymeleaflesson.domain.Category;
import com.jegalab.thymeleaflesson.domain.Product;
import com.jegalab.thymeleaflesson.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private Map<Integer, Product> productMap;

    public ProductServiceImpl(){
        loadProducts();
    }

    @Override
    public Product getProduct(Integer id) {
        return productMap.get(id);
    }

    @Override
    public List<Product> listProducts() {
        return new ArrayList<>(productMap.values());
    }

    public void loadProducts(){

        Author at = new Author();
        at.setFirstName("Javier");
        at.setLastName("Mota");
        at.setId(1);
        at.setImage("https://scontent.fclq1-1.fna.fbcdn.net/v/t39.30808-6/275771711_1008434616719760_4956569363714637716_n.jpg?_nc_cat=103&ccb=1-5&_nc_sid=09cbfe&_nc_eui2=AeHzE83-2xKEsCTm78PFudasQWu474UqNmBBa7jvhSo2YM-MHQs2BH0PkY-SwkTEXH2fLgyXRUoIwWexPJPjoZKy&_nc_ohc=BWGxBsGAfJAAX8zhWCj&_nc_ht=scontent.fclq1-1.fna&oh=00_AT8wjZbYOhQdQxJ19Fsh5tIyDsenEPCI0ZZkpr-yL82jPQ&oe=623D33C0");

        Category prodCat1 = new Category();
        prodCat1.setId(1);
        prodCat1.setCategory("Spring Introduction");

        Category prodCat2 = new Category();
        prodCat2.setId(2);
        prodCat2.setCategory("Spring Core");

        Category prodCat3 = new Category();
        prodCat3.setId(3);
        prodCat3.setCategory("Spring Boot");

        Category prodCat4 = new Category();
        prodCat4.setId(4);
        prodCat4.setCategory("Spring expert");

        Category prodCat5 = new Category();
        prodCat5.setId(5);
        prodCat5.setCategory("G.E.A.P");

        Category prodCat6 = new Category();
        prodCat6.setId(6);
        prodCat6.setCategory("Last but not least");

        productMap = new HashMap<>();

        Product product1 = new Product();
        product1.setId(1);
        product1.setCourseName("Course Title 1");
        product1.setCourseSubtitle("Course Subtitle 1");
        product1.setCourseAuthor(at);
        product1.setCoursePrice(new BigDecimal(19));
        product1.setCourseImageURL("https://game7staffing.com/media/seo/8-ENGINEER-STAFFING-FOR-EMERGING-TECH2.jpg");
        product1.setCourseCategory(new ArrayList<Category>());
        product1.getCourseCategory().add(prodCat1);
        product1.getCourseCategory().add(prodCat2);
        product1.getCourseCategory().add(prodCat3);
        product1.setCourseDescription("This is an example of a course description that I just invented while I'm coding this exercise 'cause I'm don't really have a good imagination skills and I think that something like that is enough. But courses descriptions are a little more long that i wrote before, I added this unnecessary line to fill more space in the text");
        productMap.put(product1.getId(), product1);

        Product product2 = new Product();
        product2.setId(2);
        product2.setCourseName("Course Title 2");
        product2.setCourseSubtitle("Course Subtitle 2");
        product2.setCourseAuthor(at);
        product2.setCoursePrice(new BigDecimal(0));
        product2.setCourseImageURL("https://game7staffing.com/media/seo/8-ENGINEER-STAFFING-FOR-EMERGING-TECH2.jpg");
        product2.setCourseCategory(new ArrayList<Category>());
        product2.getCourseCategory().add(prodCat4);
        product2.getCourseCategory().add(prodCat5);
        product2.getCourseCategory().add(prodCat6);
        product2.setCourseDescription("This is an example of a course description that I just invented while I'm coding this exercise 'cause I'm don't really have a good imagination skills and I think that something like that is enough. But courses descriptions are a little more long that i wrote before, I added this unnecessary line to fill more space in the text");
        productMap.put(product2.getId(), product2);

        Product product3 = new Product();
        product3.setId(3);
        product3.setCourseName("Course Title 3");
        product3.setCourseSubtitle("Course Subtitle 3");
        product3.setCourseAuthor(at);
        product3.setCoursePrice(new BigDecimal(19));
        product3.setCourseImageURL("https://game7staffing.com/media/seo/8-ENGINEER-STAFFING-FOR-EMERGING-TECH2.jpg");
        product3.setCourseCategory(new ArrayList<Category>());
        product3.getCourseCategory().add(prodCat1);
        product3.getCourseCategory().add(prodCat3);
        product3.getCourseCategory().add(prodCat5);
        product3.setCourseDescription("This is an example of a course description that I just invented while I'm coding this exercise 'cause I'm don't really have a good imagination skills and I think that something like that is enough. But courses descriptions are a little more long that i wrote before, I added this unnecessary line to fill more space in the text");
        productMap.put(product3.getId(), product3);

        Product product4 = new Product();
        product4.setId(4);
        product4.setCourseName("Course Title 4");
        product4.setCourseSubtitle("Course Subtitle 4");
        product4.setCourseAuthor(at);
        product4.setCoursePrice(new BigDecimal(0));
        product4.setCourseImageURL("https://game7staffing.com/media/seo/8-ENGINEER-STAFFING-FOR-EMERGING-TECH2.jpg");
        product4.setCourseCategory(new ArrayList<Category>());
        product4.getCourseCategory().add(prodCat2);
        product4.getCourseCategory().add(prodCat4);
        product4.getCourseCategory().add(prodCat6);
        product4.setCourseDescription("This is an example of a course description that I just invented while I'm coding this exercise 'cause I'm don't really have a good imagination skills and I think that something like that is enough. But courses descriptions are a little more long that i wrote before, I added this unnecessary line to fill more space in the text");
        productMap.put(product4.getId(), product4);

        Product product5 = new Product();
        product5.setId(5);
        product5.setCourseName("Course Title 5");
        product5.setCourseSubtitle("Course Subtitle 5");
        product5.setCourseAuthor(at);
        product5.setCoursePrice(new BigDecimal(19));
        product5.setCourseImageURL("https://game7staffing.com/media/seo/8-ENGINEER-STAFFING-FOR-EMERGING-TECH2.jpg");
        product5.setCourseCategory(new ArrayList<Category>());
        product5.getCourseCategory().add(prodCat1);
        product5.getCourseCategory().add(prodCat2);
        product5.getCourseCategory().add(prodCat5);
        product5.setCourseDescription("This is an example of a course description that I just invented while I'm coding this exercise 'cause I'm don't really have a good imagination skills and I think that something like that is enough. But courses descriptions are a little more long that i wrote before, I added this unnecessary line to fill more space in the text");
        productMap.put(product5.getId(), product5);

        Product product6 = new Product();
        product6.setId(6);
        product6.setCourseName("Course Title 6");
        product6.setCourseSubtitle("Course Subtitle 6");
        product6.setCourseAuthor(at);
        product6.setCoursePrice(new BigDecimal(0));
        product6.setCourseImageURL("https://game7staffing.com/media/seo/8-ENGINEER-STAFFING-FOR-EMERGING-TECH2.jpg");
        product6.setCourseCategory(new ArrayList<Category>());
        product6.getCourseCategory().add(prodCat3);
        product6.getCourseCategory().add(prodCat4);
        product6.getCourseCategory().add(prodCat6);
        product6.setCourseDescription("This is an example of a course description that I just invented while I'm coding this exercise 'cause I'm don't really have a good imagination skills and I think that something like that is enough. But courses descriptions are a little more long that i wrote before, I added this unnecessary line to fill more space in the text");
        productMap.put(product6.getId(), product6);

    }

}
