package com.user.Users_Info.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "UserInfo")
public class UserInfo extends User implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserInfo [getId()=" + getId() + ", getName()=" + getName() + ", getPhone()=" + getPhone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
 	
}
