import java.util.Scanner;

public class Hw_A2_Task5 {
public static void main (String [] args ){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the amount the customer need to pay(Taka) ");
    int amount = sc.nextInt();
    System.out.print("Enter the amount, customer gave(Taka) ");
    int gave_amount = sc.nextInt();

    if (amount==gave_amount){
        System.out.println("The returned amount is 0 taka");
    } else if (gave_amount<amount){
        System.out.println("Please pay " + (-(amount-gave_amount)) + " taka more.");
    } else {
        int change = gave_amount-amount;
        System.out.println("The returned amount is " + (change) + " taka");
        int note100 = change/ 100;
        change %= 100;

        int note50 = change/50;
        change %=50;

        int note20 = change/20;
        change %=20;

        int note10 = change/10;
        change %=10;

        int note5 = change/5;
        change %=5;

        int note2 = change/2;
        change %=2;

        int note1 = change/1;
        change %=1;

        System.out.println("100 taka note: " + note100);
        System.out.println("50 taka note: " + note50);
        System.out.println("20 taka note: " + note20);
        System.out.println("10 taka note: " + note10);
        System.out.println("5 taka note: " + note5);
        System.out.println("2 taka note: " + note2);
        System.out.println("1 taka note: " + note1);
    }
}
}