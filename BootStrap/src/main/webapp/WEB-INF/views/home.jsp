<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<link href="<c:url value='/resources/css/Css.css'/>" rel="stylesheet">
	<link href="<c:url value='/resources/css/output.css'/>" rel="stylesheet">
	
    <title>Hello, world!</title>
  </head>
  <body>
 <!--   부트스트랩 홈페이지에서  -->
<!--   1. 부트스트랩 다운로드 : 테마를 노트북에 직접 설치 후 테마 설치경로를 직접 입력해 테마를 불러오는 방식  -->
<!--   또는 -->
<!--   2. cdn 코드 가져와서 사용하기 : 직접 설치하지 않고 테마가 있는 사이트에서 테마를 불러오는 방식 -->
  
<!--  		난 cnd -->
	
<!--   3. body 안에 부트스트랩 홈페이지에서 원하는 소스 복붙해서 사용하기 -->
  
  	# 블랙 상단바
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarColor02">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link active" href="#">Home
            <span class="visually-hidden">(current)</span>
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">About</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" data-bs-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Dropdown</a>
          <div class="dropdown-menu">
            <a class="dropdown-item" href="#">Action</a>
            <a class="dropdown-item" href="#">Another action</a>
            <a class="dropdown-item" href="#">Something else here</a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">Separated link</a>
          </div>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-sm-2" type="text" placeholder="Search">
        <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

    
  	# 체크박스
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
   
   
   
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>