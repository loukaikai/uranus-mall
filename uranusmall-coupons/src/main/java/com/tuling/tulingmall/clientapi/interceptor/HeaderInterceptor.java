package com.uranus.uranusmall.clientapi.interceptor;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


/**
* @vlog: 高于生活，源于生活
* @desc: 类的描述:Feign调用添加请求头
* @author: uranusLou
* @createDate: 2020/1/23 15:11
* @version: 1.0
*/
//@Slf4j
//public class HeaderInterceptor implements RequestInterceptor {
//    @Override
//    public void apply(RequestTemplate template) {
//
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//        log.info("从Request中解析请求头");
//        template.header("memberId",request.getHeader("memberId"));
//    }
//}
