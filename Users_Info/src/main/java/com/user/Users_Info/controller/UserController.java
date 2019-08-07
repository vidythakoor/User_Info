package com.user.Users_Info.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.Users_Info.dao.UserDAO;
import com.user.Users_Info.model.UserDetails;
import com.user.Users_Info.model.UserInfo;


@RestController
@RequestMapping("/task")

public class UserController {

	@Autowired
	UserDAO userDAO;

	/* to save */

	@PostMapping("/user")
	public String createuser(@Valid @RequestBody UserInfo usr) {

		userDAO.saveuser(usr);

		
		UserDetails user = new UserDetails();

		user.setId(usr.getId());
		user.setName(usr.getName());
		user.setPhone(usr.getPhone());
		
		UserInfo userinfo = userDAO.userid();		
		user.setUserID(userinfo.getId()); 
		userDAO.savedetail(user);
		
		return "success";
	}

	/*update*/
	@PutMapping("/userUpdate/{id}")
	
	public String update(@Valid @RequestBody UserDetails detail, @PathVariable int id) {
		detail.setUserID(id);
		userDAO.savedetail(detail);
		return "success";
	}

	


}
