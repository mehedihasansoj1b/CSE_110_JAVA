import java.util.Scanner;

public class Hw_A2_Task1 {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 % 5 == 0 && var2 % 7 == 0) {
         System.out.println("Divisible by Both");
      } else if (var2 % 5 == 0) {
         System.out.println("Invalid: Divisible by 5 Only");
      } else if (var2 % 7 == 0) {
         System.out.println("Invalid: Divisble by 7 Only");
      } else {
         System.out.println("No");
      }

   }
}
