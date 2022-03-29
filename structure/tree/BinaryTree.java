package structure.tree;

/**
 * @author vetstein
 * @creat 2021-08-2021/8/6-16:36
 */
public class BinaryTree {
    //维护根
    Node root;

    public BinaryTree() {
    }

    //查找节点：查找效率取决于数的层数
    public Node find(int key) {
        //维护一个指针
        Node cur = root;
        while (cur.data != key) {
            if (key < cur.data) {
                cur = cur.left;
            } else if(key > cur.data) {
                cur = cur.right;
            }
            if (cur == null) {      //找不到,表明节点不存在
                return null;
            }
        }
        return cur;
    }

    //插入一个节点
    public boolean insert(int data) {
        //创建一个新节点
        Node newNode = new Node(data);
        //判断是否要维护根指针
        if (root == null) {
            root = newNode;
            return true;
        }
        //维护两个指针，寻找合适的插入位置
        Node cur= root;
        Node parent = null;
        while (true) {
            parent = cur;
            if (data < cur.data) {
                cur = cur.left;
                if (cur == null) {
                    parent.left = newNode;
                    return true;
                }
            } else if (data >= cur.data) {
                cur = cur.right;
                if (cur == null) {
                    parent.right  = newNode;
                    return true;
                }
            }
        }
    }

    //数的遍历
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data+"    ");
            inorder(root.right);
        }
    }

    //查找最小值
    public int minData() {
        //维护一个指针
        Node cur = root;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur.data;
    }

    //查找最大值
    public int maxData() {
        //维护一个指针
        Node cur = root;
        while (cur.right != null) {
            cur =cur.right;
        }
        return cur.data;
    }

    //删除节点
    public boolean delete(int key) {
        //维护两个指针，一个指向要删除的节点，一个指向其父节点
        Node parent = root;
        Node cur = root;
        //判断要删除的节点是左子节点还是右子节点
        boolean isLeft = false;
        //寻找节点
        while (cur.data != key) {
            parent = cur;
            if (key < cur.data) {
                isLeft = true;
                cur = cur.left;
            } else if (key > cur.data) {
                isLeft = false;
                cur = cur.right;
            }
            if (cur == null) {
                return false;
            }
        } //找到要删除的节点后退出

        //删除没有子节点的节点
        if (cur.left == null && cur.right == null) {
            //需要维护root指针
            if (cur == null) {
                root = null;
            } else if (isLeft) {      //要删除的节点是左子节点
                parent.left = null;
            } else if (!isLeft) {     //要删除的节点是右子节点
                parent.right = null;
            }
        }
        //删除只有一个子节点的节点
        //只有左子节点
        else if (cur.right == null) {
          //判断是否要维护root
          if (cur == root) {
              root = root.left;
          } else if (isLeft) {
              parent.left = cur.left;
          } else if (!isLeft) {
              parent.right = cur.left;
          }
        }
        //只有右子节点
        else if (cur.left == null) {
            if (cur == root) {
                root = root.right;
            } else if (isLeft) {
                parent.left = cur.right;
            } else if (!isLeft) {
                parent.right = cur.right;
            }
        }
        //删除有两个子节点的节点
        else {
            //获取删除节点的后继
            Node sub = getSub(cur);

            //连接删除节点的父节点和删除节点的后继节点
            //判断是否要维护root指针
            if (cur == root) {
                sub.left = root.left;
                root = sub;
            } else if(isLeft) {
                parent.left = sub;
                sub.left = cur.left;
            } else {
                parent.right = sub;
                sub.left = cur.left;
            }
        }
        return true;
    }

    public Node getSub(Node delete) {
        Node cur = delete.right;
        Node sub = delete.right;
        Node subParent = null;
        while (cur != null) {
            subParent = sub;
            sub = cur;
            cur = cur.left;
        }
        if (sub != delete.right) {
            subParent.left = sub.right;
            sub.right = delete.right;
        }
        return sub;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
