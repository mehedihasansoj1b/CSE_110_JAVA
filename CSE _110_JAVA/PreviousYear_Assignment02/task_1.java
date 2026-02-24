public class task_1 {
    public static void main (String [] args) {
        int a = 100;
        int b = 23;
        int c = 200;

        if (a>b && a>c) {
            System.out.println("Largest number: " + a);
        } else if (b>c && b>a) {
            System.out.println("Largest number: " + b);
        } else {
            System.out.println("Largest number: " + c);
        }
    }
}
