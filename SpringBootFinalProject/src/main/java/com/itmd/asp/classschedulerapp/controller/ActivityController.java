package com.itmd.asp.classschedulerapp.controller;

 import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 import com.itmd.asp.classschedulerapp.model.Activity;
import com.itmd.asp.classschedulerapp.model.Course;
import com.itmd.asp.classschedulerapp.service.ActivityService;

@Controller
@Scope("session")
public class ActivityController {

    @Autowired
    private ActivityService activityService;
    

    @GetMapping (value="/hello")
    public String getHello() {
        return "hello";
    }


    @GetMapping (value="/activity/{activityId}")
    public Activity getActivity(@PathVariable (value="activityId") Long activityId){
        return activityService.getActivity(activityId);
    }
  
    @PostMapping(value ="addActivity")
    public String addActivity(@ModelAttribute Activity activity,HttpSession session,Model model) {
    	 System.out.println("heereaddding activity"+activity.getActivityCourse());
    	activityService.addActivity(activity);
   // 	List<Activity> listActivity = 	activityService.findActivityByCoursesCode(activity.getActivityCourse());
    	List<Activity> listActivity = activityService.findall();
    	  model.addAttribute("course", new Course());
    	  model.addAttribute("activityList", listActivity);
        return "mainPage";
    }

    @PutMapping(value ="/activity/{id}", consumes = "application/json")
    public Activity editActivity (@RequestBody Activity activity, Long activityId){
        return activityService.editActivity(activityId, activity);
    }

    @DeleteMapping (value = "/activity/{id}")
    public void deleteActivity(@PathVariable (value="id") Long activityId){
        activityService.deleteActivity(activityId);
    }


}

