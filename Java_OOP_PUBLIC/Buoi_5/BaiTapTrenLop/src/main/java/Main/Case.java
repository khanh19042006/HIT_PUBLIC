package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Case {

    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;

    static int totalCages = 0;
    static final int MAX_CAPACITY = 3;
    static Scanner sc = new Scanner(System.in);

    public Case(String cageCode, ArrayList<Pet> pets) {
        this.cageCode = cageCode;
        this.pets = pets;
        this.currentPetCount = pets.size();
        totalCages += 1;
    }

    public String getCageCode() {
        return cageCode;
    }

    public void setCageCode(String cageCode) {
        this.cageCode = cageCode;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public int getCurrentPetCount() {
        return currentPetCount;
    }

    public void setCurrentPetCount(int currentPetCount) {
        this.currentPetCount = currentPetCount;
    }

    public static int getTotalCages() {
        return totalCages;
    }

    public static void setTotalCages(int totalCages) {
        Case.totalCages = totalCages;
    }



    public void addPet(){
        if (this.currentPetCount < MAX_CAPACITY){
            System.out.println("Hãy điền tên, cân nặng và loài thú muốn thêm !");
            String[] inforPet = sc.nextLine().split(" ");
            String name = inforPet[0];
            double weight = Double.parseDouble(inforPet[1]);
            String species = inforPet[2];

            Pet newPet = new Pet(name, weight, species);
            this.pets.add(newPet);
            this.currentPetCount += 1;
        }
    }

    public void printAllPets(){
        for (int i = 0; i < totalCages; i++){
            pets.get(i).printInfor();
        }
    }
}
