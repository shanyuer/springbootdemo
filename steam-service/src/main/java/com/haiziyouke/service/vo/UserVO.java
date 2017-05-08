package com.haiziyouke.service.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

public class UserVO implements Serializable {

    /**
     * This property corresponds to db column <tt>userId</tt>.
     */
    private String userId;


    /**
     * This property corresponds to db column <tt>openId</tt>.
     */
    private String openId;


    /**
     * This property corresponds to db column <tt>openMethod</tt>.
     */
    private String openMethod;
    /**
     * This property corresponds to db column <tt>nickName</tt>.
     */
    private String nickName;


    /**
     * This property corresponds to db column <tt>sexCode</tt>.
     */
    private int sexCode;


    /**
     * This property corresponds to db column <tt>phone</tt>.
     */
    private String phone;


    /**
     * This property corresponds to db column <tt>image</tt>.
     */
    private String image;


    /**
     * This property corresponds to db column <tt>clientId</tt>.
     */
    private String clientId;


    /**
     * This property corresponds to db column <tt>birthday</tt>.
     */
    private String birthday;


    /**
     * This property corresponds to db column <tt>realName</tt>.
     */
    private String realName;


    /**
     * This property corresponds to db column <tt>createTime</tt>.
     */
    private Date createTime;


    /**
     * This property corresponds to db column <tt>modifyTime</tt>.
     */
    private Date modifyTime;

	private String unionId;
	

	/**
	 * This property corresponds to db column <tt>publicOpenId</tt>.
	 */
	private String publicOpenId;
    
    
    /**
     * This property corresponds to db column <tt>deleted</tt>.
     */
    private Boolean deleted;
    
    /**
	 * This property corresponds to db column <tt>identity</tt>.
	 */
	private int identity;


	/**
	 * This property corresponds to db column <tt>intr</tt>.
	 */
	private String intr;
	
	private String rank;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOpenMethod() {
		return openMethod;
	}

	public void setOpenMethod(String openMethod) {
		this.openMethod = openMethod;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getSexCode() {
		return sexCode;
	}

	public void setSexCode(int sexCode) {
		this.sexCode = sexCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public int getIdentity() {
		return identity;
	}

	public void setIdentity(int identity) {
		this.identity = identity;
	}

	public String getIntr() {
		return intr;
	}

	public void setIntr(String intr) {
		this.intr = intr;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	public String getPublicOpenId() {
		return publicOpenId;
	}

	public void setPublicOpenId(String publicOpenId) {
		this.publicOpenId = publicOpenId;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.DEFAULT_STYLE);
	}
    
}
