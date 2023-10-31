package com.tuling.auth.feign;

import com.uranus.uranusmall.common.api.CommonResult;
import com.uranus.uranusmall.model.UmsMember;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "tulingmall-member",path="/member/center")
public interface UmsMemberFeignService {
    
    @RequestMapping("/loadUmsMember")
    CommonResult<UmsMember> loadUserByUsername(@RequestParam("username") String username);
}