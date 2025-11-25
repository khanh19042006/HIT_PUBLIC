import model.Employee;
import service.IEmployeeService;
import service.IEmployeeServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----- Menu -----\n" +
                "1. In ra danh sách tất cả các nhân viên\n" +
                "2. In ra thông tin nhiên viên theo ID\n" +
                "3. Lọc ra danh sách nhân viên theo Tên \n" +
                "4. Thoát");
        int choose = 0;
        IEmployeeServiceImpl ds = new IEmployeeServiceImpl(new ArrayList<Employee>());

        while (choose != 4) {
            System.out.print("Nhập lựa chọn của bạn: ");
            choose = Integer.parseInt(sc.nextLine());

            if (choose == 1) {
                for (Employee i : ds.getAllEmployee()){
                    i.toString();
                }
                System.out.println("Xong !");
                System.out.println();

            } else if (choose == 2) {
                System.out.print("Nhập ID: ");
                String id = sc.nextLine();
                Employee newE = ds.getEmployeeById(id);
                newE.toString();

            } else if (choose == 3) {
                System.out.print("Nhập tên: ");
                String name = sc.nextLine();
                ArrayList<Employee> newds = ds.getEmployeeByName(name);
                for (Employee i : newds) i.toString();

            }else {
                System.out.println("Nhập sai thao tác, hãy nhập lại !");
            }
        }
    }
}