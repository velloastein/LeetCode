package structure.base;

/**
 * @author vetstein
 * @creat 2021-03-2021/3/31-4:23
 */
public class Arraybina {
    private int[] a;
    public int num;

    public Arraybina(int size){
        a = new int[size];
        num = 0;
    }

    //查找
    public int find(int key){
        int low = 0;
        int high = num - 1;
        int mid;

        while(low <= high) {
            mid = (low + high)/2;
            if (a[mid] == key) { //找到返回mid下标值
                return mid;
            } else {
                if (a[mid] > key) { //改变查找范围
                    high = mid - 1;
                } else {            //改变查找范围
                    low = mid + 1;
                }
            }
        }
        return -1;

    }

    //插入
    public void insert(int value){
        int j;
        for (j = 0; j < num; j++){
            if (a[j] > value){
                break;
            }
        }
        for(int i = num ; i > j; i--){
            a[i] = a[i-1];
        }
        a[j] = value;
        num++;
    }

    //删除
    public boolean delete(int value){
        int b;
        b =find(value);
        if (b == -1){
            return false;
        }
        for(int i = b; i < num - 1; i++){
            a[i] = a[i+1];
        }
        num--;
        return true;
    }
    
    //遍历
    public void show(){
        for(int j = 0; j < num; j++){
            System.out.println(a[j]);
        }
    }
}
