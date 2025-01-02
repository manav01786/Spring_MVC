package com.manavit.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class UserTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uTaskId;
    private String uTaskName;
    private LocalDate uTaskDate;
    private String uTasktimings;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    
    
	private UserTask() {
		super();
	}

	public Integer getuTaskId() {
		return uTaskId;
	}

	public void setuTaskId(Integer uTaskId) {
		this.uTaskId = uTaskId;
	}

	public String getuTaskName() {
		return uTaskName;
	}

	public void setuTaskName(String uTaskName) {
		this.uTaskName = uTaskName;
	}

	public LocalDate getuTaskDate() {
		return uTaskDate;
	}

	public void setuTaskDate(LocalDate uTaskDate) {
		this.uTaskDate = uTaskDate;
	}

	public String getuTasktimings() {
		return uTasktimings;
	}

	public void setuTasktimings(String uTasktimings) {
		this.uTasktimings = uTasktimings;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

    // Getters and Setters
    
}
