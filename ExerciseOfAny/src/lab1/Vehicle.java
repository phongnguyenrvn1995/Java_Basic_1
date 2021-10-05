package lab1;

public class Vehicle {
    //const
    public static final int TYPE_2_WHEEL = 2;
    public static final int TYPE_3_WHEEL = 3;
    public static final int TYPE_4_WHEEL = 4;
    public static final int TYPE_DIFF = 0;

    public static final String COM_TOYOTA = "TOYOTA";
    public static final String COM_HONDA = "HONDA";
    public static final String COM_FORD = "FORD";
    public static final String COM_MEC = "MEC";
    public static final String COM_DIFF = "KHÁC";
    //end const

    private int id;
    private String name;
    private int type;//thay sang kiểu int -> đưa các loại ra const
    private String company;


    public Vehicle(int id, String name, int type, String company) {
        this.id = id;
        this.name = name;
//        this.type = type;
        setType(type);
//        this.company = company;
        setCompany(company);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        if (type != TYPE_2_WHEEL && type != TYPE_3_WHEEL && type != TYPE_4_WHEEL && type != TYPE_DIFF) {
            System.out.println("set type fail");
        } else
            this.type = type;

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        /*if (company != COM_DIFF && company != COM_FORD && company != COM_HONDA && company != COM_MEC && company != COM_TOYOTA){
            System.out.println("set company failed");
        } else
            this.company = company;*/
        switch (company){
            case COM_DIFF:
            case COM_FORD:
            case COM_HONDA:
            case COM_MEC:
            case COM_TOYOTA:
                this.company = company;
                break;
            default:
                System.out.println("set company failed");
                break;

        }
    }


}
