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

package com.employee.model;

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
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
@ProviderType
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
	public EmployeeWrapper(Employee employee) {
		_employee = employee;
	}

	@Override
	public Class<?> getModelClass() {
		return Employee.class;
	}

	@Override
	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("eid", getEid());
		attributes.put("ename", getEname());
		attributes.put("emailid", getEmailid());
		attributes.put("mobile", getMobile());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long eid = (Long)attributes.get("eid");

		if (eid != null) {
			setEid(eid);
		}

		String ename = (String)attributes.get("ename");

		if (ename != null) {
			setEname(ename);
		}

		String emailid = (String)attributes.get("emailid");

		if (emailid != null) {
			setEmailid(emailid);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}
	}

	@Override
	public Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public Employee toUnescapedModel() {
		return new EmployeeWrapper(_employee.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _employee.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	@Override
	public int compareTo(Employee employee) {
		return _employee.compareTo(employee);
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	/**
	* Returns the emailid of this employee.
	*
	* @return the emailid of this employee
	*/
	@Override
	public java.lang.String getEmailid() {
		return _employee.getEmailid();
	}

	/**
	* Returns the ename of this employee.
	*
	* @return the ename of this employee
	*/
	@Override
	public java.lang.String getEname() {
		return _employee.getEname();
	}

	/**
	* Returns the mobile of this employee.
	*
	* @return the mobile of this employee
	*/
	@Override
	public java.lang.String getMobile() {
		return _employee.getMobile();
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	/**
	* Returns the eid of this employee.
	*
	* @return the eid of this employee
	*/
	@Override
	public long getEid() {
		return _employee.getEid();
	}

	/**
	* Returns the primary key of this employee.
	*
	* @return the primary key of this employee
	*/
	@Override
	public long getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	@Override
	public void persist() {
		_employee.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	/**
	* Sets the eid of this employee.
	*
	* @param eid the eid of this employee
	*/
	@Override
	public void setEid(long eid) {
		_employee.setEid(eid);
	}

	/**
	* Sets the emailid of this employee.
	*
	* @param emailid the emailid of this employee
	*/
	@Override
	public void setEmailid(java.lang.String emailid) {
		_employee.setEmailid(emailid);
	}

	/**
	* Sets the ename of this employee.
	*
	* @param ename the ename of this employee
	*/
	@Override
	public void setEname(java.lang.String ename) {
		_employee.setEname(ename);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_employee.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_employee.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the mobile of this employee.
	*
	* @param mobile the mobile of this employee
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_employee.setMobile(mobile);
	}

	@Override
	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	/**
	* Sets the primary key of this employee.
	*
	* @param primaryKey the primary key of this employee
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeWrapper)) {
			return false;
		}

		EmployeeWrapper employeeWrapper = (EmployeeWrapper)obj;

		if (Objects.equals(_employee, employeeWrapper._employee)) {
			return true;
		}

		return false;
	}

	@Override
	public Employee getWrappedModel() {
		return _employee;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _employee.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _employee.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private final Employee _employee;
}