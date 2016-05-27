package com.cz.order.business;

import java.util.List;

import com.cz.order.value.clientValue;
import com.cz.order.value.menuValue;

public interface IClient {
	public void add(String cname,String cid,String cpassword,String phone,String caddress)throws Exception;
	public void mod(String cname,String cid,String cpassword,String phone,String caddress)throws Exception;
	public void del(String cid)throws Exception;
	public List getList()throws Exception;
	public clientValue get(String cid)throws Exception;
}
