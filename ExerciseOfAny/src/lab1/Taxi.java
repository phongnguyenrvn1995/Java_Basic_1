package lab1;

public class Taxi extends Vehicle {
    private int numberOfSeat;
    private String companyTaxi;

    public static final String COM_MAILINH = "MAI LINH";
    public static final String COM_VINASUN = "VINASUN";
    public static final String COM_GRAB = "GRAB";
    public static final String COM_DIFF = "KHÁC";

    public static final int  T_4_SEAT = 4;
    public static final int  T_5_SEAT = 5;
    public static final int  T_7_SEAT = 7;
    public static final int  T_9_SEAT = 9;


    //super gọi tới tất cả các tham số trong contractor của lớp cha
    // contractor của lớp con có thể không cần đủ tham số nếu không cần dùng tới
    public Taxi(int id, String name, String company, int numberOfSeat, String companyTaxi) {
        super(id, name, Vehicle.TYPE_4_WHEEL, company);

        this.numberOfSeat = numberOfSeat;
        this.companyTaxi = companyTaxi;
    }

    //để tránh trường hợp Object gọi tới setType==> setType k bị ràng buộc 4 bánh từ lớp cha
    @Override
    public void setType(int type) {
        if (type == Vehicle.TYPE_4_WHEEL){
            super.setType(type);
        }
        else
            System.out.println("setType failed");
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

