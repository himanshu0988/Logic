public class prime2 {
    public static void main(String[] args) {
        int num=7;
        boolean flag=true;

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=false;
                break;
            }
        }
        
        if(flag==true)
		{
			System.out.println("It is a prime number : " + num);
		}
	    else
		{
			System.out.println("It is not a prime number : " + num);
		}
	}
}

