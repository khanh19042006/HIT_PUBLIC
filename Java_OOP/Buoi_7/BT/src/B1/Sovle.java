package B1;

import java.util.ArrayList;

public class Sovle {
    private String text;

    public Sovle(String text) {
        this.text = text;
    }

    public Sovle(){
        this.text = "";
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int Sovle1(){
        String s = this.text;
        String a = "ueoai";
        int dem = 0;
        for (int i = 0; i <= s.length(); i++){
            for (int j = 0; j <= s.length(); j++){
                if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(a.charAt(j))){
                    dem += 1;
                    break;
                }
            }
        }
        return dem;
    }

    public int Sovle2(){
        String s = this.text;
        int dem = 0;
        for (int i = 0; i <= s.length(); i++){
            if (s.charAt(i) == Character.toUpperCase(s.charAt(i))) dem += 1;
        }
        return dem;
    }
}
