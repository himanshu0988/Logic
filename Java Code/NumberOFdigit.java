public class NumberOFdigit {
    public static void main(String[] args) {
        int num=15436;
        int count=0;

        while (num !=0)
         {
            num=num/10;
            count++;
            
        }
        System.out.println(" digit inside is"+ count);
    }
}
