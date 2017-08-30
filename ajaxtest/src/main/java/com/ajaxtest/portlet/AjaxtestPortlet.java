package com.ajaxtest.portlet;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletSession;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ajaxtest Portlet",
		"javax.portlet.init-param.template-path=/",
		"com.liferay.portlet.requires-namespaced-parameters=false",
		"javax.portlet.display-name=IPC-Receiver Portlet",    
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.supported-processing-event=selectedReport;https://my-liferay-namespace.com/events",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class AjaxtestPortlet extends MVCPortlet {
	
	
	@Override
	  public void processEvent(EventRequest request, EventResponse response) throws PortletException, IOException {      
	      Event event = request.getEvent();
	      if(event.getName().equals("selectedReport")){
	         System.out.println("selectedReport Event found!");
	         String eventValue = (String) event.getValue();
	         System.out.println("show me that value from the IPC-Event: " + eventValue);
	         request.setAttribute("eventValue", eventValue);
	         response.setRenderParameter("jspPage", "/html/aj/ajaxrec.jsp");
	      }
	      super.processEvent(request, response);
	   }
	
	
	/*@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		PortletSession session = renderRequest.getPortletSession();
		String value = (String) session.getAttribute("fromNumber", PortletSession.APPLICATION_SCOPE);
		System.out.println("function called.....");
	    /* String fromString = (String) renderRequest.getAttribute("fromAction");
		
		renderRequest.setAttribute("fromNumber", fromString);	
	//	System.out.println(":::"+fromString);
		super.doView(renderRequest, renderResponse);
	}
	public void ajaxSubmit(ResourceRequest resourceRequest
            , ResourceResponse resourceResponse) throws IOException,PortletException
	{
		System.out.println("testing actionurl..............");
	}*/
	@Override
    public void serveResource(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException,
            PortletException {
        System.out.println("#############AJAX CALL####################");
        String fullName = ParamUtil.getString(resourceRequest, "fullName");
        String age = ParamUtil.getString(resourceRequest, "age");
        //ajaxSubmit(resourceRequest, resourceResponse);
        System.out.println("The value of fullName  "+fullName);
        System.out.println("The value of age  "+age);
        resourceResponse.createRenderURL().setParameter("jspPage",
                "/html/aj/ajaxrec.jsp");
        super.serveResource(resourceRequest, resourceResponse);
    }
}