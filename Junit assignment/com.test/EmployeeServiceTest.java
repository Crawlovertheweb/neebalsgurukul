package com.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeServiceTest 
{
	EmployeeService employeeService = new EmployeeService();

	@Test
	public void testComputePerAnnumSalary() {
		Employee employee = new Employee(1, "Rohit", "rohitkarale2104@gmail.com", "9850777984", "Mumbai", 50000);
		Employee result = employeeService.computePerAnnumSalary(employee);
		assertEquals(Math.round(50000 * 12), Math.round(result.getSalaryPerMonth()));
	}

	@Test
	public void testComputeIncrement_Mumbai() {
		Employee employee = new Employee(1, "Rohit", "rohitkarale2104@gmail.com", "9850777984", "Mumbai", 50000);
		Employee result = employeeService.computeIncrement(employee);
		assertEquals(Math.round(52500), Math.round(result.getSalaryPerMonth()));
	}

	@Test
	public void testComputeTotalSalary() {
		Employee[] employees = { new Employee(1, "Rohit", "rohitkarale2104@gmail.com", "9850777984", "Mumbai", 50000),
				new Employee(2, "Rutika", "rutikarale2104@gmail.com", "9850777984", "Mumbai", 50000),
				new Employee(3, "Tanmay", "tohitkarale2104@gmail.com", "9850777984", "Mumbai", 50000),
				new Employee(4, "Saurav", "sohitkarale2104@gmail.com", "9850777984", "Mumbai", 50000) };
		double totalSalary = employeeService.computeTotalSalary(employees);
		assertEquals(Math.round(50000 * 4), Math.round(totalSalary));
	}
}
