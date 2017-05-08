package com.haiziyouke.service.query;

import java.util.List;

/**
 * Created by java on 16/4/25.
 */
public class UserQuery {
    /*

     */
    private String userId;


    private int identity;
    /**
     * This property corresponds to db column <tt>nickName</tt>.
     */
    private String nickName;
    
    private String realName;
    /**
     * This property corresponds to db column <tt>sexCode</tt>.
     */
    private Boolean sexCode;


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
    
    private int offset;
    
	private int rows;
	
	private List<String> userIds;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Boolean getSexCode() {
        return sexCode;
    }

    public void setSexCode(Boolean sexCode) {
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

	/**
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}

	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 * @return the identity
	 */
	public int getIdentity() {
		return identity;
	}

	/**
	 * @param identity the identity to set
	 */
	public void setIdentity(int identity) {
		this.identity = identity;
	}

	/**
	 * @return the offset
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * @param offset the offset to set
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * @param rows the rows to set
	 */
	public void setRows(int rows) {
		this.rows = rows;
	}

	public List<String> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<String> userIds) {
		this.userIds = userIds;
	}
	
    
}
