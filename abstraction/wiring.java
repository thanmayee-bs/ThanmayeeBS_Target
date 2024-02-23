package abstraction;

public class wiring {
    public static void main(String args[])
    {
        ISwitchBoardListener isbl = new Havels();
        isbl.switchOne();
        isbl.switchTwo();
        isbl.switchThree();
    }
}
