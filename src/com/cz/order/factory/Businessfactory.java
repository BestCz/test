package com.cz.order.factory;

import com.cz.order.business.IClient;
import com.cz.order.business.IEmployee;
import com.cz.order.business.IMenu;
import com.cz.order.business.IOrder;
import com.cz.order.business.impl.IClientImpl;
import com.cz.order.business.impl.IEmployeeimpl;
import com.cz.order.business.impl.IMenuImpl;
import com.cz.order.business.impl.IOrderImpl;

public class Businessfactory {
	public static IMenu  getMenu(){
		return new IMenuImpl();
	}
	public static IClient getClient(){
		return new IClientImpl();
		
	}
	public static IOrder getOrder(){
		return new IOrderImpl();
	}
	public static IEmployee getEmployee(){
		return new IEmployeeimpl();
	}

}
