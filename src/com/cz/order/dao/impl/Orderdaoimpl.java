package com.cz.order.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cz.order.dao.IOrderdao;
import com.cz.order.factory.ConnectionFactory;
import com.cz.order.value.menuValue;
import com.cz.order.value.orderValue;

public class Orderdaoimpl implements IOrderdao {

	@Override
	public void create(orderValue ov) throws Exception {
		// TODO Auto-genera44ted method stub
		String sql="insert into oorder (mid,cid,cname,mprice,phone,caddress) values(?,?,?,?,?,?)";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, ov.getMid());
			ps.setString(2, ov.getCid());
			ps.setString(3, ov.getCname());
			ps.setString(4, ov.getMprice());
			ps.setString(5, ov.getPhone());
			ps.setString(6, ov.getCaddress());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("订单添加错误"+e.getMessage());
		}
	}

	@Override
	public void update(orderValue ov) throws Exception {
		// TODO Auto-generated method stub
		String sql="update oorder set mid=?,cname=? ,mprice=?,phone=?,caddress=? where cid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, ov.getMid());
			ps.setString(2, ov.getCname());
			ps.setString(3, ov.getMprice());
			ps.setString(4, ov.getPhone());
			ps.setString(5, ov.getCaddress());
			ps.setString(6, ov.getCid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("订单修改错误"+e.getMessage());
		}
	}

	@Override
	public void delete(orderValue ov) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from oorder where cid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, ov.getCid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("删除订单信息错误"+e.getMessage());
		}
	}

	@Override
	public List getList() throws Exception {
		// TODO Auto-generated method stub
		
		List orderList=new ArrayList<>();
		String sql="select *from oorder";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();		
			while(rs.next()){
				
				orderValue ov=new orderValue();
				ov.setMid(rs.getString("mid"));
				ov.setCid(rs.getString("cid"));
				ov.setCname(rs.getString("cname"));
				ov.setMprice(rs.getString("mprice"));
				ov.setPhone(rs.getString("phone"));
				ov.setCaddress(rs.getString("caddress"));
				
				System.out.println("cid: " +ov.getCid());
				orderList.add(ov);
			}
		}catch(Exception e){
			System.out.println("查询订单列表错误"+e.getMessage());
		}
		return orderList;
	}

	@Override
	public orderValue get(String cid) throws Exception {
		// TODO Auto-generated method stub
		orderValue ov=new orderValue();
		String sql="select *from oorder where cid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1,cid);
			ResultSet rs=ps.executeQuery();		
			while(rs.next()){
				
				
				ov.setMid(rs.getString("mid"));
				ov.setCid(rs.getString("cid"));
				ov.setCname(rs.getString("cname"));
				ov.setMprice(rs.getString("mprice"));
				ov.setPhone(rs.getString("phone"));
				ov.setCaddress(rs.getString("caddress"));
			
			}
		}catch(Exception e){
			System.out.println("查询单个订单错误"+e.getMessage());
		}
		return ov;
	}

}
