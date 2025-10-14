package Main;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void  main(String[] args){
        School school = new School("Haui", "2024");
        Faculty[] listFaculty = new Faculty[3];
        listFaculty[1] = new Faculty("CNTT", "2024", school);
        listFaculty[2] = new Faculty("NNA", "2024", school);

        System.out.println("Cần nhập bao nhiêu học sinh ?");
        int n = Integer.parseInt(sc.nextLine());
        Student[] listStudent = new Student[n+10];

        System.out.println("Hãy nhập thông tin học sinh !");
        System.out.println("Thông tin học sinh bao gồm Tên, Lớp, Điểm, Mã số ngành học");
        System.out.println("Mã số ngành học:");
        System.out.println("1: CNTT");
        System.out.println("2: NNA");
        for (int i = 1; i <= n; i++){
            String[] inputInformation = sc.nextLine().split(" ");
            String name = inputInformation[0];
            String classStudent = inputInformation[1];
            double score = Double.parseDouble(inputInformation[2]);
            int codeFaculty = Integer.parseInt(inputInformation[3]);

            Faculty faculty;
            if (codeFaculty == 1){
                faculty = listFaculty[1];
            } else if (codeFaculty == 2) {
                faculty = listFaculty[2];
            }
            else{
                System.out.println("Mã ngành không hợp lệ !");
                continue;
            }

            listStudent[i] = new Student(name, classStudent, score, faculty);
        }

        System.out.println();
        System.out.println("Danh sách sinh viên:");
        for (int i = 1; i <= n; i++){
            System.out.println(listStudent[i].getName() + " Lớp:" + listStudent[i].getclassStudent()
                    + " Điểm:" + listStudent[i].getScore() + " Ngành: " + listStudent[i].getY().getName()
                    + " Vào ngành năm:" + listStudent[i].getY().getDate()
                    + " Trường:" + listStudent[i].getY().getX().getName() + " Vào trường năm:"
                    + listStudent[i].getY().getX().getDate());
        }
    }
}