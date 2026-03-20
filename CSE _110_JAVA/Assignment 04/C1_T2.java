import java.util.Scanner;

public class C1_T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Students (S): ");
        int s = sc.nextInt();

        System.out.print("Missions (M): ");
        int m = sc.nextInt();

        String output = "";
        double highest = 0;
        int top = 0;

        for (int i = 1; i <= s; i++) {
            System.out.println("Scores of Student " + i + ":");

            int sum = 0;

            for (int j = 1; j <= m; j++) {
                sum += sc.nextInt();
            }

            double avg = (double) sum / m;

            // store result (simple)
            if (avg == (int) avg) {
                output += "Average point of Student " + i + ": " + (int) avg + ".0\n";
            } else {
                output += "Average point of Student " + i + ": " + String.format("%.2f", avg) + "\n";
            }

            if (avg > highest) {
                highest = avg;
                top = i;
            }
        }

        System.out.println(output);
        System.out.println("Student " + top + " receives the badge of honour!!");
    }
}