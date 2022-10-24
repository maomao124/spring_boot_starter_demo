package mao.hellospringbootstarter.service;

import mao.hellospringbootstarter.config.HelloConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project name(项目名称)：spring_boot_starter_demo
 * Package(包名): mao.hellospringbootstarter.service
 * Class(类名): HelloService
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/24
 * Time(创建时间)： 20:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */

//@Service
public class HelloService
{
    /**
     * 配置属性类
     */
    private final HelloConfigProperties helloConfigProperties;

    @Autowired
    public HelloService(HelloConfigProperties helloConfigProperties)
    {
        this.helloConfigProperties = helloConfigProperties;
    }

    /**
     * hello
     *
     * @return {@link String}
     */
    public String hello()
    {
        return "你好！我的名字是" + helloConfigProperties.getName() +
                ",年龄是：" + helloConfigProperties.getAge() +
                ",地址是：" + helloConfigProperties.getAddress() +
                ",性别是：" + helloConfigProperties.getSex();
    }
}
