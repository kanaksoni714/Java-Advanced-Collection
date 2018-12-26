/*
2)	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actress, and genre  
 * add setter and getter method in that class. 
a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), 
	find_movie_By_mov_Name(), find_movie_By_Genre()
c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort 

 */




package Details.Movie;

public class MovieDetails implements Comparable 
{
	public String movieName;
	public String leadActor;
	public String leadActress;
	public String movieGenre;
	
	


	public MovieDetails(String movName, String movieGenre,String leadActress, String leadActor) {
		super();
		this.movieName = movName;
		this.leadActor = leadActor;
		this.leadActress = leadActress;
		this.movieGenre = movieGenre;
}




	/**
	 * @return the movName
	 */
	public String getMovName() {
		return movieName;
	}




	/**
	 * @param movName the movName to set
	 */
	public void setMovName(String movName) {
		this.movieName = movName;
	}




	/**
	 * @return the leadActor
	 */
	public String getLeadActor() {
		return leadActor;
	}




	/**
	 * @param leadActor the leadActor to set
	 */
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}




	/**
	 * @return the leadActress
	 */
	public String getLeadActress() {
		return leadActress;
	}




	/**
	 * @param leadActress the leadActress to set
	 */
	public void setLeadActress(String leadActress) {
		this.leadActress = leadActress;
	}




	/**
	 * @return the movieGenre
	 */
	public String getMovieGenre() {
		return movieGenre;
	}




	/**
	 * @param movieGenre the movieGenre to set
	 */
	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}




	@Override
	public int compareTo(Object o) {
		
		return 0;
	}



}
