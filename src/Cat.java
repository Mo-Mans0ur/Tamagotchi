public class Cat extends Tamagotchi{

    public Cat(String name, int age, int mood, int energy, int hunger) {
        super(name, age, mood, energy, hunger);
    }


    public void catNip() {
        System.out.println("your tamagotchi is high on catNip");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", energy=" + energy +
                ", hunger=" + hunger +
                '}';
    }
}
