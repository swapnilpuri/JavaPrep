package com.dp.client;

import com.dp.roles.Developer;
import com.dp.roles.Manager;

public class CompanyDirectory {

	public static void main(String[] args) {
		Developer dev1 = new Developer("101011", "Ram Singh", "Developer");
		Developer dev2 = new Developer("101012", "Shyam Lal", "Developer");
		Developer dev3 = new Developer("102011", "Karan Veer", "Developer");
        
		Manager manager1 = new Manager("101010", "Ladu Lal", "Team Lead");
		manager1.addEmployee(dev1);
		manager1.addEmployee(dev2);
		
		Manager manager2 = new Manager("101009", "Rambo", "Team Lead");
		manager2.addEmployee(dev3);
		
		//manager1.printDetails();
		//manager2.printDetails();
		
		Manager manager3 = new Manager("101000", "Kishore", "Project Manager");
		manager3.addEmployee(manager1);
		manager3.addEmployee(manager2);
		manager3.printDetails();
		
		
		
		

	}

}
