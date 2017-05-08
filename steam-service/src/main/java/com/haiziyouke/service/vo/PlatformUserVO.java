package com.haiziyouke.service.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Intellij IDEA
 * USER : qingzhi
 * TIME : 16/8/25 下午6:52
 * TITLE :
 * Description :
 * VERSION :
 */
public class PlatformUserVO  implements Serializable {

    private static final long serialVersionUID = 1279541354501115268L;

    /**
     * This property corresponds to db column <tt>id</tt>.
     */
    private int id;


    /**
     * This property corresponds to db column <tt>phone</tt>.
     */
    private String phone;


    /**
     * This property corresponds to db column <tt>nickName</tt>.
     */
    private String nickName;


    /**
     * This property corresponds to db column <tt>password</tt>.
     */
    private String password;


    /**
     * This property corresponds to db column <tt>createUser</tt>.
     */
    private String createUser;


    /**
     * This property corresponds to db column <tt>createTime</tt>.
     */
    private Date createTime;


    /**
     * This property corresponds to db column <tt>modifyUser</tt>.
     */
    private String modifyUser;


    /**
     * This property corresponds to db column <tt>modifyTime</tt>.
     */
    private Date modifyTime;


    /**
     * This property corresponds to db column <tt>deleted</tt>.
     */
    private boolean deleted;


    /**
     * This property corresponds to db column <tt>identity</tt>.
     */
    private int identity;


    //========== getters and setters ==========

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>phone</tt>.
     *
     * @return property value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for property <tt>phone</tt>.
     *
     * @param phone value to be assigned to property phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter method for property <tt>nickName</tt>.
     *
     * @return property value of nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Setter method for property <tt>nickName</tt>.
     *
     * @param nickName value to be assigned to property nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * Getter method for property <tt>password</tt>.
     *
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>password</tt>.
     *
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter method for property <tt>createUser</tt>.
     *
     * @return property value of createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * Setter method for property <tt>createUser</tt>.
     *
     * @param createUser value to be assigned to property createUser
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     *
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * Getter method for property <tt>modifyUser</tt>.
     *
     * @return property value of modifyUser
     */
    public String getModifyUser() {
        return modifyUser;
    }

    /**
     * Setter method for property <tt>modifyUser</tt>.
     *
     * @param modifyUser value to be assigned to property modifyUser
     */
    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * Getter method for property <tt>modifyTime</tt>.
     *
     * @return property value of modifyTime
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * Setter method for property <tt>modifyTime</tt>.
     *
     * @param modifyTime value to be assigned to property modifyTime
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
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

    /**
     * Getter method for property <tt>identity</tt>.
     *
     * @return property value of identity
     */
    public int getIdentity() {
        return identity;
    }

    /**
     * Setter method for property <tt>identity</tt>.
     *
     * @param identity value to be assigned to property identity
     */
    public void setIdentity(int identity) {
        this.identity = identity;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.DEFAULT_STYLE);
    }

}
