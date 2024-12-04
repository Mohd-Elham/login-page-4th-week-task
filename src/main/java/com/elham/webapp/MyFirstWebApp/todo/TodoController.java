package com.elham.webapp.MyFirstWebApp.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	
	@Autowired
	TodoService todoService;
	
	

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}



	@RequestMapping("/todo")
	public String showToDo(ModelMap map) {
				
		List<Todo> a = todoService.findByUsername("elham");
		
		map.put("todo", a);
		
		return "todo";
	}
	
}
