public class Test04 {
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
    
    // Tracing the outputs
    public static void main(String[] args) {
        Test04 t = new Test04();
        t.methodA();
    }
}
