package com.com.food.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FoodDTO {

	 private String fo_fcode;
	 private String fo_name;		// 식품명,
	 private String fo_dname;		// 제조사이름,
	 private String fo_vname;		// 분류명,
	 private Integer fo_size;	// 일회제공량,
	 private Integer fo_gram;	// 총내용량,
	 private Integer fo_kcal;	// 에너지,
	 private Integer fo_protein;// 단백질,
	 private Integer fo_fat;	// 지방,
	 private Integer fo_carbo;	// 탄수화물,
	 private Integer fo_sugars;	// 총당류
}
