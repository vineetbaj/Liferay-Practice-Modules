<%@ include file="/init.jsp" %>

<portlet:actionURL name="employeeSubmit" var="employeeSubmit" />

<h4>Employee Form</h4>

<form action="<%=employeeSubmit%>"  method="Post">

Name : <input type="text" name="<portlet:namespace/>name"><br><br>
E-mail : <input type="text" name="<portlet:namespace/>email"><br><br>
Mobile : <input type="text" name="<portlet:namespace/>mobile"><br>

<input type="Submit" value="SUBMIT">


</form>