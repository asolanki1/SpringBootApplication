package com.itmd.asp.classschedulerapp.controller;

 import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itmd.asp.classschedulerapp.dao.CourseRepository;
import com.itmd.asp.classschedulerapp.dao.UserRepository;
import com.itmd.asp.classschedulerapp.model.Activity;
import com.itmd.asp.classschedulerapp.model.Course;
import com.itmd.asp.classschedulerapp.model.Greeting;
import com.itmd.asp.classschedulerapp.model.User;
import com.itmd.asp.classschedulerapp.service.ActivityService;


@Controller
public class GreetingController {
    @Autowired
    private CourseRepository courseRepositary;
    private  List <Course> tests; 
    @Autowired
    private UserRepository userRepositary;



    @RequestMapping("/")
    public String greetingForm(Model model) {

    	   model.addAttribute("user", new User());


        return "index";
    }

    @PostMapping(value ="saveUser")
    public String save(@ModelAttribute User user,HttpSession session,Model model) {
   	userRepositary.save(user);

        return "index";
    }
    
    @PostMapping(value ="validateUser")
    public String validateUser(@ModelAttribute User user,HttpSession session,Model model,RedirectAttributes redirectAttributes) {
   User username = userRepositary.findUserByUsernamePassword(user.getUserName(),user.getPassword());
   if(username!=null)
   {
   model.addAttribute("newuser", username);

    	   Course c = new Course();
    	   c.setUserName(user.getUserName());
        model.addAttribute("course", new Course());
        model.addAttribute("activity", new Activity());
        session.setAttribute("username",user.getUserName());
       
       // tests = courseRepositary.findAll();
       // if(!tests.isEmpty())
        tests = courseRepositary.findAllByCoursesId(user.getUserName());
        model.addAttribute("courseList", tests);
        model.addAttribute("usernameprof", user.getUserName());
        System.out.println("heere"+tests.toString());
        session.setAttribute("Model", model);
        return "mainPage";
    }
   else
   {
	   return"index";
   }
    }
}

