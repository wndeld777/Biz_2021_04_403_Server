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
public class FoodVO {
	 private String fo_seq;
	 private String fo_date;
	 private Integer fo_eat = 0;
	 private String fo_fcode;		// 식품코드,
	 private String fo_name;		// 식품명,
	 private String fo_year;		// 출시연도,
	 private String fo_dcode;		// 제조사코드,
	 private String fo_dname;		// 제조사이름,
	 private String fo_vcode;		// 분류코드,
	 private String fo_vname;		// 분류명,
	 private Integer fo_size = 0;	// 일회제공량,
	 private Integer fo_gram = 0;	// 총내용량,
	 private Integer fo_kcal = 0;	// 에너지,
	 private Integer fo_protein = 0;// 단백질,
	 private Integer fo_fat = 0;	// 지방,
	 private Integer fo_carbo = 0;	// 탄수화물,
	 private Integer fo_sugars = 0;	// 총당류
}
