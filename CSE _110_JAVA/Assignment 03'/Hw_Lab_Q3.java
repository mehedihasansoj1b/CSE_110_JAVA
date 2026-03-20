import java.util.Scanner;

public class Hw_Lab_Q3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Energy (E): ");
        int e = sc.nextInt();

        System.out.print("Number of River (N): ");
        int n = sc.nextInt();
        

        int tiredAt = -1;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter River Distance D" + i + ": ");
            int d = sc.nextInt();
            
            int cost = (d <= 5) ? 2 : d / 2;
            
            if (e - cost < 0) {
                tiredAt = i;
                break;
            }
               e -= cost;
        }
        
        if (tiredAt != -1) {
            System.out.println("Tired at River " + tiredAt);
        } else {
            System.out.println("All Done");
            System.out.println(e+ " energy Left");
        }
        }
    }    
