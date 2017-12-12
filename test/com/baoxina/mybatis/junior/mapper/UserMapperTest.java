package com.baoxina.mybatis.junior.mapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.baoxina.mybatis.junior.po.UserEx;
import com.baoxina.mybatis.junior.po.UserQueryVo;

public class UserMapperTest {

	SqlSessionFactory sqlSessionFactory;
	
	
	
	@Before
	public void setUp() throws Exception {
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfig.xml"));
	}

	@Test
	public void testFindUserListByUserQueryVo() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		UserQueryVo userQueryVo = new UserQueryVo();
		
		UserEx userEx = new UserEx();
		
		userEx.setName("aa");
		userQueryVo.setUserEx(userEx);
		
		List<UserEx> list = mapper.findUserListByUserQueryVo(userQueryVo);
		System.out.println(list);
		sqlSession.close();
	}
	
	@Test
	public void testfindUserCountByAge() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		UserQueryVo userQueryVo = new UserQueryVo();
		
		UserEx userEx = new UserEx();
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
//		userEx.setAge(22);
		userQueryVo.setIds(ids);
		userQueryVo.setUserEx(userEx);
		
		Integer count = mapper.findUserCountByAge(userQueryVo);
		System.out.println(count);
		sqlSession.close();
	}

	
	@Test
	public void testfindIdByNameAndAge() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		
		Map<String,Object> nameAndAgeMap = new HashMap<String,Object>();
		nameAndAgeMap.put("name", "ammy");
		nameAndAgeMap.put("age", 22);
		List<Map<String, Integer>> listMap = mapper.findIdByNameAndAge(nameAndAgeMap);
		System.out.println(listMap);
		sqlSession.close();
	}
	
	@Test
	public void testFindUserByIdOnUsingResultMap() throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		UserEx userEx = mapper.findUserByIdOnUsingResultMap(1);
		System.out.println(userEx);
		sqlSession.close();
	}
}
