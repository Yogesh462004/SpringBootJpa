package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.model.Doctor;

public interface Idrepo extends JpaRepository<Doctor, Integer> {
	@Query("FROM Doctor where dsal>:s and dsal<:e ")
	public List<Doctor> searchdoctorBySal( int s, int e);
	@Query("SELECT COUNT(d), MAX(d.dsal), MIN(d.dsal) FROM Doctor d")
	public Object sectall();
	@Modifying
	@Transactional
	@Query("update Doctor set dsal = dsal + :per")
	public int updateSal(int per);
	@Modifying
	@Transactional
	@Query(value="Insert into doctor values(DOCTOR_SEQ.NEXTVAL,:dname,:sal)",nativeQuery=true)
	public int inserto(String dname,int sal);

}
