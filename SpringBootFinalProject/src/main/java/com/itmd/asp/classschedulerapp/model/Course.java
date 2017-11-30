package com.itmd.asp.classschedulerapp.model;
 import java.io.Serializable;
 import java.util.Date;

 import javax.persistence.*;

 import org.springframework.data.annotation.CreatedDate;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 import org.springframework.data.annotation.LastModifiedDate;
 import org.springframework.data.jpa.domain.support.AuditingEntityListener;
 import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

 @Entity
 @Table(name = "COURSE")
public class Course implements Serializable{
	   /**
    *
    */
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private long courseId;

   private String userName;

	private String courseName;
	private String courseCode;
	private String sem;
	private String taName;
	private String taEmail;
	private String taPhone;
	public long getCourseId() {
	return courseId;
}

public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

public void setCourseId(long courseId) {
	this.courseId = courseId;
}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getTaName() {
		return taName;
	}
	public void setTaName(String taName) {
		this.taName = taName;
	}
	public String getTaEmail() {
		return taEmail;
	}
	public void setTaEmail(String taEmail) {
		this.taEmail = taEmail;
	}
	public String getTaPhone() {
		return taPhone;
	}
	public void setTaPhone(String taPhone) {
		this.taPhone = taPhone;
	}
	
}

