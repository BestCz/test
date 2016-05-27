package com.cz.order.factory;

import com.cz.order.dao.IClientdao;
import com.cz.order.dao.ICommentdao;
import com.cz.order.dao.IEmployeedao;
import com.cz.order.dao.IMenudao;
import com.cz.order.dao.IOrderdao;
import com.cz.order.dao.impl.Clientdaoimpl;
import com.cz.order.dao.impl.Commentimpl;
import com.cz.order.dao.impl.Employeedaoimpl;
import com.cz.order.dao.impl.Menudaoimpl;
import com.cz.order.dao.impl.Orderdaoimpl;

public class Daofactory {
	public static IMenudao getIMenudao(){
		return new Menudaoimpl();
		
	}
	public static IClientdao getclientdao(){
		return new Clientdaoimpl();
	}
	public static IOrderdao getorderdao(){
		return new Orderdaoimpl();
	}
	public static IEmployeedao getemployee(){
		return new Employeedaoimpl();
		
	}
	public static ICommentdao getcommentdao(){
		return new Commentimpl();
	}
}
