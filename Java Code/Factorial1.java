public class Factorial1 {
    public static void main(String[] args) {
        int num=5;
        int temp=1;

       for(int i=num;i>=1;i--)
       {
        temp=temp*i;
       }
       System.out.println(temp);
    }
}
