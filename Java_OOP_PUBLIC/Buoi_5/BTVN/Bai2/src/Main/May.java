package Main;

public class May {
    private String codeMay;
    private String nameMay;
    private String tinhTrang;

    public May(String codeMay, String nameMay, String tinhTrang) {
        this.codeMay = codeMay;
        this.nameMay = nameMay;
        this.tinhTrang = tinhTrang;
    }

    public String getCodeMay() {
        return codeMay;
    }

    public void setCodeMay(String codeMay) {
        this.codeMay = codeMay;
    }

    public String getNameMay() {
        return nameMay;
    }

    public void setNameMay(String nameMay) {
        this.nameMay = nameMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
