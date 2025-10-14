package Main;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        QuanLy manage = new QuanLy("", "");
        PhongMay phongMay = new PhongMay("19962016", "của Khánh", 19.2, manage, 2);
        phongMay.inputMay();


        System.out.println();
        System.out.println("Danh sách các máy: ");
        System.out.println("Phòng máy " + phongMay.getNameRoom() + " mã số phòng là: "
                + phongMay.getCodeRoom() + " với diện tích là: " + phongMay.getDienTich()
                + " số máy trong phòng là: " + phongMay.getN());

        System.out.println();
        for (int i = 1; i <= phongMay.getN(); i++){
            System.out.println("Máy \"" + phongMay.getListMay()[i].getNameMay()
                    + "\" mã số máy là: " + phongMay.getListMay()[i].getCodeMay()
                    + " tình trạng hiện tại của máy là: " + phongMay.getListMay()[i].getTinhTrang());
        }

    }
}