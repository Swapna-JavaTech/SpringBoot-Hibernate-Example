package com.hexaware.springboothibernatedemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springboothibernatedemo.entity.Movie;
import com.hexaware.springboothibernatedemo.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieRepository movieRepo;

	@Override
	public List<Movie> findAll() {
		return movieRepo.findAll();
	}

	@Override
	public Movie findById(Long movieId) {
		return movieRepo.findById(movieId).get();
	}

	@Override
	public void deleteById(Long movieId) {
		movieRepo.deleteById(movieId);
	}

	@Override
	public Movie save(Movie movie) {
		return movieRepo.save(movie);
	}

	@Override
	public int update(Movie movie, Long movieId) {
		return 0;
	}

}
