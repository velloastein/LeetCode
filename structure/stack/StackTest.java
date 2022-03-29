package structure.stack;

import org.junit.Test;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/31-16:29
 */
public class StackTest {
    @Test
    public void testArrayStack() {
        ArrayStack stack = new ArrayStack(10);

        //入栈
        stack.push(14);
        stack.push(23);
        stack.push(65);
        stack.push(12);

        //出栈
        System.out.println("出栈元素:  "+ stack.pop());
        System.out.println("出栈元素:  "+ stack.pop());

        //查看栈顶元素
        System.out.println("栈顶元素:  "+ stack.peek());
    }
}
