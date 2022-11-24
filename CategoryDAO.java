package com.spring.jdbcTemplate.dao;

import java.util.List;

import com.spring.jdbcTemplate.model.Category;

public interface CategoryDAO {

	public void save(Category category);
	
	public Category getById(int id);
	
	public void update(Category category);
	
	public void deleteById(int id);
	
	public List<Category> getAll();
	
	public Category getByName(String name);
	
	public List<Category> getByNames(String subString);

}

