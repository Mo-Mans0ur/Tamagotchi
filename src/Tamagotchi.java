public class Tamagotchi {
    public String name;
    public int age;
    public int mood;
    public int energy;
    public int hunger;


    public Tamagotchi(String name, int age, int mood, int energy, int hunger) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
        this.hunger = hunger;
    }

    public void play() {
        System.out.println("the ball has been thrown and your Tamagotchi is running wild trying to get it");

        boolean play = true;
        if (play) {
            int addPlus10 = mood + 10;
        }
    }

    public void feed() {
        System.out.println("your Tamagotchi is getting its nutrients ");

        boolean feed = true;
        if (feed) {
            int addPlus40 = hunger + 40;
        }
    }

    public void sleep() {
        System.out.println("ZZZzzZZzZZZZzZZzZZZZZzZZZ");

        boolean sleep = true;
        if (sleep) {
            int addPlus60 = energy + 60;
        }
    }

    @Override
    public String toString() {
        return "Tamagotchi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mood='" + mood + '\'' +
                ", energy=" + energy +
                ", hunger=" + hunger +
                '}';
    }
}
