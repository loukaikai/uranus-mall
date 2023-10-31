package com.uranus.uranusmall.common.exception;

/**
 * ,;,,;
 * ,;;'(    社
 * __      ,;;' ' \   会
 * /'  '\'~~'~' \ /'\.)  主
 * ,;(      )    /  |.     义
 * ,;' \    /-.,,(   ) \    码
 * ) /       ) / )|    农
 * ||        ||  \)
 * (_\       (_\
 *
 * @author ：uranusLou
 * @date ：Created in 2020/2/4
 * @version: V1.0
 * @slogan: 天王星商场，为太阳系购物袋盐
 * @description: 业务异常
 **/
public class BusinessException extends Exception {

    public BusinessException(){super();}

    public BusinessException(String message) {
        super(message);
    }

}
