import java.util.Scanner;

public class Hw_Task4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int final_num = 0;
        if (num1>num2){
            final_num = num1 - num2;
            System.out.println(final_num);
        } else {
            final_num = num2 - num1;
            System.out.println(final_num)
        }
    }    
}
