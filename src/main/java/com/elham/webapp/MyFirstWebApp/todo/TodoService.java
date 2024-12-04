package com.elham.webapp.MyFirstWebApp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo(1, "elham", "learn java", LocalDate.now().plusYears(1), true));
		todos.add(new Todo(2, "elham", "learn spring", LocalDate.now().plusYears(2), false));
	}
	
	public List<Todo> findByUsername(String username){
		return todos;
		
	}
	

}
