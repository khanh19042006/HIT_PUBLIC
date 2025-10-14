package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int overWeight = 10;

    public static void main(String[] args) {
        ArrayList<Pet> makePets = new ArrayList<>();
        Case case1 = new Case("2024611098", makePets);
        Case case2 = new Case("2019611098", makePets);
        ArrayList<Pet> petsIsOverWeight = new ArrayList<>();

        String check = "Y";

        while (check.equalsIgnoreCase("Y")){
            System.out.println("Hãy chọn mã lồng muốn thêm");
            System.out.println("1: 2024611098");
            System.out.println("2: 2019611098");
            int userChoose = Integer.parseInt(sc.nextLine());

            if (userChoose == 1){
                System.out.println("Bạn muốn thêm bao nhiêu thú cưng ?");
                int currentPet = Integer.parseInt(sc.nextLine());
                if (currentPet + case1.getCurrentPetCount() > Case.MAX_CAPACITY){
                    System.out.println("Quá số thú tối đa rồi !");
                }
                else{
                    for (int i = 1; i <= currentPet; i++){
                        case1.addPet();
                    }
                }
            }
            else if (userChoose == 2){
                System.out.println("Bạn muốn thêm bao nhiêu thú cưng ?");
                int currentPet = Integer.parseInt(sc.nextLine());
                if (currentPet + case2.getCurrentPetCount() > Case.MAX_CAPACITY){
                    System.out.println("Quá số thú tối đa rồi !");
                }
                else{
                    for (int i = 1; i <= currentPet; i++){
                        case2.addPet();
                    }
                }
            }
            else System.out.println("Mã số không hợp lệ !");

            System.out.println("Bạn muốn thêm thú cưng vào lồng chứ ? (Y/N)");
            check = sc.nextLine();
        }

        System.out.println("Số lồng đã tạo là: " + Case.totalCages);

        //In ra danh sách thú trong lồng 1
        System.out.println("Đây là danh sách các thú trong lồng 1:");
        for (int i = 0; i < case1.getCurrentPetCount(); i++){
            case1.getPets().get(i).printInfor();
            if (case1.getPets().get(i).getWeight() > overWeight){
                petsIsOverWeight.add(case1.getPets().get(i));
            }
        }

        //In ra danh sách thú trong lồng 2
        System.out.println("Đây là danh sách các thú trong lồng 2");
        for (int i = 0; i < case2.getCurrentPetCount(); i++){
                case2.getPets().get(i).printInfor();
                if (case2.getPets().get(i).getWeight() > overWeight){
                    petsIsOverWeight.add(case2.getPets().get(i));
                }
        }
    }
}