package com.marketsimplified;

import java.util.Hashtable;

public class PartTimeEmployee {
	public int empcode;
	public String name;
	public String department;
	public double salary;
	public int hoursworked;
		public PartTimeEmployee(int empcode, String name, String department, double salary,int hoursworked) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.hoursworked = hoursworked;
	}
		static 	Hashtable<Integer, PartTimeEmployee> PartTimedata = new Hashtable<>();
		public static void PartTimeDetails()
		{
			PartTimeEmployee emp1 = new PartTimeEmployee(200,"Jasmin","Java", 30000,600);
			PartTimeEmployee emp2 = new PartTimeEmployee(201,"Divya","Human-Resource", 40000,455);
			PartTimeEmployee emp3 = new PartTimeEmployee(202,"Sumayia","Graphic-Designer", 50000,876);
			PartTimeEmployee emp4 = new PartTimeEmployee(203,"Shanmuk","Art-Music", 30000,345);
			PartTimeEmployee emp5 = new PartTimeEmployee(204,"sreehitha","Java", 60000,789);
			PartTimeEmployee emp6 = new PartTimeEmployee(205,"Mouniker","DataBase", 50000,546);
			PartTimeEmployee emp7 = new PartTimeEmployee(206,"Niveditha","Testing", 80000,347);
			PartTimeEmployee emp8 = new PartTimeEmployee(207,"Rahul","Developer", 90000,786);
			PartTimedata.put(emp1.empcode, emp1);
			PartTimedata.put(emp2.empcode, emp2);
			PartTimedata.put(emp3.empcode, emp3);
			PartTimedata.put(emp4.empcode, emp4);
			PartTimedata.put(emp5.empcode, emp5);
			PartTimedata.put(emp6.empcode, emp6);
			PartTimedata.put(emp7.empcode, emp7);
			PartTimedata.put(emp8.empcode, emp8);
			
		}
		@Override
		public String toString() {
			return "  " + empcode + " "+ name + " " + department + " " + salary
					+ " "+ hoursworked+" ";
		}
		

}
