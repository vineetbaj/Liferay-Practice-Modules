package com.mychildmenu.application.list;

import com.mychildmenu.constants.ChildmenuPanelCategoryKeys;

import com.liferay.application.list.BasePanelCategory;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;

import java.awt.Panel;
import java.util.Locale;
import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"panel.category.key=MycustomMenu", //+ PanelCategoryKeys.USER,
		"panel.category.order:Integer=100"
	},
	service = PanelCategory.class
)
public class ChildmenuPanelCategory extends BasePanelCategory {

	@Override
	public String getKey() {
		return ChildmenuPanelCategoryKeys.CONTROL_PANEL_CATEGORY;
	}

	@Override
	public String getLabel(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", locale, getClass());

		return LanguageUtil.get(resourceBundle, "View Policy");
	}

}