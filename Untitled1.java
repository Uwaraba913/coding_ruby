import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String language = sc.next();
        String hitokoto = sc.next();
        System.out.println("name:" + name);
        System.out.println("language:" + language);
        System.out.println("hitokoto:" + hitokoto);
    }
}