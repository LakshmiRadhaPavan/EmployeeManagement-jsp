package Servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Models.EmpModels;
import Services.EmpServices;
import dbconnection.EmpConnection;

@WebServlet("/displayall")
public class EmpData extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Inside doGet method");
        
        EmpServices service = new EmpServices(EmpConnection.getconn());
        List<EmpModels> Employees = service.getall();
        
        if (Employees == null || Employees.isEmpty()) {
            System.out.println("No employees found");
        } else {
            System.out.println("Number of employees retrieved: " + Employees.size());
        }
        req.setAttribute("Employees", Employees);
        req.getRequestDispatcher("/DisplayAll.jsp").forward(req, resp);
        System.out.println("Forwarding to JSP with employee data");
    }
}
