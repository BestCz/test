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
import com.cz.order.value.employeeValue;
import com.cz.order.value.orderValue;

/**
 * Servlet implementation class OrderGet
 */
@WebServlet("/OrderGet")
public class OrderGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cid=request.getParameter("cid");
	
		
		try{
			IOrder mm=Businessfactory.getOrder();
			orderValue mv=mm.get(cid);
			String id=mv.getCid();
			String mid=mv.getMid();
			String cname=mv.getCname();
			String phone=mv.getPhone();
			String mprice=mv.getMprice();
			String caddress=mv.getCaddress();
			
			
			request.setAttribute("id", id);
			request.setAttribute("mid",mid);
			request.setAttribute("cname", cname);
			request.setAttribute("phone",phone);
			request.setAttribute("caddress", caddress);
			request.setAttribute("mprice", mprice);
			
			request.getRequestDispatcher("order/result.jsp").forward(request, response);
			
			}catch(Exception e){
				System.out.println("菜单sevlet添加错误"+e.getMessage());
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
