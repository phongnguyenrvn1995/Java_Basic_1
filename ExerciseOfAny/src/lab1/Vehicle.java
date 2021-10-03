package lab1;

public class Vehicle {
    private int ID;
    private String name;
    private String type;
    private String company;


    public Vehicle(int ID, String name, String type, String company) {
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.company = company;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {

        this.type = type;

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {

        this.company = company;


    }


}
