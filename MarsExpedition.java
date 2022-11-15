import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() {
        Scanner input = new Scanner(System.in);

        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("Ready");

        System.out.println("Hello user, What is your name?");

        String UserName = input.nextLine();

        System.out.println("Hi, " + UserName + " --- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");

        String response = input.nextLine();

        if (response.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("To bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your expedition team? (Input an int number)");

        int teamMembers = input.nextInt();
        input.nextLine();

        if (teamMembers  > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamMembers  = 2;
        } else if (teamMembers  < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamMembers  = 2;
        } else if (teamMembers  == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you");

        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Tesla" +
                "\nB: Clyde the horse" +
                "\nC: A Ford Escalade");
        String vehicle = input.nextLine();

        if (vehicle.equalsIgnoreCase("A")) {
            vehicle = "a Mars Rover";
        } else if (vehicle.equalsIgnoreCase("B")) {
            vehicle = "a Chevy Silverado";
        } else if (vehicle.equalsIgnoreCase("C")) {
            vehicle = "a Honda Civic";
        } else {
            vehicle = "your feet";
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + UserName + " with " + teamMembers  + " teammates." +
                "\nTo explore the surface of Mars using " + vehicle + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }
}
