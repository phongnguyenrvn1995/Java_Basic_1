package lab1;

import java.util.ArrayList;

public class ListVehicle {
    public static ArrayList<Vehicle> danhSach() {
        ArrayList<Vehicle> list = new ArrayList<>();
        Vehicle vh1 = new Vehicle(1, "Future", Vehicle.TYPE_2_WHEEL, Vehicle.COM_HONDA);
        Vehicle vh2 = new Vehicle(2, "Ba gác", Vehicle.TYPE_3_WHEEL, Vehicle.COM_DIFF);
        Vehicle vh3 = new Vehicle(3, "Kia", Vehicle.TYPE_4_WHEEL, Vehicle.COM_DIFF);
        Vehicle vh4 = new Vehicle(4, "Mazda", Vehicle.TYPE_DIFF, Vehicle.COM_DIFF);
        Vehicle vh5 = new Vehicle(5, "CX Premium", Vehicle.TYPE_3_WHEEL, Vehicle.COM_TOYOTA);
        Vehicle vh6 = new Vehicle(6, "AC Luxury", Vehicle.TYPE_2_WHEEL, Vehicle.COM_FORD);
        Vehicle vh7 = new Vehicle(7, "FE5 Deluxe", Vehicle.TYPE_3_WHEEL, Vehicle.COM_MEC);
        Vehicle vh8 = new Vehicle(8, "Creato", Vehicle.TYPE_4_WHEEL, Vehicle.COM_TOYOTA);
        Vehicle vh9 = new Vehicle(9, "Wave", Vehicle.TYPE_DIFF, Vehicle.COM_HONDA);
        Vehicle vh10 = new Vehicle(10, "Exciter", Vehicle.TYPE_2_WHEEL, Vehicle.COM_FORD);
        Vehicle vh11 = new Vehicle(11, "Scooter", Vehicle.TYPE_3_WHEEL, Vehicle.COM_MEC);
        Vehicle vh12 = new Vehicle(12, "Moto", Vehicle.TYPE_3_WHEEL, Vehicle.COM_MEC);
        Vehicle vh13 = new Vehicle(13, "AB", Vehicle.TYPE_3_WHEEL, Vehicle.COM_TOYOTA);
        Vehicle vh14 = new Vehicle(14, "Jupiter", Vehicle.TYPE_DIFF, Vehicle.COM_FORD);
        Vehicle vh15 = new Vehicle(15, "Center", Vehicle.TYPE_2_WHEEL, Vehicle.COM_TOYOTA);
        Vehicle vh16 = new Vehicle(16, "Rum", Vehicle.TYPE_3_WHEEL, Vehicle.COM_HONDA);
        Vehicle vh17 = new Vehicle(17, "Gonzo", Vehicle.TYPE_3_WHEEL, Vehicle.COM_HONDA);
        Vehicle vh18 = new Vehicle(18, "Niva", Vehicle.TYPE_DIFF, Vehicle.COM_MEC);
        Vehicle vh19 = new Vehicle(19, "Sensor", Vehicle.TYPE_DIFF, Vehicle.COM_HONDA);
        Vehicle vh20 = new Vehicle(20, "Episode", Vehicle.TYPE_2_WHEEL, Vehicle.COM_FORD);
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
