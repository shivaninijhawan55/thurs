package com.infy.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.infy.dao.EmployeeServicesImpl;

import com.infy.model.Employee;





@Path("EmpService")
public class EmployeeController {
EmployeeServicesImpl e=new EmployeeServicesImpl();

@Path("getXml")
@GET
@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
public List<Employee> getXml()
{
	return e.getXml();
	
}
@Path("getJson")
@GET
@Produces(MediaType.APPLICATION_JSON)
public List<Employee> getJson()
{
	return e.getJson();
	
}


@Path("get/{salary1}/{salary2}")
@GET
@Produces({ MediaType.APPLICATION_JSON }) // need json type data
public List<Employee> displaySalary (@PathParam("salary1")int sal1,@PathParam("salary2")int sal2) {
	
	return e.displaySalary(sal1, sal2);
	
}



@Path("get/{id}") 
@GET 
@Produces(MediaType.APPLICATION_JSON)
public List<Employee> displayEmployee(@PathParam("id") String pid) {
	return e.displayEmployee(pid);
	
}

@Path("management/update")
@PUT
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.TEXT_PLAIN)
public String updateEmployee(Employee emp) {
	e.uodateEmployee(emp);
	return"Record Updated";
}

@Path("management/updateEmployeeName")
@PUT
@Consumes(MediaType.APPLICATION_JSON)
 @Produces(MediaType.TEXT_PLAIN)
public String updateName(Employee emp) {
	e.updateName(emp);
	return "Name Updated";
}


@Path("add")
@POST
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.APPLICATION_JSON)
public String addProject(Employee emp) {
	e.addEmployee(emp);
	return "one new Employee Added";
}

@Path("management/deleteemp/{id}") // remove/104
@DELETE // method delete
@Produces(MediaType.TEXT_PLAIN)
public String deleteEmployee(@PathParam("id") String pid) {
	e.deleteEmployee(pid);
	return "Record deleted";
}


}//end class
