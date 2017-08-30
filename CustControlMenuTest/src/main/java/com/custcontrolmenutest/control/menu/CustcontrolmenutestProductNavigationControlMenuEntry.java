package com.custcontrolmenutest.control.menu;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.ResourceBundleUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.product.navigation.control.menu.BaseProductNavigationControlMenuEntry;
import com.liferay.product.navigation.control.menu.ProductNavigationControlMenuEntry;
import com.liferay.product.navigation.control.menu.constants.ProductNavigationControlMenuCategoryKeys;

import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	property = {
		"product.navigation.control.menu.category.key=" + ProductNavigationControlMenuCategoryKeys.TOOLS,
		"product.navigation.control.menu.entry.order:Integer=1"
	},
	service = ProductNavigationControlMenuEntry.class
)
public class CustcontrolmenutestProductNavigationControlMenuEntry
	extends BaseProductNavigationControlMenuEntry
	implements ProductNavigationControlMenuEntry {
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ProductNavigationControlMenuEntry)) {
			return false;
		}

		ProductNavigationControlMenuEntry productNavigationControlMenuEntry =
			(ProductNavigationControlMenuEntry)obj;

		if (Objects.equals(
				getKey(), productNavigationControlMenuEntry.getKey())) {

			return true;
		}

		return false;
	}

	@Override
	public String getLabel(Locale locale) {
		ResourceBundle resourceBundle = ResourceBundleUtil.getBundle(
			"content.Language", locale, getClass());

		return LanguageUtil.get(resourceBundle, "custom-message");
	}
	
	@Override
	public String getIcon(HttpServletRequest request) {
		return "link";
	}

	@Override
	public String getIconCssClass(HttpServletRequest request) {
		return "";
	}

	@Override
	public String getKey() {
		Class<?> clazz = getClass();

		return clazz.getName();
	}

	@Override
	public String getLinkCssClass(HttpServletRequest request) {
		return "link";
	}

	@Override
	public String getMarkupView(HttpServletRequest request) {
		return "lexicon";
	}

	

	
	@Override
	public boolean includeIcon(
			HttpServletRequest request, HttpServletResponse response)
		throws IOException {

		return false;
	}

	@Override
	public boolean isShow(HttpServletRequest request) throws PortalException {
		return true;
	}

	@Override
	public boolean isUseDialog() {
		return false;
}

	@Override
	public Map<String, Object> getData(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getURL(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return "/widget/web/guest/home/-/Panelapptest";
	}
}