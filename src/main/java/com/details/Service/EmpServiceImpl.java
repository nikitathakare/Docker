package com.details.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.details.Model.Employee;
import com.details.Repository.EmpRepo;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Transactional
@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepo empRepo;

	@Override
	public List<Employee> getDetails() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}
	
}
