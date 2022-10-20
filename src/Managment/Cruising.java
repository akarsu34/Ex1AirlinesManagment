package Managment;

public class Cruising {  // ucus, seyahat
    public Airport from; // kalkis yeri
    public Airport to;   // varis yeri
    public int id;

    public Airplane airplane;

    public Cruising(Airport from, Airport to, int id, Airplane airplane) {
        this.from = from;
        this.to = to;
        this.id = id;
        this.airplane = airplane;


    }
}
