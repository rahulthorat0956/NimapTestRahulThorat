package com.example.NimapTestRahulThorat.repository;

import com.example.NimapTestRahulThorat.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
