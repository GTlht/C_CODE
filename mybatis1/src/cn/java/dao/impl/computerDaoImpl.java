package cn.java.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import cn.java.entity.Computer;

public class computerDaoImpl {
	static SqlSession session=null;
	@Before
	public void init() throws IOException {
		SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
		InputStream ins=Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory ssf=ssfb.build(ins);
		session=ssf.openSession();
	}
	@Test
	public void selectAll() throws IOException {
		List<Computer> lists=session.selectList("cn.java.dao.impl.computerDaoImpl.selectAll");
		for (Computer computer : lists) {
			System.out.println(lists);
		}
		
	}
	@Test
	public void selectById() {
		Computer computer=session.selectOne("cn.java.dao.impl.computerDaoImpl.selectById", 2l);
		System.out.println(computer);
		
	}
	@Test
	public void selectByConditions() {
		Map<String, Object> paramter=new HashMap<String, Object>();
		paramter.put("brand", "联想");
		paramter.put("memory", "4F");
		List<Computer> lists=session.selectList("cn.java.dao.impl.computerDaoImpl.selectByConditions", paramter);
		System.out.println(lists);
	}
	@Test
	public void addComputer() {
		Map<String, Object> parameter=new HashMap<String, Object>();
		parameter.put("brand", "戴尔");
		parameter.put("computer_name","戴尔Vostro 3667-R1838");
		parameter.put("price", 5522f);
		int flag=session.insert("cn.java.dao.impl.computerDaoImpl.addComputer", parameter);
		session.commit();//需要提交事务，不然数据添加不进去
		System.out.println(flag);
	}
	@Test
	public void updateById() {
		Map<String, Object> parameter=new HashMap<String, Object>();
		parameter.put("computer_name", "dell");
		parameter.put("price", 6000l);
		parameter.put("id", 2l);
		int flag=session.update("cn.java.dao.impl.computerDaoImpl.updateById", parameter);
		session.commit();
		System.out.println(flag);
	}
	@Test
	public void deleteById() {
		int flag=session.delete("cn.java.dao.impl.computerDaoImpl.deleteById",4l);
		session.commit();
		System.out.println(flag);
	}

}
