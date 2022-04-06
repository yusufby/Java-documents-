package day29interfacemanipulations;

public class Runner {
    public static void main(String[] args) {

        HybridEngine hybridEngine = new Car();

        hybridEngine.havingHybridEngine();

        Car car = new Car();

        car.bacteriaKiller();
        car.move();
        car.power();

    }

}
