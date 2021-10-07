package lab1;

import java.util.ArrayList;

public class SearchTaxi {
    public static ArrayList<Taxi> searchSeat(ArrayList<Taxi> list, int numberOfSeat) {
        ArrayList<Taxi> listSeat = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumberOfSeat() == numberOfSeat) {
                listSeat.add(list.get(i));
            }
        }
        return listSeat;
    }

    public static ArrayList<Taxi> searchCompayTaxi(ArrayList<Taxi> list, String companyTaxi) {
        ArrayList<Taxi> listCompanytaxi = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCompanyTaxi().equals(companyTaxi)) {
                listCompanytaxi.add(list.get(i));
            }
        }
        return listCompanytaxi;
    }

    public static ArrayList<Taxi> searchCompanySeat(ArrayList<Taxi> list, String companyTaxi, int numberOfSeat) {
        ArrayList<Taxi> listCompanySeat = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCompanyTaxi().equals(companyTaxi) || list.get(i).getNumberOfSeat() == numberOfSeat) {
                listCompanySeat.add(list.get(i));
            }
        }
        return listCompanySeat;
    }
}
