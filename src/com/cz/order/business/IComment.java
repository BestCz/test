package com.cz.order.business;

import java.util.List;

import com.cz.order.value.clientValue;
import com.cz.order.value.commentValue;

public interface IComment {
	public void add(String mid,String mname,String cid,String cname,String comment)throws Exception;
	public void mod(String mid,String mname,String cid,String cname,String comment)throws Exception;
	public void del(String cid)throws Exception;
	public List getList()throws Exception;
	public commentValue get(String cid)throws Exception;
}
