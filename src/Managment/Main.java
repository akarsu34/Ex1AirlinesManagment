package Managment;

public class Main   {
    public static void main(String[] args) {

        FirstPilot firstPilot1   = new FirstPilot(1,"Kemal Uncu");
        FirstPilot firstPilot2   = new FirstPilot(2,"Ahmet Batmaz ");
        SecondPilot secondPilot1 = new SecondPilot(3, "Mehmet Kaya");
        SecondPilot secondPilot2 = new SecondPilot(4, "Zeynep Atmaca");

        Airplane boing  = new Airplane(2,2,true,firstPilot1,secondPilot1);
        Airplane airbus = new Airplane(1,1,true,firstPilot2,secondPilot2);

        Airport istabulAirport = new Airport(345,"Istanbul");
        Airport ankaraAirport  = new Airport(123,"Ankara");
        Airport izmirAirport   = new Airport(334,"Izmir");

        Cruising cruising1 = new Cruising(istabulAirport,ankaraAirport,881,boing);
        Cruising cruising2 = new Cruising(istabulAirport,izmirAirport,341,airbus);


        AirlinesCompany turkishAirlines = new AirlinesCompany(444,"Turk Hava Yollari",cruising1);


        AirlinesCompany pegasus = new AirlinesCompany(231,"Pegasus",cruising2);
        AirlinesCompany.infoCruising(881);


    }
}
