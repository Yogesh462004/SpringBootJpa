package com.nt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Doctor;
import com.nt.repo.DoctRepo;

@Service
public class Service1 {
	@Autowired
	private DoctRepo repo;
	public String register(Doctor doct) {
		Doctor d=repo.save(doct);
		return "Doctor Registered With id::"+d.getDID();
	}

}
