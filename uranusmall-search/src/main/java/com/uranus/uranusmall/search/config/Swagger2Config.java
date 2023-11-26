package com.uranus.uranusmall.search.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2API文档的配置
 */

@EnableSwagger2
public class Swagger2Config {
    //http://127.0.0.1:8085/swagger-ui.html
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.uranus.uranusmall.search.controller"))
                .paths(PathSelectors.any())
                .build().host("http://127.0.0.1:8085/swagger-ui.html");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("mall搜索系统")
                .description("mall搜索模块")
                .contact("uranus")
                .version("1.0")
                .build();
    }
}
