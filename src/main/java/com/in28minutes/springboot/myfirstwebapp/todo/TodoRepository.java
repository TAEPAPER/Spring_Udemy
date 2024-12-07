package com.in28minutes.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//JPA interface이다. 
public interface TodoRepository extends JpaRepository<Todo, Integer>{
	//제공되지 않는 메서드의 경우 직접 만들어서 사용.
 	public List<Todo> findByUsername(String username);
}





