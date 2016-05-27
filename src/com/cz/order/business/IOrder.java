package com.cz.order.business;

import java.util.List;

import com.cz.order.value.menuValue;
import com.cz.order.value.orderValue;

public interface IOrder {
	public void add(String mid ,String cid,String cname,String mprice,String phone,String caddress)throws Exception;
	public void mod(String mid ,String cid,String cname,String mprice,String phone,String caddress)throws Exception;
	public void del(String cid)throws Exception;
	public List getList()throws Exception;
	public orderValue get(String cid)throws Exception;
}
