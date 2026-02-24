public class task3 {
    public static void main(String[] args){
        int given_id = 1000054943;

        int rightmost = (given_id%10);
        int rest_number = (given_id/10);
        int second_rightmost =(rest_number%10);

        System.out.println(rightmost + " " + second_rightmost);

        
    }
}
