import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class FindingsList {
    public FindingsList () throws InterruptedException {
        Thread.sleep(500);

        System.out.println("Welcome Back!");

        ArrayList<String> rocks = new ArrayList<String>();
        rocks.add("rock");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");

        System.out.println("Rock Download Complete!");
        System.out.println(rocks);

        System.out.println("Seems like something doesn't belong");
        rocks.remove("not rock");

        System.out.println(rocks);
        System.out.println("Perfect!");

        Thread.sleep(1000);
        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth?");

        Scanner input = new Scanner(System.in);

        String fossilSelection = input.nextLine();
        if (fossilSelection.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilSelection + "\nDescription: " + fossils.get(fossilSelection));
        } else if (fossilSelection.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilSelection + "\nDescription: " + fossils.get(fossilSelection));
        } else if (fossilSelection.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilSelection + "\nDescription: " + fossils.get(fossilSelection));
        }

        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<>();
        supplies.add("Super Glue");
        supplies.add("Thanos Stones");
        supplies.add("Vibranium");

        supplies.remove("Super Glue");

        Iterator itr = supplies.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next());
            System.out.println("Supplies After Expedition");
        }
    }
}