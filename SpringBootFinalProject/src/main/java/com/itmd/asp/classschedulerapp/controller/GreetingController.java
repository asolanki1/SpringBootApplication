package com.itmd.asp.classschedulerapp.controller;

 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itmd.asp.classschedulerapp.dao.CourseRepository;
import com.itmd.asp.classschedulerapp.model.Course;
import com.itmd.asp.classschedulerapp.model.Greeting;
import com.itmd.asp.classschedulerapp.service.ActivityService;


@Controller
public class GreetingController {
    @Autowired
    private CourseRepository courseRepositary;
    


    @RequestMapping("/")
    public String greetingForm(Model model) {
        model.addAttribute("course", new Course());

       List <Course> tests = courseRepositary.findAll();
        model.addAttribute("courseList", tests);
        System.out.println("heere"+tests.toString());

        return "index";
    }

    @PostMapping(value ="save")
    public String save(@ModelAttribute Course course) {
    	courseRepositary.save(course);
    	  System.out.println("heereaddding");
        return "redirect:/";
    }

}

