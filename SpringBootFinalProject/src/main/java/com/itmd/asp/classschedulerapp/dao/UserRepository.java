package com.itmd.asp.classschedulerapp.dao;


import com.itmd.asp.classschedulerapp.model.User;

import java.util.concurrent.Future;
import org.hibernate.annotations.Entity;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Async
    @Query("SELECT u FROM User u where u.userName = :username and u.password = :password") 
    public User findUserByUsernamePassword(@Param("username") String username,@Param("password") String password);
}


