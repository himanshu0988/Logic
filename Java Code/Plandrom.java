public class Plandrom {
    public static void main(String[] args) {
        String s1="nitin";
        String s2="";

        for(int i=s1.length()-1;i>=0;i--)
        {
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);
        if(s1.equals(s2))
        {
        System.out.println("It is a palindrome : "+s2) ;
        }
        else
        {
        System.out.println("It is not a palindrome : "+s2) ;
        } 
    }
}
