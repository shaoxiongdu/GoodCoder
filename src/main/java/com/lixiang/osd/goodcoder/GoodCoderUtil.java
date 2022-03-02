package com.lixiang.osd.goodcoder;

import java.util.Random;

/**
 * base通过id查询业务数据的场景非常普遍：
 *
 *  一种是在url中，一种是在接口请求参数中。为了防止连续id带来的业务数据风险，我们需要对连续id进行重新编码，进而打乱这种连续性。
 *
 *  请设计实现一个在十进制id和X进制字符串之间进行转换的工具类，可以把连续的id转换为非连续的X进制字符串。
 *
 *  要求：
 *  1. 实现34进制和10进制之间的转换；
 *  2. 实现58进制和10进制之间的转换；
 *  3. 实现任意进制和10进制之间的转换；
 *  4. 可以通过指定的salt对X进制的字母表进行打乱；
 *  5. 代码需遵守阿里巴巴编码规范(java)阿里巴巴Java开发手册.pdf ，代码提交需遵守01-gerrit使用 中 commit 信息规范;
 *  6. 代码的可读性和可维护性好。注意模块、类、函数的设计和划分;
 *  7. 完成相应的单元测试和使用demo。你的demo必须可运行，单元测试有效而且通过。
 *
 * @author 杜少雄 <email@shaoxiongdu.cn>
 * @date 2022/02/28 21:02
 **/
public class GoodCoderUtil {

    /** 34位字母表 */
    private static final char[] CHARS_TABLE_34 = "0123456789abcdefghijkmnopqrstuvwxyz".toCharArray();

    /** 58位字母表 */
    private static final char[] CHARS_TABLE_58 = "0123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray();

    /**
     * 十进制转 34进制   利用除34取余法
     * @param number 目标数字
     * @return 结果
     */
    public static String tenToThirtyFour(int number){

        //结果
        StringBuffer result = new StringBuffer();

        //34字母表长度
        int length = CHARS_TABLE_34.length;

        while (number > 0) {

            //除34取余数 累加到结果中
            result.insert(0, CHARS_TABLE_34[number % length]);
            //除34
            number /= length;
        }

        //返回结果
        return result.toString();
    }

    /**
     * 十进制转 58进制 利用除58取余法
     * @param number 目标数组
     * @return 结果
     */
    public static String tenToFiftyEight(int number){

        //结果
        StringBuffer result = new StringBuffer();

        //58字母表长度
        int length = CHARS_TABLE_58.length;

        while (number > 0) {

            //除58取余数 累加到结果中
            result.insert(0, CHARS_TABLE_58[number % length]);

            //除58赋给自己
            number /= length;
        }
        //返回结果
        return result.toString();
    }

    /**
     *  对X进制的字母表进行打乱  洗牌算法
     * @param array 源字母表
     * @param salt 盐值
     * @return
     */
    public static char[] shuffle(char[] array,int salt){

        //临界判断
        if(array.length == 0){
            return array;
        }

        for (int i = 0; i < array.length; ++i){

            //取不大于数组长度的加盐随机值
            int randomIndex = saltRandom(salt,array.length);

            //交换当前位置和随机位置的元素
            swap(array,i,randomIndex);

        }
        return array;
    }

    /**
     * 根据盐值 生成 0(包含) ~ 指定大小(不包含) 的随机数
     * @param salt 盐
     * @return 随机数
     */
    private static int saltRandom(int salt,int max){

        //临界判断
        if(max <= 0 ){
            return -1;
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //以盐值 * 当前时间戳末尾 作为随机数种子
        Random random = new Random(salt * (System.currentTimeMillis() % 10));

        //返回 不大于max的随机数
        return  random.nextInt(max);
    }

    /**
     * 交换数组中指定位置元素
     * @param src 数组
     * @param indexX 位置X
     * @param indexY 位置Y
     */
    private static void swap(char[] src,int indexX,int indexY){

        //临界判断
        if(indexX >= src.length && indexY >= src.length){
            return;
        }

        //交换
        char temp = src[indexX];
        src[indexX] = src[indexY];
        src[indexY] = temp;

    }

}
