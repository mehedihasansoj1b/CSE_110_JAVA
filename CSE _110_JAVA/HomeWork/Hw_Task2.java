import java.util.Scanner;

public class Hw_Task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("first is greater");
        } else {
            System.out.println("first is not greater");
        }
    }
}
