package com.nt;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Movie;

public interface Imovie extends JpaRepository<Movie, Integer> {
  public <T extends ResultV> Iterable<T> findByNameIs(String name,Class<T> clazz);
  public Movie findByMid(int no);
	

}
