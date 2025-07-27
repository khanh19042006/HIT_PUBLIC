import java.util.Scanner;

public class Bai2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Nhâp chuỗi: ");
        String text = sc.nextLine();
        if (check(text)) System.out.println("Chuỗi đối xứng: " + text.toUpperCase());
        else System.out.println("Chuỗi không đối xứng: " + text.toLowerCase());
    }

    public static boolean check(String a){
        int len = a.length() / 2;
        int lenfull = a.length() - 1;
        for (int i = 0; i <= len; i++){
            if (a.charAt(i) != a.charAt(lenfull - i)) return false;
        }
        return true;
    }
}