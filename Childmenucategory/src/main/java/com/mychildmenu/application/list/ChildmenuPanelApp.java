package com.mychildmenu.application.list;

import com.mychildmenu.constants.ChildmenuPanelCategoryKeys;
import com.mychildmenu.constants.ChildmenuPortletKeys;
import com.liferay.application.list.BaseJSPPanelApp;
import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key="+ ChildmenuPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class ChildmenuPanelApp extends BaseJSPPanelApp {

	@Override
	public String getPortletId() {
		return ChildmenuPortletKeys.Childmenu;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + ChildmenuPortletKeys.Childmenu + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		
		super.setPortlet(portlet);
	}

	@Override
	public String getJspPath() {
		// TODO Auto-generated method stub
		return "/panel/app/layouts_tree.jsp";
	}

	
	
	@Override
	@Reference(
	    target = "(osgi.web.symbolicname=com.liferay.layout.admin.web)",
	    unbind = "-"
	)
	
	public void setServletContext(ServletContext servletContext) {
	    super.setServletContext(servletContext);
	}
}