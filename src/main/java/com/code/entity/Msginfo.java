package com.code.entity;
        import com.baomidou.mybatisplus.annotations.TableId;
        import com.baomidou.mybatisplus.annotations.TableName;
        import com.baomidou.mybatisplus.enums.IdType;

        import java.lang.Integer;

/**
* ClassName:Msginfo
* Description: 聊天信息实体类
*/
@TableName("Msginfo")
public class Msginfo {

 @TableId(type = IdType.AUTO) //主键自增
    /**
    * 私信编号
    */
        private Integer msgid;
    /**
    * 发送用户
    */
        private String senduser;
    /**
    * 接收用户
    */
        private String fromuser;
    /**
    * 发送内容
    */
        private String sendcontent;
    /**
    * 发送时间
    */
        private String sendtime;
    /**
    * 私信状态
    */
        private String sendstate;
    /**
    * 私信备注
    */
        private String sendremarker;


        public Integer getMsgid() {
        return msgid;
        }

        public void setMsgid(Integer msgid) {
        this.msgid = msgid;
        }

        public String getSenduser() {
        return senduser;
        }

        public void setSenduser(String senduser) {
        this.senduser = senduser;
        }

        public String getFromuser() {
        return fromuser;
        }

        public void setFromuser(String fromuser) {
        this.fromuser = fromuser;
        }

        public String getSendcontent() {
        return sendcontent;
        }

        public void setSendcontent(String sendcontent) {
        this.sendcontent = sendcontent;
        }

        public String getSendtime() {
        return sendtime;
        }

        public void setSendtime(String sendtime) {
        this.sendtime = sendtime;
        }

        public String getSendstate() {
        return sendstate;
        }

        public void setSendstate(String sendstate) {
        this.sendstate = sendstate;
        }

        public String getSendremarker() {
        return sendremarker;
        }

        public void setSendremarker(String sendremarker) {
        this.sendremarker = sendremarker;
        }


}
