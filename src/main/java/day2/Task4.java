package day2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        double result;
        if (number >= 5) {
            result = (number * number - 10) / (number + 7.d);
            System.out.println(result);
        } else if (number > -3) {
            result = (number + 3) / (number * number - 2.d);
            System.out.println(result);
        } else {
            System.out.println(420);
        }

    }
}