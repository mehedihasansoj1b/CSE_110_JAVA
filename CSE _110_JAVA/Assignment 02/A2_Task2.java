import java.util.Scanner;

public class A2_Task2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int scores = sc.nextInt();

        if (scores>=90 && scores<=100){
            System.out.println("Your grade is A");
        } else if (scores>=85 && scores<=89){
            System.out.println("Your grade is A-");
        } else if (scores>=70 && scores<=84){
            System.out.println("Your grade is B");
        } else if (scores>=57 && scores<=69){
            System.out.println("Your grade is C");
        } else if (scores>=50 && scores<=56){
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
    }
}
