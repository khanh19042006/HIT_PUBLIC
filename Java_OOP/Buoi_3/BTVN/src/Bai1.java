import java.util.Scanner;

public class Bai1 {
    static Scanner sc = new Scanner(System.in);
    static final int square = 1;
    static final int triangle = 2;
    static final int circle = 3;

    public static void main(String[] args) {
        ThongBao();
        int chosse = Integer.parseInt(sc.nextLine());
        if (chosse == 1){
            System.out.print("Nhập độ dài cạnh: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Diện tích hình vuông là: " + Vuong(a));
        }else if (chosse == 2) {
            System.out.print("Nhập độ dài 3 cạnh tam giác: ");
            String[] read = sc.nextLine().split(" ");
            int a = Integer.parseInt(read[0]);
            int b = Integer.parseInt(read[1]);
            int c = Integer.parseInt(read[2]);
            if (TamGiac(a,b,c) == -1) System.out.println("Số liệu không hợp lệ !");
            System.out.println("Diện tích hình tam giác là: " + TamGiac(a,b,c));
        } else if (chosse == 3) {
            System.out.print("Nhập bán kính hình tròn: ");
            int r = Integer.parseInt(sc.nextLine());
            System.out.println("Diện tích hình tròn là: " + Tron(r));
        }
        else {
            System.out.println("Cú pháp không hợp lệ !");
        }
    }

    public static void ThongBao() {
        System.out.println("1 là hình vuông");
        System.out.println("2 là hình tam giác");
        System.out.println("3 là hình tròn");
        System.out.print("Hãy nhập số: ");
    }

    public static double Vuong(int a) {
        return a * a;
    }

    public static double TamGiac(int a, int b, int c) {
        int tong = a+b+c;
        int max = Math.max(a, Math.max(b,c));
        if (tong - max <= max) return -1;
        double p = tong / 2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static double Tron(int r) {
        double pi = Math.PI;
        return r*r*pi;
    }
}
