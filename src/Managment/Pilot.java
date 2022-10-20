package Managment;

public class Pilot {
    public int id;
    public String name;
    public Airplane airplane;

    public Pilot(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
