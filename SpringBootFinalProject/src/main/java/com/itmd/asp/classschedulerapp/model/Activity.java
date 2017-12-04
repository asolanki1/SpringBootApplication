package com.itmd.asp.classschedulerapp.model;
 import java.io.Serializable;
 import java.util.Date;

 import javax.persistence.*;

 import org.springframework.data.annotation.CreatedDate;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 import org.springframework.data.annotation.LastModifiedDate;
 import org.springframework.data.jpa.domain.support.AuditingEntityListener;
 import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="activities")

public class Activity implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long activityId;
    
    	private String userName;

	private String activityCourse;
    private String activityName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date activityStartDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date activityEndDate;
	public long getActivityId() {
		return activityId;
	}
	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}
	public String getActivityCourse() {
		return activityCourse;
	}
	public void setActivityCourse(String activityCourse) {
		this.activityCourse = activityCourse;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public Date getActivityStartDate() {
		return activityStartDate;
	}
	public void setActivityStartDate(Date activityStartDate) {
		this.activityStartDate = activityStartDate;
	}
	public Date getActivityEndDate() {
		return activityEndDate;
	}
	public void setActivityEndDate(Date activityEndDate) {
		this.activityEndDate = activityEndDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    public String getUserName() {
			return userName;
		}
	public void setUserName(String userName) {
			this.userName = userName;
		}

}
