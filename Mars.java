public class Mars {
    public static void main(String[] args) {
        String colonyName = "Beehive";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        int mealsAfterLanding = meals -(shipPopulation * .75);
        System.out.println(mealsAfterLanding);
        mealsAfterLanding = (mealsAfterLanding / * .5);
        shipPopulation = shipPopulation + 5;
        String landingLocation ="The Hill";
        if (landingLocation == "The Plain" ) {
            System.out.println("Bbzzz Landing on the Plain");
        }
        else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(100);
        new GuessingGame();
        new MarsExpedition();
        new FindingsList();

    }

    public static boolean landingCheck(int minutesLeft) {
        for (int minute = 0; minute <= minutesLeft; i++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}
