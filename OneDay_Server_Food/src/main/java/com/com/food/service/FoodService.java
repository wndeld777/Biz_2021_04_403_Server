package com.com.food.service;

import java.util.List;

import com.com.food.model.FoodDTO;
import com.com.food.model.FoodVO;

public interface FoodService {

	
	public void insert(FoodVO foodVO);
	public List<FoodDTO> selectAll();
	public FoodDTO findByFood(String fo_fcode);
	public void findBySize();
	
}
