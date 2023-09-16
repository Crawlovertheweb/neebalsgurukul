package com.service;

import com.model.Employee;

public class EmployeeService 
{
	public Employee computePerAnnumSalary(Employee emp1) {
		// TODO Auto-generated method stub
		double perAnnumSalary = emp1.getSalaryPerMonth() * 12;
        emp1.setSalaryPerMonth(perAnnumSalary);
		return emp1;
	}

	public Employee computeIncrement(Employee emp1) {
		// TODO Auto-generated method stub
		String city = emp1.getCity();
        double increment = 0.0;

        if ("Mumbai".equals(city)) {
            increment = emp1.getSalaryPerMonth() * 0.05;
        } else if ("Pune".equals(city)) {
            increment = emp1.getSalaryPerMonth() * 0.03;
        }

        emp1.setSalaryPerMonth(emp1.getSalaryPerMonth() + increment);
        return emp1;
	}

	public double computeTotalSalary(Employee[] employees) {
        double totalSalary = 0.0;
        for (Employee e : employees) {
            totalSalary += e.getSalaryPerMonth();
        }
        return totalSalary;
    }
}
