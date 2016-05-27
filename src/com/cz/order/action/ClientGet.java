package com.cz.order.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cz.order.business.IClient;
import com.cz.order.business.IMenu;
import com.cz.order.factory.Businessfactory;
import com.cz.order.value.clientValue;
import com.cz.order.value.menuValue;

/**
 * Servlet implementation class ClientGet
 */
@WebServlet("/ClientGet")
public class ClientGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientGet() {
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
			IClient mm=Businessfactory.getClient();
			clientValue mv=mm.get(cid);
			String cname=mv.getCname();
			String cpassword=mv.getCpassword();
			String phone=mv.getPhone();
			String caddress=mv.getCaddress();
			String id=mv.getCid();
			
			request.setAttribute("id", id);
			request.setAttribute("caddress",caddress);
			request.setAttribute("phone", phone);
			request.setAttribute("cpassword", cpassword);
			request.setAttribute("cname", cname);
			System.out.println(id+cname+cpassword);
			request.getRequestDispatcher("client/result.jsp").forward(request, response);
			
			}catch(Exception e){
				System.out.println("错误"+e.getMessage());
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
