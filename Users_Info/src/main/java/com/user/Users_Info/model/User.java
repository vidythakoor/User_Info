package com.user.Users_Info.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass 
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class User {

  	@Id  
  	@GeneratedValue(strategy = GenerationType.IDENTITY) 
  	@Column(name = "user_id")
	private int id;
    @Column(name = "user_name")
  	private String name;
    @Column(name = "user_phone") 
  	private String phone;
	public int getId() {
		return id;
	} 
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

 	
    
}
