import java.util.Scanner;

public class CandidateEmployment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // Get candidate's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
       
        // Get English score
        System.out.print("Enter your English test score: ");
        double english = scanner.nextDouble();
       
        // Get Mathematics score
        System.out.print("Enter your Mathematics test score: ");
        double mathematics = scanner.nextDouble();
       
        // Get ICT score
        System.out.print("Enter your ICT test score: ");
        double ict = scanner.nextDouble();
       
        // Calculate average
        double average = (english + mathematics + ict) / 3.0;
       
        // Decision logic
        boolean englishPassed = english > 70;
        boolean averagePassed = average >= 80;
       
        System.out.println("\n--- Result for " + name + " ---");
        System.out.printf("English: %.1f    Mathematics: %.1f    ICT: %.1f%n",
                          english, mathematics, ict);
        System.out.printf("Average: %.2f%n", average);
       
        if (englishPassed && averagePassed) {
            System.out.println("Employment GRANTED ✓");
        } else {
            System.out.println("Employment REJECTED ✗");
           
            // Optional: show which condition(s) failed
            if (!englishPassed) {
                System.out.println("→ Failed: English score must be greater than 70");
            }
            if (!averagePassed) {
                System.out.println("→ Failed: Average must be 80 or higher");
            }
        }
    }
}