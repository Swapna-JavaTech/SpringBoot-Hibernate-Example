package com.hexaware.springboothibernatedemo.service;

import java.util.List;

import com.hexaware.springboothibernatedemo.entity.Movie;


public interface MovieService {
	public List<Movie> findAll();
	public Movie findById(Long movieId);
	public void deleteById(Long movieId);
	public Movie save(Movie movie);
	public int update(Movie movie,Long movieId);
}
