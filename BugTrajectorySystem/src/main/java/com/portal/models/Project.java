package com.portal.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {

@Id
@Column(name="project_id")
private String project_Id;
@Column(name="project_name")
private String project_Name;

@ManyToMany(mappedBy="projects",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
private List<User> users=new ArrayList<User>();

public String getProject_Id() {
	return project_Id;
}

public void setProject_Id(String project_Id) {
	this.project_Id = project_Id;
}

public String getProject_Name() {
	return project_Name;
}

public void setProject_Name(String project_Name) {
	this.project_Name = project_Name;
}

public List<User> getUsers() {
	return users;
}

public void setUsers(List<User> users) {
	this.users = users;
}

@Override
public String toString() {
	return "Project [project_Id=" + project_Id + ", project_Name=" + project_Name + ", users=" + users + "]";
}



}

