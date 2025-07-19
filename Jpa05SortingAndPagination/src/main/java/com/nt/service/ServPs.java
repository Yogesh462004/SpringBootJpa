package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.Doctor;
import com.nt.repo.IDoctRepo;

import jakarta.transaction.Transactional;
@Service
public class ServPs implements Iserv {
	@Autowired
   private IDoctRepo repo;
	/*	@Override
		public Iterable<Doctor> showdoctorbyname(boolean asc, String... props) {
			Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, props);
			Iterable<Doctor> doctors=repo.findAll(sort);
			return doctors;
			
		}*/

	@Override
	public String deletebatch(List<Integer> ids) {
		int size=ids.size();
		repo.deleteAllByIdInBatch(ids);
		return size+" ids deleted";
	}
    @Transactional
	@Override
	public Doctor getref(Integer id) {
    	Doctor d = repo.getReferenceById(id);
        System.out.println(d.getDname()); // force initialize
        return d;
	}

	/*@Override
	public Page<Doctor> findPage(int pno, int psize, boolean asc, String... props) {
		Pageable p=PageRequest.of(pno, psize,asc?Direction.ASC:Direction.DESC,props);
		Page<Doctor> pg=repo.findAll(p);
		
		return pg;
	}
	public String register(Doctor doct) {
		Doctor d=repo.save(doct);
		return "Doctor Registered With id::"+d.getDid();
	}*/
	


	
}
