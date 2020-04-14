package com.umair.spring.springmvc1.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.umair.spring.springmvc1.dto.User;

@Controller
public class UserController {

	@RequestMapping("registrationPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("userReg");
		return modelandview;
	}
	
	@RequestMapping(value="registeruser",method=RequestMethod.POST)
	public ModelAndView RegisterUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelandview = new ModelAndView();
		
		modelandview.addObject("user", user);
		modelandview.setViewName("regResult");
		return modelandview;
	}

}
