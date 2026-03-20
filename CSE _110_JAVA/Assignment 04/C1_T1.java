import java.util.Scanner;

public class C1_T1 {
    public static void main (String [] args)  {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int count = 0;

        for (int i=2; i<=num1 ; i++){
            for (int j=1; j < i; j++){
                if (i%j == 0){
                System.out.println(i + " beats " + j);
                count ++;
            }
        }
            
        }
        System.out.println("Total wins: " + count);
    }  
}
