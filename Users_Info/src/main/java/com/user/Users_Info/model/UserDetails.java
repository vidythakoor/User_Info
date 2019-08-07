package com.user.Users_Info.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
 
@Entity
@Table(name = "UserDetails")
public class UserDetails extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  	
	@Column(name = "users_ID") 
  	private int userID;

	
 	public int getUserID() {
		return userID;
	}

 
	public void setUserID(int userID) {
		this.userID = userID;
	}


	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "UserDetails [userID=" + userID + ", getUserID()=" + getUserID() + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
 
}
