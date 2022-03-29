package structure.base;

import org.junit.Test;

/**
 * @author vetstein
 * @creat 2021-04-2021/4/24-14:47
 */
public class SortTest {
    @Test
    public void test1() {
        int[] array = {30,26,78,97,12,6};
        Sort.bubbleSort(array);
    }

    @Test
    public void test2() {
        int[] array = {30,26,78,97,12,6};
        Sort.selectSort(array);
    }

    @Test
    public void test3() {
        int[] array = {30,26,78,97,12,6};
        Sort.insertSort(array);
    }

    @Test
    public void test4(){
        int a = 0;
        String b;
        b = '0' + "48";
        System.out.println(b);
    }
}
