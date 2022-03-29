package structure.base;

/**
 * @author vetstein
 * @creat 2021-04-2021/4/24-14:35
 */
public class Sort {
    public static void bubbleSort(int[] array) {
        for (int j = array.length - 1; j > 0; j--) { //控制排序范围
            int temp;
            for (int i = 0; i < j; i++) {       //从左到右，依次比较
                if (array[i] > array[i + 1]) {  //左边的数大，就交换位置
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void  selectSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) { //确定扫描范围
            int temp;
            for (int i = j + 1; i < array.length; i++) {  //从左向右依次扫描
                if (array[j] > array[i]) {       //有比选定数据项小的，就交换它们的位置
                    temp = array[i];
                    array[i] =array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertSort(int[] array) {
        int j;
        for (j = 0; j < array.length; j++) {
            int in = j;
            int temp = array[j];
            while (in > 0 && array[in - 1] > temp) {
                array[in] = array[in - 1];
                in--;
            }
            array[in] = temp;
        }
        for(int i = 0;i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
