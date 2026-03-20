import java.util.Scanner;

public class C1_2_T2 {
  public static void main (String [] args ) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Students (S): ");
    int s = sc.nextInt();
    System.out.print("Mission (M): ");
    int m = sc.nextInt();
    String output = "";
    double highest =0;
    int top = 0;

    for (int i =1 ; i<=s; i++){
        System.out.print("Scores of Student " + i + ": " );
         int Scores = 0;
        for (int j = 0; j<m; j++){
           int scr = sc.nextInt();
           Scores += scr;
        }

        double avg = Scores / m;


        if (avg == avg){
            output += "Average point of Student " + i + ": " + avg + "\n" ;
        }

         if (avg > highest) {
                highest = avg;
                top = i;
            }
    }
        System.out.println(output);
        System.out.println("Student " + top + " receives the badge of honour!!");
  }  
}
