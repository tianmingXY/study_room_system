package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.lang.Integer;
import java.lang.Integer;

/**
 * ClassName:Siteinfo
 * Description: 自习室座位实体类
 */
@TableName("Siteinfo")
public class Siteinfo {

    @TableId(type = IdType.AUTO) //主键自增
    /**
     * 座位编号
     */
    private Integer id;
    /**
     * 自习室编号
     */
    private Integer fid;
    /**
     * 座位名称
     */
    private String sitename;
    /**
     * 座位状态
     */
    private String sitestate;
    /**
     * 专注目标
     */
    private String zzmb;
    /**
     * 专注时长
     */
    private String zzsc;
    /**
     * 休息时长
     */
    private String xxsc;
    /**
     * 座位备注
     */
    private String siteintro;
    /**
     * 在座用户
     */
    private String siteuser;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getSitestate() {
        return sitestate;
    }

    public void setSitestate(String sitestate) {
        this.sitestate = sitestate;
    }

    public String getZzmb() {
        return zzmb;
    }

    public void setZzmb(String zzmb) {
        this.zzmb = zzmb;
    }

    public String getZzsc() {
        return zzsc;
    }

    public void setZzsc(String zzsc) {
        this.zzsc = zzsc;
    }

    public String getXxsc() {
        return xxsc;
    }

    public void setXxsc(String xxsc) {
        this.xxsc = xxsc;
    }

    public String getSiteintro() {
        return siteintro;
    }

    public void setSiteintro(String siteintro) {
        this.siteintro = siteintro;
    }

    public String getSiteuser() {
        return siteuser;
    }

    public void setSiteuser(String siteuser) {
        this.siteuser = siteuser;
    }


}
