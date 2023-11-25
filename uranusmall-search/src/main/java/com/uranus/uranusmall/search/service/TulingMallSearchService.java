package com.uranus.uranusmall.search.service;

import com.uranus.uranusmall.search.vo.ESRequestParam;
import com.uranus.uranusmall.search.vo.ESResponseResult;


/**
 * @author 白起老师
 */
public interface TulingMallSearchService {


    /**
     * @param param 检索的所有参数
     * @return  返回检索的结果，里面包含页面需要的所有信息
     */
    ESResponseResult search(ESRequestParam param);


}


