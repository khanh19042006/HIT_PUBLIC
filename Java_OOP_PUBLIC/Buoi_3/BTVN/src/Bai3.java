import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int a = (int)(Math.random()*100) + 1;
        int b = (int)(Math.random()*100) + 1;
        int c = (int)(Math.random()*200) + 1;
        System.out.println(a + " + " + b + " = " + c);
        System.out.println("Đây là phép tính đúng ? (Y/N)");
        String text = sc.nextLine();
        boolean kt = check(a,b,c);
        if ((text.equalsIgnoreCase("Y") && kt) || (text.equalsIgnoreCase("N") && (!kt))) System.out.println("Bạn đã trả lời đúng !");
        else System.out.println("Bạn đã trả lời sai ;-;");
    }

    public static boolean check(int a, int b, int c){
        if (a + b == c) return true;
        return false;
    }
}
