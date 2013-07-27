/*******************************************************************************
 * Project Key : CPPII
 * Create on 2013-7-27 下午4:43:10
 * Copyright (c) 2013 - 2014.JAVASOF.CN公司版权所有
 * 注意：本内容仅限JAVASOFT.CN公司内部使用或者具有JAVASOFT.CN公司授权才可使用
 ******************************************************************************/
package com.javasoft.test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.testng.annotations.Test;

import cn.javasoft.security.model.UserModel;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * <P>TODO</P>
 * 
 * 黄雄星(13077862552,420484141@qq.com)
 */
public class TestJdbcDaoSupport extends JdbcDaoSupport {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatits-test.xml");
		ComboPooledDataSource dataSource = applicationContext.getBean("dataSource", ComboPooledDataSource.class);
		setDataSource(dataSource);
		String sql = "select t1.* from t_user t1 ";
		List<UserModel> list = this.getJdbcTemplate().query(sql, new UserMapper());
		System.out.println(list);

	}

	private class UserMapper implements RowMapper<UserModel> {
		public UserModel mapRow(ResultSet rs, int i) throws SQLException {
			UserModel vo = new UserModel();
			vo.setId(rs.getString("T_ID"));
			return vo;
		}
	}
}
