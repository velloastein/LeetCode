package LeetCode;

import structure.base.Arraybina2;
import structure.base.Arrayint2;
import structure.base.bubbleSort;
import org.junit.Test;

/**
 * @author vetstein
 * @creat 2021-03-2021/3/31-3:01
 */
public class ArrayTest {
    @Test
    public void test1(){
        int[] array;//定义数组
        array = new int[10];//创建数组

        //数组的动态初始化
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        System.out.println(array);

        /* 数组的静态初始化 */
        int[] array2 = {1,2,3,4,5};
        System.out.println(array2);

        //数组的length属性
        System.out.println(array.length);//10


        //访问数组数据项
        System.out.println(array2[1]);//2

        //数组的常用方法
        System.out.println(array.equals(array2));
        array.clone();
        array.hashCode();
        array.toString();
        System.out.println(5/2);
        System.out.println(array.getClass());
    }

    @Test
    public void test2(){
        Arraybina2 a1 = new Arraybina2(10);
        a1.insert(10);
        a1.insert(22);
        a1.insert(16);
        a1.insert(1);
        a1.insert(160);

        a1.show();
        System.out.println(a1.num);

        System.out.println(a1.find(16));

        System.out.println(a1.delete(16));
        a1.show();

    }

    @Test
    public void test3(){
        bubbleSort b = new bubbleSort(10);
        b.insert(60);
        b.insert(61);
        b.insert(62);
        b.insert(63);
        b.insert(64);
        b.insert(65);

        System.out.println(b.delete(65));;
        b.insert(30);
        b.insert(20);
        b.insert(40);
        b.insert(10);

        b.bubbleSort();
        b.show();

        System.out.println(b.search(20));

    }

    @Test
    public void test4() {
            Arrayint2 a = new Arrayint2(4);
            a.insert(0);
            a.insert(1);
            a.insert(2);
            a.insert(3);

            a.display();

            a.delete(2);
            a.display();

    }
}
