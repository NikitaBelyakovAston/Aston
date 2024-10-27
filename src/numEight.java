public class numEight {
    public static void main(String[] args) {
        lineNum("Доброе утро, Никита", 8);
    }

    public static void lineNum(String str, int a) {
        for (int b = 1; b <= a; b++) {
            System.out.println("[" + b + "]" + str);
        }
    }
}
