public class fiboic2 {
    public static void main(String[] args) {
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        int i=1;
        while (i<=10) 
        {
          int c=a+b;
          System.out.print(c +" ");
          a=b;
          b=c;
          i++;  
        }

        


    }
}
