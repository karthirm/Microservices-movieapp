package com.springboot.microservices.moviecatalogservice.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRating {
	
	private String userId;
	private List<Rating> ratings;
	
	

}
