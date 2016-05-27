package com.cz.order.business.impl;

import java.util.List;

import com.cz.order.business.IEmployee;
import com.cz.order.dao.IClientdao;
import com.cz.order.dao.IEmployeedao;
import com.cz.order.dao.IMenudao;
import com.cz.order.factory.Daofactory;
import com.cz.order.value.clientValue;
import com.cz.order.value.employeeValue;
import com.cz.order.value.menuValue;

public class IEmployeeimpl implements IEmployee {

	@Override
	public void add(String eid, String epassword, String ename, String age)
			throws Exception {
		// TODO Auto-generated method stub
		employeeValue ev=new employeeValue();
		ev.setEid(eid);
		ev.setEpassword(epassword);
		ev.setEname(ename);
		ev.setAge(age);
		IEmployeedao edo=Daofactory.getemployee();
		edo.create(ev);
	}

	@Override
	public void mod(String eid, String epassword, String ename, String age)
			throws Exception {
		// TODO Auto-generated method stub
		employeeValue ev=new employeeValue();
		ev.setEid(eid);
		ev.setEpassword(epassword);
		ev.setEname(ename);
		ev.setAge(age);
		IEmployeedao edo=Daofactory.getemployee();
		edo.update(ev);
	}

	@Override
	public void del(String eid) throws Exception {
		// TODO Auto-generated method stub
		employeeValue ev=new employeeValue();
		ev.setEid(eid);
		IEmployeedao edo=Daofactory.getemployee();
		edo.delete(ev);
	}

	@Override
	public List getList() throws Exception {
		// TODO Auto-generated method stub
		IEmployeedao edo=Daofactory.getemployee();
		return edo.getLIst();
	}

	@Override
	public employeeValue get(String eid) throws Exception {
		// TODO Auto-generated method stub
		IEmployeedao edo=Daofactory.getemployee();
		return edo.get(eid);
	}

}
