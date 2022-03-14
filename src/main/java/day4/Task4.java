package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] massiv = new int[100];
        Random r = new Random();
        for(int i = 0; i< massiv.length; i++){
            massiv[i] = r.nextInt(10000);
        }
        int max_sum = 0;
        int indx = 0;
        for(int j = 0; j< massiv.length; j++){
            if(j!=0 && j!= 99 && massiv[j-1] + massiv[j]+massiv[j+1]>max_sum){
                max_sum = massiv[j-1] + massiv[j]+massiv[j+1];
                indx = j-1;
            }
        }
        System.out.println(max_sum);
        System.out.println(indx);

    }
}
