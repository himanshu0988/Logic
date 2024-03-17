import java.util.*;
public class ConverDays {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" enter the day's");
        int day,month,year;

        day=scan.nextInt();

        year=day/365;
        day=day%365;
        month=day/30;
        day=day%30;
        System.out.println("The total year is : "+year);
        System.out.println();
        System.out.println(" the total month is :"+month);
        System.out.println();
        System.out.println(" the total day is :"+day);

    }
}
