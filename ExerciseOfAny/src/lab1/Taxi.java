package lab1;

public class Taxi extends Vehicle {
    private int numberOfSeat;
    private String companyTaxi;

    public static final String COM_MAILINH="MAI LINH";
    public static final String COM_VINASUN="VINASUN";
    public static final String COM_GRAB="GRAB";
    public static final String COM_DIFF="KHÁC";

    public static final int  T_4_SEAT=4;
    public static final int  T_5_SEAT=5;
    public static final int  T_7_SEAT=7;
    public static final int  T_9_SEAT=9;


    //contractor của lớp cha có những param nào thì contractor con cũng phải có đủ
    public Taxi(int id, String name, int type, String company,int numberOfSeat, String companyTaxi) {
        super(id,name,type,company);
        setType(type);
        this.numberOfSeat = numberOfSeat;
        this.companyTaxi = companyTaxi;
    }

    @Override
    public void setType(int type) {
        super.setType(TYPE_4_WHEEL);
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
        switch (companyTaxi){
            case COM_MAILINH:
            case COM_VINASUN:
            case COM_GRAB:
            case COM_DIFF:
                this.companyTaxi = companyTaxi;
                break;
            default:
                System.out.println("setCompanyTaxi failed");
                break;
        }

    }
}

