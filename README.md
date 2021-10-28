# Microservices-movieapp
This repository contains the source code for Microservices, spring boot app which has a couple of microservices which communicate with each other
# Microservices-movieapp
This repository contains the source code for Microservices, spring boot app which has a couple of microservices which communicate with each other
There are 3 microservices which communicate using Eureka discovery server
Spring cloud config server is used to maintain consistency among microservices
Movie-Info service takes Movie ID as input and output the movie details 
Ratings Data service takes User ID as input and output the movie ID & ratings
Movie Catalog services takes User ID as input and output the movie list with details. It also calls the movie-info and ratings data service
