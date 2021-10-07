package lab1;

import java.util.ArrayList;

public class ListTaxi {
    public static ArrayList<Taxi> listTaxi() {
        ArrayList<Taxi> list = new ArrayList<>();
        list.add(new Taxi(21, "Rum", Vehicle.COM_HONDA, Taxi.T_4_SEAT, Taxi.COM_GRAB));
        list.add(new Taxi(22, "Jet star", Vehicle.COM_TOYOTA, Taxi.T_5_SEAT, Taxi.COM_DIFF));
        list.add(new Taxi(23, "Amex", Vehicle.COM_FORD, Taxi.T_9_SEAT, Taxi.COM_MAILINH));
        list.add(new Taxi(24, "Jupiter", Vehicle.COM_DIFF, Taxi.T_7_SEAT, Taxi.COM_GRAB));
        list.add(new Taxi(25, "BWX", Vehicle.COM_MEC, Taxi.T_9_SEAT, Taxi.COM_VINASUN));
        list.add(new Taxi(26, "Kia", Vehicle.COM_HONDA, Taxi.T_9_SEAT, Taxi.COM_DIFF));
        list.add(new Taxi(27, "Platinum", Vehicle.COM_MEC, Taxi.T_9_SEAT, Taxi.COM_GRAB));
        list.add(new Taxi(28, "Titanium", Vehicle.COM_DIFF, Taxi.T_7_SEAT, Taxi.COM_MAILINH));
        list.add(new Taxi(29, "Sliver", Vehicle.COM_TOYOTA, Taxi.T_7_SEAT, Taxi.COM_VINASUN));
        list.add(new Taxi(30, "Gold", Vehicle.COM_HONDA, Taxi.T_5_SEAT, Taxi.COM_MAILINH));
        list.add(new Taxi(31, "Janet", Vehicle.COM_DIFF, Taxi.T_9_SEAT, Taxi.COM_GRAB));
        list.add(new Taxi(32, "Ryo", Vehicle.COM_FORD, Taxi.T_4_SEAT, Taxi.COM_VINASUN));
        list.add(new Taxi(33, "Mazada", Vehicle.COM_TOYOTA, Taxi.T_7_SEAT, Taxi.COM_MAILINH));
        list.add(new Taxi(34, "Sun", Vehicle.COM_MEC, Taxi.T_4_SEAT, Taxi.COM_DIFF));
        list.add(new Taxi(35, "Andie", Vehicle.COM_MEC, Taxi.T_4_SEAT, Taxi.COM_MAILINH));
        list.add(new Taxi(36, "Yakia", Vehicle.COM_TOYOTA, Taxi.T_5_SEAT, Taxi.COM_VINASUN));
        list.add(new Taxi(40, "Top", Vehicle.COM_FORD, Taxi.T_7_SEAT, Taxi.COM_VINASUN));
        list.add(new Taxi(37, "Ten", Vehicle.COM_HONDA, Taxi.T_9_SEAT, Taxi.COM_VINASUN));
        list.add(new Taxi(38, "Master", Vehicle.COM_DIFF, Taxi.T_7_SEAT, Taxi.COM_DIFF));
        list.add(new Taxi(39, "Wigo", Vehicle.COM_MEC, Taxi.T_5_SEAT, Taxi.COM_GRAB));

        return list;
    }

}
