package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.nt.model.Doctor;
import com.nt.services.Service1;

@SpringBootApplication
public class Jpa01Application implements CommandLineRunner{
@Autowired	
private Service1 ser;
@Autowired

	public static void main(String[] args) {
		SpringApplication.run(Jpa01Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*Doctor d1 = new Doctor();
		Doctor d2 = new Doctor();
		Doctor d3 = new Doctor();
		d1.setDNAME("Prabhu");
		d1.setDSAL(100);
		d2.setDNAME("Mahesh");
		d2.setDSAL(45);
		d3.setDNAME("Suresh");
		d3.setDSAL(70);
		System.out.println(ser.register(List.of(d1,d2,d3)));*/
	
		
//		System.out.println(ser.exist(1051));
		
//		System.out.println(ser.find(1051));
		
//		System.out.println(ser.getall());
		
//		System.out.println(ser.getallbyids(List.of(1,952,1051)));
		
//		System.out.println(ser.getcount());
		
//		System.out.println(ser.updateDoctsal(952, 50));
		
//		System.out.println(ser.updateDoctorSalaries(10));
		
	}

}
