package Main;

import java.util.Scanner;

public class PhongMay {

    private String codeRoom;
    private String nameRoom;
    private double dienTich;
    private QuanLy manage;
    private May[] listMay;
    private int n;

    static Scanner sc = new Scanner(System.in);

    public PhongMay(String codeRoom, String nameRoom, double dienTich, QuanLy manage, int n) {
        this.codeRoom = codeRoom;
        this.nameRoom = nameRoom;
        this.dienTich = dienTich;
        this.manage = manage;
        this.n = n;
    }

    public String getCodeRoom() {
        return codeRoom;
    }

    public void setCodeRoom(String codeRoom) {
        this.codeRoom = codeRoom;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getManage() {
        return manage;
    }

    public void setManage(QuanLy manage) {
        this.manage = manage;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setListMay(May[] listMay) {
        this.listMay = listMay;
    }

    public May[] getListMay() {
        return listMay;
    }

    public void inputMay() {
        System.out.println("Hãy nhập thông tin của các máy !");
        this.listMay = new May[n + 10];

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhập mã máy " + i + ": ");
            String codeMay = sc.nextLine();
            System.out.print("Nhập tên máy " + i + ": ");
            String nameMay = sc.nextLine();
            System.out.print("Nhập tính trạng của máy " + i + ": ");
            String tinhTrang = sc.nextLine();

            this.listMay[i] = new May(codeMay, nameMay, tinhTrang);
            System.out.println();
        }
    }

    public void inputManage() {
        System.out.println("Nhập thông tin người quản lý !");
        System.out.print("Nhập mã quản lý: ");
        this.manage.setCodeManage(sc.nextLine());
        System.out.print("Nhập tên người quản lý: ");
        this.manage.setFullName(sc.nextLine());
    }

}
