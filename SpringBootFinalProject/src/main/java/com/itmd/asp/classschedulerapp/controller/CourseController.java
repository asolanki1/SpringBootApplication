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
import org.springframework.web.servlet.support.RequestContextUtils;

import com.itmd.asp.classschedulerapp.dao.CourseRepository;
import com.itmd.asp.classschedulerapp.model.Course;
import com.itmd.asp.classschedulerapp.model.Greeting;
import com.itmd.asp.classschedulerapp.model.User;
import com.itmd.asp.classschedulerapp.service.ActivityService;


@Controller
@Scope("session")
public class CourseController {
    @Autowired
    private CourseRepository courseRepositary;

    @PostMapping(value ="saveCourse")
    public String save(@Valid @ModelAttribute("Course") Course course,HttpSession session,Model model) {

   String userName =  (String)session.getAttribute("username");
  	course.setUserName(userName);
    	courseRepositary.save(course);
        List<Course> tests = courseRepositary.findAllByCoursesId(userName);
        model.addAttribute("courseList", tests);
    	  System.out.println("heereadddingcourse");
       return "mainPage";
    }

    @GetMapping(value ="course/view/{courseCode}")
    public String viewCourse(@PathVariable String courseCode,Model model) {

  	  System.out.println("here showing course"+courseCode);
  	  Course course = courseRepositary.findByCoursesCode(courseCode);
  	  model.addAttribute("CourseName", course.getCourseName()+" : "+course.getCourseCode());
  	  model.addAttribute("course", course);
       return "course";
    }

}

