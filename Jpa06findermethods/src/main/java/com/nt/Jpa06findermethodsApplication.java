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
		/*repo.findByName("BBR").forEach(System.out::println);
		repo.findByNameIs("BBR").forEach(System.out::println);
		repo.findByNameEquals("BBR").forEach(System.out::println);
		repo.findByNameStartingWith("B").forEach(System.out::println);
		repo.findByNameEndingWith("R").forEach(System.out::println);
		repo.findByNameIgnoreCase("bbr").forEach(System.out::println);
		repo.findByNameContaining("t").forEach(System.out::println);
		
		*/

      repo.findByMidGreaterThanEqualAndMidLessThanEqual(5, 10).forEach(System.out::println);;


		
	}

}
