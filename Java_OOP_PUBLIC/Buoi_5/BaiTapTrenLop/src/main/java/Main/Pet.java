package Main;

public class Pet {

    private String name;
    private double weight;
    private String species;

    public Pet(String name, double weight, String species) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void printInfor(){
        System.out.println("Tên động vật là: " + name);
        System.out.println("Tên loài là: " + species);
        System.out.println("Cân nặng của nó là: " + weight);
        System.out.println();
    }

    public boolean isOverWeight(){
        if (weight > 10) return true;
        return false;
    }

    public String getBasicInfor(){
        return  name + " " + species;
    }
}
