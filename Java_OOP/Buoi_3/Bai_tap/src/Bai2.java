import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);
    static final double PI = 3.14159265;

    public static void main(String[] args){
        System.out.print("Nhap r va k: ");
        String s = sc.nextLine();
        int r = Integer.parseInt(s.charAt(0)+ "");
        int k = Integer.parseInt(s.charAt(2)+ "");


        System.out.println("Chu vi hinh tron = " + (2*r*PI));
        System.out.println("Dien tich hinh tron = " + (r*r*PI));
        System.out.println("r mu k = " + (Math.pow(r,k)));
        System.out.println("can bac 2 cua (r+k) = " + (Math.sqrt(r+k)));
        System.out.println("Gia tri tuyet doi cua (r-k) = " + (Math.abs(r-k)));
    }
}
