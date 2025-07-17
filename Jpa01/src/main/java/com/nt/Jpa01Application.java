package com.nt;

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
		Doctor d=new Doctor();
		d.setDNAME("Yogesh");
		d.setDSAL(100);
		System.out.println(ser.register(d));
		
	}

}
