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

package com.employee.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.employee.model.Employee;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
@ProviderType
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmployeeCacheModel)) {
			return false;
		}

		EmployeeCacheModel employeeCacheModel = (EmployeeCacheModel)obj;

		if (eid == employeeCacheModel.eid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, eid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{eid=");
		sb.append(eid);
		sb.append(", ename=");
		sb.append(ename);
		sb.append(", emailid=");
		sb.append(emailid);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setEid(eid);

		if (ename == null) {
			employeeImpl.setEname(StringPool.BLANK);
		}
		else {
			employeeImpl.setEname(ename);
		}

		if (emailid == null) {
			employeeImpl.setEmailid(StringPool.BLANK);
		}
		else {
			employeeImpl.setEmailid(emailid);
		}

		if (mobile == null) {
			employeeImpl.setMobile(StringPool.BLANK);
		}
		else {
			employeeImpl.setMobile(mobile);
		}

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		eid = objectInput.readLong();
		ename = objectInput.readUTF();
		emailid = objectInput.readUTF();
		mobile = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(eid);

		if (ename == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ename);
		}

		if (emailid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailid);
		}

		if (mobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobile);
		}
	}

	public long eid;
	public String ename;
	public String emailid;
	public String mobile;
}