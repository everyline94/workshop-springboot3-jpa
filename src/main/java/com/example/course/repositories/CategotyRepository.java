package com.example.course.repositories;

import com.example.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategotyRepository extends JpaRepository<Category, Long> {

}
