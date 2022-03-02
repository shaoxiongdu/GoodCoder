import com.lixiang.osd.goodcoder.GoodCoderUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author dushaoxiong@lixiang.com
 * @version 1.0
 * @date 2022/3/2 20:53 PM
 */
@Test
public class TestMain {

    @BeforeMethod
    public void testBefore(){
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * 测试10进制转34
     */
    @Test
    public void test10To34(){
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
    }

    /**
     * 测试10进制转58
     */
    @Test
    public void test10To58(){
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

    /**
     * 测试打乱字母表
     */
    @Test
    public void testUpSet(){
        System.out.println(GoodCoderUtil.shuffle("123456789".toCharArray(),10));
        System.out.println(GoodCoderUtil.shuffle("01".toCharArray(),3));
        System.out.println(GoodCoderUtil.shuffle("0123456789abcdefghigklmnopqrstuvwxyz".toCharArray(),4));
        System.out.println(GoodCoderUtil.shuffle("0123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz".toCharArray(),7));
    }

}
