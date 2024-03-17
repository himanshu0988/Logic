import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" please enter the marks :");
        
        int marks=scan.nextInt();

        if(marks>=95)
        {
            System.out.println(" you'r abdroable , Your Grade is = A");
        }
        else if(marks>=75 && marks<95)
        {
            System.out.println(" Greate : Your Grade is = B");
        }
        else if(marks>=50 && marks<75)
        {
            System.out.println("Your grade is = C");
        }
        else if(marks>=30 && marks<50)
        {
            System.out.println(" you'r Paassed but u need to work hard dude : your grade is : D");
        }
        else{
            System.out.println(" Better luck next time :::::");
        }

        
    }
}
