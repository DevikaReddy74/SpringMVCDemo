<!-- The below jsp link is for form tag libraries -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Student Registration Form</title>
<style type="text/css">
	.error{color:red}
</style>
</head>
<body>
	<h3>Student Details</h3>
	
	<form:form action="processStudent" modelAttribute="student">
	
	First name:* <form:input path="firstName" />
	<form:errors path="firstName" cssClass="error" />
	
	<br /><br/>	
	Last name: <form:input path="lastName" /><br/><br/>
	
	Gender: 
	<form:radiobutton path="gender" value="female"/>Female
	<form:radiobutton path="gender" value="male"/>Male<br/><br/>
	
	Age: <form:input path="age"/>
	<form:errors path="age" cssClass="error" />
	
	<br/><br/>
	Languages Known: 
	<form:checkbox path="langs" value="Telugu"/>Telugu
	<form:checkbox path="langs" value="English"/>English
	<form:checkbox path="langs" value="Hindi"/>Hindi<br/><br/>
	
	Location: <form:select path="location">
		<form:options items="${student.locOptions}"/>

<!--  
		<form:option value="Anantapur" label="Anantapur" />
		<form:option value="Kurnool" label="Kurnool"/>
		<form:option value="Kadapa" label="Kadapa"/>
		<form:option value="Chittor" label="Chittor"/>
		-->
	</form:select><br/><br/>
	Pincode: <form:input path="pincode"/>
	<form:errors path="pincode" cssClass="error" /><br/><br/>
		<input type="submit" value="submit">

	</form:form>
</body>
</html>