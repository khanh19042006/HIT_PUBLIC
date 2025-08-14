package Bai2;

public class NhanVien {

    private String MaNV;
    private String ten;
    private int tuoi;
    private String email;
    private String  phoneNumber;

    public NhanVien(String maNV, String ten, int tuoi, String email, String phoneNumber) {
        MaNV = maNV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double TinhLuong(){
        return 0;
    }

    public void hienThiThongTin(){
        System.out.println("Mã nhân viên là: " + MaNV);
        System.out.println("Tên nhân viên là: " + ten);
        System.out.println("Tuổi nhân viên là: " + tuoi);
        System.out.println("Email nhân viên là: " + email);
        System.out.println("Số điện thoại nhân viên là: " + phoneNumber);
        System.out.println("Lương của nhân viên là: " + TinhLuong());
        System.out.println();
    }
}
