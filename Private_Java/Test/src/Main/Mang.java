package Main;

import java.util.ArrayList;

public class Mang {
    String[] arr = new String[5];

    public Mang(String[] arr) {
        this.arr = arr;
    }

    public void print(){
        for (int i = 0; i < 5; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}
