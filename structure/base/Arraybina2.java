package structure.base;

/**
 * @author vetstein
 * @creat 2021-04-2021/4/23-17:07
 */
public class Arraybina2 {
    //有序数组
    private int[] array; //声明数组
    public int num;     //记录数组数据长度

    public Arraybina2(int size) {
        array = new int[size]; //运行时创建数组
        num = 0; //初始化数组长度为0
    }

    //插入数据
    public void insert(int value) {
        int j;
        for (j = 0; j < num; j++) { //找到数据将要插入的位置
            if (array[j] > value) {
                break;
            }
        }
        for (int i = num - 1 ; i >= j; i--) { //将比插入值大的数组项右移
            array[i+1] = array[i];
        }
        array[j] = value; //插入数据
        num++;
    }

    //二分查找
    public int find(int value) {
        int high = num - 1; //定义变量控制查找范围
        int low = 0;
        int mid;

        while (low <= high) { //每次循环缩小一半的查找范围
            mid = (low +high)/2;
            if (array[mid] == value) { //找到并返回小标
                return mid;
            } else {
                if (array[mid] > value) { //改变查找范围
                    high = mid - 1;
                } else {
                    low = mid + 1;      //改变查找范围
                }
            }
        }
        return -1; //没找到返回-1
    }

    //删除
    public boolean delete(int value) {
        int j = find(value);
        if (j == -1) {
            return false;
        }
        //用删除值后面数的值覆盖删除值,并左移数组数据项
        for (int i = j; i < num - 1; i++) {
            array[i] = array[i+1];
        }
        num--;
        return true;
    }

    //遍历
    public void show() {
        for (int j = 0; j < num; j++) {
            System.out.println(array[j]);
        }
    }
}
