package com.itmd.asp.classschedulerapp.dao;


import com.itmd.asp.classschedulerapp.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

}


