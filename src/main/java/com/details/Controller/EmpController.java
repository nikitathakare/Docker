package com.details.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.details.Model.Employee;
import com.details.Service.EmpService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class EmpController{
	@Autowired
	private EmpService empService;
	
	@GetMapping("/getAll")
	private ResponseEntity<?> getAll(){
		List<Employee> emp = empService.getDetails();
		//return new ResponseEntity<List<Employee>>(emp,HttpStatus.OK);
		return new ResponseEntity<List<Employee>>(emp,HttpStatus.OK);
	}
	

}
