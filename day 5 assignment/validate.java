package day5;
import java.time.LocalDate;
public class validate {
	boolean firstNameCheck(String fn) {
		try{
			if(fn.equals(null)) {
			throw new validatedob("Wrong name");
			}
		}
		catch(validatedob e) {
			e.printStackTrace();
		}


		return true;
	}
	boolean middleNameCheck(String mn) {
		try{
			if(mn.equals(null)) {
			throw new validatedob("Wrong name");
			}
		}
		catch(validatedob e) {
			e.printStackTrace();
		}

		return true;
	}
	boolean genderCheck(String gn) {
		try{
			if(!gn.equals("male")&&!gn.equals("female")) {
			throw new validatedob("Wrong gender");
			}
		}
		catch(validatedob e) {
			e.printStackTrace();
		}

		return true;
	}
	boolean dateOfBirthCheck(String dob) {
		//String db[]=new String[3];
		String [] db=dob.split("-");
		LocalDate myobj=LocalDate.now();
		LocalDate myobj2=LocalDate.of(Integer.parseInt(db[2]),Integer.parseInt(db[1]), Integer.parseInt(db[0]));
		try{
			if(myobj2.isAfter(myobj)) {
			throw new validatedob("Wrong dob");
			}
		}
		catch(validatedob e) {
			e.printStackTrace();
		}
		return true;
	}

}
