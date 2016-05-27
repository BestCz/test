package com.cz.order.dao;

import java.util.List;


import com.cz.order.value.employeeValue;
import com.cz.order.value.menuValue;

public interface IEmployeedao {
	public void create(employeeValue ev)throws Exception;
	public void update(employeeValue ev)throws Exception;
	public void delete(employeeValue ev)throws Exception;
	public List getLIst()throws Exception;
	public employeeValue get(String eid)throws Exception;
}
