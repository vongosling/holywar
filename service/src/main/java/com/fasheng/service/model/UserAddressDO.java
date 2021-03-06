package com.fasheng.service.model;

import java.util.Date;

public class UserAddressDO extends BaseDO<Integer>{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.user_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.country_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer countryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.province_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer provinceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.city_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer cityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.district_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Integer districtId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.zip_code
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private String zipCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.address_detail
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private String addressDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_address.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    private Date gmtUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.id
     *
     * @return the value of user_address.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.id
     *
     * @param id the value for user_address.id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.user_id
     *
     * @return the value of user_address.user_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.user_id
     *
     * @param userId the value for user_address.user_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.country_id
     *
     * @return the value of user_address.country_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.country_id
     *
     * @param countryId the value for user_address.country_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.province_id
     *
     * @return the value of user_address.province_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.province_id
     *
     * @param provinceId the value for user_address.province_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.city_id
     *
     * @return the value of user_address.city_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.city_id
     *
     * @param cityId the value for user_address.city_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.district_id
     *
     * @return the value of user_address.district_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Integer getDistrictId() {
        return districtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.district_id
     *
     * @param districtId the value for user_address.district_id
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.zip_code
     *
     * @return the value of user_address.zip_code
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.zip_code
     *
     * @param zipCode the value for user_address.zip_code
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.address_detail
     *
     * @return the value of user_address.address_detail
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.address_detail
     *
     * @param addressDetail the value for user_address.address_detail
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.gmt_create
     *
     * @return the value of user_address.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.gmt_create
     *
     * @param gmtCreate the value for user_address.gmt_create
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_address.gmt_update
     *
     * @return the value of user_address.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_address.gmt_update
     *
     * @param gmtUpdate the value for user_address.gmt_update
     *
     * @mbggenerated Tue Dec 06 23:15:11 CST 2011
     */
    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }
}