import java.util.Scanner;

public class Hw_Task3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1>num2){
            System.out.println("frist is greater");
        } else if (num1<num2){
            System.out.println("second is greater");
        } else {
            System.out.println("the numbers are equal");
        }
    }
}
