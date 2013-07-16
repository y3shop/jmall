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

	/********* 信息分类管理 ***************/
	String ARTICLECATEGORY_ADD_URL = ADMIN_PREFIX + "articleCategory_add";
	String ARTICLECATEGORY_EDIT_URL = ADMIN_PREFIX + "articleCategory_edit/{id}";
	String ARTICLECATEGORY_LIST_URL = ADMIN_PREFIX + "articleCategory_list";
	String ARTICLECATEGORY_SAVE_URL = ADMIN_PREFIX + "articleCategory_save";
	String ARTICLECATEGORY_UPDATE_URL = ADMIN_PREFIX + "articleCategory_update";
	String ARTICLECATEGORY_DELETE_URL = ADMIN_PREFIX + "articleCategory_delete/{id}";

	/********* 信息管理 ***************/
	String ARTICLE_ADD_URL = ADMIN_PREFIX + "article_add";
	String ARTICLE_EDIT_URL = ADMIN_PREFIX + "article_edit/{id}";
	String ARTICLE_LIST_URL = ADMIN_PREFIX + "article_list";
	String ARTICLE_SAVE_URL = ADMIN_PREFIX + "article_save";
	String ARTICLE_UPDATE_URL = ADMIN_PREFIX + "article_update";
	String ARTICLE_DELETE_URL = ADMIN_PREFIX + "article_delete";

	/********* 导航管理 ***************/
	String NAVIGATION_ADD_URL = ADMIN_PREFIX + "navigation_add";
	String NAVIGATION_EDIT_URL = ADMIN_PREFIX + "navigation_edit/{id}";
	String NAVIGATION_LIST_URL = ADMIN_PREFIX + "navigation_list";
	String NAVIGATION_SAVE_URL = ADMIN_PREFIX + "navigation_save";
	String NAVIGATION_UPDATE_URL = ADMIN_PREFIX + "navigation_update";
	String NAVIGATION_DELETE_URL = ADMIN_PREFIX + "navigation_delete";

	/********* 友情链接管理 ***************/
	String FRIENDLINK_ADD_URL = ADMIN_PREFIX + "friendLink_add";
	String FRIENDLINK_EDIT_URL = ADMIN_PREFIX + "friendLink_edit/{id}";
	String FRIENDLINK_LIST_URL = ADMIN_PREFIX + "friendLink_list";
	String FRIENDLINK_SAVE_URL = ADMIN_PREFIX + "friendLink_save";
	String FRIENDLINK_UPDATE_URL = ADMIN_PREFIX + "friendLink_update";
	String FRIENDLINK_DELETE_URL = ADMIN_PREFIX + "friendLink_delete";

	/********* 商户管理 ***************/
	String MERCHANT_ADD_URL = ADMIN_PREFIX + "merchant_add";
	String MERCHANT_EDIT_URL = ADMIN_PREFIX + "merchant_edit/{id}";
	String MERCHANT_LIST_URL = ADMIN_PREFIX + "merchant_list";
	String MERCHANT_SAVE_URL = ADMIN_PREFIX + "merchant_save";
	String MERCHANT_UPDATE_URL = ADMIN_PREFIX + "merchant_update";
	String MERCHANT_DELETE_URL = ADMIN_PREFIX + "merchant_delete";

	/********* 模板管理 ***************/
	String TEMPLE_ADD_URL = ADMIN_PREFIX + "temple_add";
	String TEMPLE_EDIT_URL = ADMIN_PREFIX + "temple_edit/{id}";
	String TEMPLE_LIST_URL = ADMIN_PREFIX + "temple_list";
	String TEMPLE_SAVE_URL = ADMIN_PREFIX + "temple_save";
	String TEMPLE_UPDATE_URL = ADMIN_PREFIX + "temple_update";
	String TEMPLE_DELETE_URL = ADMIN_PREFIX + "temple_delete";

	/********* 菜单管理 ***************/
	String MENU_ADMIN_URL = ADMIN_PREFIX + "menu_admin";
	String MENU_PAGE_URL = ADMIN_PREFIX + "menu_page";
	String MENU_MERCHAN_URL = ADMIN_PREFIX + "menu_merchant";
	String MENU_FILE_URL = ADMIN_PREFIX + "menu_file";

	/********* 构建html管理 ***************/
	String BUILD_HTML_URL = ADMIN_PREFIX + "build_html";
	String BUILD_HTML_INDEX_URL = ADMIN_PREFIX + "build_html_index";
	String BUILD_HTML_ABOUT_URL = ADMIN_PREFIX + "build_html_about";
	String BUILD_HTML_CONTACT_US_URL = ADMIN_PREFIX + "build_html_contactUs";
	String BUILD_HTML_JOB_URL = ADMIN_PREFIX + "build_html_job";
	String BUILD_HTML_NEWS_URL = ADMIN_PREFIX + "build_html_news";
	String BUILD_HTML_PRODUCT_URL = ADMIN_PREFIX + "build_html_product";
	String BUILD_HTML_UPLOAD_URL = ADMIN_PREFIX + "build_html_upload";

	String FTP_UPLOAD_INDEX_URL = ADMIN_PREFIX + "ftp_upload_index";
	String FTP_UPLOAD_ABOUT_URL = ADMIN_PREFIX + "ftp_upload_about";
	String FTP_UPLOAD_NEWS_URL = ADMIN_PREFIX + "ftp_upload_news";
	String FTP_UPLOAD_PRODUCT_URL = ADMIN_PREFIX + "ftp_upload_product";
	String FTP_UPLOAD_IMAGE_PRODUCT_URL = ADMIN_PREFIX + "ftp_upload_image_product";
	String FTP_UPLOAD_JOB_URL = ADMIN_PREFIX + "ftp_upload_job";
	String FTP_UPLOAD_CONTACT_URL = ADMIN_PREFIX + "ftp_upload_contact";
	String FTP_UPLOAD_IMAGES_URL = ADMIN_PREFIX + "ftp_upload_images";
	String FTP_UPLOAD_ONE_URL = ADMIN_PREFIX + "ftp_upload_one/{id}";
	String FTP_UPLOAD_NEWS_MENU_URL = ADMIN_PREFIX + "ftp_upload_news_menu";
	String FTP_UPLOAD_PRODUCT_MENU_URL = ADMIN_PREFIX + "ftp_upload_product_menu";

	/********* 文件上传 ***************/
	String FILE_UPLOAD = ADMIN_PREFIX + "file_upload";

	String NONO = ADMIN_PREFIX + "nono";

	/***************** 前台 ****************************/
	String FRONT_NORMAL_INDEX_URL = FRONT_PREFIX + "normal_index";
	String FRONT_NORMAL_LOOK_URL = FRONT_PREFIX + "normal_look/{templeId}/{merchantId}";
	String FRONT_NORMAL_TEMPLE_URL = FRONT_PREFIX + "{templeName}/{navigationId}/{merchantId}/{templePage}";
	String FRONT_NORMAL_PARAMS_URL = FRONT_PREFIX + "{templeName}/{params}";

	/******************* 粤海 ***************************/
	String YUEHAI = "yuehai/";
	String YUEHAI_FRONT_NORMAL_INDEX_URL = FRONT_PREFIX + YUEHAI + "index";

}
