package questions;
import java.util.*;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		System.out.println("Enter the character");
		char at=sc.next().charAt(0);
		String res=change(str,at);
		System.out.println(res);
		
	}
	public static String change(String str,char at) {
		StringBuilder res1=new StringBuilder();
		for(int i=str.length()-1;i>0;i--) {
			res1.append(str.charAt(i)).append(at);
		}
		 res1.append(str.charAt(0));
		return res1.toString();
		
	}

}
