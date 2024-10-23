public class numThirteen {
    public static void main (String[] args){
        int[][]arr = new int[3][3];
        for (int a = 0; a<arr.length; a++){
            for (int b = 0, x = arr[a].length - 1; b<arr[a].length; b++, x--){
                if (a==b || a==x) arr[a][b] = 1;
                else arr[a][b] = 0;
                System.out.println(arr[a][b] + " ");
            }
        }
    }
}
