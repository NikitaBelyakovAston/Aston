public class numNine {
    public static void main (String[] args){
        System.out.println(checkYear (1999));
    }
    public static boolean checkYear (int year){
        if (year % 400==0){
            return true;
        }
        else if (year % 100==0){
            return false;
        }
        else {
            return (year % 4==0);
        }
    }
}
