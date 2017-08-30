<%@ include file="/init.jsp" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<theme:defineObjects/>
<portlet:defineObjects />
<portlet:resourceURL var="customerSubmit"/>
<script type="text/javascript">
function callcustomerSubmit(){
	AUI().use('aui-io-request', function(A){
        A.io.request('<%=customerSubmit%>', {
               method: 'post',
               form: {
                   id: 'fm',
                   on: {
                       success: function() {
                           alert(this.get('responseData'));
                                           }
                        }
                     } 
            });
    });
}
</script>



<h4>User Form</h4>


<aui:form name="customerSubmit" id="fm" action="<%=customerSubmit%>">
        
     <aui:input label="Username" name="username" type="text" 
value='<%= "" %>'>
        <aui:validator name="required" />
        
</aui:input>
    
     <aui:input label="Password" name="pass" type="password" 
value='<%= "" %>'>
        <aui:validator name="required" />
        <aui:validator name="minLength">8</aui:validator>
      
</aui:input>

    <aui:input label="Confirm Password" name="confpass" type="password" 
value='<%= "" %>'>
        <aui:validator name="required" />
        <aui:validator name="minLength" errorMessage="Password too short..!!">8</aui:validator>
        <aui:validator name="equalTo">'#<portlet:namespace/>pass'</aui:validator>
</aui:input>


   <aui:input label="Name" name="name" type="text" 
value='<%= "" %>'>
        <aui:validator name="required" />
        <aui:validator name="name" />
        
</aui:input>


   <aui:input label="Email" name="email" type="text" 
value='<%= "" %>'>
        <aui:validator name="required" />
        <aui:validator name="email" />
        
</aui:input>

   <aui:input label="Mobile" name="mobile" type="text" 
value='<%= "" %>'>
        <aui:validator name="required" />
        <aui:validator name="number" />
        <aui:validator name="rangeLength">[8,15]</aui:validator>
              
</aui:input>
   
  <aui:button type="submit" value="SUBMIT" onClick="callcustomerSubmit" /> 
     
</aui:form>

<!--  <form method="Post">

Username : <input type="text" name="<portlet:namespace/>username"><br><br>
Password : <input type="text" name="<portlet:namespace/>pass"><br><br>
Confirm Password : <input type="text" name="<portlet:namespace/>confpass"><br><br>
Name : <input type="text" name="<portlet:namespace/>name"><br><br>
E-mail : <input type="text" name="<portlet:namespace/>email"><br><br>
Mobile : <input type="text" name="<portlet:namespace/>mobile"><br>

<input type="Submit" value="SUBMIT">


</form>-->