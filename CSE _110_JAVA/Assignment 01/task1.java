

public class task1 {
public static void main (String [] args){
    
    int given_minutes = 3456789;

    int hrs = (given_minutes/60);
    int days = (hrs/24);
    int yrs = (days/365);
    int days_left = (days%365);
    System.out.println(given_minutes + " minutes is approximately " + yrs + " years and " + days_left + " days");
}
}