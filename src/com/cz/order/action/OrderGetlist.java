package com.cz.order.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IEmployee;
import com.cz.order.business.IMenu;
import com.cz.order.business.IOrder;
import com.cz.order.factory.Businessfactory;
import com.cz.order.value.orderValue;

/**
 * Servlet implementation class OrderGetlist
 */
@WebServlet("/OrderGetlist")
public class OrderGetlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderGetlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			IOrder im=Businessfactory.getOrder();
			List orderlist=im.getList();
			
			request.setAttribute("orderlist", orderlist);
		
	
			
			RequestDispatcher rd=request.getRequestDispatcher("order/orderlist.jsp");		
			rd.forward(request, response);
			
		}catch(Exception e){
			System.out.println("menumainaction 处错误"+e.getMessage());
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
