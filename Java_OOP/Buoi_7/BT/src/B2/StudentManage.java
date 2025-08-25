package B2;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManage implements StudentManageInterface {
    private ArrayList<Student> listStudents = new ArrayList<>();

    public StudentManage(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    @Override
    public void sortByScoreDesc() {
        this.listStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getScore(),o1.getScore());
            }
        });
    }

    @Override
    public void sortBySocreAsc() {
        this.listStudents.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getScore(), o2.getScore());
            }
        });
    }

    @Override
    public Student findByName(String name) {
        for (int x = 0; x < this.listStudents.size(); x++){
            String name2 = this.listStudents.get(x).getName();

            int check = name.length();
            for (int i = 0; i < name.length(); i++) {
                int id = 0;
                for (int j = id; j < name2.length(); j++) {
                    if (Character.toLowerCase(name.charAt(i)) == Character.toLowerCase(name2.charAt(j))) {
                        check -= 1;
                        id = j + 1;
                        break;
                    }
                }
            }
            if (check == 0) return this.listStudents.get(x);
        }
        System.out.println("Không thấy kết quả hợp lệ !");
        return new Student();
    }

    @Override
    public void printStudents() {
        for (int i = 0; i < this.listStudents.size(); i++){
            System.out.println("ID: " + this.listStudents.get(i).getId());
            System.out.println("Name: " + this.listStudents.get(i).getName());
            System.out.println("Age: " + this.listStudents.get(i).getAge());
            System.out.println("Email: " + this.listStudents.get(i).getEmail());
            System.out.println("Class: " + this.listStudents.get(i).getClassName());
            System.out.println("Address: " + this.listStudents.get(i).getAddress());
            System.out.println("Score: " + this.listStudents.get(i).getScore());
            System.out.println("Grade: " + this.listStudents.get(i).getGrade());
        }
    }
}
