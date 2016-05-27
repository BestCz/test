package com.cz.order.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IEmployee;
import com.cz.order.business.IOrder;
import com.cz.order.factory.Businessfactory;

/**
 * Servlet implementation class orderadd
 */
@WebServlet("/OrderAdd")
public class OrderAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderAdd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mid=request.getParameter("mid");
		String cid=request.getParameter("cid");
		String cname=request.getParameter("cname");
		String mprice=request.getParameter("mprice");
		String phone=request.getParameter("phone");
		String caddress=request.getParameter("caddress");
		try{
			IOrder im=Businessfactory.getOrder();
			im.add(mid, cid, cname, mprice, phone, caddress);
			
			
			response.sendRedirect("http://localhost:8080/dingcan/OrderGetlist");
			
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
