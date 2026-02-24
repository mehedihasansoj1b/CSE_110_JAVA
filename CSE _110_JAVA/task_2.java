import java.util.Scanner;

public class task_2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your scores: ");
        int scores = sc.nextInt();

        if (scores>= 90 && scores<=100){
            System.out.println("Your grade is A");
        } else if (scores >= 85 && scores <= 89){
            System.out.println("Your grade is A-");
        } else if ( scores >= 70 && scores <= 84){
            System.out.println("Your grade is B");
        } else if (scores >= 57 && scores <= 69){
            System.out.println("Your grade is C");
        } else if (scores >= 50 && scores <= 56){
            System.out.println("Your grade is D");
        } else if (scores < 50){
            System.out.println("Your grade is F");
        }
    }
}
