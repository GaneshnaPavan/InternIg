package questions;

import java.util.Scanner;

public class firstWordLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		int res=sol(str);
		System.out.println(res);
	}
	public static int sol(String str) {
		String arr[]=str.split(" ");
		if(arr[0].equals(arr[arr.length-1])) {
			return arr[0].length();
		}
		else {
			return arr[0].length()+arr[arr.length-1].length();
		}
	}

}
