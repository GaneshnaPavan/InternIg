package Exception;
import java.util.*;

public class movieName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> lom=new ArrayList<>();
		Movie mv=new Movie("Rangastalam","telugu","3rdaug","sukumar","Mythri",3.30);
		Movie mv1=new Movie("Robo","tamil","3rdsep","shankar","Lyca",4.00);
		Movie mv2=new Movie("Ranga","tegu","3daug","suumar","Myhri",3.50);
		lom.add(mv1);
		lom.add(mv);
		lom.add(mv2);
		
		lom.sort(new DurationComparator());
		
		for(Movie mve:lom) {
			System.out.println(mve);
		}
	}

}
