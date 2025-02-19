package questions;



class result{
	public static int solve(int a[]){
		int more=0;
		int index=0;
		int dif=0;
		for(int i=1;i<a.length;i++) {
			dif=Math.abs(a[i]-a[i-1]);
			if(dif>more) {
				more=dif;
				if(a[i]>a[i-1]) {
					index=i;
				}
				else {
					index=i-1;
				}
				
			}
			
			
		}
		return index;
	}
public class largeDiff {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,8,6,4,9,1};
		int res=result.solve(arr);
		System.out.println(res);

	}

}
}


