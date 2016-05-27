package com.cz.order.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;







import com.cz.order.dao.IEmployeedao;
import com.cz.order.factory.ConnectionFactory;
import com.cz.order.value.employeeValue;
import com.cz.order.value.menuValue;

public class Employeedaoimpl implements IEmployeedao {

	@Override
	public void create(employeeValue ev) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into employee (eid,epassword,ename,age) values(?,?,?,?)";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1,	ev.getEid());
			ps.setString(2, ev.getEpassword());
			ps.setString(3, ev.getEname());
			ps.setString(4, ev.getAge());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("员工添加错误"+e.getMessage());
		}
	}

	@Override
	public void update(employeeValue ev) throws Exception {
		// TODO Auto-generated method stub
		String sql="update employee set epassword=?,ename=? ,age=? where eid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			
			ps.setString(1, ev.getEpassword());
			ps.setString(2, ev.getEname());
			ps.setString(3, ev.getAge());
			ps.setString(4,	ev.getEid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("员工更新错误"+e.getMessage());
		}

	}

	@Override
	public void delete(employeeValue ev) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from employee where eid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, ev.getEid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("删除菜单信息错误"+e.getMessage());
		}
	}

	@Override
	public List getLIst() throws Exception {
		// TODO Auto-generated method stub
		
		List employeeList=new ArrayList();
		String sql="select *from employee";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();		
			while(rs.next()){
				
				employeeValue ev=new employeeValue();
				
				ev.setEid(rs.getString("eid"));
				ev.setEpassword(rs.getString("epassword"));
				ev.setEname(rs.getString("ename"));
				ev.setAge(rs.getString("age"));
				employeeList.add(ev);
			}
		}catch(Exception e){
			System.out.println("查询菜单列表错误"+e.getMessage());
		}
		return employeeList;
	}

	@Override
	public employeeValue get(String eid) throws Exception {
		// TODO Auto-generated method stub
		String sql="select *from employee where eid=?";
		Connection cn=null;
		employeeValue ev=new employeeValue();
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1,eid);
			ResultSet rs=ps.executeQuery();		
			while(rs.next()){
				
				
				ev.setEid(rs.getString("eid"));
				ev.setEpassword(rs.getString("epassword"));
				ev.setEname(rs.getString("ename"));
				ev.setAge(rs.getString("age"));
				
			}
		}catch(Exception e){
			System.out.println("查询菜单列表错误"+e.getMessage());
		}
		return ev;
	}

}
