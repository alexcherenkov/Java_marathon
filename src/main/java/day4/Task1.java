package day4;
import java.util.Scanner;
import java.util.Random;
public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n = s.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i<numbers.length; i++){

            numbers[i] = r.nextInt(11);
            System.out.print(numbers[i]+ " ");
        }
        int countE= 0;
        int countOne= 0;
        int countEv= 0;
        int countNotev= 0;
        int sum= 0;
        int lenthCounter= 0;

        for(int i: numbers){
            lenthCounter++; // длина
            sum = sum+i; //сумма
            if(i>8){
                countE++; //>8
            }
            if(i ==1){
                countOne++; //=1
            }
            if(i%2 == 0){
                countEv++; // чет
            } else{
                countNotev++; // нечет
            }
        }
        System.out.println();
        System.out.printf(" Длина массива: %d \n Количество чисел больше 8: %d \n Количество чисел равных 1: %d \n Количество четных чисел: %d \n Количество нечетных чисел: %d \n Сумма всех элементов массива: %d", lenthCounter, countE,countOne, countEv, countNotev, sum);




    }
}
