package com.cz.order.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IEmployee;
import com.cz.order.business.IMenu;
import com.cz.order.factory.Businessfactory;
import com.cz.order.value.employeeValue;
import com.cz.order.value.menuValue;

/**
 * Servlet implementation class EmployeeGet
 */
@WebServlet("/EmployeeGet")
public class EmployeeGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eid=request.getParameter("eid");
	
		
		try{
			IEmployee mm=Businessfactory.getEmployee();
			employeeValue mv=mm.get(eid);
			String id=mv.getEid();
			String epassword=mv.getEpassword();
			String ename=mv.getEname();
			String age=mv.getAge();
			
			request.setAttribute("id", id);
			request.setAttribute("epassword",epassword);
			request.setAttribute("ename", ename);
			request.setAttribute("age",age);
			
			request.getRequestDispatcher("employee/result.jsp").forward(request, response);
			
			}catch(Exception e){
				System.out.println("菜单sevlet添加错误"+e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
