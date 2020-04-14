package com.umair.spring.springmvc1.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		ModelAndView modelandview = new ModelAndView();
		modelandview.setViewName("hello");
		
		return modelandview;
		
	}

}
