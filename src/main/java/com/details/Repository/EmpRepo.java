package com.details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{
	

}
