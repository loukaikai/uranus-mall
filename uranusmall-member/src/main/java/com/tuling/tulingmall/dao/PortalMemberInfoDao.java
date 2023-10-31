package com.uranus.uranusmall.dao;


import com.uranus.uranusmall.domain.PortalMemberInfo;

/**
 *                  ,;,,;
 *                ,;;'(    社
 *      __      ,;;' ' \   会
 *   /'  '\'~~'~' \ /'\.)  主
 * ,;(      )    /  |.     义
 *,;' \    /-.,,(   ) \    码
 *     ) /       ) / )|    农
 *     ||        ||  \)     
 *     (_\       (_\
 * @author ：uranusLou
 * @date ：Created in 2020/1/6 21:37
 * @version: V1.0
 * @slogan: 天王星商场，为太阳系购物袋盐
 * @description: 会员信息获取
 **/
public interface PortalMemberInfoDao {
    /**
     * 查询会员信息
     * @param memberId
     * @return
     */
    PortalMemberInfo getMemberInfo(Long memberId);
}
