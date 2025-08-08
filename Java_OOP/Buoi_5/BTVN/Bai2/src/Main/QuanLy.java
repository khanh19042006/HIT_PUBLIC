package Main;

import java.util.Scanner;

public class QuanLy {

    private String codeManage;
    private String fullName;

    static Scanner sc = new Scanner(System.in);

    public QuanLy(String codeManage, String fullName) {
        this.codeManage = codeManage;
        this.fullName = fullName;
    }

    public String getCodeManage() {
        return codeManage;
    }

    public void setCodeManage(String codeManage) {
        this.codeManage = codeManage;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
