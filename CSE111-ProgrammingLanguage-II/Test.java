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
    
    // Trace the outputs
    public static void main(String[] args) {
        Test t = new Test();
        t.methodA();
        t.methodB();
    }
}
