package questions;
import java.util.*;
//3. Write tester class, Program3 to read a string and validate PAN number against following 
//rules:
//1. There must be eight characters.
//2. First three letters must be alphabets followed by four digit number and ends 
//with alphabet
//3. All alphabets should be in capital case.
// 
//Print "Valid" if the PAN no. is valid, else print "Invalid".
// 
//Write a static method validatePAN which accepts a string. 
//The return type is Boolean type
//
//Sample Input 1:
//ALD3245E
//Sample Output 1:
//Valid
//Sample Input 2:
//OLE124F
//Sample Output 2:
//Invalid
public class Pan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		if(str.length()==8 &&Character.isLetter(str.charAt(7))&&Character.isUpperCase(str.charAt(7))) {
			if(threedigit(str)&&endsalp(str)) {
				System.out.println("valid");
			}
					}
		else {
			System.out.println("Invalid");
		}


	}
	static boolean threedigit(String test) {
		boolean t=false;
		for(int i=0;i<3;i++) {
			if(Character.isLetter(test.charAt(i))&&Character.isUpperCase(test.charAt(i))) {
				t=true;
			}
		}
		return t;
		
	}
	static boolean endsalp(String test) {
		boolean t=false;
		for(int i=3;i<7;i++) {
			if(Character.isDigit(test.charAt(i))) {
				t=true;
			}
		}
		return t;
		
	}
	


}
