public class numFive {
    public static void main (String[] args){
        System.out.println(checkBooleanSum(5, 8));
    }
    public static boolean checkBooleanSum (int a, int b){
        int x = a + b;
        return x>=10 && x<=20;
    }
}
