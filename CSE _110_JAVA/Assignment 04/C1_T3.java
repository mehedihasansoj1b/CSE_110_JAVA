import java.util.Scanner;

public class C1_T3 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pairs: ");
        int pairs = sc.nextInt();

        String output = "";
        for (int i = 1; i<=pairs; i++){
            System.out.println("Pair " + i + ":");

            System.out.print("Enter first number: " );
            int num1 = sc.nextInt();
            System.out.print("Enter second number: " );
            int num2 = sc.nextInt();

            int gcd;

            if (num1 <=0 || num2 <=0){
                gcd =0;
            } else {
                while (num2 != 0){
                    
                    int r = num1%num2;
                    num1 = num2;
                    num2 = r;
                }
                
                gcd =num1;
                
                }
                output += "Pair " + i + ": GCD = " + gcd + "\n";
            }
            System.out.println(output);
        }
    }

