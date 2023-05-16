package com.marketsimplified;

import java.util.Hashtable;

public class ContractEmployee {
	public int empcode;
	public String name;
	public String department;
	public double salary;
	public int contractperiod;
		public ContractEmployee(int empcode, String name, String department, double salary,int contractperiod) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.contractperiod = contractperiod;
	}
		static Hashtable<Integer, ContractEmployee> Contractdata = new Hashtable<>();
		public static void ContractDetails()
		{
			ContractEmployee emp1 = new ContractEmployee(300,"Jasmin","Java", 30000,600);
			ContractEmployee emp2 = new ContractEmployee(301,"Divya","Human-Resource", 40000,455);
			ContractEmployee emp3 = new ContractEmployee(302,"Sumayia","Graphic-Designer", 50000,876);
			ContractEmployee emp4 = new ContractEmployee(303,"Shanmuk","Art-Music", 30000,345);
			ContractEmployee emp5 = new ContractEmployee(304,"sreehitha","Java", 60000,789);
			ContractEmployee emp6 = new ContractEmployee(305,"Mouniker","DataBase", 50000,546);
			ContractEmployee emp7 = new ContractEmployee(306,"Niveditha","Testing", 80000,347);
			ContractEmployee emp8 = new ContractEmployee(307,"Rahul","Developer", 90000,786);
			Contractdata.put(emp1.empcode, emp1);
			Contractdata.put(emp2.empcode, emp2);
			Contractdata.put(emp3.empcode, emp3);
			Contractdata.put(emp4.empcode, emp4);
			Contractdata.put(emp5.empcode, emp5);
			Contractdata.put(emp6.empcode, emp6);
			Contractdata.put(emp7.empcode, emp7);
			Contractdata.put(emp8.empcode, emp8);
		}
		@Override
		public String toString() {
			return "  " + empcode + " "+ name + " " + department + " " + salary
					+ " "+contractperiod+" ";
		}

}
