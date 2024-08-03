package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbconnection.EmpConnection;
import Models.EmpModels;
import Services.EmpServices;

@WebServlet("/login")
public class EmpServlets extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id =Integer.parseInt(req.getParameter("Emp_id")) ;
		String name = req.getParameter("Emp_name");
		int salary = Integer.parseInt(req.getParameter("Emp_salary"));
		int age = Integer.parseInt(req.getParameter("Emp_age")) ;
		long phno = Long.parseLong(req.getParameter("Emp_phno"));
		String email = req.getParameter("Emp_email");
		
		EmpModels Employee = new EmpModels(id,name,salary,age,phno,email);
		
		EmpServices service = new EmpServices(EmpConnection.getconn());
		
		boolean f = service.addEmployee(Employee);
		if (f) {
			resp.sendRedirect("index.jsp");
		} else {
			resp.sendRedirect("register.jsp");
		}
	}

}
