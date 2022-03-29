package com.gaurav.todorest.service;

import java.util.List;

import com.gaurav.todorest.entity.Todo;

public interface TodoService {
	
	public List<Todo> getTodos();
	
	public Todo getTodo(int todoId);

	public Todo addTodo(Todo todo);
	
	public Todo updateTodo(Todo todo);
	
	public boolean deleteTodo(int todoId);
}
