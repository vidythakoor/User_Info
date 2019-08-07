package com.user.Users_Info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Users_Info.model.UserDetails;


public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
}