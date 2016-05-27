package com.cz.order.dao;

import java.util.List;

import com.cz.order.value.menuValue;

public interface IMenudao {
	public void create(menuValue mv)throws Exception;
	public void update(menuValue mv)throws Exception;
	public void delete(menuValue mv)throws Exception;
	public List getLIst()throws Exception;
	public menuValue get(String eid)throws Exception;
}
