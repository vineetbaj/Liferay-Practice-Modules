package com.customer.portlet;

import com.customer.model.Customer;
import com.customer.service.CustomerLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.Userdetails",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=customertest Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class CustomerPortlet extends MVCPortlet {
	public void customerSubmit(ActionRequest request,ActionResponse response) throws IOException, PortletException
	{
	String username = ParamUtil.getString(request, "username");
	String pass = ParamUtil.getString(request, "pass");
	String confpass = ParamUtil.getString(request, "confpass");
	String name = ParamUtil.getString(request, "name");
	String email = ParamUtil.getString(request, "email");
	String mobile = ParamUtil.getString(request, "mobile");
	
	
		
		 try{
			 
		   Customer customer = CustomerLocalServiceUtil.createCustomer(CounterLocalServiceUtil.increment());
		   customer.setCusername(username);
		   customer.setCpass(pass);
		   customer.setCname(name);
		   customer.setCemail(email);
		   customer.setCmobile(mobile);
		   CustomerLocalServiceUtil.addCustomer(customer);
		   System.out.println("====>"+username+"="+pass+"==="+confpass+"==="+name+"==="+email+"==="+mobile);
		    }catch(Exception e){
			e.printStackTrace();
		  }
		 //super.serveResource(request, response);
	
	
}
	
	@Override
    public void serveResource(ResourceRequest resourceRequest,
            ResourceResponse resourceResponse) throws IOException,
            PortletException {
        System.out.println("#############AJAX CALL####################");
        String username = ParamUtil.getString(resourceRequest, "username");
    	String pass = ParamUtil.getString(resourceRequest, "pass");
    	String confpass = ParamUtil.getString(resourceRequest, "confpass");
    	String name = ParamUtil.getString(resourceRequest, "name");
    	String email = ParamUtil.getString(resourceRequest, "email");
    	String mobile = ParamUtil.getString(resourceRequest, "mobile");
    
    	
    	
    	Long companyId = CompanyThreadLocal.getCompanyId();
        
        User user = null;
        try {
            user = UserLocalServiceUtil.getUserById(companyId);
        } catch (PortalException e) {
            e.printStackTrace();
        } catch (SystemException e) {
            e.printStackTrace();
        }
 
        resourceResponse.setContentType("text/html");
        PrintWriter writer = resourceResponse.getWriter();
        if(user != null){
            writer.print("username already exist"+user.getEmailAddress());
        /*
          own login
          customize table
          session mgmt.
         */
     
    	 }
        else
        {	
        	try
        	{
        	Customer customer = CustomerLocalServiceUtil.createCustomer(CounterLocalServiceUtil.increment());
        	customer.setCusername(username);
        	customer.setCpass(pass);
        	customer.setCname(name);
        	customer.setCemail(email);
        	customer.setCmobile(mobile);
        	CustomerLocalServiceUtil.addCustomer(customer);
        	System.out.println("====>"+username+"="+pass+"==="+confpass+"==="+name+"==="+email+"==="+mobile);
		    }
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	} 
        	super.serveResource(resourceRequest, resourceResponse); 
		  }
    }
}	