<!-- The below jsp code is for is for JSTL foreach -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Student Form</title>
</head>
<body>
	<h3>Student Details Registered</h3>
	First name: ${student.firstName}<br/><br/>
	Last name: ${student.lastName}<br/><br/>
	Gender: ${student.gender }<br/><br/>
	Age: ${student.age }<br/><br/>
	Languages Known:
	<c:forEach var="temp" items="${student.langs }">
		${temp },
	</c:forEach>
	<br/><br/>
	Location: ${student.location }<br/><br/>
	
	Pincode: ${student.pincode }<br/><br/>
	
	<br/><br/>
</body>
</html>