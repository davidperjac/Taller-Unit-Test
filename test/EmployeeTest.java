package test;
import main.Employee;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.EmployeeType;

class EmployeeTest {
	Employee e = new Employee(320,"USD",10,EmployeeType.Worker);
	Employee e1 = new Employee(320,"USD",10,EmployeeType.Supervisor);
	Employee e2 = new Employee(320,"USD",10,EmployeeType.Manager);
	
	Employee c0= new Employee(320,"Euro",10,EmployeeType.Worker);
	Employee c1 = new Employee(320,"Euro",10,EmployeeType.Supervisor);
	Employee c2 = new Employee(320,"Euro",10,EmployeeType.Manager);

	
	@Test
	void testCs() {
		/*
		 * Valida con los 3 tipos de Empleado, currency = USD
		 */
		assertEquals(e.cs(),384.3,0.1);
		
		assertEquals(e1.cs(),387.8,0.1);
		assertEquals(e2.cs(),391.3,0.1);
		/*
		 * Valida con los 3 tipos de Empleado, currency = euro
		 */
		
	    assertEquals(c0.cs(),368.3,0.1);
		assertEquals(c1.cs(),371.8,0.1);
		assertEquals(c2.cs(),375.3,0.1);
		
	}

	@Test
	void testCalculateYearBonus() {
		/*
		 * Valida con los 3 tipos de Empleado, currency = USD
		 */
		
        assertEquals(e.CalculateYearBonus(),386,0.1);
		
		assertEquals(e1.CalculateYearBonus(),513,0.1);
		assertEquals(e2.CalculateYearBonus(),706,0.1);
		/*
		 * Valida con los 3 tipos de Empleado, currency = euro
		 */
		
	    assertEquals(c0.CalculateYearBonus(),386,0.1);
		assertEquals(c1.CalculateYearBonus(),497,0.1);
		assertEquals(c2.CalculateYearBonus(),690,0.1);


	}

}
