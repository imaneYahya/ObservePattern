package net.Imane;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        observable.setState(90);
        observable.setState(20);
        Observer observer1 = new ObserverImpl1();
        observable.addObserver(new ObserverImpl1());
        observable.addObserver(new ObserverImpl2());
        observable.setState(10);
        observable.setState(110);
        observable.setState(234);
        observable.removeObserver(observer1);
        System.out.println("...................");
        observable.setState(23);

        observable.addObserver((state) -> {
            System.out.println("==========");
            System.out.println("prévision ="+Math.cos(state*2)*Math.log(state*state));

        });
        observable.addObserver(new Observer() {
            @Override
            public void updateObservable(int state) {
                System.out.println("=====**************=====");
                System.out.println("tendance ="+((state>50)?"positif":"negatif"));

            }
        });



        observable.setState(33);
    }
}