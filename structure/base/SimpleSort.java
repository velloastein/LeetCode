package structure.base;

/**
 * @author vetstein
 * @creat 2021-05-2021/5/3-10:37
 */
public class SimpleSort {
    //插入排序
    public static void insertSort(int[] nums) {
        for (int j = 1; j < nums.length; j++) {
            int temp = nums[j];  //标记观测值
            int i = j;
            while (i > 0 && nums[i-1] > temp ) {  //找到观测值的位置
                nums[i] = nums[i-1]; //右移比观测值大的数
                i--;
            }
            nums[i] = temp; //在合适的位置插入观测值
        }
    }

    //希尔排序
    public static void shellSort(int[] nums) {
        int h = 1;      //设置h的初始值
        while (h <= nums.length / 3) {
            h = 3 * h + 1;          //h(1,4,13...) 控制h的范围小于数组长度
        }
        while (h > 0) {     //逐渐减小h
            for (int j = h; j < nums.length; j++) {
                int temp = nums[j];     //存取观测值
                int i = j;
                while (i > 0 && nums[i-h] > temp) { //找到合适的位置，右移比观测值大的数据项
                    nums[i] = nums[i-h];
                    i = i - h;
                }
                nums[i] = temp; //插入观测值
            }
            h = (h - 1) / 3;  //减小h
        }
    }

     //冒泡排序
    public static void bubbleSort(int[] nums) {
        for (int j = nums.length; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                int temp;
                if (nums[i+1] < nums[i]) {
                    temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int[] nums) {
        for (int j = 0; j < nums.length - 1; j++) {
            for (int i = j+1; i < nums.length; i++) {
                int temp;
                if (nums[i] < nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }


}


