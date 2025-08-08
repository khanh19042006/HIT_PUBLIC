package Main;

public class Student {

    private String name;
    private String classStudent;
    private Double score;
    private Faculty y;

    public Student(String name, String Class, Double score, Faculty y) {
        this.name = name;
        this.classStudent = Class;
        this.score = score;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getclassStudent() {
        return classStudent;
    }

    public void setClass(String aClass) {
        this.classStudent = aClass;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
}
