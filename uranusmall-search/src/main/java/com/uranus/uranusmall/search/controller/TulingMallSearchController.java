package com.uranus.uranusmall.search.controller;

/*
@author 图灵学院-白起老师
*/

import com.uranus.uranusmall.common.api.CommonResult;
import com.uranus.uranusmall.search.service.TulingMallSearchService;
import com.uranus.uranusmall.search.vo.ESRequestParam;
import com.uranus.uranusmall.search.vo.ESResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;

@RestController
public class TulingMallSearchController {

     @Autowired
     private TulingMallSearchService  tulingMallSearchService;



    /**
     * 自动将页面提交过来的所有请求参数封装成我们指定的对象
     *
     * @param param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/searchList")
    public CommonResult<ESResponseResult> listPage(ESRequestParam param, HttpServletRequest request) {

        //1、根据传递来的页面的查询参数，去es中检索商品
        ESResponseResult searchResult = tulingMallSearchService.search(param);

        return CommonResult.success(searchResult);
    }


}
