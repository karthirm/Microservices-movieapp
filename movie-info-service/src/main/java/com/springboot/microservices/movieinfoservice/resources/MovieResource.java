package com.springboot.microservices.movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.microservices.movieinfoservice.models.Movie;
import com.springboot.microservices.movieinfoservice.models.MovieSummary;

@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	@Value("${api.key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//https://api.themoviedb.org/3/movie/550?api_key=fd54abfae2a55105907905b5d15ab7de
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		MovieSummary movieSummary = restTemplate.getForObject
				//("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey,
				("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=fd54abfae2a55105907905b5d15ab7de",
						MovieSummary.class);
		
		return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
		
	}

}
