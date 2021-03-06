package com.portal.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="ProjectUser")
public class User {
                
                @Id
                @Column(name="User_id")
                private int id;
                
                @Column(name="User_name")
                private String name;
                
                @Column(name="Pass")
                private String password;
                
                @Column(name="Designation")
                private String desg;

                @ManyToMany(fetch=FetchType.EAGER)
                @JoinTable(name="Project_Allocation",
                joinColumns={@JoinColumn(name="User_id")},
                inverseJoinColumns= {@JoinColumn(name="project_id")})
                private List<Project> projects=new ArrayList<Project>();
                
                
    public int getId() {
                                return id;
                }
                public void setId(int id) {
                                this.id = id;
                }
                public String getName() {
                                return name;
                }
                public void setName(String name) {
                                this.name = name;
                }
                public String getPassword() {
                                return password;
                }
                public void setPassword(String password) {
                                this.password = password;
                }
                public String getDesg() {
                                return desg;
                }
                public void setDesg(String desg) {
                                this.desg = desg;
                }
                
                public List<Project> getProjects() {
                                return projects;
                }
                public void setProjects(List<Project> projects) {
                                this.projects = projects;
                }
//				@Override
//				public String toString() {
//					return "User [id=" + id + ", name=" + name + ", password=" + password + ", desg=" + desg
//							+ ", projects=" + projects + "]";
//				}


}

