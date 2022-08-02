package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * ClassName:Noticeinfo
 * Description: 公告信息实体类
 */
@TableName("Noticeinfo")
public class Noticeinfo {

    /**
     * 公告编号
     */
    @TableId(value = "noticeid", type = IdType.AUTO) //主键自增
    private Integer noticeid;
    /**
     * 公告标题
     */
    private String noticetitle;
    /**
     * 公告内容
     */
    private String noticecontent;
    /**
     * 发布时间
     */
    private String noticeaddtime;
    /**
     * 公告备注
     */
    private String noticeremarker;


    public Integer getNoticeid() {
        return noticeid;
    }

    public void setNoticeid(Integer noticeid) {
        this.noticeid = noticeid;
    }

    public String getNoticetitle() {
        return noticetitle;
    }

    public void setNoticetitle(String noticetitle) {
        this.noticetitle = noticetitle;
    }

    public String getNoticecontent() {
        return noticecontent;
    }

    public void setNoticecontent(String noticecontent) {
        this.noticecontent = noticecontent;
    }

    public String getNoticeaddtime() {
        return noticeaddtime;
    }

    public void setNoticeaddtime(String noticeaddtime) {
        this.noticeaddtime = noticeaddtime;
    }

    public String getNoticeremarker() {
        return noticeremarker;
    }

    public void setNoticeremarker(String noticeremarker) {
        this.noticeremarker = noticeremarker;
    }


}