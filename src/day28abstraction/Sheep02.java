package day28abstraction;

public class Sheep02 extends Animal {
    String sound;
    String meal;

    public Sheep02(String sound, String meal){
        this.meal=meal;
        this.sound=sound;

    }

    @Override
    public void animalSound() {
        System.out.println("hey" + sound);

    }

    @Override
    public void animalName() {
        System.out.println("ot" + meal);

    }
}
