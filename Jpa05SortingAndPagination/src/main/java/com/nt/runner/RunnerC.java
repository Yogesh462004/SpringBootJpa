package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.dao.Doctor;
import com.nt.service.Iserv;
@Component
public class RunnerC implements CommandLineRunner {
	  @Autowired
     private Iserv serv;
	@Override
	public void run(String... args) throws Exception {
//        serv.showdoctorbyname(true, "dname").forEach(System.out::println);
		/*Page<Doctor> page = serv.findPage(2, 3, true, "dname");
		
		System.out.println("Page Number    : " + page.getNumber());
		System.out.println("Page Size      : " + page.getSize());
		System.out.println("Total Pages    : " + page.getTotalPages());
		System.out.println("Total Elements : " + page.getTotalElements());
		System.out.println("Content:");
		
		page.getContent().forEach(System.out::println); // Just print content here
		*/
		
		/*Doctor d=new Doctor();
		d.setDname("mantesh");
		d.setDsal(100);
		System.out.println(serv.register(d));
		 int pageNo = 0;
		    int pageSize = 3;
		    boolean asc = true;
		    String sortBy = "dname";
		
		    while (true) {
		        Page<Doctor> page = serv.findPage(pageNo, pageSize, asc, sortBy);
		        
		        // print current page content
		        System.out.println("---- Page " + pageNo + " ----");
		        page.getContent().forEach(System.out::println);
		
		        if (!page.hasNext()) {
		            break; // stop if no more pages
		        }
		        pageNo++; // go to next page
		    }*/
//		System.out.println(serv.deletebatch(List.of(1,2,3)));
          Doctor d=serv.getref(5);
          System.out.println(d.toString());
	}

}
