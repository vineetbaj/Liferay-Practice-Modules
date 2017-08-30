package com.ipcmultest.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
//import com.liferay.portal.util.PortalUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.IOException;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=IpcMultTest Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.supported-processing-event=selectedReport;https://my-liferay-namespace.com/events",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class IpcmultestPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
	
		PortletSession session = renderRequest.getPortletSession();
		 String userName = (String) session.getAttribute("username", PortletSession.APPLICATION_SCOPE);
		 if (userName != null) {
		 System.out.println("asdfghjkl..........");
			 renderRequest.setAttribute("userName", userName);
		 }
		 
		 include(viewTemplate, renderRequest, renderResponse);
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}
	
	@Override
	  public void processEvent(EventRequest request, EventResponse response) throws PortletException, IOException {      
	      Event event = request.getEvent();
	      if(event.getName().equals("selectedReport")){
	         System.out.println("selectedReport Event found!");
	         String eventValue = (String) event.getValue();
	         System.out.println("show me that value from the IPC-Event: " + eventValue);
	         request.setAttribute("eventValue", eventValue);
	         response.setRenderParameter("jspPage", "/html/test/test.jsp");
	         
	         
	         HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(request);
			HttpSession session = httpRequest.getSession();
			System.out.println(session+":::::"+session.getLastAccessedTime()+"::::"+session.getCreationTime());
			String a = (String) session.getAttribute("hi");
			
			System.out.println("value of a is : "+a+"-----"+session+"---"+session.getAttribute("hi")+"---"+session.getAttribute("hi"));

	      }
	      super.processEvent(request, response);
	   }
}