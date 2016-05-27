package com.cz.order.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.cz.order.dao.IMenudao;
import com.cz.order.factory.ConnectionFactory;
import com.cz.order.value.menuValue;

public class Menudaoimpl implements IMenudao {

	@Override
	public void create(menuValue mv) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into mmenu (mid,mname,mpicture,mprice) values(?,?,?,?)";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, mv.getMid());
			ps.setString(2, mv.getMname());
			ps.setString(3, mv.getMpicture());
			ps.setString(4, mv.getMprice());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("菜单添加错误"+e.getMessage());
		}
		
	}

	@Override
	public void update(menuValue mv) throws Exception {
		// TODO Auto-generated method stub
		String sql="update mmenu set mname=?,mpicture=? ,mprice=? where mid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, mv.getMname());
			ps.setString(2, mv.getMpicture());
			ps.setString(3, mv.getMprice());
			ps.setString(4, mv.getMid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("菜单更新错误"+e.getMessage());
		}
	}

	@Override
	public void delete(menuValue mv) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from mmenu where mid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, mv.getMid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("删除菜单信息错误"+e.getMessage());
		}
	}

	@Override
	public List getLIst() throws Exception {
		// TODO Auto-generated method stub
		List menuList=new ArrayList();
		String sql="select *from mmenu";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();		
			while(rs.next()){
				menuValue mv=new menuValue();
				
				mv.setMid(rs.getString("mid"));
				mv.setMname(rs.getString("mname"));
				mv.setMpicture(rs.getString("mpicture"));
				mv.setMprice(rs.getString("mprice"));
				menuList.add(mv);
			}
		}catch(Exception e){
			System.out.println("查询菜单列表错误"+e.getMessage());
		}
		return menuList;
	}

	@Override
	public menuValue get(String mid) throws Exception {
		// TODO Auto-generated method stub
		menuValue mv=null;
		String sql="select *from mmenu where mid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, mid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				mv=new menuValue();
				mv.setMid(rs.getString("mid"));
				mv.setMname(rs.getString("mname"));
				mv.setMpicture(rs.getString("mpicture"));
				mv.setMprice(rs.getString("mpicture"));
			
			}
		}catch(Exception e){
			System.out.println("查看单个菜单信息错误"+e.getMessage());
		}
		return mv;
	}

}
