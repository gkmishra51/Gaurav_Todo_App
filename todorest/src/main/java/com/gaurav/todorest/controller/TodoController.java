package com.gaurav.todorest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.todorest.entity.Todo;
import com.gaurav.todorest.service.TodoService;

@RestController

public class TodoController {
	@Autowired 
	private TodoService todoService;
	
	//just for trying port 
	@GetMapping("/home")
	public String home() {
		return "Welcome to my todo app";
	}
	
	// Get the todos
	@GetMapping("todos")
	public List<Todo> getTodos(){
		return this.todoService.getTodos(); 
	}
	
	//Get todo by todoId
	@GetMapping("/todos/{todoId}")
	public Todo getTodo(@PathVariable String todoId) {
		return this.todoService.getTodo(Integer.parseInt(todoId));
	}
	
	//for adding todo in the list
	@PostMapping("/todos")
	public Todo addTodo(@RequestBody Todo todo) {
		return this.todoService.addTodo(todo);
	}
	
	//to update the values of data members
	@PutMapping("/todos")
	public Todo updateTodo(@RequestBody Todo todo) {
		return this.todoService.updateTodo(todo);
	}
	
	//to delete any todo
	@DeleteMapping("/todos/{todoId}")
	public boolean deleteTodo(@PathVariable("todoId") String todoId) {
		return this.todoService.deleteTodo(Integer.parseInt(todoId));
	}
	
	
}
