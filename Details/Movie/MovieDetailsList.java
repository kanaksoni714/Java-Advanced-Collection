package Details.Movie;

import java.util.Comparator;

public class MovieDetailsList {
	MovieDetails movie= new MovieDetails("Baahubali","Prabhas","Anushka","Fictional");
	MovieDetails movie1= new MovieDetails("Andhadhun","Ayushman","Radhika","Mystery");
	MovieDetails movie2= new MovieDetails("Raazi","Vicky","Alia","Patriotic");
	MovieDetails movie3= new MovieDetails("Border","Sunny deol","Ameesha Patel","Patriotic");
	int result;


public String removeMovie(String movieName){ 
    return movieName;
   
} 
public String removeAllMovies(String movieName){ 
    return movieName;
   
} 
public String findMovieByMovieName(String movieName){ 
    return movieName;
   
} 
public String addMovie(String movieName){ 
    return movieName;
   
} 
public class FindMovieByGenre implements Comparator<MovieDetailsList>{

	@Override
	public int compare(MovieDetailsList o1, MovieDetailsList o2) {
		for (Comparator<MovieDetailsList> comparator : MovieDetailsList) 
			 result = comparator.compare(o1, o2);
        if (result != 0) {
            return result;
        }

        else return 0;
}


}
}