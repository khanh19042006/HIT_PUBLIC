package Main;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) arr[i] = "" + i;
        Mang mang = new Mang(arr);
        mang.print();

        for (int i = 4; i >= 0; i--) System.out.print(arr[i] + " ");
    }
}