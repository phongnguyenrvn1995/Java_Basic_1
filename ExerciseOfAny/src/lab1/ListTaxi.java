package lab1;

import java.util.ArrayList;

public class ListTaxi {
    public static ArrayList<Taxi> listTaxi() {
        ArrayList<Taxi> list = new ArrayList<>();
        Taxi taxi1 = new Taxi(21, "Rum", Vehicle.TYPE_4_WHEEL, Vehicle.COM_HONDA, Taxi.T_4_SEAT, Taxi.COM_GRAB);
        Taxi taxi2 = new Taxi(22, "Jet star", Vehicle.TYPE_4_WHEEL, Vehicle.COM_TOYOTA, Taxi.T_5_SEAT, Taxi.COM_DIFF);
        Taxi taxi3 = new Taxi(23, "Amex", Vehicle.TYPE_4_WHEEL, Vehicle.COM_FORD, Taxi.T_9_SEAT, Taxi.COM_MAILINH);
        Taxi taxi4 = new Taxi(24, "Jupiter", Vehicle.TYPE_4_WHEEL, Vehicle.COM_DIFF, Taxi.T_7_SEAT, Taxi.COM_GRAB);
        Taxi taxi5 = new Taxi(25, "BWX", Vehicle.TYPE_4_WHEEL, Vehicle.COM_MEC, Taxi.T_9_SEAT, Taxi.COM_VINASUN);
        Taxi taxi6 = new Taxi(26, "Kia", Vehicle.TYPE_4_WHEEL, Vehicle.COM_HONDA, Taxi.T_9_SEAT, Taxi.COM_DIFF);
        Taxi taxi7 = new Taxi(27, "Platinum", Vehicle.TYPE_4_WHEEL, Vehicle.COM_MEC, Taxi.T_9_SEAT, Taxi.COM_GRAB);
        Taxi taxi8 = new Taxi(28, "Titanium", Vehicle.TYPE_4_WHEEL, Vehicle.COM_DIFF, Taxi.T_7_SEAT, Taxi.COM_MAILINH);
        Taxi taxi9 = new Taxi(29, "Sliver", Vehicle.TYPE_4_WHEEL, Vehicle.COM_TOYOTA, Taxi.T_7_SEAT, Taxi.COM_VINASUN);
        Taxi taxi10 = new Taxi(30, "Gold", Vehicle.TYPE_4_WHEEL, Vehicle.COM_HONDA, Taxi.T_5_SEAT, Taxi.COM_MAILINH);
        Taxi taxi11 = new Taxi(31, "Janet", Vehicle.TYPE_4_WHEEL, Vehicle.COM_DIFF, Taxi.T_9_SEAT, Taxi.COM_GRAB);
        Taxi taxi12 = new Taxi(32, "Ryo", Vehicle.TYPE_4_WHEEL, Vehicle.COM_FORD, Taxi.T_4_SEAT, Taxi.COM_VINASUN);
        Taxi taxi13 = new Taxi(33, "Mazada", Vehicle.TYPE_4_WHEEL, Vehicle.COM_TOYOTA, Taxi.T_7_SEAT, Taxi.COM_MAILINH);
        Taxi taxi14 = new Taxi(34, "Sun", Vehicle.TYPE_4_WHEEL, Vehicle.COM_MEC, Taxi.T_4_SEAT, Taxi.COM_DIFF);
        Taxi taxi15 = new Taxi(35, "Andie", Vehicle.TYPE_4_WHEEL, Vehicle.COM_MEC, Taxi.T_4_SEAT, Taxi.COM_MAILINH);
        Taxi taxi16 = new Taxi(36, "Yakia", Vehicle.TYPE_4_WHEEL, Vehicle.COM_TOYOTA, Taxi.T_5_SEAT, Taxi.COM_VINASUN);
        Taxi taxi20 = new Taxi(40, "Top", Vehicle.TYPE_4_WHEEL, Vehicle.COM_FORD, Taxi.T_7_SEAT, Taxi.COM_VINASUN);
        Taxi taxi17 = new Taxi(37, "Ten", Vehicle.TYPE_4_WHEEL, Vehicle.COM_HONDA, Taxi.T_9_SEAT, Taxi.COM_VINASUN);
        Taxi taxi18 = new Taxi(38, "Master", Vehicle.TYPE_4_WHEEL, Vehicle.COM_DIFF, Taxi.T_7_SEAT, Taxi.COM_DIFF);
        Taxi taxi19 = new Taxi(39, "Wigo", Vehicle.TYPE_4_WHEEL, Vehicle.COM_MEC, Taxi.T_5_SEAT, Taxi.COM_GRAB);

        list.add(taxi1);
        list.add(taxi2);
        list.add(taxi3);
        list.add(taxi4);
        list.add(taxi5);
        list.add(taxi6);
        list.add(taxi7);
        list.add(taxi8);
        list.add(taxi9);
        list.add(taxi10);
        list.add(taxi11);
        list.add(taxi12);
        list.add(taxi13);
        list.add(taxi14);
        list.add(taxi15);
        list.add(taxi16);
        list.add(taxi17);
        list.add(taxi18);
        list.add(taxi19);
        list.add(taxi20);
        return list;
    }

}
