package com.marketsimplified;

import java.util.Hashtable;

public class PermanentEmployee {
	public int empcode;
	public String name;
	public String department;
	public double salary;
	public double bonus;
		public PermanentEmployee(int empcode, String name, String department, double salary,double bonus) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.bonus = bonus;
	}
		static Hashtable<Integer, PermanentEmployee> Permanentdata = new Hashtable<>();

		public static void PermanentDetails()
		{
			PermanentEmployee emp1 = new PermanentEmployee(100,"Jasmin","Java", 30000,600);
			PermanentEmployee emp2 = new PermanentEmployee(101,"Divya","Human-Resource", 40000,455);
			PermanentEmployee emp3 = new PermanentEmployee(102,"Sumayia","Graphic-Designer", 50000,876);
			PermanentEmployee emp4 = new PermanentEmployee(103,"Shanmuk","Art-Music", 30000,345);
			PermanentEmployee emp5 = new PermanentEmployee(104,"sreehitha","Java", 60000,789);
			PermanentEmployee emp6 = new PermanentEmployee(105,"Mouniker","DataBase", 50000,546);
			PermanentEmployee emp7 = new PermanentEmployee(106,"Niveditha","Testing", 80000,347);
			PermanentEmployee emp8 = new PermanentEmployee(107,"Rahul","Developer", 90000,786);
			Permanentdata.put(emp1.empcode, emp1);
			Permanentdata.put(emp2.empcode, emp2);
			Permanentdata.put(emp3.empcode, emp3);
			Permanentdata.put(emp4.empcode, emp4);
			Permanentdata.put(emp5.empcode, emp5);
			Permanentdata.put(emp6.empcode, emp6);
			Permanentdata.put(emp7.empcode, emp7);
			Permanentdata.put(emp8.empcode, emp8);
		}
		@Override
		public String toString() {
			return "  " + empcode + " "+ name + " " + department + " " + salary
					+ " "+ bonus+" ";
		}
		

	
	
	

}
