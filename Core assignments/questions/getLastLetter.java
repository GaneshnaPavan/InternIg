package questions;

import java.util.*;

public class getLastLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String res=sol(str);
	
		System.out.println(res);

	}
	public static String sol(String str) {
		String arr[]=str.split(" ");
		StringBuilder str1=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			str1.append(arr[i].charAt(arr[i].length()-1));
		}
		return str1.toString().toUpperCase();
	}

}
