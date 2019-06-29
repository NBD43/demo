package com.bridgelabz.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(Registration registration) {
		//HttpSession session=req.getSession();
		//String name=req.getParameter("name");
		// System.out.println("HomeController.home()::");
		//session.setAttribute("name", myname);
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",registration);
		mv.setViewName("home");
		return mv;
	}
	

}
 