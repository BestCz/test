package com.cz.order.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IClient;
import com.cz.order.business.IEmployee;
import com.cz.order.factory.Businessfactory;

/**
 * Servlet implementation class ClientAdd
 */
@WebServlet("/ClientAdd")
public class ClientAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cname=request.getParameter("cname");
		String cid=request.getParameter("cid");
		String cpassword=request.getParameter("cpassword");
		String phone=request.getParameter("phone");
		String caddress=request.getParameter("caddress");
		try{
			IClient im=Businessfactory.getClient();
			im.add(cname, cid, cpassword, phone, caddress);
			
			
			
			response.sendRedirect("http://localhost:8080/dingcan/ClientGetlist");
			
			}catch(Exception e){
				System.out.println("员工sevlet添加错误"+e.getMessage());
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
