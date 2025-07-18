package com.nt.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Doctor;
import com.nt.repo.DoctRepo;

@Service
public class Service1 {
	@Autowired
	private DoctRepo repo;
	/*public String register(Iterable<Doctor> doctors) {
		Iterable<Doctor> savedDoctors = repo.saveAll(doctors);
		int size = ((Collection<?>) savedDoctors).size();
		List<Integer> ids=new ArrayList();
		savedDoctors.forEach(d->{
			ids.add(d.getDID());
			
		});
		return size+" no of doctors inserted with ids "+ids.toString();
	
	}*/
	
	/*public boolean exist(Integer id) {
		return repo.existsById(id);
	}*/
	
	/*public String find(Integer id){
		Optional<Doctor> doct=repo.findById(id);
		return doct.toString();
	}*/
	
	/*public String getall() {
		Iterable<Doctor> doctors=repo.findAll();
		return doctors.toString();
	}
	*/
	
	/*public String getallbyids(Iterable<Integer> ids) {
		Iterable<Doctor> doctors=repo.findAllById(ids);
		return doctors.toString();
	}*/
	
	/*public long getcount() {
		return repo.count();
	}
	
	*/
	
//	public String updateDoctsal(Integer id,int sal) {
//		Optional<Doctor> opt=repo.findById(id);
//		if(opt.isPresent()) {
//			Doctor d=opt.get();
//			int newsal=d.getDSAL()+sal;
//			d.setDSAL(newsal);
//			return repo.save(d).getDID()+" updated with new sal "+newsal;
//		}else {
//			return id+" doctor not found";
//		}
//		
//	}
	/*public String updateDoctorSalaries(int increment) {
	    Iterable<Doctor> doctors = repo.findAll();
	    int count = 0;

	    for (Doctor d : doctors) {
	        if (d.getDSAL() < 100) {
	            d.setDSAL(d.getDSAL() + increment);
	            repo.save(d); // optional: batch save instead
	            count++;
	        }
	    }
		return null;
	

	}*/
}


