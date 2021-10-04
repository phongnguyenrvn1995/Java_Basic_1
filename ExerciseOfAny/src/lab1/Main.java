package lab1;

import static lab1.Filter.filterCompany;
import static lab1.Filter.filterType;

public class Main {
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
