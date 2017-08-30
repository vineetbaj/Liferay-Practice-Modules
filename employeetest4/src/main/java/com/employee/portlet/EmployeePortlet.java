package com.employee.portlet;

import com.employee.model.Employee;
import com.employee.service.EmployeeLocalServiceUtil;
import com.employee.service.impl.EmployeeLocalServiceImpl;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=employeetest4 Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EmployeePortlet extends MVCPortlet {
	
	public void employeeSubmit(ActionRequest request,ActionResponse response) throws IOException, PortletException
	{
		String name = ParamUtil.getString(request, "name");
		String email = ParamUtil.getString(request, "email");
		String mobile = ParamUtil.getString(request, "mobile");
		try{
		Employee employee = EmployeeLocalServiceUtil.createEmployee(CounterLocalServiceUtil.increment());
		employee.setEname(name);
		employee.setEmailid(email);
		employee.setMobile(mobile);
		EmployeeLocalServiceUtil.addEmployee(employee);
		//EmployeeLocalServiceUtil.deleteEmployee(employee);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		try {
			Employee employee = EmployeeLocalServiceUtil.getEmployee(1);
			System.out.println(employee.getEmailid());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("====>"+name+"==="+email+"==="+mobile);
		
		
	}
}