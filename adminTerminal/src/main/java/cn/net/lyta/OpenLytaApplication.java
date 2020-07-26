package cn.net.lyta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class OpenLytaApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(OpenLytaApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  洛阳旅游网站管理端启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}