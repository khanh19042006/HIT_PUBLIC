import java.util.ArrayList;

public class Manager extends Employee{

    private ArrayList<SaleStaff> SaleStaffs = new ArrayList<>();
    private ArrayList<Technician> Technicians = new ArrayList<>();

    public Manager(String name, String country, double salary, ArrayList<SaleStaff> saleStaffs, ArrayList<Technician> technicians) {
        super(name, country, salary);
        SaleStaffs = saleStaffs;
        Technicians = technicians;
    }

    public ArrayList<SaleStaff> getSaleStaffs() {
        return SaleStaffs;
    }

    public void setSaleStaffs(ArrayList<SaleStaff> saleStaffs) {
        SaleStaffs = saleStaffs;
    }

    public ArrayList<Technician> getTechnicians() {
        return Technicians;
    }

    public void setTechnicians(ArrayList<Technician> technicians) {
        Technicians = technicians;
    }

    public SaleStaff getSaleStaffById(int saleStaffId){
        for (SaleStaff i : this.SaleStaffs){
            if (i.getId() == saleStaffId){
                return i;
            }
        }
        return new SaleStaff();
    }

    public Technician getTechnicianById(int technicianId) {
        for (Technician i : this.Technicians) {
            if (i.getId() == technicianId) {
                return i;
            }
        }
        return new Technician();
    }
}
