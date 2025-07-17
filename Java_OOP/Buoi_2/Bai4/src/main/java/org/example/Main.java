import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        String[] s = sc.nextLine().split(" ");
        int sum = 0;
        int max = 0;
        for (int i = 1; i <= 5; i++) {
            a[i] = Integer.parseInt(s[i - 1]);
            sum += a[i];
            max = Math.max(max,a[i]);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Tong la: " + sum);
        System.out.println("Max la: " + max);
    }
}