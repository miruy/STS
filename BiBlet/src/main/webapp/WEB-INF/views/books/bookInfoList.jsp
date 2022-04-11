<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BiBlet 테스트용 메인 페이지</title>
 <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
    
    <!-- 도서 검색 -->
    <script>
        $(document).ready(function () {
            var pageNum = 1;
            $("#search").click(function () {
                $("div").html("");
                $.ajax({
                    method: "GET",
                    url: "https://dapi.kakao.com/v3/search/book",
                    data: { query: $("#query").val(), page: pageNum},
                    headers: {Authorization: "KakaoAK 6f9ab74953bbcacc4423564a74af264e"} 
                })
                .done(function (msg) {
                    console.log(msg);
                    for (var i = 0; i < 10; i++){
                        $("div").append("<h2><a href='"+ msg.documents[i].url +"'>" + msg.documents[i].title + "</a></h2>");
                        $("div").append("<img src='" + msg.documents[i].thumbnail + "'/><br>");
                        $("div").append("<strong>저자:</strong> " + msg.documents[i].authors + "<br>");
                        $("div").append("<strong>출판사:</strong> " + msg.documents[i].publisher + "<br>");
                        $("div").append("<strong>줄거리:</strong> " + msg.documents[i].contents + "...<br>");
                    }
                });
            })
				<!-- 무한 스크롤 -->
            $(window).scroll(function(){  
                if ( Math.ceil($(window).scrollTop()) + $(window).height() >= $(document).height() ){
                    pageNum++;
                    $.ajax({
                        method: "GET",
                        url: "https://dapi.kakao.com/v3/search/book?target=title",
                        data: { query: $("#query").val(),  page: pageNum},
                        headers: {Authorization: "KakaoAK 6f9ab74953bbcacc4423564a74af264e"} 
                    })
                    .done(function (msg) {
                        console.log(msg);
                        for (var i = 0; i < 10; i++){
                            $("div").append("<h2><a href='"+ msg.documents[i].url +"'>" + msg.documents[i].title + "</a></h2>");
                            $("div").append("<img src='" + msg.documents[i].thumbnail + "'/><br>");
                            $("div").append("<strong>저자:</strong> " + msg.documents[i].authors + "<br>");
                            $("div").append("<strong>출판사:</strong> " + msg.documents[i].publisher + "<br>");
                            $("div").append("<strong>줄거리:</strong> " + msg.documents[i].contents + "...<br>");
                        }
                    });
                }   
            });
        })    
 	 </script>
</head>
<body>
	<p>
		검색 키워드 입력 : 
		<select name="option">
			<option value="title">제목</option>
			<option value="author">저자</option>
			<option value="publisher">출판사</option>
		</select> 
			
		<input type="text" name="query" id="query" placeholder="제목, 저자 또는 출판사 검색" size=30> 
		<button id="search">검색</button>
 	</p>
 		
    <div>
	<!--     자바 스크립트 표현 부분 -->
	</div>

	
	
<%-- 	 <c:if test="${!empty books}"> --%>
<!-- 		<table border="1"> -->
<!-- 			<tr> -->
<!-- 				<th>일련번호</th> -->
<!-- 				<th>도서 이름</th> -->
<!-- 				<th>출판사</th> -->
<!-- 				<th>저자</th> -->
<!-- 				<th>제작년도</th> -->
<!-- 				<th>총 페이지</th> -->
<!-- 				<th>카테고리</th> -->
<!-- 				<th>연령등급</th> -->
<!-- 				<th>줄거리</th> -->
<!-- 				<th>표지</th>	 -->
<!-- 			</tr> -->
			
<%-- 			<c:forEach var="books" items="${books}"> --%>
<!-- 				<tr> -->
<%-- 					<td>${books.isbn}</td> --%>
<%-- 					<td>${books.book_name}</td> --%>
<%-- 					<td>${books.publisher}</td> --%>
<%-- 					<td>${books.author}</td> --%>
<%-- 					<td>${books.produc_year}</td> --%>
<%-- 					<td>${books.book_page}</td> --%>
<%-- 					<td>${books.book_category}</td> --%>
<%-- 					<td>${books.age_grade}</td> --%>
<%-- 					<td>${books.book_sum}</td> --%>
<%-- 					<td>${books.book_cover}</td> --%>
<!-- 				</tr> -->
<%-- 			</c:forEach> --%>
<!-- 		</table>	 -->
<%-- 	</c:if> --%>
	
	
	
	
</body>
</html>