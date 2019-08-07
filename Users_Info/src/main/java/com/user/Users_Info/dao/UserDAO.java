package com.user.Users_Info.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Users_Info.model.User;
import com.user.Users_Info.model.UserDetails;
import com.user.Users_Info.model.UserInfo;
import com.user.Users_Info.repository.UserDetailsRepository;
import com.user.Users_Info.repository.UserInfoRepository;


@Service
public class UserDAO {
	

	@Autowired
	UserInfoRepository userInfoRepository;
	
	 
	@Autowired	
	UserDetailsRepository userDetailsRepository;
	
	public User saveuser(UserInfo usr) {
		
		return userInfoRepository.save(usr);
 	}
	
	public User savedetail(UserDetails detail) {
		
		return userDetailsRepository.save(detail);
	}
   
	
	public UserInfo userid() {
		
		return userInfoRepository.findTopByOrderByIdDesc();
	}
	
	
}
