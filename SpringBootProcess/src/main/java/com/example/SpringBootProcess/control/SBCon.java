package com.example.SpringBootProcess.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootProcess.entity.Employee;
import com.example.SpringBootProcess.repo.EmployeeRepo;

@RestController
@RequestMapping("/forward")
@ComponentScan
public class SBCon {
	@Autowired
	EmployeeRepo repo;
	
	
	
	@DeleteMapping("/erase")
	public String name() {
		System.out.println("this is the village");
		return "no name to my name";
		
	}
	
	@PatchMapping("/direction")
	public int no() {
		System.out.println("enterd");
		return 12;
		}

	  @PostMapping("/check")
	  public ResponseEntity<Object> SaveValues(@RequestBody Employee emp){
		  Employee e=repo.save(emp);
		return new ResponseEntity<Object>(e, HttpStatus.ACCEPTED);
		  }
		  
	  }
	  

