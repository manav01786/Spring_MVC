package com.manavit.entity;



import jakarta.persistence.*;
import java.util.List;

@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uId;
    private String uName;
    private String uPassword;
    private String uEmail;
    private String uGender;
    private String uphoneNo;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserTask> uTask;

	private UserEntity() {
		super();
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuGender() {
		return uGender;
	}

	public void setuGender(String uGender) {
		this.uGender = uGender;
	}

	public String getUphoneNo() {
		return uphoneNo;
	}

	public void setUphoneNo(String uphoneNo) {
		this.uphoneNo = uphoneNo;
	}

	public List<UserTask> getuTask() {
		return uTask;
	}

	public void setuTask(List<UserTask> uTask) {
		this.uTask = uTask;
	}

 
}
