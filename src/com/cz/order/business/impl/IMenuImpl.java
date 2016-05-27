package com.cz.order.business.impl;

import java.util.List;


import com.cz.order.business.IMenu;
import com.cz.order.dao.IMenudao;
import com.cz.order.factory.Daofactory;
import com.cz.order.value.menuValue;

public class IMenuImpl implements IMenu {

	@Override
	public void add(String mid, String mname, String mpictrue, String mprice)
			throws Exception {
		// TODO Auto-generated method stub
		menuValue mv=new menuValue();
		mv.setMid(mid);
		mv.setMname(mname);
		mv.setMpicture(mpictrue);
		mv.setMprice(mprice);
		IMenudao ido=Daofactory.getIMenudao();
		ido.create(mv);

	}

	@Override
	public void mod(String mid,String mname, String mpicture, String mprice)
			throws Exception {
		// TODO Auto-generated method stub
		menuValue mv=new menuValue();
		mv.setMid(mid);
		mv.setMname(mname);
		mv.setMpicture(mpicture);
		mv.setMprice(mprice);
		IMenudao ido=Daofactory.getIMenudao();
		ido.update(mv);
	}

	@Override
	public void del(String mid) throws Exception {
		// TODO Auto-generated method stub
		menuValue mv=new menuValue();
		mv.setMid(mid);
		IMenudao ido=Daofactory.getIMenudao();
		ido.delete(mv);
	}

	@Override
	public List getList() throws Exception {
		// TODO Auto-generated method stub
		IMenudao ido=Daofactory.getIMenudao();
		return ido.getLIst();
	}

	@Override
	public menuValue get(String mid) throws Exception {
		// TODO Auto-generated method stub
		IMenudao ido=Daofactory.getIMenudao();
		
		
		return ido.get(mid);
	}

}
