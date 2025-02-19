package collections;

import java.util.Scanner;

public class accountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		boolean something =true;
		accountservice as=new accountservice();
		while(something) {
			System.out.println("Enter the acc no:");
			Integer id=sc.nextInt();
			System.out.println("Enter the acc holder name");
			String name=sc.next();
			System.out.println("Enter the balance");
			Double balance=sc.nextDouble();
			account acct=new account(id,name,balance);
			
			as.addAccount(acct);
			as.listAccount();
			System.out.println("If you want to enter one more account type yes..or else no");
			String loop=sc.next();
			if(loop.equals("no")) {
				something=false;	
			}
			
			
		}
		
		
		
		

	}

}
