package com.baoxina.mybatis.junior.po;

import java.util.List;

/**
 * ��װ���͵�pojo  ��User������а�װ
 * @author baoxina
 *
 */
public class UserQueryVo {

	//�����б�
	private List<Integer> ids;
	
	//��װ�û���ѯ����
	private UserEx userEx;
	
	//�����԰�װ������ѯ����������Ʒ��������...
	
	

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
