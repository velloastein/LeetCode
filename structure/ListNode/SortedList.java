package structure.ListNode;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/30-0:56
 */
public class SortedList {
    ListNode first;

    public SortedList() {
        this.first = null;
    }

    //插入
    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        //声明一个指针，记录前一个元素
        ListNode prev = null;
        //声明一个指针
        ListNode cur = first;
        while (cur != null && cur.data <= data) {
            prev = cur;
            cur = cur.next;
        }
        if (prev == null) {     //插入位置在表头或者链表为空
             first = newNode;
        } else {                //其它位置，表中间位置或者表尾
           prev.next = newNode;
        }
        newNode.next = cur;         //都要进行的一步
    }

    //删除头元素
    public ListNode deleteFirst() {
        if (!isEmpty()) {
            ListNode temp = first;
            first = first.next;
            return temp;
        }
        return null;
    }

    //判断非空
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

    //遍历
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
