import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int count =0;
        for (String arg : args) {
            int parseInt = Integer.parseInt(arg);
            if (parseInt >0) {
               count = count +1;

            }
        }
        System.out.println("Count positive numbers=" +count);
    }
}

