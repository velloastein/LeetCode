package structure.ListNode;

import org.junit.Test;

/**
 * @author vetstein
 * @creat 2021-07-2021/7/29-23:13
 */
public class ListNodeTest {

    @Test
    public void testDoubleLinkList() {
        DoubleLinkList doubleLinkList = new DoubleLinkList();

        //测试头插法
        doubleLinkList.insertFirst(19);
        doubleLinkList.insertFirst(13);
        doubleLinkList.insertFirst(100);
        doubleLinkList.display();

        //测试尾插法
        doubleLinkList.insertLast(30);
        doubleLinkList.insertLast(40);
        doubleLinkList.insertLast(20);
        doubleLinkList.display();

        //删除首个元素
        doubleLinkList.display();
        doubleLinkList.deleteFirst();
        doubleLinkList.display();

        //删除末尾元素
        doubleLinkList.display();
        doubleLinkList.deleteLast();
        doubleLinkList.display();

        //测试在指定元素后面插入新元素
        System.out.println("测试");
        doubleLinkList.insertAfter(40,41);
        doubleLinkList.display();

        //测试删除指定的元素
        doubleLinkList.deleteKey(13);
        doubleLinkList.display();

        //测试向后遍历
        doubleLinkList.displayBackward();



    }

    @Test
    public void testSortedList() {
        SortedList sortedList = new SortedList();

        //插入元素
        sortedList.insert(100);
        sortedList.insert(11);
        sortedList.insert(23);
        sortedList.insert(18);
        sortedList.insert(1100);
        sortedList.insert(1200);
        sortedList.display();

        //删除头元素
        System.out.println("删除的最小元素是： "+sortedList.deleteFirst().toString());;
        System.out.println("删除的最小元素是： "+sortedList.deleteFirst().toString());;

        //查找
        System.out.println("元素的索引是： "+sortedList.indexFind(100));
    }

    @Test
    public void testFirstLastList() {
        FirstLastList firstLastList = new FirstLastList();

        //测试头插法
        firstLastList.insertFirst(100);
        firstLastList.insertFirst(80);
        firstLastList.insertFirst(50);
        firstLastList.insertFirst(10);
        firstLastList.display();

        //测试尾插法
        firstLastList.insertLast(1000);
        firstLastList.insertLast(2000);
        firstLastList.insertLast(6000);
        firstLastList.display();

        //测试查找
        System.out.println("元素所在位置 "+firstLastList.indexFind(2000));;
    }

    @Test
    public void testListNode() {
        LinkList linkList = new LinkList();
        //插入节点
        linkList.insertFirst(5);
        linkList.insertFirst(4);
        linkList.insertFirst(3);
        linkList.insertFirst(2);
        linkList.dispaly();

        //删除头节点
        linkList.deleteFirst();
        linkList.deleteFirst();
        linkList.dispaly();

        //查找指定的元素
        System.out.println("元素索引:  "+linkList.indexFind(5));
        System.out.println("元素索引:  "+linkList.indexFind(4));

        //删除指定的元素,返回索引
        System.out.println("删除的元素位置: "+linkList.deletNode(5));


    }

}
