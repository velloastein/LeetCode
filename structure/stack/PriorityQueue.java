package structure.stack;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/31-21:03
 */
public class PriorityQueue {
    //数组实现队列,需要声明大小
    int maxSize = 10;
    int[] array;
    //记录元素个数
    int num;

    public PriorityQueue() {
        array = new int[maxSize];
        num = 0;
    }

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        num = 0;
    }

    //判断非空
    public boolean isEmpty() {
        return num == 0;
    }

    //判断是否满
    public boolean isFull() {
        return num == maxSize;
    }

    //入队
    public boolean insert(int data) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            array[num++] = data;
            return true;
        } else {
            int i;
            for ( i = num - 1; i >= 0; i --) {
                if (array[i] < data) {
                    array[i+1] = array[i];
                } else {
                    break;
                }
            }
            array[i+1] = data;
            num++;
            return true;
        }
    }

    //出队
    public int remove() {
        if (isEmpty()) {
            return -1;
        } else {
            return array[--num];
        }
    }

    //查看优先级最小的元素
    public int peekMin() {
        return array[num-1];
    }

    //队列数据项数量
    public int size() {
        return  num;
    }

}
