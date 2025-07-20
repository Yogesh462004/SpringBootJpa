package com.nt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jpa06findermethodsApplication implements CommandLineRunner{
@Autowired	
private Imovie repo;
	public static void main(String[] args) {
		SpringApplication.run(Jpa06findermethodsApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		repo.findByNameIs("BBR",Result1.class).forEach(System.out::println);
         System.out.println(repo.findByMid(5));
	}

}
