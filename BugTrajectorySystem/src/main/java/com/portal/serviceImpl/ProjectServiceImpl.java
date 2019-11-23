package com.portal.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portal.daos.ProjectDaos;
import com.portal.models.Project;
import com.portal.service.ProjectService;

@Service("ProjectService")
@Transactional
public class ProjectServiceImpl implements ProjectService{


       @Autowired
       ProjectDaos projectDao;
       
       
       public Project getProjectById(String pId) {
              return projectDao.getProjectById(pId);
       }

    
       public List<Project> getAllProjects() {
              return projectDao.getAllProjects();
       }
       
       public boolean updateProject(Project pObj) {
              return projectDao.updateProject(pObj);
       }
}
