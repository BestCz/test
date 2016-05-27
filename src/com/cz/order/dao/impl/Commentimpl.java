package com.cz.order.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cz.order.dao.ICommentdao;
import com.cz.order.factory.ConnectionFactory;
import com.cz.order.value.commentValue;
import com.cz.order.value.menuValue;

public class Commentimpl implements ICommentdao {

	@Override
	public void create(commentValue cv) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into comment (mid,mname,cid,mprice,comment) values(?,?,?,?,?)";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, cv.getMid());
			ps.setString(2, cv.getMname());
			ps.setString(3, cv.getCid());
			ps.setString(4, cv.getCname());
			ps.setString(5, cv.getComment());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("评价信息添加错误"+e.getMessage());
		}
	}

	@Override
	public void update(commentValue cv) throws Exception {
		// TODO Auto-generated method stub
		String sql="update comment set mname=?,cid=? ,cname=?,comment=?  where mid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, cv.getMid());
			ps.setString(2, cv.getMname());
			ps.setString(3, cv.getCid());
			ps.setString(4, cv.getCname());
			ps.setString(5, cv.getComment());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("评价信息添加错误"+e.getMessage());
		}
	}

	@Override
	public void delete(commentValue cv) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from comment where cid=?";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, cv.getCid());
			ps.executeUpdate();
		}catch(Exception e){
			System.out.println("删除评价信息错误"+e.getMessage());
		}
	}

	@Override
	public List getLIst() throws Exception {
		// TODO Auto-generated method stub
		List commentlist=new ArrayList();
		String sql="select *from commnet";
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();		
			while(rs.next()){
				commentValue cv=new commentValue();
				
				cv.setMid(rs.getString("mid"));
				cv.setMname(rs.getString("mname"));
				cv.setCid(rs.getString("cid"));
				cv.setCname(rs.getString("cname"));
				cv.setComment(rs.getString("comment"));
				commentlist.add(cv);
			}
		}catch(Exception e){
			System.out.println("查询评价列表错误"+e.getMessage());
		}
		return commentlist;
	}

	@Override
	public commentValue get(String cid) throws Exception {
		// TODO Auto-generated method stub
		String sql="select *from commnet";
		commentValue cv=new commentValue();
		Connection cn=null;
		try{
			cn=ConnectionFactory.getConnection();
			PreparedStatement ps=cn.prepareStatement(sql);
			ps.setString(1, cid);
			ResultSet rs=ps.executeQuery();		
			while(rs.next()){
				
				
				cv.setMid(rs.getString("mid"));
				cv.setMname(rs.getString("mname"));
				cv.setCid(rs.getString("cid"));
				cv.setCname(rs.getString("cname"));
				cv.setComment(rs.getString("comment"));
				
			}
		}catch(Exception e){
			System.out.println("查询评价错误"+e.getMessage());
		}
		return cv;
	}

}
