<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>==================================================<br/>
	식품코드 : ${FOOD.fo_fcode }<br/>
	식품이름 : ${FOOD.fo_name }<br/>
	======================================================</p>
	<h1>식품 검색결과</h1>
	<c:if test="${empty FOOD }">검색결과가 없음!!!</c:if>
	<c:forEach items="${FOOD }" var= "FOOD">
		<p>${FOOD.fo_fcode },
		<a href="insert?fo_fcode=${FOOD.fo_fcode }&fo_name=${FOOD.fo_name}">
		</a>
		
		</p>
		</c:forEach>
		

</body>
</html>