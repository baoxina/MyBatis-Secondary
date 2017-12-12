package com.baoxina.mybatis.junior.mapper;

import java.util.List;
import java.util.Map;

import com.baoxina.mybatis.junior.po.User;
import com.baoxina.mybatis.junior.po.UserEx;
import com.baoxina.mybatis.junior.po.UserQueryVo;

/**
 * mapper����ʽ����ԭʼdao��ʵ��
 * @author baoxina
 *
 */
public interface UserMapper {
	//[��װ���͵�pojo]��Ϊ[����������������]������
	public List<UserEx> findUserListByUserQueryVo(UserQueryVo userQueryVo) throws Exception;
	
	//[������]��Ϊ[����������������]������
	public int findUserCountByAge(UserQueryVo userQueryVo) throws Exception;
	public User findUserById(int id) throws Exception;
	
	//[HashMap]��Ϊ[����������������]������
	public List<Map<String,Integer>> findIdByNameAndAge(Map<String,Object> nameAndAgeMap) throws Exception;
	
	//ʹ��resultMap�������ӳ�������
	public UserEx findUserByIdOnUsingResultMap(Integer id) throws Exception;
	
	
	
	
	//����Ϊ�򵥵�po��Ϊ������������������
	//����ID��ѯ�û���Ϣ
	
	
	//��������ģ����ѯ�û���Ϣ
	public List<User> findUserByName(String name) throws Exception;
	
	//����û���Ϣ
	public void insertUser(User user) throws Exception;
	
	//ɾ���û���Ϣ
	public void deleteUserById(int id) throws Exception;
	
	//�����û���Ϣ
	public void updateUser(User user) throws Exception;
}
