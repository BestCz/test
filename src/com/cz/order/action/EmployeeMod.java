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
import com.cz.order.factory.Daofactory;

/**
 * Servlet implementation class EmployeeMod
 */
@WebServlet("/EmployeeMod")
public class EmployeeMod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeMod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String eid=request.getParameter("eid");
		String epassword=request.getParameter("epassword");
		String ename=request.getParameter("ename");
		String age=request.getParameter("age");
		System.out.println(eid+" "+epassword+" "+ename+" "+age);
		
		try{
			IEmployee im=Businessfactory.getEmployee();
			im.mod(eid,epassword, ename, age);
			response.sendRedirect("http://localhost:8080/dingcan/EmployeeGetlist");
			
			}catch(Exception e){
				System.out.println("yuangong sevlet修改错误"+e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
