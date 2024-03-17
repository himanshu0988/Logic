public class ArmStrong {
    public static void main(String[] args) {
        int num=153 ;
        int num1=num;
        int arm=0;
        while(num !=0)
        {
          int  rem=num%10;
          arm=arm+(rem*rem*rem);
          num=num/10;

        }
        if(num1==arm)
        {
            System.out.println(" the number is armstrong "+num1);
        }else
        {
            System.out.println(" the number is not armstrong "+num1);
        }
    }
}
