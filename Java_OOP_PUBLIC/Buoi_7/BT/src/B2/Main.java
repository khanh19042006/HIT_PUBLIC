package B2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        String input = "Y";
        System.out.println("Hãy nhập thông tin học sinh !");
        while (input.equalsIgnoreCase("Y")) {
            System.out.print("Nhập mã sinh viên: ");
            String id = sc.nextLine();
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            System.out.print("Nhập tuổi: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.print("Nhập địa chỉ email: ");
            String email = sc.nextLine();
            System.out.print("Nhập địa chỉ sinh viên: ");
            String address = sc.nextLine();
            System.out.print("Nhập điểm: ");
            double score = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập tên lớp: ");
            String nameClass = sc.nextLine();

            students.add(new Student(id, name, score, age, email, nameClass, address));

            System.out.println("Bạn muốn nhập tiếp chứ ? (Y/N)");
            input = sc.nextLine();
        }

        StudentManage studentManage = new StudentManage(students);
        while (true){
            System.out.println("=== QUẢN LÝ HỌC SINH ===");
            System.out.println("1: In ra danh sách học sinh");
            System.out.println("2: Sắp xếp theo điểm giảm dần");
            System.out.println("3: Sắp xếp theo điểm tăng dần");
            System.out.println("4: Tìm học sinh theo tên");
            System.out.println("5: Thoát");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(sc.nextLine());
            
            if (choose == 1){
                studentManage.printStudents();
            } else if (choose == 2) {
                studentManage.sortByScoreDesc();
                System.out.println("Thao tác thành công !");
            } else if (choose == 3) {
                studentManage.sortBySocreAsc();
                System.out.println("Thao tác thành công !");
            } else if (choose == 4) {
                System.out.print("Nhâp tên sinh viên muốn tìm: ");
                String name = sc.nextLine();

                ArrayList<Student> studentFind = new ArrayList<>();
                studentFind.add(studentManage.findByName(name));
                if (studentFind.get(0).getAge() == -1){
                    System.out.println();
                    continue;
                }
                StudentManage findStudent = new StudentManage(studentFind);

                findStudent.printStudents();
            } else if (choose == 5) {
                break;
            }
            else System.out.println("Cú pháp không hợp lệ !");
            System.out.println();
        }
    }
}
