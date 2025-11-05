public class Technician extends Employee{

    private String techSkill;

    public Technician() {}

    public Technician(String name, String country, double salary, String techSkill) {
        super(name, country, salary);
        this.techSkill = techSkill;
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }
}
