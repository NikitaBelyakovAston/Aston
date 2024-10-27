public class numFourteen {
    public static void main(String[] args) {
        massivVal(5, 8);
    }

    public static void massivVal(int len, int initialValue) {
        int[] arr = new int[len];
        for (int a = 0; a < len; a++) {
            arr[a] = initialValue;
            System.out.println("[" + a + "]" + arr[a] + " ");
        }
    }
}
