package com.thibaut.lightecomv1;

import com.thibaut.lightecomv1.dao.CategoryRepository;
import com.thibaut.lightecomv1.dao.ProductRepository;
import com.thibaut.lightecomv1.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LightEcomV1Application implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    public static void main(String[] args) {

        SpringApplication.run(LightEcomV1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Category ordinateurs = categoryRepository.save(new Category(null, "Ordinateurs", null, null));
    }
}
