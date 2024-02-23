package abstraction;

class Havels implements ISwitchBoardListener{

    @Override
    public void switchOne()
    {
        System.out.println("Havels light is on");
    }

    @Override
    public void switchTwo() {
        System.out.println("havels AC is on");
    }

    @Override
    public void switchThree()
    {
        System.out.println("havels fan is on");
    }


}
