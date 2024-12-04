package com.elham.webapp.MyFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SayHelloController {

	@RequestMapping("say-hello")
	@ResponseBody
	public String helloWorld() {
		return "<h1>Hello World</h1>";
	}
	
	
	@RequestMapping("say-jsp")
	public String helloHTML(@RequestParam String name ,ModelMap model) {
		model.put("name", name);
		System.out.println(name);
		return "sayHello";//this returns the file name
	}
	
}
