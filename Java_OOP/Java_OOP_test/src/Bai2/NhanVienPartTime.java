package Bai2;

public class NhanVienPartTime extends NhanVien{

    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(String maNV, String ten, int tuoi, String email, String phoneNumber, int soGioLam, double luongTheoGio) {
        super(maNV, ten, tuoi, email, phoneNumber);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double getLuongTheoGio() {
        return luongTheoGio;
    }

    public void setLuongTheoGio(double luongTheoGio) {
        this.luongTheoGio = luongTheoGio;
    }

    @Override
    public double TinhLuong(){
        return soGioLam * luongTheoGio;
    }

    @Override
    public void hienThiThongTin(){
        System.out.println("Mã nhân viên là: " + getMaNV());
        System.out.println("Tên nhân viên là: " + getTen());
        System.out.println("Tuổi nhân viên là: " + getTuoi());
        System.out.println("Email nhân viên là: " + getEmail());
        System.out.println("Số điện thoại nhân viên là: " + getPhoneNumber());
        System.out.println("Lương của nhân viên là: " + TinhLuong());
        System.out.println("Loại nhân viên là: PartTime");
        System.out.println();
    }
}
