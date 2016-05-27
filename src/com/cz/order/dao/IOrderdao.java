package com.cz.order.dao;

import java.util.List;

import com.cz.order.value.clientValue;
import com.cz.order.value.orderValue;

public interface IOrderdao {
	public void create(orderValue ov)throws Exception;
	public void update(orderValue ov)throws Exception;
	public void delete(orderValue ov)throws Exception;
	public List getList()throws Exception;
	public orderValue get(String cid)throws Exception;
}
