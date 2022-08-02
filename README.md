# 线上自习室预定管理系统

#### 介绍
线上自习室学习系统 的设计与实现,前后端分离项目，系统包括普通用户和管理员两种角色，座位预定，在线聊天
系统设计实现包括如下功能：用户信息功能模块,智能问答信息功能模块,评论信息功能模块,自习室功能模块,
好友信息功能模块,聊天信息功能模块,公告信息功能模块,自习室座位功能模块,管理员信息功能模块等等。


## 系统特色功能
1.在线聊天
2.自习室座位预定
3.好友添加


## 【系统测试账号】
管理员 admin 123456
后台技术： SSM框架和Springboot框架两个版本代码
前端技术： vue 和 jsp两个版本
数据库：   Mysql5.x/8.x版本都可以
开发工具： Eclipse、idea、MyEclipse、NetBeans都可以运行
jdk版本： jdk1.8+
【如果不会运行，可以找我们远程帮助调试运行】
数据库每个表都有详细注释
代码也有详细注释（详细说明）

## 获取源码
请加扣扣 1516993194  或者  2551449109

网站前端：http://localhost:8080/myproject/pc/index

网站后台:http://localhost:8080/myproject/manage/login

4.系统实现（基础代码，业务功能代码的编写）
com   项目包结构说明
└─module
    ├─controller  控制层，负责请求的处理，数据库的操作调用
    ├─mapper      数据库操作接口，sql文件在xml中的配置
    ├─pojo        数据库对应实体类，用来和数据库表实现映射关系
    └─util        java中常见工具类的存放


## 包名功能说明

com.code.controller  所有请求控制类  例如 UserinfoMapper 代表用户相关请求

com.code.entity 数据库对应实体类

com.code.mapper 所有mybatis plus框架操作数据库接口

com.code.util   项目中常用工具类



下面的文件是springboot框架配置文件

application.properties   数据库配置 端口配置 项目名配置

log4j.properties   框架日志配置文件

banner.txt     springboot启动加载提示文件



## 项目运行部分截图
![输入图片说明](%E9%A1%B9%E7%9B%AE%E8%BF%90%E8%A1%8C%E6%88%AA%E5%9B%BE%E7%BA%BF%E4%B8%8A%E8%87%AA%E4%B9%A0%E5%AE%A4%E5%AD%A6%E4%B9%A0%E7%B3%BB%E7%BB%9F-%E9%A6%96%E9%A1%B5.png)
![输入图片说明](img/%E7%BA%BF%E4%B8%8A%E8%87%AA%E4%B9%A0%E5%AE%A4%E5%AD%A6%E4%B9%A0%E7%B3%BB%E7%BB%9F-1.png)

![输入图片说明](img/%E7%AE%A1%E7%90%86%E5%91%98%E7%99%BB%E9%99%86.png)

![输入图片说明](img/%E7%AE%A1%E7%90%86%E5%91%98-%E8%87%AA%E4%B9%A0%E5%AE%A4%E7%AE%A1%E7%90%86.png)

![输入图片说明](img/%E7%94%A8%E6%88%B7%E7%99%BB%E9%99%86.png)

![输入图片说明](img/%E7%94%A8%E6%88%B7%E6%B3%A8%E5%86%8C.png)

![输入图片说明](img/%E6%99%BA%E8%83%BD%E9%97%AE%E7%AD%94.png)

![输入图片说明](img/%E6%88%91%E7%9A%84%E5%BA%A7%E4%BD%8D.png)

![输入图片说明](img/%E6%88%91%E7%9A%84%E5%A5%BD%E5%8F%8B.png)

![输入图片说明](img/%E5%BA%A7%E4%BD%8D%E9%A2%84%E5%AE%9A.png)

![输入图片说明](img/%E5%A5%BD%E5%8F%8B%E8%81%8A%E5%A4%A9.png)

![输入图片说明](img/%E5%90%8E%E5%8F%B0%E7%AE%A1%E7%90%86.png)

## 后天功能太多，就不一一截图演示 

# 完整代码请加扣扣1516993194或者2551449109获取