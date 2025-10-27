import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[101];
        int tich = 0;
        int tong = 0;
        for (int i = 0; i < 100; i++){
            arr[i] = i;
            tich *= i;
            tong += i;
        }

        System.out.println("Tổng của mảng là: " + tong);
        System.out.println("Tích của mảng là: " + tich);

        System.out.print("Các số nguyên tố trong hàm là: ");
        for (int i = 1; i <= 100; i++){
            if (findnt(arr[i])) System.out.print(arr[i] + " ");
        }
    }

    public static boolean findnt(int x){
        if (x < 1) return false;
        if (x <= 2) return true;

        for (int i = 2; i <= Math.sqrt(x)+1; i++){
            if (x % i == 0) return false;
        }
        return true;
    }

}