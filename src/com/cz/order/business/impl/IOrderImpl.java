package com.cz.order.business.impl;

import java.util.List;

import com.cz.order.business.IOrder;
import com.cz.order.dao.IClientdao;
import com.cz.order.dao.IMenudao;
import com.cz.order.dao.IOrderdao;
import com.cz.order.factory.Daofactory;
import com.cz.order.value.clientValue;
import com.cz.order.value.menuValue;
import com.cz.order.value.orderValue;

public class IOrderImpl implements IOrder {

	@Override
	public void add(String mid, String cid, String cname, String mprice,
			String phone, String caddress) throws Exception {
		// TODO Auto-generated method stub
		orderValue ov=new orderValue();
		ov.setMid(mid);
		ov.setCid(cid);
		ov.setCname(cname);
		ov.setMprice(mprice);
		ov.setPhone(phone);
		ov.setCaddress(caddress);
		IOrderdao odo=Daofactory.getorderdao();
		odo.create(ov);

	}

	@Override
	public void mod(String mid, String cid, String cname, String mprice,
			String phone, String caddress) throws Exception {
		// TODO Auto-generated method stub
		orderValue ov=new orderValue();
		ov.setCid(cid);
		ov.setMid(mid);		
		ov.setCname(cname);
		ov.setMprice(mprice);
		ov.setPhone(phone);
		ov.setCaddress(caddress);
		IOrderdao odo=Daofactory.getorderdao();
		odo.update(ov);
	}

	@Override
	public void del(String cid) throws Exception {
		// TODO Auto-generated method stub
		orderValue mv=new orderValue();
		mv.setCid(cid);;
		IOrderdao ido=Daofactory.getorderdao();
		ido.delete(mv);
	}

	@Override
	public List getList() throws Exception {
		// TODO Auto-generated method stub
		IOrderdao ido=Daofactory.getorderdao();
		return ido.getList();
	}

	@Override
	public orderValue get(String cid) throws Exception {
		// TODO Auto-generated method stub
		IOrderdao ido=Daofactory.getorderdao();
		return ido.get(cid);
	}

}
