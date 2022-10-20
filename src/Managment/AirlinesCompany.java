package Managment;

import java.util.ArrayList;
import java.util.List;

public class AirlinesCompany {
    public int id;
    public String name;
    public static List<Airplane> airplaneList; // ucaklarin listesi

    public static  List<Cruising> cruisingList; // ucusların listesi

    public Cruising cruising; // ucuşlar, seyahat

    static {
        airplaneList = new ArrayList<>();
        cruisingList = new ArrayList<>();
    }


    public AirlinesCompany(int id, String name, Cruising cruising) {
        this.id = id;
        this.name = name;
        this.cruising = cruising;

        addCruising(cruising);

    }

    public void addCruising(Cruising cruising) {
        cruisingList.add(cruising);
    }

    public static void infoCruising(int cruisingId) {
        boolean isTrue = false;
        for (Cruising c : cruisingList) {
            if (cruisingId == c.id) {
                isTrue = true;
                System.out.println(c.id + " numaralı ucus " + c.from.city + " sehrinden ---> " + c.to.city + " sehrine gitmektedir");
                System.out.println("ucusun bir numaralı pilotu : " + c.airplane.firstPilot.name);
                if (c.airplane.haveToPilotNumber == 2) {
                    System.out.println("ucusun iki numaralı pilotu : " + c.airplane.secondPilot.name);
                }
            }

        }
        if (isTrue == false) {
            System.out.println(cruisingId + " numarali ucus bulunamadi");
        }

    }
}
