public class numTwelve {
    public static void main (String[] args){
        int[]arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a<arr.length; a++) {
            if (arr[a]<6){
                arr[a] = arr[a] * 2;
            }
            System.out.println(arr[a] + " ");
        }
    }
}
