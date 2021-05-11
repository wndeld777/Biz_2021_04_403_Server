<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${RESULT }
	
	<h5>식품명 : ${FOOD.fo_name }</h5>
	<h5>식품코드 : ${FOOD.fo_fcode }</h5> 
	<h5>회사명 : ${FOOD.fo_dname }</h5>
	<h5>분류 : ${FOOD.fo_vname }</h5>
	<h5>1회섭취량 : ${FOOD.fo_size }</h5>
	<h5>총내용량 : ${FOOD.fo_gram }</h5> 
	<h5>단백질 : ${FOOD.fo_protein }</h5> 
	<h5>지방 : ${FOOD.fo_fat }</h5> 
	<h5>탄수화물 : ${FOOD.fo_carbo }</h5>
	<h5>총당류 : ${FOOD.fo_sugars }</h5>
	
</body>
</html>