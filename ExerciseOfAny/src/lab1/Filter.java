package lab1;

import java.util.ArrayList;

public class Filter {
    public static ArrayList<Vehicle> filterCompany(ArrayList<Vehicle> list, String company) {
        ArrayList<Vehicle> listCompany = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCompany().equals(company)) {
                listCompany.add(list.get(i));
            }
        }
        return listCompany;
    }

    public static ArrayList<Vehicle> filterType(ArrayList<Vehicle> list, int type) {
        ArrayList<Vehicle> listType = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getType() == type) {
                listType.add(list.get(i));
            }
        }
        return listType;
    }


}
