package structure.base;

/**
 * @author vetstein
 * @creat 2021-03-2021/3/31-3:42
 */
public class ArrayInt {
    private int[] a;//定义数组
    public int num;//记录数据项长度

    public ArrayInt(int size){
        a = new int[size];//Java中数组的长度可以在运行时再确定
        num = 0;
    }

    //查找
    public boolean find(int key){
        int j;
        for (j = 0; j < num; j++) {//遍历数组数据项
            if (a[j] == key) {
                break;
            }
        }
        if (j == num ){ //没找到
            return false;
        }else{
            return true;        //找到
        }
    }

    //插入
    public void insert(int data){
        a[num] = data;
        num++;
    }

    //删除
    public boolean delete(int value){
        int j;
        for (j = 0; j < num; j++){
            if (a[j] == value ){
                break;
            }
        }
        if (j == num ){     //没找到
            return false;
        }else{              //找到
            for(int i = j; i < num; i++){
               a[i] = a[i+1] ;
            }
            num--;
            return true;
        }
    }

    //遍历
    public void show(){
        System.out.println(a.length);
        for(int j = 0; j <num; j++){
            System.out.println(a[j]);
        }
    }
}
