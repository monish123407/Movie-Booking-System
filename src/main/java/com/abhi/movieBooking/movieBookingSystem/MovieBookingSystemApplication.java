package com.abhi.movieBooking.movieBookingSystem;

import com.abhi.movieBooking.movieBookingSystem.Service.MovieService;
import com.abhi.movieBooking.movieBookingSystem.dao.*;
import com.abhi.movieBooking.movieBookingSystem.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MovieBookingSystemApplication {


	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(MovieBookingSystemApplication.class, args);



		System.out.println("Hello Spring Boot !!! ");
		MovieService movieService=ctx.getBean(MovieService.class);

//		Movie movie=new Movie();
//		movie.setMovieDescription("Good Movie");
//		movie.setMovieName("Dhoom");
//		movie.setDuration(120);
//		movie.setCoverPhotoUrl("Cover Photo Url");
//		movie.setReleaseDate(LocalDateTime.of(2020,07,10,0,0,0));
//		movie.setTrailerUrl("Trailer Url");
//		StatusDao statusDao=ctx.getBean(StatusDao.class);
//		Status status=new Status();
//		status.setStatusName("Cazz");
//		statusDao.save(status);
//		movie.setStatus(status);
//		movieService.acceptMovieDetails(movie);
	}

}