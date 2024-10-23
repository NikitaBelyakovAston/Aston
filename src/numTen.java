import java.util.Arrays;
public class numTen {
    public static void main (String[] args){
        int[]arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int a = 0; a<arr.length; a++){
            if (arr[a] == 0) arr[a]++;
            else arr[a]--;
            }
        System.out.println(Arrays.toString(arr));
    }
}

