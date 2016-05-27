package com.cz.order.business;

import java.util.List;

import com.cz.order.value.clientValue;
import com.cz.order.value.employeeValue;

public interface IEmployee {
	public void add(String eid,String epassword,String ename,String age)throws Exception;
	public void mod(String eid,String epassword,String ename,String age)throws Exception;
	public void del(String eid)throws Exception;
	public List getList()throws Exception;
	public employeeValue get(String eid)throws Exception;
}
