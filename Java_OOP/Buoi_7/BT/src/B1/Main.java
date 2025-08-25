package B1;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String s = sc.nextLine();
        Sovle sovle = new Sovle(s);
        System.out.println(sovle.Sovle1());
        System.out.println(sovle.Sovle2());
    }
}