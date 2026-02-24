public class Other1 {
    public static void main (String [] args){
        int Given_Value = 34512;

        int first_two_number = Given_Value/1000;
        int last_two_number = Given_Value%100;
       

        double Circumference = 2*Math.PI*first_two_number;
        double Area = Math.PI*first_two_number*first_two_number;

        System.out.println("Frist two digits: " + first_two_number);
        System.out.println("Last two digits: " + last_two_number);
        System.out.println("Area: " + Area);
        System.out.println("Circumference: " + Circumference);


    }
}
