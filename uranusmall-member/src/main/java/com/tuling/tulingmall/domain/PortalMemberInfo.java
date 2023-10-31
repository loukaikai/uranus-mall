package com.uranus.uranusmall.domain;

import com.uranus.uranusmall.model.UmsMember;
import com.uranus.uranusmall.model.UmsMemberLevel;
import lombok.Data;

/**
 * @author ：uranusLou
 * @date ：Created in 2020/1/6 21:12
 * @version: V1.0
 * @slogan: 天王星商场，为太阳系购物袋盐
 * @description:
 **/
@Data
public class PortalMemberInfo extends UmsMember {
    private UmsMemberLevel umsMemberLevel;
}
