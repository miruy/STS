<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상세 및 평가</title>
</head>
<body>
	<c:if test="${!empty book}">
		<table border="1">

			<tr>
				<th>일련번호</th>
				<td>${book.isbn}</td>
			</tr>

			<tr>
				<th>도서 이름</th>
				<td>${book.book_name}</td>
			</tr>

			<tr>
				<th>출판사</th>
				<td>${book.publisher}</td>
			</tr>

			<tr>
				<th>저자</th>
				<td>${book.author}</td>
			</tr>

			<tr>
				<th>제작년도</th>
				<td>${book.produc_year}</td>
			</tr>

			<tr>
				<th>총 페이지</th>
				<td>${book.book_page}</td>
			</tr>

			<tr>
				<th>카테고리</th>
				<td>${book.book_category}</td>
			</tr>

			<tr>
				<th>연령등급</th>
				<td>${book.age_grade}</td>
			</tr>
			
			<tr>
				<th>줄거리</th>
				<td>${book.book_sum}</td>
			</tr>
			
			<tr>
				<th>표지</th>
				<td>${book.book_cover}</td>
			</tr>
		</table>
	</c:if>
</body>
</html>