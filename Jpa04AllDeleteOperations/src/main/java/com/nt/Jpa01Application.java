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
		/*Doctor d=new Doctor();
		d.setDID(952);
		try {
		System.out.println(ser.deleteE(d));
		}catch(Exception e) {
		System.out.println(e.getMessage());
		}*/
		
		/*try {
			System.out.println(ser.deletebyid(1051));
			}catch(Exception e) {
			System.out.println(e.getMessage());
			}
		*/
//		System.out.println(ser.deletemultiple(List.of(1101,1151)));
//		Doctor d1=new Doctor(),d2=new Doctor();
//		d1.setDID(4);
//		d2.setDID(5);
//		
//		System.out.println(ser.deletemul(List.of(d1,d2)));
//		
		System.out.println(ser.deletemul());
	}

}
