package mao.usestarter.controller;

import mao.hellospringbootstarter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：spring_boot_starter_demo
 * Package(包名): mao.usestarter.controller
 * Class(类名): HelloController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/24
 * Time(创建时间)： 20:55
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@RestController
public class HelloController
{
    @Autowired
    private HelloService helloService;


    @GetMapping("/test")
    public String test()
    {
        return helloService.hello();
    }
}
