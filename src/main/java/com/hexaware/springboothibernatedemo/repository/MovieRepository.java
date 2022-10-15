package com.hexaware.springboothibernatedemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.springboothibernatedemo.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
