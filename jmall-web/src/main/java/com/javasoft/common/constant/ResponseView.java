/**
 * 此代码由黄雄星独立完成，如需使用请经过本人同意。版权所有，侵权必究
 */
package com.javasoft.common.constant;

/**
 * @author huangxiongxing
 * 
 *         2013-1-4 下午08:28:48
 */
public interface ResponseView {

	static final String ADMIN_PATH = "admin/";

	static final String FRONT_PATH = "front/";

	static final String INDEX = "/index";

	static final String INPUT = "_input";

	static final String LIST = "_list";

	static final String PARAM_ERROR = "";

	static final String EXCEPTION_URL = "/error/error";

	static final String UPLOADFAIL_VIEW = ADMIN_PATH + "upload_error";

	static final String SUCCESS_VIEW = ADMIN_PATH + "success";

	// 登陆响应视图
	String LOGIN_VIEW = "login";

	// 登陆失败响应视图
	String LOGIN_FAIL = "fail";

	// 登陆响应视图
	String TEST_VIEW = "test";

	// 登入成功页面头
	String HEADER_VIEW = ADMIN_PATH + "admin_header";

	// 登入成功页面左侧
	String COMMON_VIEW = ADMIN_PATH + "menu_common";

	// 隐藏条
	String MIDDLE_VIEW = ADMIN_PATH + "admin_middle";

	// 首页显示内容
	String INDEX_VIEW = ADMIN_PATH + "admin_index";

	// 首页显示内容
	String MAIN_VIEW = ADMIN_PATH + "admin_main";

	String NONO = ADMIN_PATH + "nono";

	/********** 公共部分视图 ****************/
	String ADMIN_SHOW_FILE_INFO_VIEW = ADMIN_PATH + "show_file";

	/******* 菜单视图 *************/
	// 管理员
	String MENU_USER_VIEW = ADMIN_PATH + "menu_admin";
	// 页面内容
	String MENU_PAGE_VIEW = ADMIN_PATH + "menu_page";
	// 商户管理
	String MENU_MERCHANT_VIEW = ADMIN_PATH + "menu_merchant";
	// 文件管理
	String MENU_FILE_VIEW = ADMIN_PATH + "menu_file";

	/********** 用户视图 ****************/
	String USER_INPUT_VIEW = ADMIN_PATH + "user" + INPUT;
	String USER_LIST_VIEW = ADMIN_PATH + "user" + LIST;

	/********** 角色视图 ****************/
	String ROLE_INPUT_VIEW = ADMIN_PATH + "role" + INPUT;
	String ROLE_LIST_VIEW = ADMIN_PATH + "role" + LIST;

	/********** 资源视图 ****************/
	String RESOURCE_INPUT_VIEW = ADMIN_PATH + "resource" + INPUT;
	String RESOURCE_LIST_VIEW = ADMIN_PATH + "resource" + LIST;

	/********** 资源组视图 ****************/
	String RESOURCEGROUP_INPUT_VIEW = ADMIN_PATH + "resource_group" + INPUT;
	String RESOURCEGROUP_LIST_VIEW = ADMIN_PATH + "resource_group" + LIST;

	/********** 信息分类视图 ****************/
	String ARTICLECATEGORY_INPUT_VIEW = ADMIN_PATH + "article_category" + INPUT;
	String ARTICLECATEGORY_LIST_VIEW = ADMIN_PATH + "article_category" + LIST;

	/********** 信息视图 ****************/
	String ARTICLE_INPUT_VIEW = ADMIN_PATH + "article" + INPUT;
	String ARTICLE_LIST_VIEW = ADMIN_PATH + "article" + LIST;

	/********** 导航视图 ****************/
	String NAVIGATION_INPUT_VIEW = ADMIN_PATH + "navigation" + INPUT;
	String NAVIGATION_LIST_VIEW = ADMIN_PATH + "navigation" + LIST;

	/********** 友情链接视图 ****************/
	String FRIENDLINK_INPUT_VIEW = ADMIN_PATH + "friend_link" + INPUT;
	String FRIENDLINK_LIST_VIEW = ADMIN_PATH + "friend_link" + LIST;

	/********** 商户视图 ****************/
	String MERCHANT_INPUT_VIEW = ADMIN_PATH + "merchant" + INPUT;
	String MERCHANT_LIST_VIEW = ADMIN_PATH + "merchant" + LIST;

	/********** 模板视图 ****************/
	String TEMPLE_INPUT_VIEW = ADMIN_PATH + "temple" + INPUT;
	String TEMPLE_LIST_VIEW = ADMIN_PATH + "temple" + LIST;

	/********** 构建页面视图 ****************/
	String BUILD_HTML_VIEW = ADMIN_PATH + "build_html";

	/********** 前台normal视图 ****************/
	String FRONT_NORMAL_INDEX_VIEW = FRONT_PATH + "normal" + INDEX;

	/****************** 粤海 ****************************/
	String YUEHAI = "yuehai/";
	String YUEHAI_FRONT_NORMAL_INDEX_VIEW = FRONT_PATH + YUEHAI + "index";
}
