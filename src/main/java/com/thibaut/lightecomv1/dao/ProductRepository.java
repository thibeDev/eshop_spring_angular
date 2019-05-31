package com.thibaut.lightecomv1.dao;

import com.thibaut.lightecomv1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
