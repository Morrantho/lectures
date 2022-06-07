import java.util.ArrayList;

public class Program
{
	public MovieList movieList;

	public HorrorMovieList horrorMovieList;

	public Program()
	{
		movieList=new MovieList();
		horrorMovieList=new HorrorMovieList();
	}

	public static void main(String[] args)
	{
		Program program=new Program();

		program.movieList.movies.add("Friday");
		program.movieList.movies.add("Avatar");
		program.movieList.movies.add("Dodgeball");
		program.movieList.movies.add("Marvel");
		program.movieList.movies.add("Step Brothers");

		ArrayList<String> horrorMovies=program.horrorMovieList.getMovies();
		horrorMovies.add("The Ring");
		horrorMovies.add("Amityville");
		horrorMovies.add("Saw");
		horrorMovies.add("The Grudge");
		horrorMovies.add("The Haunting In Connecticut");
		horrorMovies.add("Exorcist");
		horrorMovies.add("Jeepers Creepers");

		ArrayList<String> horrorMovies2=program.horrorMovieList.getMovies();
		for(String movie:horrorMovies2)
		{
			System.out.println(movie);
		}

		// program.horrorMovieList.movies.add("The Ring");
		// program.horrorMovieList.movies.add("Amityville");
		// program.horrorMovieList.movies.add("Saw");
		// program.horrorMovieList.movies.add("The Grudge");
		// program.horrorMovieList.movies.add("The Haunting In Connecting");
		// program.horrorMovieList.movies.add("Exorcist");
		// program.horrorMovieList.movies.add("Jeepers Creepers");
	}
};