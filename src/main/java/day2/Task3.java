package day2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        while(num1 != num2){
            if(num1%5 == 0 && num1%10 != 0){
                System.out.print(num1+ " ");
            }
            num1++;
        }

    }
}
