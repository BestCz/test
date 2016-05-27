package com.cz.order.business.impl;

import java.util.List;

import com.cz.order.business.IClient;
import com.cz.order.dao.IClientdao;
import com.cz.order.dao.IMenudao;
import com.cz.order.factory.Daofactory;
import com.cz.order.value.clientValue;
import com.cz.order.value.menuValue;

public class IClientImpl implements IClient {

	@Override
	public void add(String cname, String cid, String cpassword, String phone,
			String caddress) throws Exception {
		// TODO Auto-generated method stub
		clientValue cv=new clientValue();
		cv.setCname(cname);
		cv.setCid(cid);
		cv.setCpassword(cpassword);
		cv.setPhone(phone);
		cv.setCaddress(caddress);
		IClientdao ido=Daofactory.getclientdao();
		ido.create(cv);

	}

	@Override
	public void mod(String cname, String cid, String cpassword, String phone,
			String caddress) throws Exception {
		// TODO Auto-generated method stub
		clientValue cv=new clientValue();
		cv.setCname(cname);
		cv.setCid(cid);
		cv.setCpassword(cpassword);
		cv.setPhone(phone);
		cv.setCaddress(caddress);
		IClientdao ido=Daofactory.getclientdao();
		ido.update(cv);
	}

	@Override
	public void del(String cid) throws Exception {
		// TODO Auto-generated method stub
		clientValue cv=new clientValue();
		cv.setCid(cid);
		IClientdao ido=Daofactory.getclientdao();
		ido.delete(cv);
	}

	@Override
	public List getList() throws Exception {
		// TODO Auto-generated method stub
		IClientdao ido=Daofactory.getclientdao();
		return ido.getLIst();
		
	}

	@Override
	public clientValue get(String cid) throws Exception {
		// TODO Auto-generated method stub
		IClientdao ido=Daofactory.getclientdao();
		return ido.get(cid);
	}

}
