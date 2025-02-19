package questions;

import java.util.Scanner;

public class phoneNo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string in format XXX-XXX-XXXX");
		String str=sc.nextLine();
		 if (str.matches("^\\d{3}-\\d{3}-\\d{4}$")) {
	            System.out.println(str + " is a valid phone number.");
	        } else {
	            System.out.println(str + " is not a valid phone number.");
	        }
		 String res=sol(str);
		 System.out.println(res);

}
	public static String sol(String str) {
		StringBuilder str1=new StringBuilder();
		String arr[]=str.split("-");
		for(int i=0;i<arr.length;i++) {
			str1.append(arr[i]);
		}
//		XX-XX-XXX-XXX
		str1.insert(2,"-");
		str1.insert(5,"-");
		str1.insert(9,"-");
		return str1.toString();

		
	}
}
