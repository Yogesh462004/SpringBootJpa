package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.model.Doctor;

public interface DoctRepo extends CrudRepository<Doctor, Integer> {

}
