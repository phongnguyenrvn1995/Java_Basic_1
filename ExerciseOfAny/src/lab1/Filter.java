package lab1;

import java.util.ArrayList;

public class Filter {
    public static ArrayList filterCompany(ArrayList<Vehicle> list, String company) {
        ArrayList<Vehicle> listCompany = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCompany().equalsIgnoreCase(company)) {
                listCompany.add(list.get(i));
            }
        }
        return listCompany;
    }

    public static ArrayList filterType(ArrayList<Vehicle> list, String type) {
        ArrayList<Vehicle> listType = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCompany().equalsIgnoreCase(type)) {
                listType.add(list.get(i));
            }
        }
        return listType;
    }


}
