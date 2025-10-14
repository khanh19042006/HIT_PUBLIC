import java.util.Scanner;

public class Bai4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(fibo(n));
    }

    public static int fibo (int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;

        return fibo(n-1) + fibo(n-2);
    }
}
