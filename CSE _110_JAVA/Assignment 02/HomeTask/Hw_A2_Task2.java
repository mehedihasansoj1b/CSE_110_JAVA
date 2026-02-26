import java.util.Scanner;

public class Hw_A2_Task2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Electricity Consumed: ");
        int consumed = sc.nextInt();
        double bill = 0;
        if (age<18){
            if (consumed<=100){
                bill = (consumed*15)*0.2;
                System.out.println("Final Bill: " + bill + " Taka");
            } else {
                bill = ((consumed*15)*0.2)*0.05;
                System.out.println("Final Bill: " + bill + " Taka");
            }
        } else if (age >=18 && age<=60){
            if (consumed<=100){
                bill = (consumed*15);
                System.out.println("Final Bill: " + bill + " Taka");
            } else {
                bill = ((consumed*15))*0.05;
                System.out.println("Final Bill: " + bill + " Taka");
            }
        } else {
            if (consumed<=100){
                bill = (consumed*15)*0.1;
                System.out.println("Final Bill: " + bill + " Taka");
            } else {
                bill = ((consumed*15)*0.1)*0.05;
                System.out.println("Final Bill: " + bill + " Taka");
            }
        }
    }
}
