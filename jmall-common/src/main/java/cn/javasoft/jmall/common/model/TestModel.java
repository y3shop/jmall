/*******************************************************************************
 * Project Key : CPPII
 * Create on 2013-7-24 下午8:18:42
 * Copyright (c) 2013 - 2014.JAVASOF.CN公司版权所有
 * 注意：本内容仅限JAVASOFT.CN公司内部使用或者具有JAVASOFT.CN公司授权才可使用
 ******************************************************************************/
package cn.javasoft.jmall.common.model;

import java.math.BigDecimal;

import cn.javasoft.BaseModelObject;

/**
 * <P>TODO</P>
 * 
 * 黄雄星(13077862552,420484141@qq.com)
 */
public class TestModel extends BaseModelObject {

	/**
	 * TODO
	 */
	private static final long serialVersionUID = -2847123266573425926L;

	private String userName;

	private Boolean isTrue;

	private Integer age;

	private BigDecimal amount;

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

	/**
	 * @return the isTrue
	 */
	public Boolean getIsTrue() {
		return isTrue;
	}

	/**
	 * @param isTrue the isTrue to set
	 */
	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}

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
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public void onSave() {
	}

	@Override
	public void onUpdate() {
	}

}
