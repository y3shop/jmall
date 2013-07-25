/*******************************************************************************
 * Project Key : CPPII
 * Create on 2013-7-16 下午9:10:59
 * Copyright (c) 2013 - 2014.版权所有
 * 代码由黄雄星独立完成。注意：如需使用项目代码需经本人同意方可使用。
 ******************************************************************************/
package cn.javasoft.back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.javasoft.BaseDBService;
import cn.javasoft.jmall.common.constant.ProjectInfo;
import cn.javasoft.jmall.common.mapper.TestMapper;
import cn.javasoft.jmall.common.model.TestModel;

/**
 * <P>TODO</P>
 * 
 * 黄雄星(13077862552,420484141@qq.com)
 */
@Service(ProjectInfo.PRO_INFO + "TestService")
public class TestService extends BaseDBService<TestModel> {

	@Autowired
	@Qualifier(ProjectInfo.PRO_INFO + "TestMapper")
	public void setTestMapper(TestMapper testMapper) {
		super.setBaseMapper(testMapper);
	}

}
