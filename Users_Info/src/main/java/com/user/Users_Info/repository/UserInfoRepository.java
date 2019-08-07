package com.user.Users_Info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Users_Info.model.UserInfo;


public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {
	
	UserInfo findTopByOrderByIdDesc();	
}
