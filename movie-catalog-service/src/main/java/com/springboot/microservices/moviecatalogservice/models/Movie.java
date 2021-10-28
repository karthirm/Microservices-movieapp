package com.springboot.microservices.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	
	private String movieId;
	private String name;
	private String description;

	
}
