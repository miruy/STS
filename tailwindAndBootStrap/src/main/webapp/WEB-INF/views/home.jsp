<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
  <head>
<!--   부트스트랩 홈페이지에서  -->
<!--   1. 부트스트랩 다운로드 : 직접 설치 후 테마 설치경로를 직접 입력해 테마를 불러오는 방식  -->
<!--   또는 -->
<!--   2. cdn 코드 가져와서 사용하기 : 직접 설치하지 않고 테마가 있는 사이트에서 테마를 불러오는 방식 -->
  
<!--  		난 cnd -->
  
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    

    <!-- Bootstrap CSS -->s
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="<c:url value='/resources/css/Css.css'/>" rel="stylesheet">
	<link href="<c:url value='/resources/css/output.css'/>" rel="stylesheet">
	
    <title>Hello, world!</title>
  </head>
  <body>
  
	# tailwind 적용된 것 : class명이 t- 로 되어 있는 부분은 우선 무시하기
    <h1 class="t-bg-gray-500 t-text-red-500">Hello, world!</h1>
    
    
    <br>
    
    
  	# 부트스트랩 적용된 것 : 한 문단을 전체를 감싼 div class 중요 / form-check
    <div class="form-check">
	  <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked">
	  <label class="form-check-label for="flexCheckChecked">
	    Checked checkbox
	  </label>
	</div>
	
	<br>
	
	# 스위치 버튼
	<div class="form-check form-switch">
	  <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault">
	  <label class="form-check-label" for="flexSwitchCheckDefault">Default switch checkbox input</label>
	</div>
	<div class="form-check form-switch">
	  <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckChecked" checked>
	  <label class="form-check-label" for="flexSwitchCheckChecked">Checked switch checkbox input</label>
	</div>

	<br>
	
	<div class="mb-3">
	  <label for="exampleFormControlInput1" class="form-label">Email address</label>
	  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
	</div>
	<div class="mb-3">
	  <label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
	  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
	</div>
	
	<br>
	
	# 색 선택
	<label for="exampleColorInput" class="form-label">Color picker</label>
<input type="color" class="form-control form-control-color" id="exampleColorInput" value="#563d7c" title="Choose your color">
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
  </body>
</html>