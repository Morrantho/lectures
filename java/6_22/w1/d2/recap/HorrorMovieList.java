import java.util.ArrayList;

public class HorrorMovieList
{
	private ArrayList<String> movies;

	public void setMovies(ArrayList<String> _movies)
	{
		movies=_movies;
	}

	public ArrayList<String> getMovies()
	{
		return movies;
	}

	public HorrorMovieList()
	{
		movies=new ArrayList<String>();
	}
};