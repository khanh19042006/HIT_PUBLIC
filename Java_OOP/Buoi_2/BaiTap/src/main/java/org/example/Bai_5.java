import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) System.out.println("5 x " + i + " = " + (5*i));

        int sum = 0;
        for (int i = 2; i <= 100; i+=2) sum += i;
        System.out.println("Tong la: " + sum);

        sum = 0;
        int i = 0;
        while (i <= 100){
            sum += i;
            i += 2;
        }
        System.out.println("Tong la: " + sum);
    }
}