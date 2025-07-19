package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.dao.Doctor;

public interface IDoctRepo extends PagingAndSortingRepository<Doctor, Integer>,CrudRepository<Doctor, Integer>,JpaRepository<Doctor, Integer>  {

}
