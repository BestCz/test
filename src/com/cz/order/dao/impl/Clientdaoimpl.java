package com.cz.order.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cz.order.dao.IClientdao;
import com.cz.order.factory.ConnectionFactory;
import com.cz.order.value.clientValue;
import com.cz.order.value.menuValue;

public class Clientdaoimpl implements IClientdao {

	@Override
	public void create(clientValue cv) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into client (cname,cid,cpassword,phone,caddress) values(?,?,?,?,?)";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, cv.getCname());
			ps.setString(2, cv.getCid());
			ps.setString(3, cv.getCpassword());
			ps.setString(4, cv.getPhone());
			ps.setString(5, cv.getCaddress());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("客户添加错误"+e.getMessage());
		}
	}

	@Override
	public void update(clientValue cv) throws Exception {
		// TODO Auto-generated method stub
		String sql="update client set cname=?,cpassword=? ,phone=?,caddress=? where cid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, cv.getCname());
			ps.setString(2, cv.getCpassword());
			ps.setString(3, cv.getPhone());
			ps.setString(4, cv.getCaddress());
			ps.setString(5, cv.getCid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("客户更新错误"+e.getMessage());
		}
	}

	@Override
	public void delete(clientValue cv) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from client where cid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, cv.getCid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("删除客户信息错误"+e.getMessage());
		}
	}

	@Override
	public List getLIst() throws Exception {
		// TODO Auto-generated method stub
		List clientlist=new ArrayList();
		String sql="select *from client";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();		
			while(rs.next()){
				clientValue cv=new clientValue();
				
				cv.setCname(rs.getString("cname"));
				cv.setCid(rs.getString("cid"));
				cv.setCpassword(rs.getString("cpassword"));
				cv.setPhone(rs.getString("phone"));
				cv.setCaddress(rs.getString("caddress"));
				clientlist.add(cv);
			}
		}catch(Exception e){
			System.out.println("查询客户列表错误"+e.getMessage());
		}
		return clientlist;
	
	}

	@Override
	public clientValue get(String cid) throws Exception {
		// TODO Auto-generated method stub
		clientValue cv=new clientValue();
		String sql="select *from client where cid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, cid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				
				cv.setCname(rs.getString("cname"));
				cv.setCid(rs.getString("cid"));
				cv.setCpassword(rs.getString("cpassword"));
				cv.setPhone(rs.getString("phone"));
				
				cv.setCaddress(rs.getString("caddress"));
			
			
			}
		}catch(Exception e){
			System.out.println("查看单个客户信息错误"+e.getMessage());
		}
		return cv;
	
	}

}
