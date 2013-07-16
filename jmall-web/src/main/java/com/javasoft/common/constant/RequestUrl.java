/**
 * 此代码由黄雄星独立完成，如需使用请经过本人同意。版权所有，侵权必究
 */
package com.javasoft.common.constant;

/**
 * @author huangxiongxing
 * 
 *         2013-1-4 下午08:26:30
 */
public interface RequestUrl {
	/***************** 后台 ****************************/
	static final String ADMIN_PREFIX = "admin/";
	static final String FRONT_PREFIX = "front/";

	// 登陆
	String LOGIN_URL = ADMIN_PREFIX + "login";

	// 登陆失败
	String LOGIN_FAIL = ADMIN_PREFIX + "fail";

	// 退出
	String LOGIN_OUT_URL = ADMIN_PREFIX + "login_out";

	// 测试
	String TEST_URL = ADMIN_PREFIX + "test";

	// 登入成功页面的头
	String HEADER_URL = ADMIN_PREFIX + "header";

	// 登入成功页面左侧
	String COMMON_URL = ADMIN_PREFIX + "common";

	// 隐藏条
	String MIDDLE_URL = ADMIN_PREFIX + "middle";

	// 首页内容
	String INDEX_URL = ADMIN_PREFIX + "index";

	// 后台主页
	String MAIN_URL = ADMIN_PREFIX + "main";

	String SHOW_PICTURE_URL = ADMIN_PREFIX + "show/picture/{id}";
	String SHOW_HTML_URL = ADMIN_PREFIX + "show/html/{id}";

	// 显示所有文件信息
	String SHOW_FILE_ALL_URL = ADMIN_PREFIX + "show/file/all";
	String SHOW_DELETE_FILE_URL = ADMIN_PREFIX + "delete/file/{id}";

	/********* 用户管理 ***************/
	String USER_ADD_URL = ADMIN_PREFIX + "user_add";
	String USER_EDIT_URL = ADMIN_PREFIX + "user_edit/{id}";
	String USER_LIST_URL = ADMIN_PREFIX + "user_list";
	String USER_SAVE_URL = ADMIN_PREFIX + "user_save";
	String USER_UPDATE_URL = ADMIN_PREFIX + "user_update";
	String USER_DELETE_URL = ADMIN_PREFIX + "user_delete";
	String USER_CHECK_USER_NAME_URL = ADMIN_PREFIX + "user_checkUsername";

	/********* 角色管理 ***************/
	String ROLE_ADD_URL = ADMIN_PREFIX + "role_add";
	String ROLE_EDIT_URL = ADMIN_PREFIX + "role_edit/{id}";
	String ROLE_LIST_URL = ADMIN_PREFIX + "role_list";
	String ROLE_SAVE_URL = ADMIN_PREFIX + "role_save";
	String ROLE_UPDATE_URL = ADMIN_PREFIX + "role_update";
	String ROLE_DELETE_URL = ADMIN_PREFIX + "role_delete";

	/********* 资源租管理 ***************/
	String RESOURCEGROUP_ADD_URL = ADMIN_PREFIX + "resourceGroup_add";
	String RESOURCEGROUP_EDIT_URL = ADMIN_PREFIX + "resourceGroup_edit/{id}";
	String RESOURCEGROUP_LIST_URL = ADMIN_PREFIX + "resourceGroup_list";
	String RESOURCEGROUP_SAVE_URL = ADMIN_PREFIX + "resourceGroup_save";
	String RESOURCEGROUP_UPDATE_URL = ADMIN_PREFIX + "resourceGroup_update";
	String RESOURCEGROUP_DELETE_URL = ADMIN_PREFIX + "resourceGroup_delete";

	/********* 资源管理 ***************/
	String RESOURCE_ADD_URL = ADMIN_PREFIX + "resource_add";
	String RESOURCE_EDIT_URL = ADMIN_PREFIX + "resource_edit/{id}";
	String RESOURCE_LIST_URL = ADMIN_PREFIX + "resource_list";
	String RESOURCE_SAVE_URL = ADMIN_PREFIX + "resource_save";
	String RESOURCE_UPDATE_URL = ADMIN_PREFIX + "resource_update";
	String RESOURCE_DELETE_URL = ADMIN_PREFIX + "resource_delete";

}
