package structure.ListNode;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/30-0:07
 */
public class FirstLastList {
    ListNode first;
    ListNode last;

    public FirstLastList() {
        this.first = null;
        this.last = null;
    }

    //头插法
    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        if (first == null) {  //插入首个元素
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    //尾插法
    public void insertLast(int data) {
        ListNode newNode = new ListNode(data);
        if (this.isEmpty()) { //如果是插入首个元素
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    //删除首个元素
    public void deleteFirst() {
        if (!this.isEmpty()) { //判断是否非空
            first = first.next;
            if (first == null) { //判断是否非空
                last = null;
            }
        }
    }

    //判断是否空
    public boolean isEmpty() {
        return first == null;
    }
    
    //遍历
    public void display() {
        //声明一个指针
        ListNode cur = first;
        System.out.println("链表节点：");
        while (cur != null) {
            System.out.print(cur.toString()+" ");
            cur = cur.next;
        }
        System.out.println(" ");
    }

    //和单链表一样
    //查找给定元素的索引
    public int indexFind(int data) {
        //声明一个指针
        ListNode cur = first;
        int count = 0;
        while (cur != null) {
            if (cur.data == data) {
                return count;
            } else {
                cur = cur.next;
                count++;
            }
        }
        return -1;
    }
    
    
}
