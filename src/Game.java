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

        Dog tamagotchiDog = new Dog(nameOfDog, 2, 90, 40, 40);

        System.out.println("cool so this is the info of your dog " + tamagotchiDog +"\nwhat would you like to do with your friend?");
        System.out.println();

        tamagotchiDog.givepaw();
        System.out.println();

        System.out.println("1. feed.\n2. play. \n3. sleep.");
        int choice = scanner.nextInt();

        if (choice == 1) {
            tamagotchiDog.feed();
            System.out.println("hey his stats has increased!");
        } else if (choice == 2) {
            tamagotchiDog.play();
            System.out.println("hey his stats has increased!");
        } else {
            tamagotchiDog.sleep();
            System.out.println("hey his stats has increased!");

        }

        int choice2 = scanner.nextInt();

        if (choice2 == 1) {
            tamagotchiDog.feed();
            System.out.println("hey his stats has increased!");
        } else if (choice == 2) {
            tamagotchiDog.play();
            System.out.println("hey his stats has increased!");
        } else {
            tamagotchiDog.sleep();
            System.out.println("hey his stats has increased!");

        }
    }

    public static void Cat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("wow you chose a cat, well this feline cottontail likes you too.");
        System.out.println("so what would you call your feline little friend");
        String nameOfCat = scanner.nextLine();

        Cat tamagotchiCat = new Cat(nameOfCat,5,90,40,40);

        System.out.println("nice so heres your info of your cat " + tamagotchiCat + "\nwhat would you like to do with your friend?");
        System.out.println();



        System.out.println("1. feed.\n2. play.\n3. sleep.");
        int choice = scanner.nextInt();

        if (choice == 1) {
            tamagotchiCat.feed();
            System.out.println("hey his stats has increased!");
        } else if (choice == 2) {
            tamagotchiCat.play();
            System.out.println("hey his stats has increased!");
        } else {
            tamagotchiCat.sleep();
            System.out.println("hey his stats has increased!");

        }

        tamagotchiCat.catNip();
        System.out.println();
        System.out.println();


        System.out.println("what would you like to do with your friend?");

        System.out.println("1. feed.\n2. play.\n3. sleep.");
        int choice2 = scanner.nextInt();

        if (choice2 == 1) {
            tamagotchiCat.feed();
            System.out.println("hey his stats has increased!");
        } else if (choice == 2) {
            tamagotchiCat.play();
            System.out.println("hey his stats has increased!");
        } else {
            tamagotchiCat.sleep();
            System.out.println("hey his stats has increased!");

        }


    }
}
