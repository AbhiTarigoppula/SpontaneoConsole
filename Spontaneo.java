import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Spontaneo {    
    public static void main(String[] args) {
    
       List<Activity> activities = new ArrayList<>();
       Scanner console = new Scanner(System.in);
       Random random = new Random();

       // Loading activities into list
       addActivities(activities);

       System.out.println("Welcome to Spontaneo!");
       System.out.println("A trip planner that helps you be spontaneous and explore the world a bit more!");
       System.out.println("First we need some details to be able to plan out your trip");

       try {
        Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Thread did not work");
        }

        System.out.println();

       String city = askCity(console);
       int budget = askBudget(console);
       console.nextLine();
       String location = askLocation(console);
       String vibe = askVibe(console);


              
    }

    // Adding activities to the list
    public static void addActivities(List<Activity> activities) {
        activities.add(new Activity("Visit a coffee shop", "low", "indoor", "chill"));
        activities.add(new Activity("Go to a bookstore", "low", "indoor", "chill"));
        activities.add(new Activity("Walk in a park", "low", "outdoor", "chill"));
        activities.add(new Activity("Take photos around town", "low", "outdoor", "adventurous"));

        activities.add(new Activity("Try a new restaurant", "medium", "indoor", "chill"));
        activities.add(new Activity("Go to the movies", "medium", "indoor", "chill"));
        activities.add(new Activity("Visit a museum", "medium", "indoor", "adventurous"));
        activities.add(new Activity("Go mini golfing", "medium", "outdoor", "adventurous"));

        activities.add(new Activity("Attend a concert", "high", "indoor", "adventurous"));
        activities.add(new Activity("Take a day trip", "high", "outdoor", "adventurous"));
        activities.add(new Activity("Go kayaking", "high", "outdoor", "adventurous"));
    }



    // Asking user for city
    public static String askCity(Scanner console) {
        System.out.print("What city are you in/plan on going to? ");
        String cityAnswer = console.nextLine();

        return cityAnswer;
    }

    // Asking user for budget
    public static int askBudget(Scanner console) {
        int budgetAnswer;

        System.out.print("What is your budget (1 = high, 2 = medium, 3 = low)? ");
        budgetAnswer = console.nextInt();

        while (budgetAnswer < 1 || budgetAnswer > 3) {
            System.out.println("Invalid number!");
            System.out.print("What is your budget (1 = high, 2 = medium, 3 = low)? ");
            budgetAnswer = console.nextInt();
        }

        return budgetAnswer;
    }

    // Asking user for location type
    public static String askLocation(Scanner console) {
        System.out.print("Are you planning to stay indoor or outdoor? ");
        String cityAnswer = console.nextLine().toLowerCase();

        while (!cityAnswer.equals("indoor") && !cityAnswer.equals("outdoor")) {
            System.out.println("Invalid input!");
            System.out.print("Are you planning to stay indoor or outdoor? ");
            cityAnswer = console.nextLine().toLowerCase();
        }

        return cityAnswer;
    }    

    // Asking user for vibe
    public static String askVibe(Scanner console) {
        System.out.print("What is the vibe of your trip (Chill or Adventurous)? ");
        String vibeAnswer = console.nextLine().toLowerCase();   

        while (!vibeAnswer.equals("chill") && !vibeAnswer.equals("adventurous")) {
            System.out.println("Invalid answer!");
            System.out.print("What is the vibe of your trip (chill or adventurous)? ");
            vibeAnswer = console.nextLine().toLowerCase();               
        }
 

        return vibeAnswer;
    }    

    // Converts number budget to string budget
    public static String convertBudget(int budgetNumber) {
        switch (budgetNumber) {
            case 1:
                return "high";
            case 2:
                return "medium";
            default:
                return "low";
        }
    }    


    public static List<Activity> findMatches(List<Activity> activities, String budget, String locationType, String vibe) {
        List<Activity> list = new ArrayList<>();

        for (Activity activity : activities) {
            if (activity.getBudget().equals(budget)
                    && activity.getLocationType().equals(locationType)
                    && activity.getVibe().equals(vibe)) {
                list.add(activity);
            }
        }

        return list;
    }


    // Bonus Challenges
    public static void bonus(String vibe) {
        System.out.println();
        System.out.println("Bonus Challenge:");

        if (vibe.equals("adventurous")) {
            System.out.println("Talk to a stranger and ask to hang out with them while you're out.");
        } else if (vibe.equals("chill")) {
            System.out.println("Put your phone away for the entire day.");
        } else {
            System.out.println("Try something different today.");
        }
    }
}
