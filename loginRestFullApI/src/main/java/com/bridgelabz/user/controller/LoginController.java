package com.bridgelabz.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bridgelabz.user.dao.LoginRepo;
import com.bridgelabz.user.model.Login;

@Controller
public class LoginController {
	@Autowired
	LoginRepo repo;
	@RequestMapping("store")
	@ResponseBody
	public String show(@RequestParam("emailId") String emailId,@RequestParam("password") String password) {
		
		Login login=new Login();
		login.setEmailId(emailId);
		login.setPassword(password);
		repo.save(login);
		return"successfully";
	}
	@RequestMapping("home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("data")
	public String addData(Login login) {
		repo.save(login);
		return "home.jsp";
	}

}