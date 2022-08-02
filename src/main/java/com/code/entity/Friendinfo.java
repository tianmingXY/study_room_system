package com.code.entity;
        import com.baomidou.mybatisplus.annotations.TableId;
        import com.baomidou.mybatisplus.annotations.TableName;
        import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;
        import java.lang.Integer;
        import java.lang.Integer;
        import java.lang.Integer;

/**
* ClassName:Friendinfo
* Description: 好友信息实体类
*/
@TableName("Friendinfo")
public class Friendinfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 好友编号
    */
        private Integer id;
    /**
    * 用户编号
    */
        private Integer uid;
    /**
    * 朋友编号
    */
        private Integer fid;
    /**
    * 好友状态
    */
        private Integer state;


        public Integer getId() {
        return id;
        }

        public void setId(Integer id) {
        this.id = id;
        }

        public Integer getUid() {
        return uid;
        }

        public void setUid(Integer uid) {
        this.uid = uid;
        }

        public Integer getFid() {
        return fid;
        }

        public void setFid(Integer fid) {
        this.fid = fid;
        }

        public Integer getState() {
        return state;
        }

        public void setState(Integer state) {
        this.state = state;
        }


}
