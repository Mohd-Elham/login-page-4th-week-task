package com.elham.webapp.MyFirstWebApp.deafault;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyDefaultPage {
		
	
	@RequestMapping(value = "/",  method = RequestMethod.GET)
	public String defaultPage(ModelMap map) {
		if (map.getAttribute("username") == null) {
			System.out.println("there is no username as "+ map.get("username"));
			return "/login";
		} else {
			System.out.println("there is username as "+ map.get("username"));
			return "/homePage";
		}
		
	}
}
