package com.itmd.asp.classschedulerapp.dao;


import com.itmd.asp.classschedulerapp.model.Activity;
import com.itmd.asp.classschedulerapp.model.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {
	
    @Query("SELECT c FROM Activity c where c.activityCourse = :courseCode ") 
    public List<Activity> findActivityByCoursesCode(@Param("courseCode") String courseCode);
    
    @Query("SELECT c FROM Activity c where c.userName = :userName ") 
    public List<Activity> findActivityByUserName(@Param("userName") String courseCode);

}


