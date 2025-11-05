public class SaleStaff extends Employee{

    private int numbersOfSale;

    public SaleStaff() {}

    public SaleStaff(String name, String country, double salary, int numbersOfSale) {
        super(name, country, salary);
        this.numbersOfSale = numbersOfSale;
    }

    public int getNumbersOfSale() {
        return numbersOfSale;
    }

    public void setNumbersOfSale(int numbersOfSale) {
        this.numbersOfSale = numbersOfSale;
    }

    public void SaleStaff(int numbersOfSale) {}
}
