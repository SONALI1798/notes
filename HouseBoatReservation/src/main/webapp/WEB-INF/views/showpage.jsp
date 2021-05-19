
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<center>
<h1><center> Welcome to House Boat Reservation </center></h1>
<form:form method="POST" action="/billdesk" modelAttribute="houseBoat">

<table>
<tr>
	<td><lable>Choose House Boat Type:</lable></td>
	<td><form:select path="houseBoatType" name="houseBoatType" id="houseBoatType" items="${roomList}"></form:select></td>
	
</tr>

<tr>
	<td><lable>Enter Number Of Days</lable></td>
	<td><form:input path="noOfDays" id="noOfDays" name="noOfDays"/></td>
	<form:errors path="noOfDays"></form:errors>

</tr>

<tr>
	<td><input type="submit" value="TotalCost" name="submit" /></td>
	<td><input type="reset"  value="Cancel" name="cancel"/></td>

</tr>

</table>

              
	
</form:form>

</center>
</body>
</html>	 	  	    	    	     	      	 	
 	  	    	    	     	      	 	
