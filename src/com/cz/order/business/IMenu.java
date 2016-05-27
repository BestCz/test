package com.cz.order.business;

import java.util.List;

import com.cz.order.value.menuValue;

public interface IMenu {
	public void add(String mid,String mname,String mpicture,String mprice)throws Exception;
	public void mod(String mid ,String mname,String mpicture,String mprice)throws Exception;
	public void del(String mid)throws Exception;
	public List getList()throws Exception;
	public menuValue get(String mid)throws Exception;
}
