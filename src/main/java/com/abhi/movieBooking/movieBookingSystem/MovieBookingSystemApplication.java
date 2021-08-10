package com.abhi.movieBooking.movieBookingSystem;

import com.abhi.movieBooking.movieBookingSystem.Service.MovieService;
import com.abhi.movieBooking.movieBookingSystem.dao.*;
import com.abhi.movieBooking.movieBookingSystem.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDateTime;
import java.util.List;
//
//@SpringBootApplication
//public class MovieBookingSystemApplication {
//
//	public static void main(String[] args) {
//
//		ApplicationContext ctx= SpringApplication.run(MovieBookingSystemApplication.class, args);
//		MovieDao movieDao=  ctx.getBean(MovieDao.class);
//		System.out.println(movieDao);
//		Movie movie=new Movie();
//		movie.setMovieName("Keshari");
//		movie.setReleaseDate(LocalDateTime.of(2019,4,27,2,10));
////		movie.setMovieId(1337);
//		movie.setMovieURL("google.com");
//		movie.setMovieDescription("good Movie");
//		Movie savedObject=movieDao.save(movie);
//		System.out.println("Saved Object:"+movie);
//		Movie movie1=new Movie();
//		movie1.setMovieName("Keshari");
//		movie1.setReleaseDate(LocalDateTime.of(2019,4,27,2,10));
////		movie.setMovieId(1337);
//		movie1.setMovieURL("google.com");
//		movie1.setMovieDescription("good Movie");
//		Movie savedObject1=movieDao.save(movie1);
//		System.out.println("Next Saved:" + savedObject1);
//		/**
//		 * I should be able to find the movie I'm interested
//		 */
//		Movie searchMovie=movieDao.findById(2).get();
//		System.out.println("Searched Movie:"+ searchMovie);
//		movie.setMovieDescription("Updated");
//		movieDao.save(movie);
//		/**
//		 * Delete the movie
//		 */
//		movieDao.delete(searchMovie);
//		Movie movie2=new Movie();
//		movie2.setMovieName("KesMission Impossible");
//		movie2.setReleaseDate(LocalDateTime.of(2019,4,27,2,10));
////		movie.setMovieId(1337);
//		movie2.setMovieURL("google.com");
//		movie2.setMovieDescription("good Movie");
//		Movie savedObject2=movieDao.save(movie2);
//		System.out.println("saved:" + savedObject2);
//		List<Movie> result=movieDao.findByMovieName("Keshari");
//		System.out.println("result"+ result);
//	}

//}
@SpringBootApplication
public class MovieBookingSystemApplication {


	public static void main(String[] args)
	{
		ApplicationContext ctx = SpringApplication.run(MovieBookingSystemApplication.class, args);



		System.out.println("Hello Spring Boot !!! ");
		MovieService movieService=ctx.getBean(MovieService.class);

		Movie movie=new Movie();
		movie.setMovieDescription("Good Movie");
		movie.setMovieName("Dhoom");
		movie.setDuration(120);
		movie.setCoverPhotoUrl("Cover Photo Url");
		movie.setReleaseDate(LocalDateTime.of(2020,07,10,0,0,0));
		movie.setTrailerUrl("Trailer Url");
		StatusDao statusDao=ctx.getBean(StatusDao.class);
		Status status=new Status();
		status.setStatusName("Cazz");
		statusDao.save(status);
		movie.setStatus(status);
		movieService.acceptMovieDetails(movie);
	}

}