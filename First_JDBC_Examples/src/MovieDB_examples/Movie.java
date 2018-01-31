package MovieDB_examples;

/**
 * Entity class: Movie
 * 
 * @author Kari
 * @version 1.0
 */
public class Movie {
	private String id;
	private String name;
	private String director;
	private int year;

	public Movie() {
		id = "";
		name = "";
		director = "";
		year = -1;
	}

	public Movie(String id, String name, String director, int year) {
		this.id = id;
		this.name = name;
		this.director = director;
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", year=" + year + "]";
	}
}
// End
