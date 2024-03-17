public class Prime3 {
    
    public static void main(String[] args) {
        
        for(int i=2;i<=100;i++)
        {
            int num=i;
            boolean flage=true;
            for(int j=2;j<num;j++)
            {
                if(num%j==0)
                flage=false;
            }
            if(flage==true)
            System.out.println("the number is prime "+ num);
        }
    }
}
