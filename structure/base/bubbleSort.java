package structure.base;

/**
 * @author vetstein
 * @creat 2021-04-2021/4/11-16:54
 */
public class bubbleSort {
    private int[] a;
    private int nums;

    public bubbleSort(int size){
        a = new int[size];
        nums = 0;
    }
    //增加
    public void insert(int values){
        a[nums] = values;
        nums++;
    }

    //遍历
    public void show(){
        for (int j = 0;j < nums; j++){
            System.out.println(a[j]);
        }
    }

    //查找
    public int search(int values){
        int j;
        for (j = 0;j < nums;j++){
            if(a[j] == values){
                break;
            }
        }
        if (j == nums){
            return -1;
        }
        return j;
    }

    //删除
    public boolean delete(int values){
        if (search(values) == -1){
            return false;
        }else{
            int n;
            n = search(values);
            for(int j = n; j < nums-1; j++){
                a[j] = a[j+1];
            }
            nums--;
            return true;
        }
    }
    //冒泡排序
    public void bubbleSort(){
        int out,in;
        for (out  = nums-1; out >0;out--){
            for (in = 0;in < out;in++){
                int temp;
                if (a[in] > a[in+1]){
                    temp = a[in+1];
                    a[in+1] = a[in];
                    a[in] = temp;
                }
            }
        }
    }


}
