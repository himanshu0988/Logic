public class Secintohour {
    public static void main(String[] args) {
        int sec=7290;

        int hour=sec/3600;
        sec=sec%3600;
        int min=sec/60;
        sec=sec%60;
        

        System.out.println(" the total hours is "+hour);
        System.out.println(" the total minute is "+min);
        System.out.println(" the total sec is "+sec);
    }
}
