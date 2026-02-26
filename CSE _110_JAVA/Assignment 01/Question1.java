import java.util.Scanner;

public class Question1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        int last_two = num1%100;

        System.out.println(last_two);
    }
}
