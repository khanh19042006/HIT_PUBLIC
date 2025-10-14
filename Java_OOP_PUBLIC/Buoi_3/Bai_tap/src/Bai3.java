import java.util.Scanner;

public class Bai3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String s = sc.nextLine().trim();
        s = " " + s;
        if (check(s)) System.out.println(s.substring(1,s.length()));
        else System.out.println("Khong doi xung");
    }

    public static boolean check(String s){
        int mid_len = (s.length()-1)/2+1;
        int len = s.length();

        for (int i = 1; i < mid_len; i++){
            if (s.charAt(i) != s.charAt(len-i)) return false;
        }
        return true;
    }
}
