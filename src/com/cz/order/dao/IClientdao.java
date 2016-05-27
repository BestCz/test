package com.cz.order.dao;

import java.util.List;

import com.cz.order.value.clientValue;


public interface IClientdao {
	public void create(clientValue cv)throws Exception;
	public void update(clientValue cv)throws Exception;
	public void delete(clientValue cv)throws Exception;
	public List getLIst()throws Exception;
	public clientValue get(String cid)throws Exception;
}
