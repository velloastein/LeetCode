package structure.stack;

import org.junit.Test;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/31-20:48
 */
public class QueueTest {

    @Test
    public void testArrayQueue() {
        ArrayQueue arrayQueue = new ArrayQueue();

        //测试入队方法
        arrayQueue.insert(23);
        arrayQueue.insert(230);
        arrayQueue.insert(2300);
        arrayQueue.insert(23000);
        System.out.println("元素个数：" +arrayQueue.size());

        //查看队首元素
        System.out.println("队首元素： "+arrayQueue.peekFront());;

        //测试出队方法
        System.out.println("出队元素： "+arrayQueue.remove());
        System.out.println("队首元素： "+arrayQueue.peekFront());;
        System.out.println("出队元素： "+arrayQueue.remove());
        System.out.println("队首元素： "+arrayQueue.peekFront());;
        System.out.println("元素个数：" +arrayQueue.size());


    }

    @Test
    public void testPriorityQueue() {
        PriorityQueue priorityQueue = new PriorityQueue();

        //入队
        priorityQueue.insert(78);
        priorityQueue.insert(32);
        priorityQueue.insert(2);
        priorityQueue.insert(788);
        System.out.println("元素个数：" + priorityQueue.size());

        //出队
        System.out.println("出队元素： "+ priorityQueue.remove());
        System.out.println("优先级最小的元素： "+ priorityQueue.peekMin());
        System.out.println("出队元素： "+ priorityQueue.remove());
        System.out.println("优先级最小的元素： "+ priorityQueue.peekMin());
        System.out.println("元素个数：" + priorityQueue.size());


        //查看队尾元素
        System.out.println("优先级最小的元素： "+ priorityQueue.peekMin());
    }
}
