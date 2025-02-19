package collections;

public class account {
	Integer id;
	String name;
	public Double balance;
	public account(Integer id, String name, Double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	

}
