package com.thibaut.lightecomv1.dao;

import com.thibaut.lightecomv1.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
