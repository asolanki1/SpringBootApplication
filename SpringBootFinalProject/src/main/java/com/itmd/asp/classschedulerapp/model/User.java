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
 @Table(name = "USER")
public class User implements Serializable{
	   /**
    *
    */
   private static final long serialVersionUID = 1L;
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private long profId;


	private String profName;
	private String password;
	private String profEmail;
	private String userName;
	public long getProfId() {
		return profId;
	}
	public void setProfId(long profId) {
		this.profId = profId;
	}
	public String getProfName() {
		return profName;
	}
	public void setProfName(String profName) {
		this.profName = profName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfEmail() {
		return profEmail;
	}
	public void setProfEmail(String profEmail) {
		this.profEmail = profEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

