package com.portal.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.portal.models.Project;
import com.portal.models.User;
import com.portal.service.ProjectService;
import com.portal.service.UserService;

@Controller
public class HomeController {
                   
@Autowired
UserService userService;

  @RequestMapping(value="/",method=RequestMethod.GET)
  public String validateUser(Model map)  { 
       return"Login";
  }

  @Autowired
HttpSession session;
  
  @Autowired
  ProjectService projectService;
  
  
@RequestMapping(value="/signin",method=RequestMethod.POST)
public ModelAndView validateUser(@RequestParam int id,@RequestParam String password){
       
       System.out.println(id+" "+password);
       User uObj=userService.validateUser(id,password);
       
       System.out.println(uObj);
       if(uObj!=null){
              
              session.setAttribute("userObj",uObj);
       
              if(uObj.getDesg().equalsIgnoreCase("ProjectManager")) {
                     List<Project> proList=projectService.getAllProjects();
                     
                      System.out.println("Project List : "+proList);
                   List<User> dList=userService.getAllDeveloper();
                   
                   System.out.println("Developers List : "+dList);
                   
                   List<User> tList=userService.getAllTester();
                  System.out.println("Testers List : "+tList);
                   
                   ModelAndView mv=new ModelAndView("ProjectAllocationForm");
                   mv.addObject("projectList",proList);
                   mv.addObject("developerList",dList);
                   mv.addObject("testerList",tList);
                   System.out.println(proList+""+dList+""+tList);
                   return mv;
                     
              }
              else if (uObj.getDesg().equalsIgnoreCase("Developer")) {
                     
            	  
            	  return new ModelAndView("Developer");
              }
              else if (uObj.getDesg().equalsIgnoreCase("Tester")) {
            	   id=uObj.getId();
            	  User testerObj=userService.getUserById(id);
            	  List<Project> ProjectList=testerObj.getProjects();
            	  ModelAndView mv= new ModelAndView("BugReport");
            	  mv.addObject("uObj",uObj);

            	  mv.addObject("ProjectList",ProjectList);
            	  return mv;
            	  
              }
       }
       
              return new ModelAndView("Login");
       
       
}
}

