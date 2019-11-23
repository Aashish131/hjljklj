package com.portal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Severity")
public class Severity {
	@Id
	@Column(name="severity_id")
	int seveityId;
	@Column(name="severity_name")
	String severityType;
	public int getSeveityId() {
		return seveityId;
	}
	public void setSeveityId(int seveityId) {
		this.seveityId = seveityId;
	}
	public String getSeverityType() {
		return severityType;
	}
	public void setSeverityType(String severityType) {
		this.severityType = severityType;
	}
	@Override
	public String toString() {
		return "Severity [seveityId=" + seveityId + ", severityType=" + severityType + "]";
	}
	

}