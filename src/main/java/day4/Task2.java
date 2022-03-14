package day4;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        Random r = new Random();
        for(int i = 0; i< massiv.length; i++){
            massiv[i] = r.nextInt(10000);
        }
        int max_num = 0;
        int min_num = 0;
        int counter = 0;
        int sum = 0;
        for(int j: massiv){
            if(j> max_num){
                max_num = j;
            } else if(j< min_num){
                min_num =j;
            }
            if(j%10 == 0){
                counter ++;
                sum = sum + j;
            }

        }
        System.out.printf("наибольший элемент массива = %d \nнаименьший элемент массива= %d \nколичество элементов массива, оканчивающихся на 0 = %d \nсумму элементов массива, оканчивающихся на 0= %d", max_num, min_num, counter, sum);
    }
}
