package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.lang.Integer;
import java.lang.Integer;
import java.lang.Integer;

/**
 * ClassName:Datainfo
 * Description: 自习室实体类
 */
@TableName("Datainfo")
public class Datainfo {

    @TableId(type = IdType.AUTO) //主键自增
    /**
     * 自习室编号
     */
    private Integer id;
    /**
     * 自习室名称
     */
    private String name;
    /**
     * 自习室图片
     */
    private String picurl;
    /**
     * 自习室介绍
     */
    private String content;
    /**
     * 自习室备注
     */
    private String intro;
    /**
     * 座位总数
     */
    private Integer totalnum;
    /**
     * 使用数量
     */
    private Integer usenum;
    /**
     * 创建时间
     */
    private String addtime;


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

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getTotalnum() {
        return totalnum;
    }

    public void setTotalnum(Integer totalnum) {
        this.totalnum = totalnum;
    }

    public Integer getUsenum() {
        return usenum;
    }

    public void setUsenum(Integer usenum) {
        this.usenum = usenum;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }


}
