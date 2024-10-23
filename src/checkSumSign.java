public class checkSumSign {
    public static void main (String[] args){
        checkSumSign ();
    }
    public static void checkSumSign (){
        int a = 585;
        int b = 858;
        int x = a + b;
        if (x >= 0) {
            System.out.println("Сумма положительная");}
        else {
            System.out.println("Сумма отрицательная");}
    }
}
