package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nt.model.Doctor;
import com.nt.repo.Idrepo;

@SpringBootApplication
public class Jpa09QueryApplication implements CommandLineRunner{
	@Autowired
    private Idrepo repo;
	public static void main(String[] args) {
		SpringApplication.run(Jpa09QueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*List<Doctor> doc=repo.searchdoctorBySal(90000, 94000);
		for(Doctor d:doc) {
		  System.out.println("Name: "+d.getDname()+" Salary: "+"Id: "+d.getDid());
		  
				  
		}
		*///      Object[] data = (Object [])repo.sectall();
//      System.out.println("Data length: " + data.length);
//      System.out.println(data[0]);
//      System.out.println(data[1]);
//      System.out.println("Affected rows::"+repo.updateSal(10));
        System.out.println(repo.inserto("Chandru", 1070));
      	}

}
