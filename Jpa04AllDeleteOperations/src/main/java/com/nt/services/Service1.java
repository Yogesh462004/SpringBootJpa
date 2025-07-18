package com.nt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Doctor;
import com.nt.repo.DoctRepo;

@Service
public class Service1 {
	@Autowired
	private DoctRepo repo;
	
	/*public String deleteE(Doctor d) {
		int id=d.getDID();
		if(repo.existsById(d.getDID())) {
			repo.delete(d);
			return id+" Doctor Deleted";
		}else {
			throw new IllegalArgumentException("Given Id Doctor Already Deleted");
		}
	}*/
	/*public String deletebyid(Integer id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return id+" Doctor Deleted";
		}else {
			throw new IllegalArgumentException("Given Id Doctor Already Deleted");
		}
	}*/
	
	/*public String deletemultiple(List<Integer> ids) {
		List<Doctor> doctsids=(List<Doctor>)repo.findAllById(ids);
		if(doctsids.size()==ids.size()) {
			repo.deleteAllById(ids);
			return ids.toString()+" ids Doctors Deleted";
		}else {
			return "Some ids Are already Deleted";
		}
		
	}*/
	
	/*public String deletemul(List<Doctor> doctors) {
		List<Integer> ids=new ArrayList();
		doctors.forEach(d->{
			ids.add(d.getDID());
		});
		repo.deleteAll(doctors);
		return ids.toString()+" Doctors deleted";
		
	}*/
	
	public String deletemul() {
		List<Doctor> doctors=(List<Doctor>)repo.findAll();
		List<Integer> ids=new ArrayList();
		doctors.forEach(d->{
			ids.add(d.getDID());
		});
		repo.deleteAll();
		return ids.toString()+" Doctors deleted";
		
	}

}
