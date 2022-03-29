package structure.stack;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/31-20:30
 */
public class ArrayQueue {
    //数组实现队列,需要声明大小
    int maxSize = 10;
    int[] array;
    //声明队头指针
    int front;
    //声明队尾指针
    int near;
    //记录元素个数
    int num;

    public ArrayQueue() {
        array = new int[maxSize];
        front = 0;
        near = -1;
        num = 0;
    }

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        front = 0;
        near = -1;
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
    public void insert(int data) {
        if (!isFull()) {
            if (near == maxSize - 1) {      //循环队列
                near = -1;
            }
            array[++near] = data;
            num++;
        }
    }

    //出队
    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int temp = array[front];
        if (front == maxSize -1) {
            front = -1;
        }
        front++;
        num--;
        return temp;
    }

    //查看队首元素
    public int peekFront() {
        return array[front];
    }

    //队列数据项数量
    public int size() {
        return  num;
    }
}
