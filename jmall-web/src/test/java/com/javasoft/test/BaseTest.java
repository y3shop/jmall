/*******************************************************************************
 * Project Key : CPPII
 * Create on 2013-7-24 下午8:05:48
 * Copyright (c) 2013 - 2014.JAVASOF.CN公司版权所有
 * 注意：本内容仅限JAVASOFT.CN公司内部使用或者具有JAVASOFT.CN公司授权才可使用
 ******************************************************************************/
package com.javasoft.test;

import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * <P>TODO</P>
 * 
 * 黄雄星(13077862552,420484141@qq.com)
 */
@ContextConfiguration(locations = { "/spring-defult-test.xml" })
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = true)
public class BaseTest extends AbstractTransactionalTestNGSpringContextTests {

	protected final transient Logger log = LoggerFactory.getLogger(this.getClass());

	// @Autowired
	// @Qualifier("txManager")
	protected PlatformTransactionManager platformTransactionManager;

	protected String getNextId() {
		String time = DateFormatUtils.format(new Date(), "yyyyMMddHHmmSSSS");
		return time;
	}

}
