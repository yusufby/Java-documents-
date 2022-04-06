package day29interfacemanipulations;

public class Car implements AirCondition, HybridEngine {


    @Override
    public void electronicAc() {
        System.out.println("The car AC is electronic ");

    }

    @Override
    public void climateAc() {
        System.out.println("The car AC is climate");

    }

    @Override
    public void bacteriaKiller() {
        System.out.println("The car AC kills bacteria ");

    }

    @Override
    public void run() {
        System.out.println("The car AC runs perfectly.");

    }

    @Override
    public void electronicAC() {
        System.out.println("The car engine is electrocnic");


    }

    @Override
    public void havingHybridEngine() {
        System.out.println("the car engine is hybrid ");

    }
}
