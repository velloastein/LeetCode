package structure.stack;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/31-16:02
 */
public class ArrayStack {
    //底层是数组，创建时要声明数组大小
    int[] array;
    int maxSize = 10;
    //维护一个指针访问栈顶元素,数组就是下标数字
    int top;

    public ArrayStack() {
        array = new int[maxSize];
        top = -1;
    }

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        top = -1;
    }

    //判断是否空栈
    public boolean isEmpty() {
        return top == -1;
    }

    //判断是否满栈
    public boolean isFull() {
        return top == this.maxSize - 1;
    }

    //入栈
    public void push(int data) {
        if (!isFull()){
            array[++top] = data;
        }
    }

    //出栈,返回栈顶元素
    public int pop() {
        if (!isEmpty()) {
            return array[top--];
        }
        return 0;
    }

    //查看栈顶元素
    public int peek() {
        return array[top];
    }
}

