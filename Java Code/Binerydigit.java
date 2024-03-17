public class Binerydigit {
    public static void main(String[] args) {
        int num=506;

        int count=0;
        while (num!=0) {
            
            int rem=num%10;
            if(rem==0||rem==1)
            {
                count++;
            }
            num=num/10;

        }
        System.out.println(count);
    }
}
