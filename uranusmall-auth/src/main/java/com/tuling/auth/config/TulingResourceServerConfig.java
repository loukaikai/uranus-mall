package com.tuling.auth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * 用于测试
 * 这段代码是一个 Spring Security 配置，用于配置资源服务器的行为。资源服务器在 OAuth 2.0 认证流程中扮演关键角色，保护和提供受保护资源。以下是对这段代码的解释：
 *
 * @Configuration 注解：这表示这是一个 Spring 配置类，用于定义资源服务器的配置。
 *
 * @EnableResourceServer 注解：这是 Spring Security OAuth2 提供的注解，用于启用资源服务器功能。
 * 它告诉 Spring 框架，该应用程序将充当 OAuth 2.0 资源服务器，需要验证和授权访问请求。
 *
 * TulingResourceServerConfig 类扩展了 ResourceServerConfigurerAdapter：这是一个配置类，用于自定义资源服务器的行为。
 *
 * configure(HttpSecurity http) 方法：这个方法允许您自定义资源服务器的 HTTP 安全性规则。
 * 在这个特定的配置中，它做了以下事情：
 *
 * http.authorizeRequests()：这一行指示您将配置请求的授权规则。
 *
 * .anyRequest().authenticated()：这表示任何请求都需要经过身份验证才能访问。在 OAuth 2.0 流程中，只有经过授权的用户才能访问受保护的资源。这是资源服务器的核心功能之一，确保只有合法用户可以访问资源。
 *
 * 总结：这段代码配置了一个 Spring Security 资源服务器，用于保护和授权访问请求。通过 @EnableResourceServer 注解，它启用了资源服务器功能，然后通过 configure(HttpSecurity http) 方法定义了资源服务器的访问规则，要求所有请求都必须经过身份验证才能访问。这对于保护受保护资源非常重要，确保只有经过授权的用户可以访问它们。
 */
@Configuration
@EnableResourceServer
public class TulingResourceServerConfig  extends ResourceServerConfigurerAdapter {
    
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated();
        
    }
}