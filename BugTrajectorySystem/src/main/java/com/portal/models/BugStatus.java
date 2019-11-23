package com.portal.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BugStatus {
@Id
@Column(name="status_id")
int statusId;
@Column(name="status_name")
String statusName;
public int getStatusId() {
	return statusId;
}
public void setStatusId(int statusId) {
	this.statusId = statusId;
}
public String getStatusName() {
	return statusName;
}
public void setStatusName(String statusName) {
	this.statusName = statusName;
}
@Override
public String toString() {
	return "BugStatus [statusId=" + statusId + ", statusName=" + statusName + "]";
}

}
/*
 * 
 * 
 * BugStatus model :-

@Entity
public class BugStatus {
	@Id
	int statusId;
	String statusName;

	Setters and Getters
}*/
 