package Exception;
import java.util.*;

public class Average {

	public static void main(String[] args) throws notNatural {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		AverageCalculator avgcal=new AverageCalculator();
		System.out.println("Enter a number");
		int num=sc.nextInt();
		if(num==0) {
			throw new notNatural("This is a not natural number");
		}
		System.out.println("The average is"+avgcal.calAverage(num));
		
	}

}
