import java.util.*;
public class SecondLar {
    public static void main(String [] args)
    {
    Scanner scan=new Scanner(System.in);
    int a,b,c;
    System.out.println("Please enter the number A , B and C");
    a=scan.nextInt();
    b=scan.nextInt();
    c=scan.nextInt();
    
    int Largest=a;
    int Smallest=a;

    if(b>Largest)
    Largest=b;

    if(c>Largest)
    Largest=c;

    if(b<Smallest)
    Smallest=b;

    if(c<Smallest)
    Smallest=c;

    int SecondLargest=(a+b+c)-(Smallest+Largest);

    System.out.println(" the first largest is :"+ Largest);
    System.out.println(" the first Second is :"+ SecondLargest);
    System.out.println("The Smalles is "+Smallest);
    }
    
}
