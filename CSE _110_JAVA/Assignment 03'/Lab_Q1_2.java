import java.util.Scanner;
public class Lab_Q1_2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    while (10>5){
        if (num<0){
            break;
        } else {
            num = num*num;
            System.out.println(num);
        }
    }

  }  
}
