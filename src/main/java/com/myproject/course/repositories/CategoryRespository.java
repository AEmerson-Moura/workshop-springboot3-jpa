package com.myproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.course.entities.Category;

public interface CategoryRespository extends JpaRepository<Category, Long>{
	
	
}
