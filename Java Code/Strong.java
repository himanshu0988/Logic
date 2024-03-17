import java.util.*;
class Strong
{
    public static int fac(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
public static void main(String[]args)
{
int n ;
Scanner sc = new Scanner ( System .in ) ;
System.out.println("Enter the number : ");
n = sc . nextInt ( ) ;
int sum=0;
int copy=n;
while (n!=0)
 {
   int rem=n%10;
   
   sum=sum+ fac(rem);
   n=n/10;

}
if(copy==sum)
{
    System.out.println(" the number is strong "+copy);
}else
{
    System.out.println(" the number is not strong "+copy);
}

}}