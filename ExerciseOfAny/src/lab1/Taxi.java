package lab1;

public class Taxi extends Vehicle {
    private int numberOfSeat;
    private String companyTaxi;

    public static final String COM_MAILINH="MAI LINH";
    public static final String COM_VINASUN="VINASUN";
    public static final String COM_GRAB="GRAB";
    public static final String COM_DIFF="KHÁC";


    //contractor của lớp cha có những param nào thì contractor con cũng phải có đủ
    public Taxi(int id, String name, int type, String company,int numberOfSeat, String companyTaxi) {
        super(id,name,TYPE_4_WHEEL,company);
        this.numberOfSeat = numberOfSeat;
        this.companyTaxi = companyTaxi;
    }

    @Override
    public int getType() {
        return super.getType();
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getCompanyTaxi() {
        return companyTaxi;
    }

    public void setCompanyTaxi(String companyTaxi) {
        this.companyTaxi = companyTaxi;
    }
}

