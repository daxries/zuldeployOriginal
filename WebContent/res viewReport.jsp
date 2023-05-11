<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<head>
<meta charset="ISO-8859-1">
<style>
.top{
    border: none;
    padding-top: 10px;
    height: 10%;

	
}

.content img{
    margin-left: 200;
	margin-top: 100px;
	
}
.container{
  background: #C5DEDC;
  position: absolute;
  top: 3%;
  width: 1325px;
  height: 1000px;
  padding: 30px;
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  margin-left: 10px;
  margin-top: 50px;
}
.container .text{
  font-size: 35px;
  font-weight: 600;
  text-align: center;
  font-family: 'Montserrat', sans-serif;
  text-transform:uppercase;
}
.container form{
  margin-top: 0px;
}
.container form .data{
  height: 45px;
  width: 100%;
  margin: 40px 0;
}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
.button {
  border: none;
  color: white;
  padding: 8px 20px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.button1 {background-color: #FE4E27;} /* Green */

form .btn{
  margin: 30px 0;
  height: 45px;
  width: 100%;
  position: relative;
}
form .btn button{
    border: none;
	border-radius:5px;
	padding: 10px 195px;
	position: absolute;
	text-align: center;
	font-size:20px;
	text-transform: uppercase;
	transition-duration: 0.5s;
	cursor: pointer;
	background-color: 	#FF1D39 ;
	border: 2px solid #bfbfbf;
	color: white;
	letter-spacing: 3px;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}
form .btn:hover button{
    background-color: #94948F;
	border: 2px solid white;
}

.btn-group button {
  background-color: #728FCE; /* Green background */
  border: 1px solid white; /* Green yaoyao border */
  color: white; /* White text */
  padding: 10px 24px; /* Some padding */
  cursor: pointer; /* Pointer/hand icon */
  float: left; /* Float the buttons side by side */

}

.header {
  overflow: hidden;
  background-color: #7393B3;
  padding: 20px 10px;
}

.header a {
  float: left;
  color: black;
  text-align: center;
  padding: 10px;
  text-decoration: none;
  font-size: 15px; 
  line-height: 10px;
  border-radius: 10px;
  
}
a:link, a:visited {
  background-color: #7393B3;
  color: black;
  border: 2px solid #7393B3;
  padding: 15px 3px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

a:hover, a:active {
  background-color: #7ADBD3;
  color: white;
}


.header-right {
  float: right;
  cursor: pointer;
}
a{margin-right: 4px;}

</style>
</head>
<body style="margin:0; padding:0; font-family:Arial;background-color:#7393B3;">
   
<div class="header">

  <div class="header-right">
  <a href="HOMEPAGE RESIDENTS.jsp">HOME</a>
   <a href="Res Profile.jsp">PROFILE</a>
    <a href="index.jsp">LOGOUT</a>
  </div>
</div>
			
			<div class="center">
	
         
  <div class="imgcontainer">
<div class="container">
  <div class="row">
    <div class="col-12">
      <table class="table table-bordered">
       <h2>VIEW REPORT</h2>

<table class="table table-bordered">
       
       <h2>VIEW REPORTS</h2>

			<table>
							<tr>
								<th>Report Id</th>
								<th>Patrolman Id</th>
								<th>Report Description</th>
								<th>Date Created</th>
								
								<th colspan="3"></th>
							</tr>
							<c:forEach items="${reports}" var="report">
								<tr>
									<td><c:out value="${report.reportId}" /></td>
									<td><c:out value="${report.patrolmanId}" /></td>
									<td><c:out value="${report.reportDescription}" /></td>
									<td><c:out value="${report.reportDateSubmit}" /></td>
									<td><a href="viewReportComm?action=view&reportId=<c:out value="${report.reportId}"/>" class="button">View</a></td>
							</c:forEach>
			</table>
			
			</table>


</div>
	</div>

</body>

</html>