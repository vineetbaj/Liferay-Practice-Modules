<%@ include file="/init.jsp" %>
<%request.getSession().setAttribute("attr1","value1");%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<theme:defineObjects/>
<portlet:defineObjects />
<portlet:resourceURL var="ajaxSubmit"/>
<script type="text/javascript">
function onServeResource()
{
	AUI().use('aui-io-request', function(A){
        A.io.request('<%=ajaxSubmit%>', {
               method: 'post',
               form: {
                   id: 'fm'
               }
            });
    });
}
 
</script>
<form name="ajaxSubmit" id="fm" action="ajaxSubmit">
Full Name:<input type="text" name="<portlet:namespace/>fullName"/>
<br/>
Age:<input type="text" name="<portlet:namespace/>age"/>
<br/>
<input type="button" value="Submit Form Data" onclick="onServeResource()">
</form>