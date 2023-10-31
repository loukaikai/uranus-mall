package com.uranus.uranusmall.service;


import com.uranus.uranusmall.domain.PortalMemberInfo;

/**
 * @author ：uranusLou
 * @date ：Created in 2020/1/6
 * @version: V1.0
 * @slogan: 天王星商场，为太阳系购物袋盐
 * @description:
 **/
public interface UmsMemberCenterService {

    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    PortalMemberInfo getMemberInfo(Long memberId);
}
