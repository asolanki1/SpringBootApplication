package com.itmd.asp.classschedulerapp.controller;

 import java.util.List;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.*;
 import com.itmd.asp.classschedulerapp.model.Activity;
 import com.itmd.asp.classschedulerapp.service.ActivityService;

@RestController
@RequestMapping ("/api")
public class ActivityController {

    @Autowired
    private ActivityService activityService;
    

    @GetMapping (value="/hello")
    public String getHello() {
        return "hello";
    }

    @GetMapping (value="/activity")
    public List<Activity> allActivities() {
        return activityService.findAll();
    }

    @GetMapping (value="/activity/{activityId}")
    public Activity getActivity(@PathVariable (value="activityId") Long activityId){
        return activityService.getActivity(activityId);
    }

    @PostMapping (value="/activity", consumes = "application/json")
    public Activity addActivity(@RequestBody Activity activity) {
        return activityService.addActivity(activity);
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

