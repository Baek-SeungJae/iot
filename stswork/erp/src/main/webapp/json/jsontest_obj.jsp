<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
 <title>인사관리시스템</title>
  <meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		//자바스크립트 객체 선언
		var person = {
				name:"김서연",
				age:"25",
				like:["자바","서블릿","하둡"],
				addr:{
					zipcode:"11-22",
					addr1:"인천시",
					addr2:"남구"
				},
				history:[
				    { 
				    	subject:"java",
				    	month:"11"
				    },
				    {
				    	subject:"servlet",
				    	month:"1"
				    },
				    {
				    	subject:"spring",
				    	month:"1"
				    },
				    {
				    	subject:"hadoop",
				    	month:"2"
				    }
				]				
		}
		document.write("<H3>"+person.name+"</H3>");
		document.write("<H3>"+person.age+"</H3>");
		document.write("<H3>"+person.addr.addr1+"</H3>");
		document.write("<H3>"+person.like[0]+"</H3>");
		document.write("<H3>"+person.person.histroy[0].subject+"</H3>");
	</script>
</body>
</html>











