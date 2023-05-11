<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="ISO-8859-1">
<style>


.content2{
    background: #C5DEDC;
	margin-top: 1px;
	width: 1070px;
	padding: 20px;
	margin-left: 150px;
	height: 900px;
	color:white;
	position: relative;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}
.content2 h1{
    color: black;
	text-align: center;
	font-family:'Montserrat Alternates', sans-serif;
	margin-top: 50px;
	letter-spacing: 15px;
}

.wrap{
	position: relative;
	height: 100px;
	margin-top: 60px;
	margin-left: 115px;
}

.card-img {
  display: block;
  width: 30%;
  height: 102px;
  object-fit: cover;
  margin-left: 118px;
  margin-top: 50px;
}

.card{
    width: 350px;
	height: 250px;
    display: inline-table;
	border-radius: 5px;
    background: white;
    box-shadow: 5px 5px 15px rgba(0,0,0,0.9);
    text-align: center;
	margin: 30px;
	transition: transform0.5s;
	cursor: pointer;
}
.card:hover{
    transform: translateY(-10px);
}
.card1 h3{
    font-family: 'Quicksand', sans-serif;
	text-align:center;
	color: #737373;
	letter-spacing: 5px;
}

.card2 h3{
    font-family: 'Quicksand', sans-serif;
	text-align:center;
	color: #737373;
	letter-spacing: 5px;
}
.card3 h3{
    font-family: 'Quicksand', sans-serif;
	text-align:center;
	color: #737373;
	letter-spacing: 5px;
	
}
.card4 h3{
    font-family: 'Quicksand', sans-serif;
	text-align:center;
	color: #737373;
	letter-spacing: 5px;
	
}
a:link, a:visited {
  background-color: #7393B3;
  color: black;
  border: 2px solid #bfbfbf;
  padding: 15px 3px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  

}

a:hover, a:active {
  background-color: #7ADBD3;
  color: white;
}
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
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
  font-size: 13px; 
  line-height: 10px;
  border-radius: 10px;
  
}
a:link, a:visited {
  background-color: #7393B3;
  color: black;
  border: 2px solid #7393B3;
  padding: 5px 3px;
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
<body style="margin:0; padding:0 ; font-family:Arial;background-color:#7393B3;">
   
<div class="header">

  <div class="header-right">
  
    <a href="login comm.jsp">LOGOUT</a>
  </div>
</div>
 

<div id="top" class="content2">
	    <h1><b>. COMMITTEE .</b></h1>
		    <div class="wrap">
                <div class = "card card1">
			        <b href=""><img class="card-img" src="img/calander img.png" alt="SCHEDULE" /></b>
		            <h3>SCHEDULE</h3>
		
				<a href="listScheduleControllerComm">View Schedule</a>
				<a href="comm CreateSchedule.jsp" >Create Schedule</a>
				<hr>.</hr>
				
				

		        </div>
				
		        <div class = "card card2">
			        <b href=""><img class="card-img" src="img/report p.png" alt="REPORT" /></b>
			        <h3>REPORT</h3>
				
					<a href="ListReportComm">View Report</a>
					<hr>.</hr>
				
		        </div>
				
				<div class = "card card3">
			        <b href=""><img class="card-img" src="img/pm.png" alt="patrolman" /></b>
			        <h3>PATROLMAN</h3>
				
					<a href="comm createPat.jsp" target =" blank">Create Patrolman</a>
					<a href="ListPatrolmanControllerUpdate" target="_blank">Update Patrolman</a>
					<a href="ListPatrolmanController">View Patrolman</a>
					<hr>.</hr>
				
		        </div>
				
				<div class = "card card4">
			        <b href="PReport.html"><img class="card-img" src="img/rs.png" alt="resident" /></b>
			        <h3>RESIDENT</h3>
	
					<a href="UpdateResidentListController" target="_blank">Update Resident</a>
					<a href="ListResidentController">View Resident</a>
					<hr>.</hr>
				
		        </div>
				
		   </div> 	   
	</div>

</div>
</body>
</html>