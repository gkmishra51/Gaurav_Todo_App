package com.gaurav.todorest.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gaurav.todorest.entity.Todo;

@Service
public class TodoServiceimpl implements TodoService {
	List<Todo> list;
	
	public TodoServiceimpl() {
		list = new ArrayList<>();
		list.add(new Todo(12345, "Java core", "This contains basics of java complete within 2 days"));
		list.add(new Todo(11111, "Spring and Spring boot", "Complete it within 3 days") );
		
	}

	@Override
	public List<Todo> getTodos() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Todo getTodo(int todoId) {
		Todo todo = null;
		for(Todo t:list) {
			if(t.getId()==todoId) {
				todo = t;
				break;
			}
		}
		return todo;
	}

	@Override
	public Todo addTodo(Todo todo) {
		list.add(todo);
		return todo;
	}

	@Override
	public Todo updateTodo(Todo todo) {
		/*Todo temp = null;
		for(Todo t:list) {
			if(t.getId()==todo.getId()) {
				t.setTitle(todo.getTitle());
				t.setDescription(todo.getDescription());
				temp = t;
				break;
			}
		}
		return temp;*/
		list.forEach(t -> {
			if(t.getId()==todo.getId()) {
				t.setTitle(todo.getTitle());
				t.setDescription(todo.getDescription());
			}
		});
		return todo;   
	}

	@Override
	public boolean deleteTodo(int todoId) {
		for(Todo todo:list) {
			if(todo.getId()==todoId) {
				list.remove(todo);
				return true;
			}
		}
		return false;
	}

	
	

}
