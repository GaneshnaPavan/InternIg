package Exception;

public class AverageCalculator {
	public double calAverage(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		double avg=sum/n;
		return avg;
	}
}
