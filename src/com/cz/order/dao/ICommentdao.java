package com.cz.order.dao;

import java.util.List;

import com.cz.order.value.clientValue;
import com.cz.order.value.commentValue;

public interface ICommentdao {
	public void create(commentValue cv)throws Exception;
	public void update(commentValue cv)throws Exception;
	public void delete(commentValue cv)throws Exception;
	public List getLIst()throws Exception;
	public commentValue get(String cid)throws Exception;
}
