package net.Imane;

public class ObserverImpl1 implements Observer{
    @Override
    public void updateObservable(int state) {
        System.out.println("********OBS1********");
        System.out.println("State Value =" +state);
        System.out.println("****************");
    }
}
