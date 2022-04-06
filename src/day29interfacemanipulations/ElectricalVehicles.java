package day29interfacemanipulations;

public abstract class ElectricalVehicles implements AirCondition {

    @Override
    public void electronicAC(){
        System.out.println("Electrical vehicles");
    }

    @Override
    public void bacteriaKiller(){
        System.out.println("Electrical vehicle");
    }
}
