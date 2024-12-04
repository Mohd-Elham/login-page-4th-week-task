package com.elham.webapp.MyFirstWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.servlet.http.HttpSession;


@Controller
@SessionAttributes("username")
public class LoginController {

	@Autowired
	public UserAuthenticateService auth;
	Logger  r = LoggerFactory.getLogger(getClass());
	
	
	public LoginController(UserAuthenticateService auth) {
		super();
		this.auth = auth;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLoginPage(ModelMap map, HttpSession session) {
	
		
		
		
		
		
		if (map.containsAttribute("username")) {
			System.out.println("we alredy have username as " + map.getAttribute("username"));
			r.info("this is alredy there " + map.get("username"));
			return "redirect:/homePage";
		}
		
		return "login";
		}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToHomePage(@RequestParam() String username, @RequestParam String password,ModelMap map) {
		
		r.info(username);
			map.put("username", username);
			map.put("password", password);
			if (auth.authenticate(username, password)) {
				r.info("this is inside the if");
				return "redirect:/homePage";
			}else
				return "login";
		}
	
}
