package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.dao.Doctor;

public interface IDoctRepo extends JpaRepository<Doctor, Integer>  {
//  @Query("FROM Doctor where dsal>?1 and dsal<?2 ")	
//  public List<Doctor> searchdoctorBySal(int p1,int p2);
	@Query("FROM Doctor where dsal>:s and dsal<:e ")
	public List<Doctor> searchdoctorBySal( int s, int e);
	
}
