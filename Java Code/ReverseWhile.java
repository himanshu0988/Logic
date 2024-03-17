public class ReverseWhile {
    public static void main(String[] args) {
        String s1="Himanshu";
        String s2=" ";
        int i=s1.length()-1;

        while (i>=0)
         {
            s2=s2+s1.charAt(i);  
            i--;  
        }
        System.out.println(" the revesre String is "+ s2);
    }
}
