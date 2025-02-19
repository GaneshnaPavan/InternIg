package Exception;
import java.util.*;

public class Movie {
	String name;
	String language;
	String release;
	String director;
	String producer;
	Double duration;
	public Movie(String name, String language, String release, String director, String producer, Double duration) {
		super();
		this.name = name;
		this.language = language;
		this.release = release;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", language=" + language + ", release=" + release + ", director=" + director
				+ ", producer=" + producer + ", duration=" + duration + "]";
	}
	
	
}
class DurationComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		Movie m1=(Movie)o1;
		Movie m2=(Movie)o2;
		if(m1.duration>m2.duration)
			return 1;
		else if(m1.duration<m2.duration)
			return -1;
		else
			return 0;
	}
}

