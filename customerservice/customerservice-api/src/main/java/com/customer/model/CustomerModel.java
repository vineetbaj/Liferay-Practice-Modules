/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.customer.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Customer service. Represents a row in the &quot;customer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.customer.model.impl.CustomerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.customer.model.impl.CustomerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @see com.customer.model.impl.CustomerImpl
 * @see com.customer.model.impl.CustomerModelImpl
 * @generated
 */
@ProviderType
public interface CustomerModel extends BaseModel<Customer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a customer model instance should use the {@link Customer} interface instead.
	 */

	/**
	 * Returns the primary key of this customer.
	 *
	 * @return the primary key of this customer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this customer.
	 *
	 * @param primaryKey the primary key of this customer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the cid of this customer.
	 *
	 * @return the cid of this customer
	 */
	public long getCid();

	/**
	 * Sets the cid of this customer.
	 *
	 * @param cid the cid of this customer
	 */
	public void setCid(long cid);

	/**
	 * Returns the cusername of this customer.
	 *
	 * @return the cusername of this customer
	 */
	@AutoEscape
	public String getCusername();

	/**
	 * Sets the cusername of this customer.
	 *
	 * @param cusername the cusername of this customer
	 */
	public void setCusername(String cusername);

	/**
	 * Returns the cpass of this customer.
	 *
	 * @return the cpass of this customer
	 */
	@AutoEscape
	public String getCpass();

	/**
	 * Sets the cpass of this customer.
	 *
	 * @param cpass the cpass of this customer
	 */
	public void setCpass(String cpass);

	/**
	 * Returns the cname of this customer.
	 *
	 * @return the cname of this customer
	 */
	@AutoEscape
	public String getCname();

	/**
	 * Sets the cname of this customer.
	 *
	 * @param cname the cname of this customer
	 */
	public void setCname(String cname);

	/**
	 * Returns the cemail of this customer.
	 *
	 * @return the cemail of this customer
	 */
	@AutoEscape
	public String getCemail();

	/**
	 * Sets the cemail of this customer.
	 *
	 * @param cemail the cemail of this customer
	 */
	public void setCemail(String cemail);

	/**
	 * Returns the cmobile of this customer.
	 *
	 * @return the cmobile of this customer
	 */
	@AutoEscape
	public String getCmobile();

	/**
	 * Sets the cmobile of this customer.
	 *
	 * @param cmobile the cmobile of this customer
	 */
	public void setCmobile(String cmobile);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Customer customer);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Customer> toCacheModel();

	@Override
	public Customer toEscapedModel();

	@Override
	public Customer toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}