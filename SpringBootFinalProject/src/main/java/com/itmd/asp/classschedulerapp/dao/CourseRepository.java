package com.itmd.asp.classschedulerapp.dao;


import com.itmd.asp.classschedulerapp.model.Course;
import com.itmd.asp.classschedulerapp.model.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
	
    @Query("SELECT c FROM Course c where c.userName = :username ") 
    public List<Course> findAllByCoursesId(@Param("username") String username);
    
    @Query("SELECT c FROM Course c where c.courseCode = :courseCode ") 
    public Course findByCoursesCode(@Param("courseCode") String courseCode);

}


