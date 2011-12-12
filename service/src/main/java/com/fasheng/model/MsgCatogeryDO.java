package com.fasheng.model;

import java.util.Date;

public class MsgCatogeryDO extends BaseDO<Integer>{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_catogery.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_catogery.name
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_catogery.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_catogery.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Date gmtUpdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_catogery.parent_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_catogery.default_expire_time
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer defaultExpireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_catogery.description
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_catogery.id
     *
     * @return the value of msg_catogery.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_catogery.id
     *
     * @param id the value for msg_catogery.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_catogery.name
     *
     * @return the value of msg_catogery.name
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_catogery.name
     *
     * @param name the value for msg_catogery.name
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_catogery.gmt_create
     *
     * @return the value of msg_catogery.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_catogery.gmt_create
     *
     * @param gmtCreate the value for msg_catogery.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_catogery.gmt_update
     *
     * @return the value of msg_catogery.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_catogery.gmt_update
     *
     * @param gmtUpdate the value for msg_catogery.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_catogery.parent_id
     *
     * @return the value of msg_catogery.parent_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_catogery.parent_id
     *
     * @param parentId the value for msg_catogery.parent_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_catogery.default_expire_time
     *
     * @return the value of msg_catogery.default_expire_time
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getDefaultExpireTime() {
        return defaultExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_catogery.default_expire_time
     *
     * @param defaultExpireTime the value for msg_catogery.default_expire_time
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setDefaultExpireTime(Integer defaultExpireTime) {
        this.defaultExpireTime = defaultExpireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_catogery.description
     *
     * @return the value of msg_catogery.description
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_catogery.description
     *
     * @param description the value for msg_catogery.description
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}