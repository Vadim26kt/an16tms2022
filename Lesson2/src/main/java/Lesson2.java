public class Lesson2 {
    public static void main(String[] args) {
        printLiterals();
        System.out.println(sum(2147483646, 6));
        System.out.println(sum(5, 6));
        System.out.println(max(4, 5));
        System.out.println(calkulateHypotenuse(3, 4));
    }

    public static int sum(int a, int b) {
        double sum = (double) a + (double) b;
        if (sum > Integer.MAX_VALUE) {
            return -1;
        }
        return (int) sum;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }


    private static void printLiterals() {
        boolean c = false;
        boolean d = true;
        System.out.println(c);
        System.out.println(d);
        System.out.println("String literal");
        System.out.println('a');
        System.out.println(0b1101);
        System.out.println(012);
        System.out.println(0x1A);
        System.out.println(12);
        System.out.println(12.5F);
        System.out.println(12e-3);
    }

    public static int calkulateHypotenuse(int a, int b) {
        return (int) Math.hypot(a, b);
    }
}
