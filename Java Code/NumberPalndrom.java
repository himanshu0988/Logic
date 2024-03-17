public class NumberPalndrom {
    
    public static void main(String[] args) {
        int num=121;
        int num1=num;
        int rev=0;
        while (num !=0) {
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(" the rev number is "+rev );

        if(num1==rev)
        {
            System.out.println(" number is plandrom  "+num1);
        }
        else
        {
            System.out.println(" number is not plandrom  "+ num1);
        }
    }
}
