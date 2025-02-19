package day5;
import java.util.*;
public class stackexec {

	public static void main(String[] args) throws validatedob {
		// TODO Auto-generated method stub
		String firstname;
		String middleName;
		String dateOfbirth;
		String gender;
		String mobileNumber;
		validate validation=new validate();
		Scanner sc=new Scanner(System.in);
		boolean something=true;
		stack1 stackitem=new stack1();
		
		Stack<stack1> s1=new Stack<>();
		System.out.println("Enter the size of the stack");
		int size=sc.nextInt();
		//Stack1op ss=new stack1op();
		while(something) {
			
			System.out.println("Enter the option");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Exit");
			int response=sc.nextInt();
			switch(response) {
			case 1:		
				if(s1.size()==size) {
					throw new validatedob("Stack full");
				}
				System.out.println("Enter the firstname");
				firstname=sc.next();
				System.out.println("Enter the middlename");
				middleName=sc.next();
				System.out.println("Enter the date of birth of the format dd-mm-yyyy");
				dateOfbirth=sc.next();
				System.out.println("Enter the gender");
				gender=sc.next();
				System.out.println("Enter the mobile number");
				mobileNumber=sc.next();
		
		
		
		

					
		
					stackitem.setFirstname(firstname);
					stackitem.setMiddleName(middleName);
					stackitem.setDateOfbirth(dateOfbirth);
					stackitem.setGender(gender);
					stackitem.setMobileNumber(mobileNumber);
					
					
							
					s1.push(stackitem);
					
		break;
		
		
			case 2:
				if(s1.isEmpty()) {
					throw new validatedob("Stack empty");
				}
				System.out.println( s1.pop());
				break;
			case 3:
				something=false;
				break;
		
		
			}
		}
	}

}
