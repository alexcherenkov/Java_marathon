package day2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        for(int i = num1; i != num2; i++){
        if(i%5 == 0 && i%10!= 0){
            System.out.print(i+" ");
        }

        }

    }
}
