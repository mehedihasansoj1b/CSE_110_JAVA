import java.util.Scanner;

public class Hw_Lab_Q5 {
    public static void main(String [] args)    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the N-digit vault code: ");
        int code = sc.nextInt();

        int temp = code;
        int count = 0;

         while (temp > 0) {
            count++;
            temp = temp / 10;
        }


        int divider = 1;
        for (int i = 1; i < count; i++) {
            divider = divider * 10;
        }

        while (divider > 0) {
            int digit = code / divider;
            System.out.print(digit);

            code = code % divider;
            divider = divider / 10;

            if (divider > 0) {
                System.out.print(", ");
            }
        }

    }
}
