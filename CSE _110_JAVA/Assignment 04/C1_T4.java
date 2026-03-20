import java.util.Scanner;

public class C1_T4 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Weeks, W: ");
        int week = sc.nextInt();
        int strl =0;
        int sum =0;

        for (int i=0; i<=week; i++){
            sum += i;
            strl -= sum;
            }
            System.out.println("STRL = " + strl);
        }
    }

