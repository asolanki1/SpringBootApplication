package com.itmd.asp.classschedulerapp.controller;

 import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;

import com.itmd.asp.classschedulerapp.dao.CourseRepository;
import com.itmd.asp.classschedulerapp.model.Activity;
import com.itmd.asp.classschedulerapp.model.Course;
import com.itmd.asp.classschedulerapp.model.Greeting;
import com.itmd.asp.classschedulerapp.model.User;
import com.itmd.asp.classschedulerapp.service.ActivityService;


@Controller
@Scope("session")

public class CourseController {
    @Autowired
    private CourseRepository courseRepositary;

    private Course course;
    @Autowired
    private ActivityService activityService;
    @PostMapping(value ="saveCourse")
    public String save(@ModelAttribute("Course") Course course,HttpSession session,Model model) {

   String userName =  (String)session.getAttribute("username");
  	course.setUserName(userName);
    	courseRepositary.save(course);
        List<Course> tests = courseRepositary.findAllByCoursesId(userName);
        model.addAttribute("courseList", tests);
        model.addAttribute("course", new Course());
        model.addAttribute("activity", new Activity());
       	List<Activity> listActivity = 	activityService.findActivityByUserName(userName);
    	
  	  model.addAttribute("course", new Course());
  	  model.addAttribute("activityList", listActivity);
       
    	  System.out.println("heereadddingcourse");
       return "mainPage";
    }

    @GetMapping(value ="course/view/{courseCode}")
    public String viewCourse(@PathVariable String courseCode,Model model,HttpSession session) {

  	  System.out.println("here showing course"+courseCode);
  	   course = courseRepositary.findByCoursesCode(courseCode);
  	   session.setAttribute("courseCode", courseCode);
  	  model.addAttribute("CourseName", course.getCourseName()+" : "+course.getCourseCode());
  	  model.addAttribute("course", course);
      model.addAttribute("activity", new Activity());
      
   	   List<Activity> listActivity = 	activityService.findActivityByCoursesCode(course.getCourseCode());
   	model.addAttribute("activityForCourseList", listActivity);
	 RedirectView rv = new RedirectView("course");
     rv.setExposeModelAttributes(false);
       return "course";
    }
    
    @RequestMapping(value ="course/view/addActivity", method = RequestMethod.POST)

    public String addActivity(@ModelAttribute Activity activity,HttpSession session,Model model) {
    	

   
   
    	   String userName =  (String)session.getAttribute("username");

    	   System.out.println("here showing course"+userName);
    	   activity.setUserName(userName);
    	   activity.setActivityCourse(course.getCourseCode());
    	 	activityService.addActivity(activity);
    	   	   List<Activity> listActivity = 	activityService.findActivityByCoursesCode(course.getCourseCode());
    	      	model.addAttribute("activityForCourseList", listActivity);
    	      	 model.addAttribute("CourseName", course.getCourseName()+" : "+course.getCourseCode());
    	  model.addAttribute("course",course);
    	  model.addAttribute("activity", new Activity());

        return "course";
    }

}

