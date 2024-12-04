package com.elham.webapp.MyFirstWebApp.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("username")
public class HomeController {

	Logger r = LoggerFactory.getLogger(getClass());
	
	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	public String homePage(ModelMap map) {
		if (map.getAttribute("username") != null) {
			System.out.println(map.getAttribute("username") + "this is inside admin conditon");
			return "homePage";
		}else {
			System.out.println(map.getAttribute("username") + "THIS IS NOT ADMIN CONDITION");
			return "redirect:/login";
		}
	}
}
