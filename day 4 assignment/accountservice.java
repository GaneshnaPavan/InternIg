package collections;

import java.util.*;

public class accountservice {
	ArrayList<account> accountlist= new ArrayList<>();
	
	public void addAccount(account acc) {
		accountlist.add(acc);
	}
	
	public void listAccount() {
		accountlist.forEach(x->System.out.println(x));
	}
	
	public void updateAccount(Double amt,Double bal) {
		bal-=amt;
	}

}
