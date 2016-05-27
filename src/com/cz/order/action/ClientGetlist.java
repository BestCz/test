package com.cz.order.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IClient;
import com.cz.order.business.IEmployee;
import com.cz.order.factory.Businessfactory;

/**
 * Servlet implementation class ClientGetlist
 */
@WebServlet("/ClientGetlist")
public class ClientGetlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientGetlist() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			IClient im=Businessfactory.getClient();
			List clientlist=im.getList();
			
			request.setAttribute("clientlist", clientlist);
			
		
			
			RequestDispatcher rd=request.getRequestDispatcher("client/clientlist.jsp");		
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
