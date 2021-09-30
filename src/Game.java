import java.util.Scanner;
public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Tamagotchi, a Tamagotchi is your virtual pet");
        System.out.println("so what pet do you want a cat or a dog \n press 1 for dog \n press 2 for cat");

        int chosenNumber = scanner.nextInt();
        System.out.println();

        if (chosenNumber == 1) {
            Dog();
        } else {
            Cat();
        }




    }

    public static void Dog() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("wow you chose a dog, they are not called a mans best friend for nothing.");
        System.out.println("so what will you call your new buddy?");
        String nameOfDog = scanner.nextLine();

        Dog tamagotchiDog = new Dog(nameOfDog, 2, 90, 90, 40);

        System.out.println("cool so this is the info of your dog " + tamagotchiDog +"\nwhat would you like to do with your friend?");
        System.out.println();

        tamagotchiDog.givepaw();
        System.out.println();

        System.out.println("1. you could feed him.\n2. play with him.\n3. let him sleep.");
        int choice = scanner.nextInt();

        if (choice == 1) {
            tamagotchiDog.feed();
        } else if (choice == 2) {
            tamagotchiDog.play();
        } else {
            tamagotchiDog.sleep();
        }


        System.out.println("hey " + tamagotchiDog.name + "'s stats has increased take a look!");

        System.out.println(tamagotchiDog);

    }

    public static void Cat() {
        System.out.println("wow you chose a cat, well this feline cottontail likes you too.");
    }
}
