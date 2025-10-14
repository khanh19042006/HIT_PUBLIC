package Tools;

public class Student {
    private String name;
    private  int birthday;
    private String addres;
    private float tx1;
    private float tx2;
    private float kthp;
    private int so_tiet_nghi;

    public Student(String name, int birthday, String addres, float tx1, float tx2, float kthp, int so_tiet_nghi){
        this.name = name;
        this.birthday = birthday;
        this.addres = addres;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.kthp = kthp;
        this.so_tiet_nghi = so_tiet_nghi;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return addres;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getSo_tiet_nghi() {
        return so_tiet_nghi;
    }

    public float getTx1() {
        return tx1;
    }

    public float getTx2() {
        return tx2;
    }

    public float getKthp() {
        return kthp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public void setTx1(float tx1) {
        this.tx1 = tx1;
    }

    public void setTx2(float tx2) {
        this.tx2 = tx2;
    }

    public void setKthp(float kthp) {
        this.kthp = kthp;
    }

    public void setSo_tiet_nghi(int so_tiet_nghi) {
        this.so_tiet_nghi = so_tiet_nghi;
    }
}
