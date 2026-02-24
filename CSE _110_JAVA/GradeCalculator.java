import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's mark: ");
        int mark = input.nextInt();

        if (mark >= 97 && mark <= 100) {
            System.out.println("Grade: A+");
        } 
        else if (mark >= 90 && mark <= 96) {
            System.out.println("Grade: A");
        } 
        else if (mark >= 85 && mark <= 89) {
            System.out.println("Grade: A-");
        } 
        else if (mark >= 70 && mark <= 84) {
            System.out.println("Grade: B");
        } 
        else if (mark >= 57 && mark <= 69) {
            System.out.println("Grade: C");
        } 
        else if (mark >= 50 && mark <= 56) {
            System.out.println("Grade: D");
        } 
        else if (mark >= 0 && mark < 50) {
            System.out.println("Grade: F");
        } 
        else {
            System.out.println("Invalid mark! Please enter a mark between 0 and 100.");
        }

        input.close();
    }
}