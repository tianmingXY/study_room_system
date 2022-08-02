package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.lang.Integer;

/**
 * ClassName:Commentinfo
 * Description: 评论信息实体类
 */
@TableName("Commentinfo")
public class Commentinfo {

    @TableId(type = IdType.AUTO) //主键自增
    /**
     * 评论编号
     */
    private Integer id;
    /**
     * 评论视频
     */
    private String tid;
    /**
     * 评论用户
     */
    private String username;
    /**
     * 评论内容
     */
    private String content;
    /**
     * 用户头像
     */
    private String picurl;
    /**
     * 评论时间
     */
    private String addtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }


}