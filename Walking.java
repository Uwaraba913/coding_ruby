import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        double s = sc.nextInt();
        double n = d / (s / 100000);
        if(n >= 10000) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
    }
}