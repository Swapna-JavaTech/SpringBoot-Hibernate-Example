package com.hexaware.springboothibernatedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springboothibernatedemo.entity.Movie;
import com.hexaware.springboothibernatedemo.service.MovieService;



@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/getallmovies")
	public List<Movie> getAllMovies(){
		return movieService.findAll();
	}
	
	@PostMapping("/addmovie")
	public String saveMovie(@RequestBody Movie movie) {
		return movieService.save(movie) + "Movie added Successfully";
	}
	
	@DeleteMapping("/deletemovie/{movieid}")
	public void deleteMovie(@PathVariable("movieid") Long movieId) {
		 movieService.deleteById(movieId) ;
	}
	
	@GetMapping("/getmovie/{movieid}")
	public Movie getMovie(@PathVariable("movieid") Long movieId) {
		return movieService.findById(movieId);
	}
	
	@PutMapping("/updatemovie/{movieid}")
	public String Update(@RequestBody Movie movie,@PathVariable("movieid") Long movieId) {
		return movieService.update(movie, movieId) + " Movie updated successfully";
	}
}
