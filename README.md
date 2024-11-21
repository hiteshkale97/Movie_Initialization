# Movie_Initialization
Movie Initialization for mangoApp assignment

"In this application, I have utilized MySQL as the database and Spring Boot for the backend development."

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
