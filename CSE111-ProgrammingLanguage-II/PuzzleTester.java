class PuzzleTester {
    public static void main(String[] args) {
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
        x = 5;
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
