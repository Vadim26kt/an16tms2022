import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        taskOne();
        taskTwo();
        taskTree();
    }

    private static void taskOne() {
        for (int c = 65; c < 90; c++) {
            System.out.println((char) c);
        }
    }
    private static void taskTwo() {
        int num;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("An even number");
        } else {
            System.out.println("Odd number");
        }
    }

    private static void taskTree() {
        {
            Scanner sc = new Scanner(System.in);
            int min1, min2, min;
            System.out.print("Enter a number 1: ");
            int x = sc.nextInt();
            System.out.println("Enter a number 2: ");
            int y = sc.nextInt();
            System.out.println("Enter a number 3: ");
            int z = sc.nextInt();
            min1 = Math.min(Math.abs(x), Math.abs(y));
            min2 = Math.min(Math.abs(x), Math.abs(z));
            min = Math.min(min1, min2);
            System.out.println("Smaller in modulus:" + min);
        }
    }

}







