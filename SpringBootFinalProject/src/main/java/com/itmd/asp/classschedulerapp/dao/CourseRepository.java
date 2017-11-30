package com.itmd.asp.classschedulerapp.dao;


import com.itmd.asp.classschedulerapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}


