# Movie_Initialization
Movie Initialization for mangoApp assignment

"In this application, I have used MySQL as the database and Spring Boot for backend development to implement RESTful APIs."

---for save movie -> post method
http://localhost:8888/saveMovie
json format data
{
    "title": "KGF",
    "genre": "Drama",
    "shows": [
        {
            "showTime": "2024-1-20T18:00:00",
            "totalSeats" : 50,
            "availableSeats": 50,
            "movie": {
                "id" : 1
            }
        }
    ]
}

---for Book a ticket -> post method -> 
http://localhost:8888/book?showId=1&userName=hitesh

---for cancel ticket -> delete method ->
http://localhost:8888/cancel/{bookingId}

---for get show for particular movie -> get method
http://localhost:8888/{movieId}/shows

--- for get all available movie -> get method
http://localhost:8888/getAllMovies


