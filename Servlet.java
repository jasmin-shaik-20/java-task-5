package com.marketsimplified;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

@WebServlet("/Response")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
			response.setContentType("application/json");
			StringBuffer jb= new StringBuffer();
			String line=null;
			BufferedReader reader=request.getReader();
			while((line=reader.readLine())!= null) {
				jb.append(line);
				
			}
			JSONObject jsobj = new JSONObject(jb.toString());
			int empcode=jsobj.getInt("empcode");
			JSONObject tabledata= new JSONObject();
			JSONArray jsonArray = new JSONArray();
			String jsonData;
			PermanentEmployee.PermanentDetails();
			PartTimeEmployee.PartTimeDetails();
			ContractEmployee.ContractDetails();
			
			if(PermanentEmployee.Permanentdata.containsKey(empcode)) {	
			tabledata.put("EmpCode",PermanentEmployee.Permanentdata.get(empcode).empcode );
			tabledata.put("Name",PermanentEmployee.Permanentdata.get(empcode).name);
			tabledata.put("Department",PermanentEmployee.Permanentdata.get(empcode).department);
			tabledata.put("Salary", PermanentEmployee.Permanentdata.get(empcode).salary);
			tabledata.put("Bonus", PermanentEmployee.Permanentdata.get(empcode).bonus);
			jsonArray.put(tabledata);
            jsonData=jsonArray.toString();
			out.print(jsonData);
			System.out.println(jsonData);	
			}
			
			
			else if(PartTimeEmployee.PartTimedata.containsKey(empcode)) {
				tabledata.put("EmpCode",PartTimeEmployee.PartTimedata.get(empcode).empcode );
				tabledata.put("Name",PartTimeEmployee.PartTimedata.get(empcode).name);
				tabledata.put("Department",PartTimeEmployee.PartTimedata.get(empcode).department);
				tabledata.put("Salary", PartTimeEmployee.PartTimedata.get(empcode).salary);
				tabledata.put("HoursWorked", PartTimeEmployee.PartTimedata.get(empcode).hoursworked);
				jsonArray.put(tabledata);
	            jsonData=jsonArray.toString();
				out.print(jsonData);
				System.out.println(jsonData);	
				}
			
			
			else if(ContractEmployee.Contractdata.containsKey(empcode))
			{
				tabledata.put("EmpCode",ContractEmployee.Contractdata.get(empcode).empcode );
				tabledata.put("Name",ContractEmployee.Contractdata.get(empcode).name);
				tabledata.put("Department",ContractEmployee.Contractdata.get(empcode).department);
				tabledata.put("Salary", ContractEmployee.Contractdata.get(empcode).salary);
				tabledata.put("ContractPeriod", ContractEmployee.Contractdata.get(empcode).contractperiod);
				jsonArray.put(tabledata);
	            jsonData=jsonArray.toString();
				out.print(jsonData);
				System.out.println(jsonData);
				
				
			}
			else
			{
			   out.println("Invalid employee code");
			}
			
		
			
	}

}