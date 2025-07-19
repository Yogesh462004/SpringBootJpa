package com.nt.service;

import java.util.List;

import com.nt.dao.Doctor;

public interface Iserv {
    // Returns a Page of Doctors for a given page number, size, sort direction, and properties
//    public Page<Doctor> findPage(int pno, int psize, boolean asc, String... props);
//    public String register(Doctor doct);
	public String deletebatch(List<Integer> ids);
	public Doctor getref(Integer id);
}
