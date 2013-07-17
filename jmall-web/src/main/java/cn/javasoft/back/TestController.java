/*******************************************************************************
 * Project Key : CPPII
 * Create on 2013-3-4 上午11:17:35
 * Copyright (c) 2013 - 2014.版权所有
 * 代码由黄雄星独立完成。注意：如需使用项目代码需经本人同意方可使用。
 ******************************************************************************/
package cn.javasoft.back;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.javasoft.common.constant.RequestUrl;
import cn.javasoft.common.constant.ResponseView;
import cn.javasoft.jmall.common.constant.ProjectInfo;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializer;

/**
 * <P>springmvc框架示例</P>
 * 
 * 黄雄星(13077862552,420484141@qq.com)
 */
@Controller(ProjectInfo.PRO_INFO + "TestController")
public class TestController {

	@RequestMapping(value = RequestUrl.TEST_URL, method = RequestMethod.GET)
	public String test() {
		return ResponseView.TEST_VIEW;
	}

	/**
	 * 
	 * <p>返回ModelAndView对象得到响应视图</p>
	 * 
	 * @return
	 * 
	 */
	@RequestMapping(value = "test/list", method = RequestMethod.GET)
	public ModelAndView list() {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		ModelAndView modelAndView = new ModelAndView("test/test");
		modelAndView.addObject("list", list);
		return modelAndView;
	}

	/**
	 * 
	 * <p></p>
	 * 
	 * @return
	 * 
	 */
	@RequestMapping(value = "test/m_list", method = RequestMethod.GET)
	public String m_list(ModelMap modelMap) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		modelMap.addAttribute("list", list);
		return "test/test";
	}

	/**
	 * 
	 * <p>重定向</p>
	 * 
	 * @return
	 * 
	 */
	@RequestMapping(value = "test1/m_list_1", method = RequestMethod.GET)
	public String m_list_1(ModelMap modelMap) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		modelMap.addAttribute("list", list);
		return "redirect:../test/m_list.do";
	}

	/**
	 * TODO:有乱码 <p>url带参数请求，有中文会乱码 </p>
	 * 
	 * @return
	 * 
	 */
	@RequestMapping(value = "test/m_list_2/{urlParam}", method = RequestMethod.GET)
	public ModelAndView m_list_2(@PathVariable String urlParam) {
		List<String> list = new ArrayList<String>();
		ModelAndView modelAndView = new ModelAndView("test/test");
		list.add(urlParam);
		modelAndView.addObject("list", list);
		return modelAndView;
	}

	/**
	 * 
	 * <p>url传参重定向</p>
	 * 
	 * @return
	 * 
	 */
	@RequestMapping(value = "test/m_list_3", method = RequestMethod.GET)
	public String m_list_3(ModelMap modelMap) {
		return "redirect:../test/m_list_2/woshicanshu.do";
	}

	/**
	 * 
	 * <p>ajax返回字符串</p>
	 * 
	 * @param modelMap
	 * @param name
	 * @param age
	 * @return
	 * 
	 */
	@RequestMapping(value = "test/m_list_4", method = RequestMethod.POST)
	public @ResponseBody
	String m_list_4(ModelMap modelMap, @RequestParam String name, @RequestParam int age) {
		return "hh\"name\":" + name + ",\"age\":" + age + "hh";
	}

	/**
	 * 
	 * <p>ajaxs返回json</p>
	 * 
	 * @param modelMap
	 * @param name
	 * @param age
	 * @return
	 * 
	 */
	@RequestMapping(value = "test/m_list_6", method = RequestMethod.POST)
	@ResponseBody
	public String m_list_6(ModelMap modelMap, @RequestParam String name, @RequestParam int age) {
		TestModel model = new TestModel();
		model.setAge(age);
		model.setUserName(name);
		return JSONObject.toJSONString(model);
	}

	/**
	 * 
	 * <p>重定向 跳转到WEB_INF下jsp页面</p>
	 * 
	 * @return
	 * 
	 */
	@RequestMapping(value = "test/m_list_8", method = RequestMethod.GET)
	public String m_list_8() {
		return "redirect:test/test";
	}

	/**
	 * 
	 * <p>ajax返回json 使用HttpServletResponse</p>
	 * 
	 * @param modelMap
	 * @param name
	 * @param age
	 * @return
	 * @throws IOException
	 * 
	 */
	@RequestMapping(value = "test/m_list_5", method = RequestMethod.POST)
	@ResponseBody
	public void m_list_5(ModelMap modelMap, @RequestParam String name, @RequestParam int age,
			HttpServletResponse response) throws IOException {
		TestModel model = new TestModel();
		model.setAge(age);
		model.setUserName(name);
		response.setHeader("Content-Type", "application/json");
		JSONSerializer.write(response.getWriter(), model);
	}
}

class TestModel {
	private Integer age;

	private String userName;

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
