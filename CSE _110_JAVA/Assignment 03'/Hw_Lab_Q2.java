import java.util.Scanner;

public class Hw_Lab_Q2 {
    public static void main(String [] agrs){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please Enter number of Herbs(H): ");
        int h = sc.nextInt();
        System.out.print("Please Enter number of Crystals (C): ");
        int c = sc.nextInt();
        int potionCount = 0;

         for (int i = 1; h >= 3 && c >= 2; i++) {
            h -= 3;
            c -= 2;
            potionCount++;
            System.out.println("Potion-" + i + " created");
            System.out.println("Remaining Herbs: " + h + ", Remaining Crystals: " + c);
        }

        System.out.println("Potions Created: " + potionCount);

         if (potionCount % 2 == 0) {
            System.out.println("Stable Elixir");
        } else {
            System.out.println("Volatile Elixir");
        }

    }
}
