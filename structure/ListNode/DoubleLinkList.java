package structure.ListNode;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/30-14:46
 */
public class DoubleLinkList {
    //采用双端链表的形式
    Node first;
    Node last;

    public DoubleLinkList() {
        this.first = null;
        this.last = null;
    }

    //判断是否空
    public boolean isEmpty() {
        return first == null;
    }

    //头插法
    //与单链表相比需要维护链节点对前一个的引用
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {  //非空，不需要维护last指针
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        } else {           //空，需要维护last指针
            last = newNode;
            first = newNode;
        }
    }

    //尾插法，有双端链表的情况才有这种方法
    //相比单链表，需要多维护链节点对前一个的引用
    public void insertLast(int data) {
        Node newNode= new Node(data);
        if (!isEmpty()) {   //非空，不需要维护first指针
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }else {                //空，需要维护first指针
            first = newNode;
            last = newNode;
        }
    }

    //删除第一个链节点
    //相比单链表，需要多链节点对前一个的引用
    public void deleteFirst() {
        if (!isEmpty()) {  //判断非空
            if (first.next != null) {  //如果不止一个元素，不需要维护last指针
                first.next.prev = null;
                first = first.next;
            } else {                    //如果只有一个元素，需要维护last指针
                last = null;
                first = null;
            }
        }
    }

    //删除最后一个节点,双向链表相比其它链表最方便的特性
    public void deleteLast() {
        if (!isEmpty()) {       //判断非空
            if (first.next != null) {  //如果不止一个元素，不需要维护first指针
                last.prev.next = null;
                last = last.prev;
            } else {                    //如果只有一个元素，需要维护last指针
                first = null;
                last = null;
            }
        }
    }

    //在某个特定的链节点插入元素
    public boolean insertAfter(int key,int data) {
        //声明一个指针
        Node cur = first;
        while (cur != null && cur.data != key) {       //寻找要插入的元素位置
            cur = cur.next;
        }
        if (cur == null) {              //找不到退出
            return false;
        }
        Node newNode = new Node(data);      //找到
        if(cur != last) {                   //要插入的位置不是末尾
            //先于后一个链节点相连
            newNode.next = cur.next;
            cur.next.prev = newNode;
            //再与前一个链节点相连
            cur.next = newNode;
            newNode.prev = cur;
        } else {                            //插入的位置是末尾,要维护last指针
            cur.next = newNode;
            newNode.prev = cur;
            last = newNode;
        }
        return true;
    }

    //删除元素
    public boolean deleteKey(int key) {
        if (isEmpty()) {
            return false;
        }
        //声明一个指针
        Node cur = first;
        while (cur != null && cur.data != key) {       //寻找位置
            cur = cur.next;
        }
        if (cur == null) {              //找不到退出
            return false;
        }
        if (cur == first) {             //删除的是第一个元素，需要维护first指针
            first.next.prev = null;
            first = first.next;
        } else{                         //删除其它位置元素
            cur.prev.next = cur.next;
        }
        if (cur == last) {              //删除的是末尾最后一个元素，需要维护last指针
            last.prev.next = null;
            last = last.prev;
        } else {
            cur.next.prev = cur.prev;
        }
        return true;
    }

    //遍历
    public void display() {
        Node cur = first;
        System.out.println("双向链表的元素： ");
        while (cur != null) {
            System.out.print(cur.toString()+"  ");
            cur = cur.next;
        }
        System.out.println("  ");
    }

    //向前遍历
    public void displayBackward() {
        Node cur = last;
        System.out.println("双向链表的元素： ");
        while (cur != null) {
            System.out.print(cur.toString()+"  ");
            cur = cur.prev;
        }
        System.out.println(" ");
    }







}

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return ""+data;
    }
}
