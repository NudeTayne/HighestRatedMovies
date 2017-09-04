package movie;

import java.util.ArrayList;
import java.util.List;

public class Movie 
{
	private int id;
	private double rating;
	private List<Movie> similarMovies;
	
	public Movie(int aInId, double aInRating)
	{
		this.setId(aInId);
		this.setRating(aInRating);
		similarMovies = new ArrayList<Movie>();
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public double getRating() 
	{
		return rating;
	}

	public void setRating(double rating) 
	{
		this.rating = rating;
	}

	public List<Movie> getSimilarMovies() 
	{
		return similarMovies;
	}

	public void addSimilarMovies(Movie aInMovie) 
	{
		similarMovies.add(aInMovie);
		aInMovie.addSimilarMovies(this);
	}		
}
