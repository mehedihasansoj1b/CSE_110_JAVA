import java.util.Scanner;

public class Hw_Lab_Q4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = num; i > 0; i = i / 10) {
            if (i == num) {
                System.out.print(i % 10);
            } else {
                System.out.print(", " + i % 10);
            }
        }
    }
}
