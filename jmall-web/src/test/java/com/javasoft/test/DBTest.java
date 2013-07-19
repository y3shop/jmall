package com.javasoft.test;

/**
 * 此代码由黄雄星独立完成，如需使用请经过本人同意。版权所有，侵权必究
 */

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.testng.annotations.Test;

import cn.javasoft.back.service.TestService;
import cn.javasoft.jmall.common.constant.ProjectInfo;
import cn.javasoft.jmall.common.model.TestModel;

/**
 * @author huangxiongxing
 * 
 */
public class DBTest extends BaseTest {

	@Autowired
	@Qualifier(ProjectInfo.PRO_INFO + "TestService")
	private transient TestService testService;

	@Test
	public void testAdd() {
		TestModel model = new TestModel();
		model.setAge(25);
		model.setAmount(new BigDecimal(200));
		model.setUserName("hxx");
		testService.save(model);

		TestModel sModel = testService.selectAllById(model.getId());
		System.out.println(sModel);
	}

	/*
	 * @Test public void testUserAll() { List<UserModel> sModel = userMapper.queryModel(); for
	 * (UserModel userModel : sModel) { System.out.println(userModel); } }
	 * @Test public void testPager() { List<UserModel> sModel = userMapper.queryByPager(1, 1); for
	 * (UserModel userModel : sModel) { System.out.println(userModel); } }
	 * @Test public void testSelectByName() {
	 * System.out.println(userMapper.queryAllByUsername("admin")); }
	 * @Test public void testqueryAllAndRolesByById() {
	 * System.out.println(userMapper.queryAllAndRolesById("030512563823073326")); }
	 * @Test public void testupdateByById() { try { UserModel m = new UserModel(); m.onUpdate();
	 * m.setUsername("aa"); m.setIsEnabled(true); m.setId("030512563823073326");
	 * userMapper.updateSelectorById(m); } catch (Exception e) { e.printStackTrace(); } }
	 * @Test public void testSelectResourceModels() { resourceService.selectAllResource();
	 * List<ResourceModel> resourceModels = resourceMapper.queryModel();
	 * System.out.println(resourceModels); }
	 */

	/*
	 * PROPAGATION_SUPPORTS: 如果已经存在事务,则加入事务;如果没有事务,则以非事务的方式执行; PROPAGATION_MANDATORY: 使用当前事务, 如果没有,
	 * 则抛出异常; PROPAGATION_REQUIRED: 新建事务,如果当前有事务, 则挂起; P ROPAGATION_NOT_SUPPORTED:以非事务的方式执行,
	 * 如果当前有事务, 则挂起; PROPAGATION_NEVER:以非事务的方式执行, 如果当前有事务,则抛出异常; -Exception + 表示异常出现时事物提交 -
	 * 表示异常出现时事务回滚
	 */
	@Test
	public void testTx() throws Exception {
		DefaultTransactionDefinition def = new DefaultTransactionDefinition();
		def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

		TransactionStatus status = platformTransactionManager.getTransaction(def);
		/*
		 * try { String id = getNextId(); UserModel user = new UserModel(); user.setId(id);
		 * user.setUsername("第一个测试添加"); userMapper.insert(user); int i = 1 / 0; } catch (Exception
		 * ex) { platformTransactionManager.rollback(status); throw ex; }
		 */
		platformTransactionManager.commit(status);
	}
}
