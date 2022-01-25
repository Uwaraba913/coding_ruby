import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[] {1, 3, 5, 6, 3, 2, 5, 23, 2};
        int sum = 0;
        for(int i = 0; i < n.length; i ++){
            sum = sum + n[i];
        }
        System.out.println(sum);
    }
}