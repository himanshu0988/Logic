public class Prime1 {
    
public static void main(String[] args)
 {
    int a=6;
    int count=0;

    for(int i=1;i<=a;i++)
    {
        if(a%i==0)
        {
            count++;
        }
    }
    if(count==2)
    {
        System.out.println("number is prime "+a);
    }
    else
    {
        System.out.println("number is not prime");
    }
}
}
