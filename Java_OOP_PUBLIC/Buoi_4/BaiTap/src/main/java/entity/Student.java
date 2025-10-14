package entity;

public class Student {
    private String name;
    private int age;

    public Student(String names, int ages){
        this.name = names;
        this.age = ages;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Xin chao, toi ten la " + name + ", nam nay toi " + age + " tuoi");
    }
}
