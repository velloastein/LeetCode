package structure.ListNode;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/29-22:50
 */
public class ListNode {
    int data;//数据项
    ListNode next;//引用

    public ListNode() {
    }

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return   "  "+data ;
    }
}

class LinkList {
    ListNode first;//维护链表头


    public LinkList() {
        //链表创建时没有数据项
        this.first = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    //头插法
    public void insertFirst(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = first;
        first = newNode;
    }

    //删除第一个节点
    public void deleteFirst() {
        if (!this.isEmpty()) {
            first = first.next;
        }
    }

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

    //删除指定的元素,有两个或多个相同的元素删除索引最小的,f返回索引
    public int deletNode(int data) {
        //声明一个指针
        ListNode cur = first;
        //声明一个指针，记录单链表的前一个元素
        ListNode prev = null;
        int count = 0;
        while (cur != null) {
            if (cur.data == data) { //找到位置
                if (prev == null) { //删除第一个元素
                    first = first.next;
                    break;
                } else {           //删除其它位置元素
                    prev.next = cur.next;
                    break;
                }
            } else {
                prev = cur;     //记录前一个元素位置
                cur = cur.next;
                count++;
            }
        }
        return count;
    }

    //遍历
    public void dispaly() {
        //声明一个指针
        ListNode cur = first;
        System.out.println("链表节点：");
        while (cur != null) {
            System.out.print(cur.toString()+" ");
            cur = cur.next;
        }
        System.out.println("");
    }





}
