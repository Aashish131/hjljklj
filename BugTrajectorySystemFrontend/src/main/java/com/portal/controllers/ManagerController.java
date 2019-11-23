package com.portal.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.portal.models.Project;
import com.portal.models.User;
import com.portal.service.ProjectService;
import com.portal.service.UserService;

@Controller
public class ManagerController {
    @Autowired
    UserService userService;
    
    @Autowired
    ProjectService projectService;

                @RequestMapping(value="/projectAllocated",method=RequestMethod.POST)
                public String getProjectAllocation(@RequestParam String project,@RequestParam int[] developer,@RequestParam int[] tester) {
                                
                                
                                Project pObj=projectService.getProjectById(project);
                                
                                List<User> usersList=pObj.getUsers();
                                
                                for(int i:developer) {
                                                
                                                User uObj=userService.getUserById(i);

                                                uObj.getProjects().add(pObj);
                                                
                                                usersList.add(uObj);
                                }
                                
                                for(int i:tester) {
                                                User uObj=userService.getUserById(i);
                                                uObj.getProjects().add(pObj);
                                                usersList.add(uObj);
                                }
                                
                                pObj.setUsers(usersList);
                                
                                
                                
                                projectService.updateProject(pObj);
                                System.out.println("Project Obj : "+pObj);
                                
                                return "ProjectAllocationForm";
                }
                

}

