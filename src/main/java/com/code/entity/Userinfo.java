package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * ClassName:Userinfo
 * Description: 用户信息实体类
 */
@TableName("Userinfo")
public class Userinfo {

    /**
     * ID
     */
    @TableId(type = IdType.AUTO) //主键自增
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 头像
     */
    private String picurl;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 角色
     */
    private String role;
    /**
     * 性别
     */
    private String sex;
    /**
     * 密码
     */
    private String password;
    /**
     * 备注
     */
    private String intro;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }


}