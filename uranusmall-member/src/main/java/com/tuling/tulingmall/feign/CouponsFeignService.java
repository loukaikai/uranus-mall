package com.uranus.uranusmall.feign;

import com.uranus.uranusmall.common.api.CommonResult;
import com.uranus.uranusmall.model.SmsCouponHistory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author uranusLou
 */
@FeignClient(name = "tulingmall-coupons",path = "/coupon")
public interface CouponsFeignService {
    
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    CommonResult<List<SmsCouponHistory>> list(@RequestParam(value = "useStatus", required = false) Integer useStatus
            ,@RequestHeader("memberId") Long memberId);
}
