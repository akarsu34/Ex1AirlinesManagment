package Managment;

public class Airplane {
    public int id;
    public int haveToPilotNumber; // bir yada iki
    public boolean state; // calısır durum için true / onarımda durumu icin false
    public Pilot firstPilot;
    public Pilot secondPilot;

    public Airplane(int id,int haveToPilotNumber, boolean state, Pilot firstPilot, Pilot secondPilot) {
        this.id = id;
        this.haveToPilotNumber = haveToPilotNumber;
        this.state = state;
        this.firstPilot = firstPilot;
        if(this.haveToPilotNumber == 1){
            this.secondPilot = null;
        }else{
            this.secondPilot = secondPilot;
        }

    }
}
