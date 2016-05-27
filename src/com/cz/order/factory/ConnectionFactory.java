package com.cz.order.factory;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionFactory {
	public static Connection getConnection() throws Exception{
		Connection cn=null;
		try{
			Context ctx=new InitialContext();
			DataSource ds=(DataSource) ctx.lookup("java:comp/env/cz");
			cn=ds.getConnection();
		}catch(Exception e){
			System.out.println("数据连接错误"+e.getMessage());
		}
		return cn;
	}
}
