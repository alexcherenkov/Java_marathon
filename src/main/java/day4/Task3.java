package day4;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int max_sum = 0;
        int counter = 0;
        for(int i =0; i<8; i++){
            int[] stroka = new int[12];
            int sum = 0;
            for(int j = 0; j< stroka.length; j++){
                stroka[j] = r.nextInt(50);
                System.out.print(stroka[j]+", ");
                sum = sum + stroka[j];
            }
            if(max_sum<sum){
                max_sum = sum;
                counter = i;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(counter);

    }
}
