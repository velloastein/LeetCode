package structure.tree;

import org.junit.Test;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/6-19:23
 */
public class TreeTest {
    @Test
    public void binaryTreeTest() {
        BinaryTree binaryTree = new BinaryTree();
        //测试插入节点
        binaryTree.insert(34);
        binaryTree.insert(20);
        binaryTree.insert(22);
        binaryTree.insert(65);
        binaryTree.insert(12);
        binaryTree.insert(2);
        binaryTree.insert(8);
        BinaryTree.inorder(binaryTree.root);

        //测试查找方法
        System.out.println();
        System.out.println("要寻找的元素地址: " + binaryTree.find(+22));

        //测试寻找最大值最小值
        System.out.println("最大值: " + binaryTree.maxData());
        System.out.println("最小值: " + binaryTree.minData());

        //测试删除节点
        //删除没有子节点的节点
        System.out.println("是否删除成功: " + binaryTree.delete(8));
        binaryTree.inorder(binaryTree.root);

        //删除有一个子节点的节点
        System.out.println();
        System.out.println("是否删除成功: " + binaryTree.delete(12));
        binaryTree.inorder(binaryTree.root);

        //删除有两个子节点的节点
        binaryTree.insert(60);
        binaryTree.insert(67);
        binaryTree.insert(66);
        System.out.println();
        System.out.println("是否删除成功: " + binaryTree.delete(65));
        binaryTree.inorder(binaryTree.root);

    }


    }
