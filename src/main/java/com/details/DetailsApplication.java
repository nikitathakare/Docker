package com.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.details.Model.Employee;
import com.details.Repository.EmpRepo;

@SpringBootApplication
public class DetailsApplication {
	@Autowired
	private EmpRepo empRepo;

	public static void main(String[] args) {
		SpringApplication.run(DetailsApplication.class, args);
	}
	@Bean 
	public CommandLineRunner CommandlineRunner() {
		CommandLineRunner runner = new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				 Employee emp = new Employee();
				 emp.setName("Ram");
				 emp.setDepartment("HR");
				 emp.setSalary(40000);
				 Employee emp1 = new Employee();
				 emp1.setName("Shyam");
				 emp1.setDepartment("Dev");
				 emp1.setSalary(42000.70);
				 Employee emp2 = new Employee();
				 emp2.setName("Gola");
				 emp2.setDepartment("QE");
				 emp2.setSalary(30000.80);
				 empRepo.save(emp);
				 empRepo.save(emp1);
				 empRepo.save(emp2);
				 
				
			}
		};
		return runner; // bean methid always return a object
	}

}
