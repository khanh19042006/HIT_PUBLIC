import java.util.Scanner;

public class Bai1{
    static Scanner sc = new Scanner(System.in);
    static int[] a = new int[100];

    public static void main(String[] args){
        int n = input();
        int sum_chan = 0;
        int sum_le = 0;
        int so_nt = 0;
        for (int i = 1; i <= n; i++){
            if (a[i] % 2 == 0){
                sum_chan += 1;
            }
            else{
                sum_le += 1;
            }
            if (check_nt(a[i])) so_nt += 1;
        }

        System.out.println("Tong so chan la: " + sum_chan);
        System.out.println("Tong so le la: " + sum_le);
        System.out.println("So cac so nguyen to la: " + so_nt);
    }

    public static int input(){
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        int j = 0;
        for (int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(s.charAt(j) + "");
            j += 2;
        }
        return n;
    }

    public static boolean check_nt(int n){
        if (n < 2) return false;
        else if (n == 2) return true;
        for (int i = 2; i <= (int)(Math.sqrt(n)+1); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
}