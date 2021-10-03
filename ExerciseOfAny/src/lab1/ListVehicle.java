package lab1;

import java.util.ArrayList;

public class ListVehicle {
    public static ArrayList<Vehicle> DanhSach() {
        ArrayList<Vehicle> list = new ArrayList<>();
        Vehicle vh1 = new Vehicle(1, "Future", "2 bánh", "HONDA");
        Vehicle vh2 = new Vehicle(2, "Ba gác", "3 bánh", "khác");
        Vehicle vh3 = new Vehicle(3, "Kia", "4 bánh", "khác");
        Vehicle vh4 = new Vehicle(4, "Mazda", "khác", "khác");
        Vehicle vh5 = new Vehicle(5, "CX Premium", "3 bánh", "TOYOTA");
        Vehicle vh6 = new Vehicle(6, "AC Luxury", "2 bánh", "FORD");
        Vehicle vh7 = new Vehicle(7, "FE5 Deluxe", "3 bánh", "MEC");
        Vehicle vh8 = new Vehicle(8, "Creato", "4 bánh", "TOYOTA");
        Vehicle vh9 = new Vehicle(9, "Wave", "khác", "HONDA");
        Vehicle vh10 = new Vehicle(10, "Exciter", "2 bánh", "FORD");
        Vehicle vh11 = new Vehicle(11, "Scooter", "3 bánh", "MEC");
        Vehicle vh12 = new Vehicle(12, "Moto", "2 bánh", "MEC");
        Vehicle vh13 = new Vehicle(13, "AB", "4 bánh", "TOYOTA");
        Vehicle vh14 = new Vehicle(14, "Jupiter", "khác", "FORD");
        Vehicle vh15 = new Vehicle(15, "Center", "2 bánh", "TOYOTA");
        Vehicle vh16 = new Vehicle(16, "Rum", "3 bánh", "HONDA");
        Vehicle vh17 = new Vehicle(17, "Gonzo", "4 bánh", "HONDA");
        Vehicle vh18 = new Vehicle(18, "Niva", "khác", "MEC");
        Vehicle vh19 = new Vehicle(19, "Sensor", "6 bánh", "HONDA");
        Vehicle vh20 = new Vehicle(20, "Episode", "2 bánh", "FORD");
        list.add(vh1);
        list.add(vh2);
        list.add(vh3);
        list.add(vh4);
        list.add(vh5);
        list.add(vh6);
        list.add(vh7);
        list.add(vh8);
        list.add(vh9);
        list.add(vh10);
        list.add(vh11);
        list.add(vh12);
        list.add(vh13);
        list.add(vh14);
        list.add(vh15);
        list.add(vh16);
        list.add(vh17);
        list.add(vh18);
        list.add(vh19);
        list.add(vh20);

//        System.out.println(list.get(4).getType());
        return list;
    }


}
