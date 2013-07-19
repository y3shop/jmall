/*******************************************************************************
 * Project Key : CPPII
 * Create on 2013-3-3 下午10:58:41
 * Copyright (c) 2013 - 2014.版权所有
 * 代码由黄雄星独立完成。注意：如需使用项目代码需经本人同意方可使用。
 ******************************************************************************/
package cn.javasoft.jmall.common.mapper;

import org.springframework.stereotype.Repository;

import cn.javasoft.BaseMapper;
import cn.javasoft.jmall.common.constant.ProjectInfo;
import cn.javasoft.jmall.common.model.TestModel;

/**
 * <P>TODO</P>
 * 
 * 黄雄星(13077862552,420484141@qq.com)
 */
@Repository(ProjectInfo.PRO_INFO + "TestMapper")
public interface TestMapper extends BaseMapper<TestModel> {

}
