public class Fibonic {
    public static void main(String[] args) {
        int a=0;
        int b=1;

        System.out.print("the fibonac series of 10 is "+a+" "+b+" ");
        for(int i=1;i<=10;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
      

    }
}
