package mao.hellospringbootstarter.config;

import mao.hellospringbootstarter.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project name(项目名称)：spring_boot_starter_demo
 * Package(包名): mao.hellospringbootstarter.config
 * Class(类名): HelloServiceAutoConfiguration
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/10/24
 * Time(创建时间)： 20:38
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Configuration
@EnableConfigurationProperties(HelloConfigProperties.class)
public class HelloServiceAutoConfiguration
{


    @Bean
    @ConditionalOnMissingBean
    public HelloService helloService(@Autowired HelloConfigProperties helloConfigProperties)
    {
        return new HelloService(helloConfigProperties);
    }

}
