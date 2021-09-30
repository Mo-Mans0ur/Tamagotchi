import java.util.Scanner;

public class Dog extends Tamagotchi{

    public Dog(String name, int age, int mood, int energy, int hunger) {
        super(name, age, mood, energy, hunger);

    }


    public void givepaw() {
        System.out.println("your Tamagotchi gives you its paw");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", energy=" + energy +
                ", hunger=" + hunger +
                '}';
    }
}
