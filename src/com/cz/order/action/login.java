package com.cz.order.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IClient;
import com.cz.order.business.IEmployee;
import com.cz.order.factory.Businessfactory;
import com.cz.order.factory.ConnectionFactory;
import com.cz.order.factory.Daofactory;
import com.cz.order.value.clientValue;
import com.cz.order.value.employeeValue;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		if(eid!=null&&eid.trim().length()>0&&epassword!=null &&epassword.trim().length()>0){
			IEmployee ic=Businessfactory.getEmployee();
			try{
				
				
				
				employeeValue cv=ic.get(eid);
				if(cv.getEpassword().equals(epassword)){
					System.out.println(cv.getEpassword());
					response.sendRedirect("http://localhost:8080/dingcan/main.jsp");
				}
			}			
		catch(Exception e){
			System.out.println("登陆错误"+e.getMessage());
			}
		}else{
			response.sendRedirect("http://localhost:8080/dingcan/login/login.jsp");
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
