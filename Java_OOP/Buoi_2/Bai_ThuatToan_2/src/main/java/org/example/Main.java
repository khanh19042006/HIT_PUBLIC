import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] a = new int[n+5];
        String[] nhap = sc.nextLine().split(" ");

        for (int i = 1 ; i <= n; i++) a[i] = Integer.parseInt(nhap[i-1]);

        for (int i = 2; i <= n; i+=2) {
            a[i] += Math.abs(a[i + 1] - a[i - 1]);
        }

        for (int i = 1; i <= n; i++) System.out.print(a[i] + " ");
    }
}