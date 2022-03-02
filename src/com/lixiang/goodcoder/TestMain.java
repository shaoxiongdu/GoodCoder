package com.lixiang.goodcoder;

/**
 * @author dushaoxiong@lixiang.com
 * @version 1.0
 * @date 2022/3/2 4:36 PM
 */
public class TestMain {

    public static void main(String[] args) {

        //测试打乱X进制字母表
        System.out.println(GoodCoderUtil.shuffle("123456789".toCharArray(),10));
        System.out.println(GoodCoderUtil.shuffle("01".toCharArray(),3));
        System.out.println(GoodCoderUtil.shuffle("0123456789abcdefghigklmnopqrstuvwxyz".toCharArray(),4));
        System.out.println(GoodCoderUtil.shuffle("0123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray(),7));


        //测试10进制转34进制
        System.out.println(GoodCoderUtil.tenToFiftyEight(0));
        System.out.println(GoodCoderUtil.tenToFiftyEight(1));
        System.out.println(GoodCoderUtil.tenToFiftyEight(2));
        System.out.println(GoodCoderUtil.tenToFiftyEight(33));
        System.out.println(GoodCoderUtil.tenToFiftyEight(34));
        System.out.println(GoodCoderUtil.tenToFiftyEight(35));
        System.out.println(GoodCoderUtil.tenToFiftyEight(99));
        System.out.println(GoodCoderUtil.tenToFiftyEight(999));
        System.out.println(GoodCoderUtil.tenToFiftyEight(99999999));
        System.out.println(GoodCoderUtil.tenToFiftyEight(Integer.MIN_VALUE));
        System.out.println(GoodCoderUtil.tenToFiftyEight(Integer.MAX_VALUE));

        //测试10进制转58进制
        System.out.println(GoodCoderUtil.tenToThirtyFour(0));
        System.out.println(GoodCoderUtil.tenToThirtyFour(1));
        System.out.println(GoodCoderUtil.tenToThirtyFour(2));
        System.out.println(GoodCoderUtil.tenToThirtyFour(57));
        System.out.println(GoodCoderUtil.tenToThirtyFour(58));
        System.out.println(GoodCoderUtil.tenToThirtyFour(59));
        System.out.println(GoodCoderUtil.tenToThirtyFour(99));
        System.out.println(GoodCoderUtil.tenToThirtyFour(999));
        System.out.println(GoodCoderUtil.tenToThirtyFour(99999999));
        System.out.println(GoodCoderUtil.tenToThirtyFour(Integer.MIN_VALUE));
        System.out.println(GoodCoderUtil.tenToThirtyFour(Integer.MAX_VALUE));

    }

}
