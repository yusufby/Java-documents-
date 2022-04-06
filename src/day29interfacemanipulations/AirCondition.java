package day29interfacemanipulations;

public interface AirCondition extends Vehicle{


    String NAME="Samsung";

    public abstract void electronicAc();

    public void climateAc();

    void bacteriaKiller();

    void run();

    public default int power(){
        System.out.println("Engines are increasing....");
        return 1000;

    }
    public static String model(){
        System.out.println("the best model");
        return  "the best ....";

    }


    void electronicAC();
}
