# open-lyta  毕业设计-洛阳旅游网站
## 还在开发中，请暂勿Fork  ![CRAN/METACRAN](https://img.shields.io/badge/Build-faild-yellow)
### 0.ICON
![CRAN/METACRAN](https://img.shields.io/badge/Java-1.8-red)
![CRAN/METACRAN](https://img.shields.io/badge/version-1.5-blue)
![CRAN/METACRAN](https://img.shields.io/badge/license-GPL3.0-green)

* 作者：ishiningway
* Email：ishiningway@qq.com
* Github：https://github.com/ishiningway/open-lyta
* 码云：https://gitee.com/ishiningway/open-lyta

### 1.功能介绍
查看洛阳旅游概况，洛阳旅游景点信息，分享旅游游记以及地图导航，景点地图等功能。
### 2.技术栈
前台客户页面：JSP+Bootstrap

后台管理页面：JQuery+LayUI

后端系统：SpringBoot+Mybatis+AlibabaDurid+SpringSecurity

数据库系统：MySQL

### 3.技术解释
* Q:为什么不使用freemarker或者Thymeleaf？  
A:JSP确实有很大的缺点，耦合性太高，不能完美地实现MVC，代码混杂。但是因为JSP同样和他们都是模板引擎，只是侧重不同，而且有些时候性能还不如JSP，因此综合考虑这次更新并没有加入
* Q:为什么我运行报错？
A：那就对了，目前还没有重构完。
* Q:现在流行前后端分离，怎么不来个试试？A：预计在2.0正式版实现前后端分离，到时会进行架构升级，请耐心等待。

### 4.部署提示
由于Springboot不推荐使用JSP，因此在部署时务必使用jar包并添加如下依赖
```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-tomcat</artifactId>
    <scope>provided</scope>
</dependency>
```
provided的作用使打包的war包同时适合java -jar命令启动以及部署到外部容器中。

如果你不喜欢默认的打包名称，你可以通过节点里添加内容。
```
<build>
  <finalName>springBootJsp</finalName>
</bulid>
```

### 5.License
![CRAN/METACRAN](https://img.shields.io/badge/license-GPL3.0-green)  

  GPL V 3.0协议许可（其他引用组件仍按照其原许可）




