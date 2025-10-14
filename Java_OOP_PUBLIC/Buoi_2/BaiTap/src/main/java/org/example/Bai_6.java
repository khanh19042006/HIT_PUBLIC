import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sl = sc.nextInt();
        sc.nextLine();
        double tb = 0;
        double max = 0;
        String[][] ds = new String[sl+1][3];

        for (int i = 1; i <= sl; i++){
            System.out.print("Nhap ten, tuoi va diem: ");
            String[] s = sc.nextLine().split(" ");
            Student stu = new Student();

            stu.name = s[0];
            stu.age = Integer.parseInt(s[1]);
            stu.gpa = Double.parseDouble(s[2]);

            tb += stu.gpa;
            max = Math.max(max, stu.gpa);

            ds[i][0] = stu.name;
            ds[i][1] = String.valueOf(stu.age);
            ds[i][2] = String.valueOf(stu.gpa);
        }
        tb /= sl;

        for (int i = 1; i <= sl; i++){
            System.out.println(ds[i][0] + " " + ds[i][1] + " tuoi va " + ds[i][2] + " diem");
        }
        System.out.println("Diem trung binh lop la: " + tb);
        System.out.println("Diem cao nhat lop la: " + max);
    }
}

class Student{
    String name;
    int age;
    double gpa;
}