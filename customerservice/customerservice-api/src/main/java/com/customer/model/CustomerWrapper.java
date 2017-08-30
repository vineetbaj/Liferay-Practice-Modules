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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Customer}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
@ProviderType
public class CustomerWrapper implements Customer, ModelWrapper<Customer> {
	public CustomerWrapper(Customer customer) {
		_customer = customer;
	}

	@Override
	public Class<?> getModelClass() {
		return Customer.class;
	}

	@Override
	public String getModelClassName() {
		return Customer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("cid", getCid());
		attributes.put("cusername", getCusername());
		attributes.put("cpass", getCpass());
		attributes.put("cname", getCname());
		attributes.put("cemail", getCemail());
		attributes.put("cmobile", getCmobile());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		String cusername = (String)attributes.get("cusername");

		if (cusername != null) {
			setCusername(cusername);
		}

		String cpass = (String)attributes.get("cpass");

		if (cpass != null) {
			setCpass(cpass);
		}

		String cname = (String)attributes.get("cname");

		if (cname != null) {
			setCname(cname);
		}

		String cemail = (String)attributes.get("cemail");

		if (cemail != null) {
			setCemail(cemail);
		}

		String cmobile = (String)attributes.get("cmobile");

		if (cmobile != null) {
			setCmobile(cmobile);
		}
	}

	@Override
	public Customer toEscapedModel() {
		return new CustomerWrapper(_customer.toEscapedModel());
	}

	@Override
	public Customer toUnescapedModel() {
		return new CustomerWrapper(_customer.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _customer.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _customer.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _customer.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _customer.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Customer> toCacheModel() {
		return _customer.toCacheModel();
	}

	@Override
	public int compareTo(Customer customer) {
		return _customer.compareTo(customer);
	}

	@Override
	public int hashCode() {
		return _customer.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _customer.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerWrapper((Customer)_customer.clone());
	}

	/**
	* Returns the cemail of this customer.
	*
	* @return the cemail of this customer
	*/
	@Override
	public java.lang.String getCemail() {
		return _customer.getCemail();
	}

	/**
	* Returns the cmobile of this customer.
	*
	* @return the cmobile of this customer
	*/
	@Override
	public java.lang.String getCmobile() {
		return _customer.getCmobile();
	}

	/**
	* Returns the cname of this customer.
	*
	* @return the cname of this customer
	*/
	@Override
	public java.lang.String getCname() {
		return _customer.getCname();
	}

	/**
	* Returns the cpass of this customer.
	*
	* @return the cpass of this customer
	*/
	@Override
	public java.lang.String getCpass() {
		return _customer.getCpass();
	}

	/**
	* Returns the cusername of this customer.
	*
	* @return the cusername of this customer
	*/
	@Override
	public java.lang.String getCusername() {
		return _customer.getCusername();
	}

	@Override
	public java.lang.String toString() {
		return _customer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customer.toXmlString();
	}

	/**
	* Returns the cid of this customer.
	*
	* @return the cid of this customer
	*/
	@Override
	public long getCid() {
		return _customer.getCid();
	}

	/**
	* Returns the primary key of this customer.
	*
	* @return the primary key of this customer
	*/
	@Override
	public long getPrimaryKey() {
		return _customer.getPrimaryKey();
	}

	@Override
	public void persist() {
		_customer.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customer.setCachedModel(cachedModel);
	}

	/**
	* Sets the cemail of this customer.
	*
	* @param cemail the cemail of this customer
	*/
	@Override
	public void setCemail(java.lang.String cemail) {
		_customer.setCemail(cemail);
	}

	/**
	* Sets the cid of this customer.
	*
	* @param cid the cid of this customer
	*/
	@Override
	public void setCid(long cid) {
		_customer.setCid(cid);
	}

	/**
	* Sets the cmobile of this customer.
	*
	* @param cmobile the cmobile of this customer
	*/
	@Override
	public void setCmobile(java.lang.String cmobile) {
		_customer.setCmobile(cmobile);
	}

	/**
	* Sets the cname of this customer.
	*
	* @param cname the cname of this customer
	*/
	@Override
	public void setCname(java.lang.String cname) {
		_customer.setCname(cname);
	}

	/**
	* Sets the cpass of this customer.
	*
	* @param cpass the cpass of this customer
	*/
	@Override
	public void setCpass(java.lang.String cpass) {
		_customer.setCpass(cpass);
	}

	/**
	* Sets the cusername of this customer.
	*
	* @param cusername the cusername of this customer
	*/
	@Override
	public void setCusername(java.lang.String cusername) {
		_customer.setCusername(cusername);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_customer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_customer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_customer.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_customer.setNew(n);
	}

	/**
	* Sets the primary key of this customer.
	*
	* @param primaryKey the primary key of this customer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_customer.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_customer.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerWrapper)) {
			return false;
		}

		CustomerWrapper customerWrapper = (CustomerWrapper)obj;

		if (Objects.equals(_customer, customerWrapper._customer)) {
			return true;
		}

		return false;
	}

	@Override
	public Customer getWrappedModel() {
		return _customer;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _customer.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _customer.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_customer.resetOriginalValues();
	}

	private final Customer _customer;
}