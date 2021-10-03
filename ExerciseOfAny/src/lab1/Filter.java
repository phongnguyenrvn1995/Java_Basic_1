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

    public static void main(String[] args) {

//        ListVehicle.DanhSach();
//
//        int size=ListVehicle.DanhSach().size();

        for (int i = 0; i < ListVehicle.DanhSach().size(); i++) {
            System.out.println(filterCompany(ListVehicle.DanhSach(), "HONDA").get(i));
        }
        System.out.println();
        for (int i = 0; i < ListVehicle.DanhSach().size(); i++) {
            System.out.println(filterType(ListVehicle.DanhSach(), "3 bánh"));
        }

    }
}
