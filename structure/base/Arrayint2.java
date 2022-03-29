package structure.base;

/**
 * @author vetstein
 * @creat 2021-04-2021/4/22-21:44
 */
public class Arrayint2 {
    private int[] a;
    public int nums;

    public Arrayint2(int size) {
        a = new int[size];
        nums = 0;
    }

    public void insert(int value) {
        a[nums] = value;
        nums++;
    }

    public int find(int value) {
        int j;
        for (j = 0; j < nums; j++) {
            if (a[j] == value) {
                break;
            }
        }
        if (j > nums) {
            return -1;
        } else {
            return j;
        }
    }

    public boolean delete(int value) {
        int j = find(value);
        if (j == -1) {
            return false;
        } else {
            for (int i = j; i < nums; i++) {
                a[j] = a[j + 1];
            }
            nums--;
            return  true;
        }
    }

    public void display() {
        for (int j = 0; j < nums; j++) {
            System.out.println(a[j]);
        }
    }
}
