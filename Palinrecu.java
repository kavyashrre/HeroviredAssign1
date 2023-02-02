import java.util.*;

public class Palinrecu {

    public static boolean palin(char arr[], int i, int j) {
        if (arr[i] != arr[j]) {
            return false;
        }
        if (i < j)
            return true && (palin(arr, i + 1, j - 1));
        else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char arr[] = s.toCharArray();
        int i = 0, j = arr.length - 1;
        System.out.println(palin(arr, i, j));
        sc.close();
    }
}