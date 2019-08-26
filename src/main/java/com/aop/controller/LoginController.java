package com.aop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aop.model.Login;
import com.aop.model.User;
import com.aop.service.UserService;

@Controller
public class LoginController {
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String openRegisterPage() {

		return "register";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String openLoginPage() {

		return "login";
	}
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/registerprocess", method = RequestMethod.POST)
	public ModelAndView registerSuccess(@ModelAttribute("user") User user, ModelAndView modelAndView) {
	modelAndView.setViewName("register");
		userService.addUser(user);
		modelAndView.addObject("username1","welcome" +" "+ user.getUsername() +"," + " "+"please click Home button to login");
		return modelAndView;
	}
	@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)
	public ModelAndView LoginSuccess(@ModelAttribute("login") Login login, ModelAndView modelAndView) {
	User user=userService.validate(login);
		if(null!=user) {
			modelAndView.setViewName("destination");
			modelAndView.addObject("welcomeMessage","welcome"+" "+"to creative learning" +" ,"+ login.getUserNameLog() );
			}else {
				modelAndView.setViewName("login");
				modelAndView.addObject("message","username or password are incorrect" );

			}
		return modelAndView;
	}

}
