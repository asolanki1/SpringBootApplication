package com.itmd.asp.classschedulerapp.model;
 import java.io.Serializable;
 import java.util.Date;

 import javax.persistence.*;

 import org.springframework.data.annotation.CreatedDate;
 import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 import org.springframework.data.annotation.LastModifiedDate;
 import org.springframework.data.jpa.domain.support.AuditingEntityListener;
 import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

 public class Greeting {

	    private long id;
	    private String content;

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	}