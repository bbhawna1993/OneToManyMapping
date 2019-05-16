package com.io.hibernatemaven;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity(name="USER_DETAILS")
public class UserDetails {

	@Id @GeneratedValue
	private int userId;
	private String userName;

	@OneToMany(mappedBy="user")
	private Collection<Vehicle> vehicles_list=new ArrayList();

	public Collection<Vehicle> getVehicles_list() {
		return vehicles_list;
	}
	public void setVehicles_list(Collection<Vehicle> vehicles_list) {
		this.vehicles_list = vehicles_list;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


}
