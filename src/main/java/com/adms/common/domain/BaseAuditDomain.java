package com.adms.common.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class BaseAuditDomain extends BaseDomain {

	private static final long serialVersionUID = -3170976403036443133L;
	
	@Column(name="CREATE_DATE", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name="CREATE_BY", nullable=false)
	private String createBy;

	@Column(name="UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@Column(name="UPDATE_BY")
	private String updateBy;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	@Override
	public String toString() {
		return "Create and Update [createDate=" + createDate + ", createBy="
				+ createBy + ", updateDate=" + updateDate + ", updateBy="
				+ updateBy + "]";
	}

}
