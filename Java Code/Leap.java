public class Leap {
   
    public static void main(String[] args) {
        int year =2004; 
      if(year%4==0 && year !=100 || year%400==0)
    {
        System.out.println(" the year is Leap "+year);
    }else
    {
        System.out.println(" the year is not Leap "+year)   ;
    }
}
}
