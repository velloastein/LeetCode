package structure.base;

import org.junit.Test;

/**
 * @author vetstein
 * @creat 2021-05-2021/5/3-10:43
 */
public class SimpleSortTest {
    @Test
    public void test1() {
        int[] a = new int[5];
        a[0] = 34;
        a[1] = 3;
        a[2] = 16;
        a[3] = 26;
        a[4] = 54;

        SimpleSort.selectSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void test2() {
        int[] a = new int[5];
        a[0] = 34;
        a[1] = 3;
        a[2] = 16;
        a[3] = 26;
        a[4] = 54;

        SimpleSort.shellSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void test3() {
        int[] a = new int[5];
        a[0] = 34;
        a[1] = 3;
        a[2] = 16;
        a[3] = 26;
        a[4] = 54;

        SimpleSort.bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    @Test
    public void test4() {
        int[] a = new int[5];
        a[0] = 34;
        a[1] = 3;
        a[2] = 16;
        a[3] = 26;
        a[4] = 54;

        SimpleSort.insertSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}
