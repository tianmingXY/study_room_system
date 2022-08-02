package com.code.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.lang.Integer;

/**
 * ClassName:Answerinfo
 * Description: 答案信息实体类
 */
@TableName("Answerinfo")
public class Answerinfo {

    @TableId(type = IdType.AUTO) //主键自增
    /**
     * 答案编号
     */
    private Integer id;
    /**
     * 答案题目
     */
    private String title;
    /**
     * 答案内容
     */
    private String content;
    /**
     * 添加时间
     */
    private String addtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }


}
