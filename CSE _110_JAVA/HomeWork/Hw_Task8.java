import java.util.Scanner;

public class Hw_Task8 {
 public static void main (String[] args){
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    double new_num = 0;
     if (num%5==0){
       new_num = num*0.25;
       System.out.println(new_num+20);
     } else {
        new_num = num*0.4;
        System.out.println(new_num+20);
     }  
}
}
