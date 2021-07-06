import java.util.*;
	
	
public class Movie {
	private ArrayList<String> MoviesList = new ArrayList<>();
	private ArrayList<Movie> MoviesObj = new ArrayList<>();
	private String MovieTitle;
	private String YearOfRelease;
	private String Language;
	private String Genre;
	private String date;
	
	Movie(){
		InitialMovies();
	}
	
	public String toString(Movie obj) {
		return obj.MovieTitle;
	}
	
	public void InitialMovies() {
		MoviesList.add("AvengersInfinitywar");
		MoviesList.add("EndGame");
		MoviesList.add("Master");
		MoviesList.add("Dark");
		MoviesList.add("Mr.ROBOT");
	}
	
	public void AddMovies(User obj) {
		Scanner sc = new Scanner(System.in);
		Movie m = new Movie();
		
		MovieTitle = sc.nextLine();
		YearOfRelease = sc.nextLine();
		Language = sc.nextLine();
		Genre = sc.nextLine();
		date = sc.nextLine();
		
		m.MovieTitle=MovieTitle;
		m.YearOfRelease=YearOfRelease;
		m.Language=Language;
		m.Genre= Genre;
		m.date=date;
		
		if(Admin.Validate(MovieTitle,obj,MoviesObj,MoviesList)) {
			MoviesObj.add(m);
		}
		else {
			System.out.println("Admin not approved");
		}
	}
	
	public void displayMovies() {
		System.out.println("Select Your Movies :");
		
		for(String iter:MoviesList) {
			System.out.println(iter);
		}
		
	}
	
	public ArrayList<String> getMoviesList() {
		return MoviesList;
	}

	public void setMoviesList(ArrayList<String> moviesList) {
		MoviesList = moviesList;
	}

	public String getMovieTitle() {
		return MovieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		MovieTitle = movieTitle;
	}

	public String getYearOfRelease() {
		return YearOfRelease;
	}

	public void setYearOfRelease(String yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


}
