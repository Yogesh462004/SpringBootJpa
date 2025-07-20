package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.dao.Doctor;
import com.nt.repo.IDoctRepo;
@Component
public class RunnerC implements CommandLineRunner {
	  @Autowired
     private IDoctRepo repo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello");
       repo.searchdoctorBySal(90000, 94000).forEach(System.out::println);;
     
        
	}

}
