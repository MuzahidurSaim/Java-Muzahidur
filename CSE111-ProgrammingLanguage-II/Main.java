// task 1
/*
public class Test {
    int sum;
    public int y;
    public void methodA() {
        int x = 0, y = 0;
        y = y + 7;
        x = y + 11;
        sum = x + y;
        System.out.println(x + " " + y + " " + sum);
    }
    public void methodB() {
        int x = 0;
        y = y + 11;
        x = x + 33 + y;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }
}
*/

// task 2
/*
public class Q3
{
    public static void main(String args[])
    {
        String test = "";
        inti = 5, j = 0, k = 15;
        while (i < 10) {
            k -= 1;
            j = k;
            while (j > 10) {
                if (j % 2 == 0) {
                    test = "<--";
                    test = test + i + 2 + "-->" + (j / 2);
                }
                else
                {
                    test = "-->";
                    test = "-->" + (i / 2) + test + j;
                }
                System.out.println(test);
                --j;
            }
            i++;
        }
    }
}
*/

// task 3
/*
//Run the methodA() on an Instance of Test3 five times and explain the answer.
public class Test3 {
    public int sum;
    public int y;
    public void methodA() {
        int x = 2, y = 3;
        int[] msg = new int[1];
        msg[0] = 3;
        y = this.y + msg[0];
        methodB(msg, msg[0]);
        x = this.y + msg[0];
        sum = x + y + msg[0];
        System.out.println(x + " " + y + " " + sum);
    }
    private void methodB(int[] mg2, int mg1) {
        int x = 0;
        y = this.y + mg2[0];
        x = x + 33 + mg1;
        sum = sum + x + y;
        mg2[0] = y + mg1;
        mg1 = mg1 + x + 2;
        System.out.println(x + " " + y + " " + sum);
    }
}
*/

// task 4
/*
//Run the methodA() on an Instance of Test4 five times and explain the answer.
public class Test4 {
    public int sum;

    public int y;
    public void methodA() {
        int x = 0, y = 0;
        int[] msg = new int[1];
        msg[0] = 5;
        y = y + methodB(msg[0]);
        x = y + methodB(msg, msg[0]);
        sum = x + y + msg[0];
        System.out.println(x + " " + y + " " + sum);
    }
    Private int methodB(int mg2[], int mg1) {
        int x = 0;
        y = y + mg2[0];
        x = x + 33 + mg1;
        sum = sum + x + y;
        mg2[0] = y + mg1;
        mg1 = mg1 + x + 2;
        System.out.println(x + " " + y + " " + sum);
        return sum;
    }
    private int methodB(int mg1) {
        int x = 0;
        int y = 0;
        y = y + mg1;
        x = x + 33 + mg1;
        sum = sum + x + y;
        this.y = mg1 + x + 2;
        System.out.println(x + " " + y + " " + sum);
        return y;
    }
}
*/

// task 5
/*
//What is the output if you execute the methodA( ) on an instance of the Test04 Class?
public class Test4 {
    public int sum;
    public int y;
    public void methodA() {

        int x = 0;
        int z = 0;
        while (z < 5) {
            y = y + sum;
            x = y + 1;
            System.out.println(x + " " + y + " " + sum);
            sum = sum + methodB(x, y);
            z++;
        }
    }
    public int methodB(int m, int n) {
        int x = 0;
        int sum = 0;
        y = y + m;
        x = n - 4;
        sum = sum + y;
        System.out.println(x + " " + y + " " + sum);
        return sum;
    }
}
*/

// task 6
/*
//What is the output for the following code sequence?
//FinalT3A fT3A = new FinalT3A();
//fT3A.methodA();
//fT3A.methodB(6,8);
public class FinalT3A {

    public int sum;
    public int y;

    public void methodA() {
        int x = 0, y = 0, j = 0;
        while (j < 2) {
            y = y + j;
            x = j + methodB(y, j);
            sum = x + y;
            System.out.println(x + " " + y + " " + sum);
            j++;
        }
    }
    public int methodB(int p, int k) {
        int x = 0;
        y = y + k + 1;
        x = x + 3 - p;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
        return sum;
    }
}
*/

// task 7
/*
class PuzzleTester {
    public static void main(String[] args)
    {
        Puzzle p = new Puzzle();
        p.methodA();
        p.methodA();
        p = new Puzzle();
        p.methodA();
        p.methodB(7);
    }

}
class Puzzle {
    static int x;
    void methodA() {
        int z;
        x = 5; //at home, comment/delete this line and try again
        z = x + methodB(x);
        System.out.println(x + " " + z);
        z = methodB(z + 2) + x;
        System.out.println(x + " " + z);
        methodB(x, z);
        System.out.println(x + " " + z);
    }
    int methodB(int y) {
        x = y + x;
        System.out.println(x + " " + y);
        return x + 3;
    }
    void methodB(int z, int x) {
        z = z + 1;
        x = x + 1;
        System.out.println(z + " " + x);
    }
}
*/

// task 7.1
/*
class PuzzleTester {
    public static void main(String[] args)
    {
        Puzzle p = new Puzzle();
        p.methodA();
        p.methodB(7);
    }
}
class Puzzle {
    static int x;
    void methodA() {
        int z;

        x = 5; //at home, comment/delete this line and try again
        z = x + methodB(x);
        Maze m1 = new Maze();
        System.out.println(x + " " + z);
        m1.methodA();
        z = methodB(z + 2) + x;
        System.out.println(x + " " + z);
        methodB(x, z);
        System.out.println(x + " " + z);
    }
    int methodB(int y) {
        x = y + x;
        System.out.println(x + " " + y);
        return x + 3;
    }
    void methodB(int z, int x) {
        z = z + 1;
        x = x + 1;
        System.out.println(z + " " + x);
    }
}
class Maze {
    static int x;
    void methodA() {
        int m;
        x = 5;
        m = x + methodB(x);
        System.out.println(x + " " + m);
        m = methodB(m - 3) + x;
        System.out.println(x + " " + (m));
        methodB(x, m);
        System.out.println(x + " " + m + x);
    }
    int methodB(int y) {
        x = y * y;
        System.out.println(x + " " + y);
        return x + 3;
    }
    void methodB(int z, int x) {
        z = z - 2;
        x = x * 1;
        System.out.println(z + " " + x);
    }
}
*/
