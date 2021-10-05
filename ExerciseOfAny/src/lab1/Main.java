package lab1;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        // làm thao tác với db cần biến để hứng dữ liệu (tránh bị lỗi bất ngờ)
        ArrayList<Vehicle> list = ListVehicle.danhSach(); //list chuẩn
        //tạo list để chứa danh sách sau khi filter
        ArrayList<Vehicle> listHonda = Filter.filterCompany(list,Vehicle.COM_HONDA);
        //in ra danh sách đó
        for (int i = 0; i < listHonda.size(); i++){
            System.out.println(listHonda.get(i).getName() + " " + listHonda.get(i).getCompany());
        }
        //khai báo với ArrayList không định kiểu, khi dùng phải ép kiểu để gọi tới các method
        ArrayList<Vehicle> listToyota = Filter.filterCompany(list,Vehicle.COM_TOYOTA);
        for (int i = 0; i < listToyota.size(); i++){
            System.out.println(listToyota.get(i).getName() + " " + listToyota.get(i).getCompany());
        }
        System.out.println();
        ArrayList<Vehicle> list2Wheel = Filter.filterType(list,Vehicle.TYPE_2_WHEEL);
        for (int i = 0; i < list2Wheel.size(); i++){
            System.out.println(list2Wheel.get(i).getName() + " " + list2Wheel.get(i).getType());
        }
        System.out.println();
        ArrayList<Vehicle> list4Wheel = Filter.filterType(list, Vehicle.TYPE_4_WHEEL);
        for (int i = 0; i < list4Wheel.size(); i++){
            System.out.println(list4Wheel.get(i).getName() + " " +list4Wheel.get(i).getType());
        }
    }
}
