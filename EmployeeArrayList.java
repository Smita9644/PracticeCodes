package ArrayIist_code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeArrayList {

	public EmployeeArrayList() {
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean comareTwoArraylist(ArrayList<Employee> e1,ArrayList<Employee> e2)
	{
		boolean status = false;	
		
		for(Employee emp1 : e1) {
			status = false;	
			for(Employee emp2 : e2) {
				if(emp1.equals(emp2)) {
					status = true;
				
				}
			}
			if(status == false) {
				break;
			}
		}
	
		if(status == true) {
			for(Employee emp2 : e2) {
				status = false;	
				for(Employee emp1 : e1) {
					if(emp2.equals(emp1)) {
						status = true;
						
					}
				}
				if(status == false) {
					break;
				}
			}
			return status;
		}else
			return status;
	}
	public static void main(String[] args)
	{
		ArrayList<Employee> a1=new ArrayList<>();
		ArrayList<Employee> a2=new ArrayList<>();
		
		a1.add(new Employee(11,"smita"));
		a1.add(new Employee(2,"asmita"));
		a1.add(new Employee(3,"smit"));
		a1.add(new Employee(44,"mitali"));
		
		a2.add(new Employee(44,"smita"));
		a2.add(new Employee(3,"asmita"));
		a2.add(new Employee(2,"smit"));
		a2.add(new Employee(11,"mitali"));
		EmployeeArrayList campare=new EmployeeArrayList();
		Collections.sort(a1);
		for (Employee em : a1) {
			System.out.println(em.Id+" "+em.name);
		}
		Collections.sort(a2);
		for (Employee em : a2) {
			System.out.println(em.Id+" "+em.name);
		}
		
		if(campare.comareTwoArraylist(a1,a2))
			{
			  System.out.println("list is same");
			}
		else
		{
			System.out.println("list is different");
		}
	}

	
}
