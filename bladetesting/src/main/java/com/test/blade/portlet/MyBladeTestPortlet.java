package com.test.blade.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * @author hp
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.portlet-name=blade test portlet",
		"com.liferay.portlet.control-panel-entry-category=sites",
		"com.liferay.portlet.control-panel-entry-weight=1",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=bladetesting Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MyBladeTestPortlet extends MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		super.doView(renderRequest, renderResponse);
		PrintWriter printWriter = renderResponse.getWriter();
        System.out.println("blade...........");
        printWriter.print("cp-portlet Portlet - Hello World!");
	}
}