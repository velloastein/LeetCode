package structure.base;

import org.junit.Test;

/**
 * @author vetstein
 * @creat 2021-03-2021/3/10-8:42
 */
public class ExampleTest {
    @Test
    public void test1(){
        String s = " 2-1 + 2 ";
        int sum = BasicCalculator.calculate1(s);
        System.out.println(sum);
    }

    @Test
    public void test2(){
        String s = "abbaca";
        System.out.println(BasicCalculator.removeDuplicates(s));
    }

    @Test
    public void test(){
        String s = "100 + 2 - 32 * 2-8";
        System.out.println(BasicCalculator.calculate(s));
    }
}
