package collections;
import java.util.*;

public class Employee {
	String firstname;
	String lastname;
	public Employee(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	public static void main(String[] args) {
		int id1=4;
		int id2=2;
		int id3=3;
		int id4=6;
		int id5=1;
		int id6=5;
		int id7=4;
		Employee emp1=new Employee("Pavan","Ganeshna");
		Employee emp2=new Employee("varshith","Gandra");
		Employee emp3=new Employee("sai","uppalapati");
		Employee emp4=new Employee("lasya","mattaparthy");
		Employee emp5=new Employee("yamini","annadipuram");
		Employee emp6=new Employee("Siddartha","Jilebi");
		Employee emp7=new Employee("Vineeth","Rathode");
		HashMap<Integer,Employee> emps=new HashMap<>();
		addEmployee(emps, id1, emp1);
        addEmployee(emps, id2, emp2);
        addEmployee(emps, id3, emp3);
        addEmployee(emps, id4, emp4);
        addEmployee(emps, id5, emp5);
        addEmployee(emps, id6, emp6);
        addEmployee(emps, id7, emp7);
        
       
//		emps.put(id1,emp1);
//		emps.put(id2,emp2);
//		emps.put(id3,emp3);
//		emps.put(id4,emp4);
//		emps.put(id5,emp5);
//		emps.put(id6,emp6);
//		emps.put(id7,emp7);
		Set entries=emps.entrySet();
		Iterator i=entries.iterator();
		while(i.hasNext()) {
			Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()   +"  "+entry.getValue());
		}
		
	}
	 public static void addEmployee(HashMap<Integer,Employee> emps,int id,Employee emp) {
     	if(!emps.containsKey(id)) {
     		emps.put(id, emp);
     	}
     }

}
