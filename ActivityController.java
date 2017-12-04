package com.itmd.asp.classschedulerapp.controller;

 import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.itmd.asp.classschedulerapp.dao.CourseRepository;
import com.itmd.asp.classschedulerapp.model.Activity;
import com.itmd.asp.classschedulerapp.model.Course;
import com.itmd.asp.classschedulerapp.service.ActivityService;

@Controller
@Scope("session")
public class ActivityController {

    @Autowired
    private ActivityService activityService;
    @Autowired
   private CourseRepository courseRepositary;
    private Long currentID;
    private Boolean callFromCourse;
    @GetMapping (value="/hello")
    public String getHello() {
        return "hello";
    }



  
 @RequestMapping(value = {"/**/addNewActivity"}, method = RequestMethod.POST)

    public String addNewActivity(@ModelAttribute Activity activity,HttpSession session,Model model,HttpServletResponse response ) {
    	
    	 System.out.println("heereaddding activity"+activity.getActivityCourse());
   
    	   String userName =  (String)session.getAttribute("username");
    	   activity.setUserName(userName);
    	 	activityService.addActivity(activity);
   	List<Activity> listActivity = 	activityService.findActivityByUserName(userName);

	List<Course> tests = courseRepositary.findAllByCoursesId(userName);
    	  model.addAttribute("course", new Course());
    	  model.addAttribute("activity", new Activity());
    	  model.addAttribute("activityList", listActivity);
    	  model.addAttribute("courseList", tests);
        return "mainPage";
    }







  
    @RequestMapping (value = "/**/delete/{id}",method = {RequestMethod.GET,RequestMethod.POST})

    public String deleteActivity(@PathVariable (value="id") Long activityId,HttpSession session,Model model,HttpServletRequest request){
        activityService.deleteActivity(activityId);
        System.out.println("deleting activity"+request.toString());
 	   String userName =  (String)session.getAttribute("username");

	List<Activity> listActivity = 	activityService.findActivityByUserName(userName);

	List<Course> tests = courseRepositary.findAllByCoursesId(userName);
 	  model.addAttribute("course", new Course());
 	  model.addAttribute("activity", new Activity());
 	  model.addAttribute("activityList", listActivity);
 	  model.addAttribute("courseList", tests);
 	  model.addAttribute("editActivity",  new Activity());

     return "mainPage";

    }


}

