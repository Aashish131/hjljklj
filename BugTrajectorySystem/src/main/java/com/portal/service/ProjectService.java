package com.portal.service;

import java.util.List;

import com.portal.models.Project;

public interface ProjectService {

       public Project getProjectById(String pId);
       public List<Project> getAllProjects();
       public boolean updateProject(Project pObj);

}
