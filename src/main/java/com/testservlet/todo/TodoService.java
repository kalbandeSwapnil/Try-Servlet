package com.testservlet.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList();

	static {
		todos.add(new Todo("Learn Web Application","Study"));
		todos.add(new Todo("Learn Spring","study"));
		todos.add(new Todo("Learn Spring MVC" ,"study"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}

	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}