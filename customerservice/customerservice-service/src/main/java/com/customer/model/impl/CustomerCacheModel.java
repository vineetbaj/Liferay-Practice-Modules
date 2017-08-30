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

package com.customer.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.customer.model.Customer;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
@ProviderType
public class CustomerCacheModel implements CacheModel<Customer>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerCacheModel)) {
			return false;
		}

		CustomerCacheModel customerCacheModel = (CustomerCacheModel)obj;

		if (cid == customerCacheModel.cid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, cid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{cid=");
		sb.append(cid);
		sb.append(", cusername=");
		sb.append(cusername);
		sb.append(", cpass=");
		sb.append(cpass);
		sb.append(", cname=");
		sb.append(cname);
		sb.append(", cemail=");
		sb.append(cemail);
		sb.append(", cmobile=");
		sb.append(cmobile);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Customer toEntityModel() {
		CustomerImpl customerImpl = new CustomerImpl();

		customerImpl.setCid(cid);

		if (cusername == null) {
			customerImpl.setCusername(StringPool.BLANK);
		}
		else {
			customerImpl.setCusername(cusername);
		}

		if (cpass == null) {
			customerImpl.setCpass(StringPool.BLANK);
		}
		else {
			customerImpl.setCpass(cpass);
		}

		if (cname == null) {
			customerImpl.setCname(StringPool.BLANK);
		}
		else {
			customerImpl.setCname(cname);
		}

		if (cemail == null) {
			customerImpl.setCemail(StringPool.BLANK);
		}
		else {
			customerImpl.setCemail(cemail);
		}

		if (cmobile == null) {
			customerImpl.setCmobile(StringPool.BLANK);
		}
		else {
			customerImpl.setCmobile(cmobile);
		}

		customerImpl.resetOriginalValues();

		return customerImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		cid = objectInput.readLong();
		cusername = objectInput.readUTF();
		cpass = objectInput.readUTF();
		cname = objectInput.readUTF();
		cemail = objectInput.readUTF();
		cmobile = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(cid);

		if (cusername == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cusername);
		}

		if (cpass == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cpass);
		}

		if (cname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cname);
		}

		if (cemail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cemail);
		}

		if (cmobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cmobile);
		}
	}

	public long cid;
	public String cusername;
	public String cpass;
	public String cname;
	public String cemail;
	public String cmobile;
}