package com.baoxina.mybatis.junior.mapper;

import java.util.List;
import java.util.Map;

import com.baoxina.mybatis.junior.po.User;
import com.baoxina.mybatis.junior.po.UserEx;
import com.baoxina.mybatis.junior.po.UserQueryVo;

/**
 * mapper代理方式代替原始dao的实现
 * @author baoxina
 *
 */
public interface UserMapper {
	//[包装类型的pojo]作为[输入和输出参数类型]的例子
	public List<UserEx> findUserListByUserQueryVo(UserQueryVo userQueryVo) throws Exception;
	
	//[简单类型]作为[输入和输出参数类型]的例子
	public int findUserCountByAge(UserQueryVo userQueryVo) throws Exception;
	public User findUserById(int id) throws Exception;
	
	//[HashMap]作为[输入和输出参数类型]的例子
	public List<Map<String,Integer>> findIdByNameAndAge(Map<String,Object> nameAndAgeMap) throws Exception;
	
	//使用resultMap进行输出映射的例子
	public UserEx findUserByIdOnUsingResultMap(Integer id) throws Exception;
	
	
	
	
	//以下为简单的po作为输入和输出参数的例子
	//根据ID查询用户信息
	
	
	//根据名称模糊查询用户信息
	public List<User> findUserByName(String name) throws Exception;
	
	//添加用户信息
	public void insertUser(User user) throws Exception;
	
	//删除用户信息
	public void deleteUserById(int id) throws Exception;
	
	//更新用户信息
	public void updateUser(User user) throws Exception;
}
