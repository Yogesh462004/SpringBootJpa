package com.nt;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Movie;

public interface Imovie extends JpaRepository<Movie, Integer> {

	/*public List<Movie> findByNameEquals(String name);
	public List<Movie> findByNameIs(String name);
	public List<Movie> findByName(String name);
	public List<Movie> findByNameStartingWith(String name);
	public List<Movie> findByNameEndingWith(String name);
	public List<Movie> findByNameContaining(String name);
	public List<Movie> findByNameIgnoreCase(String name);*/
	public List<Movie> findByMidGreaterThanEqualAndMidLessThanEqual(int i1,int i2);



}
