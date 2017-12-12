package com.baoxina.mybatis.junior.po;

import java.util.List;

/**
 * 包装类型的pojo  对User对象进行包装
 * @author baoxina
 *
 */
public class UserQueryVo {

	//主键列表
	private List<Integer> ids;
	
	//包装用户查询条件
	private UserEx userEx;
	
	//还可以包装其他查询条件，如商品、订单等...
	
	

	public UserEx getUserEx() {
		return userEx;
	}

	public void setUserEx(UserEx userEx) {
		this.userEx = userEx;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	
}
