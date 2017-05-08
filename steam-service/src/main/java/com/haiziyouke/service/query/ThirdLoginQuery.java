package com.haiziyouke.service.query;

/**
 * Created by java on 16/4/25.
 */
public class ThirdLoginQuery {

    /**
     * This property corresponds to db column <tt>id</tt>.
     */
    private Integer id;


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
    
    private String unionId;
    
    private String publicOpenId;


    /**
     * This property corresponds to db column <tt>deleted</tt>.
     */
    private Boolean deleted;


    //========== getters and setters ==========

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

	/**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>userId</tt>.
     *
     * @return property value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>openId</tt>.
     *
     * @return property value of openId
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * Setter method for property <tt>openId</tt>.
     *
     * @param openId value to be assigned to property openId
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * Getter method for property <tt>openMethod</tt>.
     *
     * @return property value of openMethod
     */
    public String getOpenMethod() {
        return openMethod;
    }

    /**
     * Setter method for property <tt>openMethod</tt>.
     *
     * @param openMethod value to be assigned to property openMethod
     */
    public void setOpenMethod(String openMethod) {
        this.openMethod = openMethod;
    }

    /**
     * Getter method for property <tt>deleted</tt>.
     *
     * @return property value of deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Setter method for property <tt>deleted</tt>.
     *
     * @param deleted value to be assigned to property deleted
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
