
package com.debug.pmp.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

/**
 * @author zhouyulei
 * @version v1.0.0
 * @ClassName: Swagger2Configuration
 * @date 2019/9/3 16:11
 * @Description: swagger ui的文档
 */

// 启动时加载类
@Configuration
// 启用Swagger API文档
@EnableSwagger2
public class Swagger2Configuration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("如来佛组")
                .apiInfo(apiInfo())
                .select()
                // 修改为接口的包路径
                .apis(RequestHandlerSelectors.basePackage("com.debug.pmp.server.controller"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("员工管理平台的接口")
                .description("基于 swagger 2 的自动化文档")
                .version("1.0")
                .contact(new Contact("zhouyulei33", "https://github.com/zhouyulei/PermissonManagementPlatform.git", "zhouyulei33@163.com"))
                .build();
    }
}

